import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Skills } from 'src/app/model/skills';
import { SSkillsService } from 'src/app/service/s-skills.service';

@Component({
  selector: 'app-new-skills',
  templateUrl: './new-skills.component.html',
  styleUrls: ['./new-skills.component.css']
})
export class NewSkillsComponent implements OnInit {
nombreS: string = '';
valueSk: string = '';
imgS: string = '';

  constructor(
    private sSkills: SSkillsService,
    private router: Router
  ) { }

  ngOnInit(): void {
  }

  onCreate(): void {
    const edu = new Skills(this.nombreS, this.valueSk, this.imgS);
    this.sSkills.save(edu).subscribe( data => {alert('Experiencia educativa creada con exito.'), this.router.navigate(['']);
      }, err => { alert('Falló');
        this.router.navigate(['']);
      }
    )
  }

  stepBack(): void {
    this.router.navigate(['']);
  }

}
