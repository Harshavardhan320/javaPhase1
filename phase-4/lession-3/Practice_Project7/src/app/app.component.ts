import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { FirstpageComponent } from "./firstpage/firstpage.component";
import { DreDirective } from './dre.directive';

@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    styleUrl: './app.component.css',
    imports: [RouterOutlet, FirstpageComponent,DreDirective]
})
export class AppComponent {
  title = 'Practice_Project7';
}
