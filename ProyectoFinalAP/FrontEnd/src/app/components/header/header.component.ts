import { UsuariosService } from './../../services/usuarios.service';
import { Usuario } from './../../model/usuario';
import { Component, OnInit } from '@angular/core';
import { HttpErrorResponse } from '@angular/common/http';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss']
})
export class HeaderComponent implements OnInit {
 

  constructor(){

  }
  ngOnInit(): void {
    
  }

}
