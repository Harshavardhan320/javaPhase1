import { Component } from '@angular/core';

@Component({
  selector: 'app-binging',
  standalone: true,
  imports: [],
  templateUrl: './binging.component.html',
  styleUrl: './binging.component.css'
})
export class BingingComponent {
  private name:String = "harsha";
  private  age:Number=25;
  public emails:String = "sunnyharsha@gmail.com";
  
  public ShowDetails():void{
    document.write(`Name: ${this.name} and Age: ${this.age}`);
  }
  public showname():String{
    return this.name;
  }
}
