import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { RouterLink, RouterOutlet } from '@angular/router';
import { PersondetailsComponent } from '../persondetails/persondetails.component';
import { Data } from '../../classes/data';

@Component({
    selector: 'app-users',
    standalone: true,
    templateUrl: './users.component.html',
    styleUrl: './users.component.css',
    imports: [CommonModule, PersondetailsComponent, RouterOutlet, RouterLink]
})
export class UsersComponent extends Data{
  users: any= {
    person1:{name:"John Doe",age:30}
  };
}
