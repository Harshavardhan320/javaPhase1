console.log(navigator.languages);
console.log(navigator.onLine);
console.log(navigator.geolocation.watchPosition)
console.log(navigator.userAgentData.brands[1]);
class home{
      Totalrooms =5;
      bedrooms=Totalrooms-2;
      kitc=Totalrooms-1;

      getRooms(){
            return  `${this.bedrooms} Bedroom, ${this.kitc} Kitchen`;
      }
}
// export function school() {
//       let classrooms = 223;
//       let students = 2341;
//       let teachers = 67;
//       return `School has ${classrooms} Classrooms and ${students} Students with ${teachers} Teachers.`;
//     }

function *hotal(){
      var foodname = yield "order";
      console.log(foodname);
}
var hotelorder = hotal();
console.log(hotelorder.next("egg"));