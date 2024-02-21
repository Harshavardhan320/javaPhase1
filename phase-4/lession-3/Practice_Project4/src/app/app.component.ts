import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { EventbingingComponent } from "./event/eventbinging/eventbinging.component";

@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    styleUrl: './app.component.css',
    imports: [RouterOutlet, EventbingingComponent]
})
export class AppComponent {
  title = 'Practice_Project4';
}
