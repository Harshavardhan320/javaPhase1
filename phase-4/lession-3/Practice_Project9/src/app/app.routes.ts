import { Routes } from '@angular/router';
import { Page1Component } from './compo/page1/page1.component';
import { Page2Component } from './compo/page2/page2.component';
import { UsersComponent } from './compo/users/users.component';
import { PersondetailsComponent } from './compo/persondetails/persondetails.component';
import { PlaceholderComponent } from './compo/placeholder/placeholder.component';


export const routes: Routes = [

      {path:"page1", component:Page1Component, title:"home page1"},
      {path:"page2", component:Page2Component},
      {path:"users", component:UsersComponent, children:[
            {path:":id", component:PersondetailsComponent},
            {path:"", component:PlaceholderComponent},
      ]},
];
