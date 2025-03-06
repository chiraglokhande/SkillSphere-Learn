import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { RegisterComponent } from './components/register/register.component';
import { LoginComponent } from './components/login/login.component';
import { UserDashboardComponent } from './components/user-dashboard/user-dashboard.component';
import { UserCoursesComponent } from './components/user-courses/user-courses.component';

const routes: Routes = [
  {
    path:"", component:HomeComponent
  },
  {
    path:"register", component:RegisterComponent
  },

  {
    path:"login",component:LoginComponent
  },
  {
    path:"user-course",component:UserCoursesComponent
  },
  {
    path:"user-dashboard", component:UserDashboardComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
