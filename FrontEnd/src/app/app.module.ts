import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { LogoSocialComponent } from './components/header/logo-social/logo-social.component';
import { BannerComponent } from './components/header/banner/banner.component';
import { AcercaDeComponent } from './components/acerca-de/acerca-de.component';
import { ExperienciaLaboralComponent } from './components/experiencia-laboral/experiencia-laboral.component';
import { EducacionComponent } from './components/educacion/educacion.component';
import { ProyectosComponent } from './components/proyectos/proyectos.component';
import { SkillsComponent } from './components/skills/skills.component';
import { FooterComponent } from './components/footer/footer.component';
import { HttpClientModule } from '@angular/common/http';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { FormsModule } from '@angular/forms';
import { interceptorProvider } from './service/interceptor-service';
import { NewExpeComponent } from './components/experiencia-laboral/new-expe/new-expe.component';
import { EditExpeComponent } from './components/experiencia-laboral/edit-expe/edit-expe.component';
import { NewEduComponent } from './components/educacion/new-edu/new-edu.component';
import { EditEduComponent } from './components/educacion/edit-edu/edit-edu.component';
import { EditSkillsComponent } from './components/skills/edit-skills/edit-skills.component';
import { NewSkillsComponent } from './components/skills/new-skills/new-skills.component';
import { NewProyectosComponent } from './components/proyectos/new-proyectos/new-proyectos.component';
import { EditProyectosComponent } from './components/proyectos/edit-proyectos/edit-proyectos.component';
import { EditAcercaDeComponent } from './components/acerca-de/edit-acerca-de/edit-acerca-de.component';



@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LogoSocialComponent,
    BannerComponent,
    AcercaDeComponent,
    ExperienciaLaboralComponent,
    EducacionComponent,
    ProyectosComponent,
    SkillsComponent,
    FooterComponent,
    HomeComponent,
    LoginComponent,
    NewExpeComponent,
    EditExpeComponent,
    NewEduComponent,
    EditEduComponent,
    EditSkillsComponent,
    NewSkillsComponent,
    NewProyectosComponent,
    EditProyectosComponent,
    EditAcercaDeComponent
    
  ],

  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],

  providers: [
    interceptorProvider,
    
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
