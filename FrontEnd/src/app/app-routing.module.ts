import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { NewEduComponent } from './components/educacion/new-edu/new-edu.component';

import { EditExpeComponent } from './components/experiencia-laboral/edit-expe/edit-expe.component';
import { NewExpeComponent } from './components/experiencia-laboral/new-expe/new-expe.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';

const routes: Routes = [
  {path:'', component : HomeComponent},
  {path:'login', component: LoginComponent},
  {path:'nuevaexp', component: NewExpeComponent},
  {path:'nuevaedu', component: NewEduComponent},
  {path:'editexp/:id', component: EditExpeComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
