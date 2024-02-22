import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { BingingComponent } from "./class/binging/binging.component";
import { CssbingingComponent } from "./style/cssbinging/cssbinging.component";

@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    styleUrl: './app.component.css',
    imports: [RouterOutlet, BingingComponent, CssbingingComponent]
})
export class AppComponent {
  title = 'Practice_Project3';
}
