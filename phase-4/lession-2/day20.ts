(function(){
      for(var i=0; i<5; i++){
            // console.log(i);
      }
      // console.log("w"+i);
})();

//objects
let user ={
      firstname:"harsha",
      lastname:'vardhan',
      username:`sunny`,
      getusername: ():string =>"vikram"
};
// console.log(user.getusername);
//enum
enum weekenddays{
      monday=0,
      tusday=0,
      wednesday=0,
      thirsday=0,
      friday=1,
      saterday=1,
      sunday=1,
}
// console.log(weekenddays.monday);

let months: any={
      jan:1,
      feb:"asdas",
      march:"232",
}
// console.log(months.march=234);
// console.log(months.march);
class Pashent{
      constructor(
            private id:number,
            protected name:String,
            public age:number,
            protected number:number,
      ){}
      // displayInfo(){
      //       return `id : ${this.id}, Name :${this.name}, Age :${this.age}`;
      // }
}
class Doctor extends Pashent{
     constructor(id:number, name:string, age:number, number:number){super(id, name, age, number)}

      displayInfo(): string {
         return `name :${this.name}`;
      }
}

let a:Doctor =  new Doctor;

let doctor:Doctor = new Doctor(5,"John", 36,987654321);

// console.log(doctor.displayInfo());

const details = function(pashent:Pashent){
      console.log(pashent.age);
}
let p1:Pashent = new Pashent(1,"harsha",23,24235646456);
details(p1);

let details1 = (pashent:Pashent) =>{
      console.log(pashent.age);
}