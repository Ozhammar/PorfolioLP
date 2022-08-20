import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Proyectos } from 'src/app/model/proyectos';
import { SProyectosService } from 'src/app/service/s-proyectos.service';

@Component({
  selector: 'app-new-proyectos',
  templateUrl: './new-proyectos.component.html',
  styleUrls: ['./new-proyectos.component.css']
})
export class NewProyectosComponent implements OnInit {
nombreP: string = '';
descripcionP: string = '';
imgP: string = '';
urlP: string = '';


  constructor(
    private sProyectos: SProyectosService,
    private router: Router
  ) { }

  ngOnInit(): void {
  }

  onCreate(): void {
    const proyecto = new Proyectos(this.nombreP, this.descripcionP, this.imgP, this.urlP);
    this.sProyectos.save(proyecto).subscribe( data => {alert('Experiencia educativa creada con exito.'), this.router.navigate(['']);
      }, err => { alert('Falló');
        this.router.navigate(['']);
      }
    )
  }

  stepBack(): void {
    this.router.navigate(['']);
  }

}
