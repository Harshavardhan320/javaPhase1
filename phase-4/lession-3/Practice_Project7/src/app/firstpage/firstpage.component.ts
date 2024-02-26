import { Component } from '@angular/core';
import { DreDirective } from '../dre.directive';

@Component({
  selector: 'app-firstpage',
  standalone: true,
  imports: [DreDirective],
  templateUrl: './firstpage.component.html',
  styleUrl: './firstpage.component.css'
})
export class FirstpageComponent {

}
