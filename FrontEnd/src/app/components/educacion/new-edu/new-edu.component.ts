import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Educacion } from 'src/app/model/educacion';
import { SEducacionService } from 'src/app/service/s-educacion.service';

@Component({
  selector: 'app-new-edu',
  templateUrl: './new-edu.component.html',
  styleUrls: ['./new-edu.component.css'],
})
export class NewEduComponent implements OnInit {
  nombreEdu: string = '';
  urlEdu: string = '';
  descripcionEdu: string = '';
  inicioEdu: string = '';
  finEdu: string = '';
  tituloEdu: string = '';
  imgEdu: string = '';

  constructor(
    private sEducacion: SEducacionService,
    private router: Router
  ) {}

  ngOnInit(): void {}

  onCreate(): void {
    const edu = new Educacion(this.nombreEdu,this.urlEdu, this.descripcionEdu, this.inicioEdu, this.finEdu, this.tituloEdu, this.imgEdu);
    this.sEducacion.save(edu).subscribe( data => {alert('Experiencia educativa creada con exito.'), this.router.navigate(['']);
      }, err => { alert('Falló');
        this.router.navigate(['']);
      }
    )
  }

  stepBack(): void {
    this.router.navigate(['']);
  }
}
