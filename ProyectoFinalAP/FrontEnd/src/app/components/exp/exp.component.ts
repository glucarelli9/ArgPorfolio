import { HttpErrorResponse } from '@angular/common/http';
import { ExpService } from './../../services/exp.service';
import { Experiencia } from './../../model/Experiencia';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-exp',
  templateUrl: './exp.component.html',
  styleUrls: ['./exp.component.scss']
})
export class ExpComponent implements OnInit {

  public experiencias:Experiencia[]=[];
  public editExperiencia:Experiencia | undefined;
  public deleteExperiencia:Experiencia | undefined;


  constructor(private Experiencia:ExpService) { }

  ngOnInit(): void {
    this.getExperiencias();
  }

  public getExperiencias():void{
    this.Experiencia.getexp().subscribe({
      next:(Response:Experiencia[])=>{
        this.experiencias=Response;
      },
      error:(error:HttpErrorResponse)=>{
        alert(error.message);
      }
    })
  }

  public onOpenModal(mode:String, experiencia?:Experiencia):void{
    const container = document.getElementById('main-container');
    const button = document.createElement('button');
    button.type = 'button';
    button.style.display='none';
    button.setAttribute('data-toggle','modal');
    if(mode === 'agregar'){
      button.setAttribute('data-target','#agregarExperienciaModal');
    } else if(mode === 'delete'){
      this.deleteExperiencia = experiencia;
      button.setAttribute('data-target','#deleteExperienciaModal');
    }else if(mode === 'edit'){
      this.editExperiencia = experiencia;
      button.setAttribute('data-target','#editarExperienciaModal');
    }

    container?.appendChild(button);
    button.click();
  }

  // Funcion Agregar
  public onAgregarExperiencia(addform:NgForm){
    document.getElementById('agregar-experiencia-form')?.click();  
    this.Experiencia.addexp(addform.value).subscribe({
      next: (response:Experiencia) =>{
        console.log(response);
        this.getExperiencias();
        addform.reset();
      },
      error:(error:HttpErrorResponse)=>{
        alert(error.message);
        addform.reset();
      }
    })
  }
  // Funcion Editar
  public onEditarExperiencia(experiencia:Experiencia){
    this.editExperiencia=experiencia;
    document.getElementById('agregar-experiencia-form')?.click();
    this.Experiencia.editarexp(experiencia).subscribe({
      next:(response:Experiencia) =>{
        console.log(response);
        this.getExperiencias;
      },
      error:(error:HttpErrorResponse)=>{
        alert(error.message);
      }
    })
  }

   // Funcion Eliminar
   public onDeleteExperiencia(idexp:number):void{
    this.Experiencia.deleteexp(idexp).subscribe({
      next:(response:void) =>{
        console.log(response);
        this.getExperiencias();
      },
      error:(error:HttpErrorResponse)=>{
        alert(error.message);
      }
    })
  }
}
