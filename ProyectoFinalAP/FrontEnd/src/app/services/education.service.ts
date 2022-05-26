import { Education } from './../model/education';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class EducationService {
private apiServerURL = environment.apiBaseURL;


  constructor(private web:HttpClient) { }

  public getEducacion():Observable<Education[]>{
    return this.web.get<Education[]>(`${this.apiServerURL}/Educacion/all`);
  }
  public addEducacion(educacion: Education):Observable<Education>{
    return this.web.post<Education>(`${this.apiServerURL}/Educacion/add`,educacion);
  }
  public editarEducacion(educacion: Education):Observable<Education>{
    return this.web.put<Education>(`${this.apiServerURL}/Educacion/editar`,educacion);
  } 
  public deleteEducacion(educacionid: number):Observable<void>{
    return this.web.delete<void>(`${this.apiServerURL}/Educacion/delete/${educacionid}`);
  }
}
