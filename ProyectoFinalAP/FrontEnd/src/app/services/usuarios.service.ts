import { Usuario } from './../model/usuario';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class UsuariosService {
private apiServerURL = environment.apiBaseURL;


  constructor(private web: HttpClient) {
   }
   
   public getUsuario():Observable<Usuario>{
     return this.web.get<Usuario>(`${this.apiServerURL}/usuario/id/1`)
   }

   public editarUsuario(usuario: Usuario):Observable<Usuario>{
     return this.web.put<Usuario>(`${this.apiServerURL}/usuario/id/1`,usuario)
   }

   
}
