import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ChartComponent } from "./components/chart/chart.component";

@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    styleUrl: './app.component.css',
    imports: [RouterOutlet, ChartComponent]
})
export class AppComponent {
  title = 'Practice_Project1';
}
