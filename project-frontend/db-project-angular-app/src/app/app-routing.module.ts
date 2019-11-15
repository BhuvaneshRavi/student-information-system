import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './views/home/home.component';
import { LoginComponent } from './views/login/login.component';
import { StudentregComponent } from './views/studentreg/studentreg.component';

const routes: Routes = [
  {
    path: '',component:HomeComponent
  },
  {
    path: 'login',
  component:LoginComponent
  },
  {
    path: 'studentreg',
  component:StudentregComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  
  exports: [RouterModule]
})
export class AppRoutingModule { }
