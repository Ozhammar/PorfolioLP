import { Component, OnInit } from '@angular/core';
import { Proyectos } from 'src/app/model/proyectos';
import { SProyectosService } from 'src/app/service/s-proyectos.service';
import { TokenService } from 'src/app/service/token.service';

@Component({
  selector: 'app-proyectos',
  templateUrl: './proyectos.component.html',
  styleUrls: ['./proyectos.component.css']
})
export class ProyectosComponent implements OnInit {

  proyecto: Proyectos[] = [];

  constructor(
    private sProyectos: SProyectosService,
    private tokenService: TokenService
  ) {}

  isLogged = false;
  isAdmin = false;

  ngOnInit(): void {
    this.cargarEducacion();
    if (this.tokenService.getToken()) {
      this.isLogged = true;
    } else {
      this.isLogged = false;
    }
    if(this.tokenService.isAdmin()){
      this.isAdmin = true;
    } else {
      this.isAdmin = false;
    }
  }

  cargarEducacion(): void {
    this.sProyectos.lista().subscribe((data) => {
      this.proyecto = data;
    });
  }

  delete(id?: number): void {
    if (id != undefined) {
      this.sProyectos.delete(id).subscribe(
        (data) => {
          this.cargarEducacion();
        },
        (err) => {
          alert('No se pudo borrar la experiencia educativa');
        }
      );
    }
  }

}
