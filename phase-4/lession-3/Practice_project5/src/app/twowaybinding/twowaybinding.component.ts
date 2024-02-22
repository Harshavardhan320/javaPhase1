import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-twowaybinding',
  standalone: true,
  imports: [],
  templateUrl: './twowaybinding.component.html',
  styleUrl: './twowaybinding.component.css'
})
export class TwowaybindingComponent {

  @Output() pet:EventEmitter<String> = new EventEmitter<String>();
  @Input() coursename:String = "";

  changename(value: String) {
    // console.log(value);
    this.pet.emit(value);
  
  }
 
}


        