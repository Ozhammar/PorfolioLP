import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { persona } from '../model/persona.model';


@Injectable({
  providedIn: 'root'
})
export class PersonaService {

  //URL = 'http://localhost:8080/personas/';
  URL = 'https://pofoliolp.herokuapp.com/personas/';
  
  

  constructor(private httpClient: HttpClient) { }

  public lista(): Observable<persona> {
    return this.httpClient.get<persona>(this.URL + 'lista');
  }


  public update(id: number, Persona: persona): Observable<any> {
    return this.httpClient.put<any>(this.URL + `update/${id}`, Persona);
  }

  public detail(id: number): Observable<persona> {
    return this.httpClient.get<persona>(this.URL + `detail/${id}`);
  }

  public getPersona(): Observable<persona> {
    return this.httpClient.get<persona>(this.URL+ 'traer/perfil');
  }
}
