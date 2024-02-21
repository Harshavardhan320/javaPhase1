import { Component } from '@angular/core';

@Component({
  selector: 'app-binding',
  standalone: true,
  imports: [],
  templateUrl: './binding.component.html',
  styleUrl: './binding.component.css'
})
export class BindingComponent {
  str:String = "This message in string";
  num:Number = 34;
  boo:Boolean=true;
  arr:Array<any>=[1,"2",false];
}
