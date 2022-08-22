import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EditEduComponent } from './components/educacion/edit-edu/edit-edu.component';
import { NewEduComponent } from './components/educacion/new-edu/new-edu.component';
import { EditExpeComponent } from './components/experiencia-laboral/edit-expe/edit-expe.component';
import { NewExpeComponent } from './components/experiencia-laboral/new-expe/new-expe.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { EditProyectosComponent } from './components/proyectos/edit-proyectos/edit-proyectos.component';
import { NewProyectosComponent } from './components/proyectos/new-proyectos/new-proyectos.component';
import { EditSkillsComponent } from './components/skills/edit-skills/edit-skills.component';
import { NewSkillsComponent } from './components/skills/new-skills/new-skills.component';


const routes: Routes = [
  {path:'', component : HomeComponent},
  {path:'login', component: LoginComponent},
  {path:'nuevaexp', component: NewExpeComponent},
  {path:'nuevaedu', component: NewEduComponent},
  {path:'nuevaskill', component: NewSkillsComponent},
  {path:'nuevoproyectos',component: NewProyectosComponent},
  {path:'editproyectos/:id', component: EditProyectosComponent},
  {path:'editskill/:id',component: EditSkillsComponent},
  {path:'editexp/:id', component: EditExpeComponent},
  {path:'editedu/:id', component: EditEduComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
