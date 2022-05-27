import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Experiencia } from '../model/Experiencia';

@Injectable({
  providedIn: 'root'
})
export class ExpService {
  private apiServerURL = environment.apiBaseURL;

  constructor(private web:HttpClient) { }

  public getexp():Observable<Experiencia[]>{
    return this.web.get<Experiencia[]>(`${this.apiServerURL}/Exp/all`);
  }
  public addexp(educacion: Experiencia):Observable<Experiencia>{
    return this.web.post<Experiencia>(`${this.apiServerURL}/Exp/add`,educacion);
  }
  public editarexp(educacion: Experiencia):Observable<Experiencia>{
    return this.web.put<Experiencia>(`${this.apiServerURL}/Exp/editar`,educacion);
  } 
  public deleteexp(educacionid: number):Observable<void>{
    return this.web.delete<void>(`${this.apiServerURL}/Exp/delete/${educacionid}`);
  }

}
