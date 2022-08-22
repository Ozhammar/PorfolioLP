import { Component, OnInit } from '@angular/core';
import { Educacion } from 'src/app/model/educacion';
import { SEducacionService } from 'src/app/service/s-educacion.service';
import { TokenService } from 'src/app/service/token.service';

@Component({
  selector: 'app-educacion',
  templateUrl: './educacion.component.html',
  styleUrls: ['./educacion.component.css'],
})
export class EducacionComponent implements OnInit {
  edu: Educacion[] = [];

  constructor(
    private sEducacion: SEducacionService,
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
    this.sEducacion.lista().subscribe((data) => {
      this.edu = data;
    });
  }

  delete(id?: number): void {
    if (id != undefined) {
      this.sEducacion.delete(id).subscribe(
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
