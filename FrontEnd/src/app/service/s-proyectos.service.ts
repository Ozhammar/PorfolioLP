import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Proyectos } from '../model/proyectos';

@Injectable({
  providedIn: 'root'
})
export class SProyectosService {

 //pURL = 'http://localhost:8080/proyectos/';
 pURL = 'https://pofoliolp.herokuapp.com/proyectos/';

  constructor(private httpClient: HttpClient) {}

  public lista(): Observable<Proyectos[]> {
    return this.httpClient.get<Proyectos[]>(this.pURL + 'lista');
  }

  public detail(id: number): Observable<Proyectos> {
    return this.httpClient.get<Proyectos>(this.pURL + `detail/${id}`);
  }

  public save(proyectos: Proyectos): Observable<any> {
    return this.httpClient.post<any>(this.pURL + 'create', proyectos);
  }
  public update(id: number, proyectos: Proyectos): Observable<any> {
    return this.httpClient.put<any>(this.pURL + `update/${id}`, proyectos);
  }

  public delete(id: number): Observable<any> {
    return this.httpClient.delete<any>(this.pURL + `delete/${id}`);
  }
}
