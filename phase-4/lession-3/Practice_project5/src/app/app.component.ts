import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { TwowaybindingComponent } from "./twowaybinding/twowaybinding.component";

@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    styleUrl: './app.component.css',
    imports: [RouterOutlet, TwowaybindingComponent]
})
export class AppComponent {

  title = 'Practice_project5';
  Petname:String = "aminal";
  courcename:String ="java";

  changePetName(petname: String) {
    this.Petname = petname;
    console.log(petname);
  }
}

