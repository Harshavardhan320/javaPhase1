import { Component } from '@angular/core';

@Component({
  selector: 'app-eventbinging',
  standalone: true,
  imports: [],
  templateUrl: './eventbinging.component.html',
  styleUrl: './eventbinging.component.css'
})
export class EventbingingComponent {
  public noclick():void{
    alert('You clicked me!');
  }
  public name!: String;
  public getvalue(){
    let name = prompt("Please enter your name", "Guest");
  }
}
