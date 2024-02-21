import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { BindingComponent } from "./string/binding/binding.component";
import { BingingComponent } from "./property/binging/binging.component";

@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    styleUrl: './app.component.css',
    imports: [RouterOutlet, BindingComponent, BingingComponent]
})
export class AppComponent {
  title = 'Practice_project2';
}
