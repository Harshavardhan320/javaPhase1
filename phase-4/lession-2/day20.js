var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
(function () {
    for (var i = 0; i < 5; i++) {
        // console.log(i);
    }
    // console.log("w"+i);
})();
//objects
var user = {
    firstname: "harsha",
    lastname: 'vardhan',
    username: "sunny",
    getusername: function () { return "vikram"; }
};
// console.log(user.getusername);
//enum
var weekenddays;
(function (weekenddays) {
    weekenddays[weekenddays["monday"] = 0] = "monday";
    weekenddays[weekenddays["tusday"] = 0] = "tusday";
    weekenddays[weekenddays["wednesday"] = 0] = "wednesday";
    weekenddays[weekenddays["thirsday"] = 0] = "thirsday";
    weekenddays[weekenddays["friday"] = 1] = "friday";
    weekenddays[weekenddays["saterday"] = 1] = "saterday";
    weekenddays[weekenddays["sunday"] = 1] = "sunday";
})(weekenddays || (weekenddays = {}));
// console.log(weekenddays.monday);
var months = {
    jan: 1,
    feb: "asdas",
    march: "232",
};
// console.log(months.march=234);
// console.log(months.march);
var Pashent = /** @class */ (function () {
    function Pashent(id, name, age, number) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.number = number;
    }
    return Pashent;
}());
var Doctor = /** @class */ (function (_super) {
    __extends(Doctor, _super);
    function Doctor(id, name, age, number) {
        return _super.call(this, id, name, age, number) || this;
    }
    Doctor.prototype.displayInfo = function () {
        return "name :".concat(this.name);
    };
    return Doctor;
}(Pashent));
var doctor = new Doctor(5, "John", 36, 987654321);
// console.log(doctor.displayInfo());
var details = function (pashent) {
    console.log(pashent.age);
};
var p1 = new Pashent(1, "harsha", 23, 24235646456);
details(p1);
var details1 = function (pashent) {
    console.log(pashent.age);
};
