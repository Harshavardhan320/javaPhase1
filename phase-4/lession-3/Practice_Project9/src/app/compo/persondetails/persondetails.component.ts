import { Component, Input, OnInit, input } from '@angular/core';
import { Data } from '../../classes/data';
import { ActivatedRoute, RouterLink, RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-persondetails',
  standalone: true,
  imports: [RouterLink,RouterOutlet],
  templateUrl: './persondetails.component.html',
  styleUrl: './persondetails.component.css'
})
export class PersondetailsComponent extends Data{

  

}
