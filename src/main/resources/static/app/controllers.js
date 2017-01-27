(function(angular) {
   // Declaration of AppController with $scope and Item as arguements
   var AppController = function($scope, Item) {

        // Implements query method with a response return from ItemFactory.query using the $resource
        Item.query(function(response) {
            // The response from the query will be mapped to the items in the HTML
            $scope.items = response ? response : [];
        });

        $scope.addItem = function(description) {
            // Item is the Item passed in the AppController
            // This will create a new Item object using the description passed to this function
            new Item({
                description: description,
                checked: false
            }).
            // Implements save method with an item variable return from ItemFactory.save
            $save(function(item) {
                $scope.items.push(item);
            });
            $scope.newItem = "";
        };

        // Implements update method with an item variable return from Itemfactory.update
        $scope.updateItem = function(item) {
            item.$update();
        };

       // Implements remove method with an item variable return from Itemfactory.remove
       $scope.deleteItem = function(item) {
            item.$remove(function() {
                $scope.items.splice($scope.items.indexOf(item), 1);
            });
        };
    }; // End of Controller Declaration

    // Implementation of AppController
    // Note: For the AppController to be used you must inject the parameters needed by the controller
    AppController.$inject = ['$scope', 'Item'];

    // AppController as a Controller of myApp.controllers
    angular.module("myApp.controllers").controller("AppController", AppController);
}(angular));