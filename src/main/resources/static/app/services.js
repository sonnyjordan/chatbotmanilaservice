(function(angular) {
    // Initialization of Item Factory
    var ItemFactory = function($resource) {
        // This refers to the URL of the Item Controller
        return $resource('/items/:id',
            // @id refers to the @PathVariable name in the Controller
            { id: '@id'},
            // This refers to the RequestMethod of the Controller = UPDATE adn REMOVE
            { update: { method: "PUT"}, remove: { method: "DELETE"}});
    };

    // Usage of ItemFactory
    // The $resource is injected to ItemFactory
    ItemFactory.$inject = ['$resource'];

    // This line will set the module name, which is myApp.services, and will register ItemFactory as a factory of "Item" under myApp.services module
    angular.module("myApp.services").factory("Item", ItemFactory);

}(angular));