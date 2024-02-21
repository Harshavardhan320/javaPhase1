export class person{
      private name:String;
      private age:number;
      constructor(name:String, age:number){
            this.name = name;
            this.age= age;
      }
      hight():void{
            console.log(`${this.name} is ${this.age} years old.`);
      }
}