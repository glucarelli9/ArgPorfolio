import { UsuariosService } from './../../services/usuarios.service';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss'],
  providers: [UsuariosService],
})

export class LoginComponent implements OnInit {
//  form:FormGroup;
constructor(){
  // this.form=this.formBuilder.group({
//private formBuilder:FormBuilder < contructort
  
  // })
}
  ngOnInit() {
 
 }
    
}