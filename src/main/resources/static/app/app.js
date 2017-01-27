(function(angular) {

    //Add myApp.controllers
    angular.module("myApp.controllers", [])

    //Add myApp.services
    angular.module("myApp.services", []);

    //Add modules ngResource Module, myApp.controllers module and myApp.services module under myApp.
    angular.module("myApp", ["ngResource", "myApp.controllers", "myApp.services"]);

}(angular));