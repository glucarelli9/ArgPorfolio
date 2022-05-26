import { UsuariosService } from './../../services/usuarios.service';

import { Component, OnInit } from '@angular/core';
import { HttpErrorResponse } from '@angular/common/http';
import { Usuario } from 'src/app/model/usuario';

@Component({
  selector: 'app-acerca-de',
  templateUrl: './acerca-de.component.html',
  styleUrls: ['./acerca-de.component.scss']
})
export class AcercaDeComponent implements OnInit {

  public usuario : Usuario | undefined;
  public editarUsuario: Usuario | undefined;

  constructor(private headerSerices: UsuariosService) { }

  ngOnInit(): void {
    this.getUsuario();
  }
  public getUsuario():void{
    this.headerSerices.getUsuario().subscribe({
      next: (response: Usuario) => {
        this.usuario=response;
      },
      error:(error:HttpErrorResponse)=>{
        alert(error.message);
      }
    })
  }
}
