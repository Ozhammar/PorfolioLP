import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Experiencia } from 'src/app/model/experiencia';
import { SExperienciaService } from 'src/app/service/s-experiencia.service';

@Component({
  selector: 'app-new-expe',
  templateUrl: './new-expe.component.html',
  styleUrls: ['./new-expe.component.css'],
})
export class NewExpeComponent implements OnInit {
  nombreExp: string = '';
  descripcionExp: string = '';

  constructor(
    private sExperiencia: SExperienciaService,
    private router: Router
  ) {}

  ngOnInit(): void {}

  onCreate(): void {
    const expe = new Experiencia(this.nombreExp, this.descripcionExp);
    this.sExperiencia.save(expe).subscribe( data => {alert('Experiencia crada con exito.'), this.router.navigate(['']);
      }, err => { alert('Falló');
        this.router.navigate(['']);
      }
    )
  }
}
