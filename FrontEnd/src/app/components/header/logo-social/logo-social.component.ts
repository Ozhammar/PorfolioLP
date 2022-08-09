import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-logo-social',
  templateUrl: './logo-social.component.html',
  styleUrls: ['./logo-social.component.css']
})
export class LogoSocialComponent implements OnInit {

  constructor(private router: Router) { }


  ngOnInit(): void {
  }

  login(){
    this.router.navigate(['/login']);
  }
}
