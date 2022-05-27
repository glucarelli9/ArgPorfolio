import { HttpErrorResponse } from '@angular/common/http';
import { EducationService } from './../../services/education.service';
import { Education } from './../../model/education';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-educ',
  templateUrl: './educ.component.html',
  styleUrls: ['./educ.component.scss']
})
export class EducComponent implements OnInit {

  public educaciones:Education[]=[];
  public editEducation:Education | undefined;
  public deleteEducation:Education | undefined;
  

  constructor(private Education:EducationService) { }

  ngOnInit(): void {
    this.getEducacion();
  }

  public getEducacion():void{
    this.Education.getEducacion().subscribe({
      next:(Response:Education[])=>{
        this.educaciones=Response;
      },
      error:(error:HttpErrorResponse)=>{
        alert(error.message);
      }
    })
  }

  public onOpenModal(mode:String, educacion?:Education):void{
    const container = document.getElementById('main-container');
    const button = document.createElement('button');
    button.type = 'button';
    button.style.display='none';
    button.setAttribute('data-toggle','modal');
    if(mode === 'agregar'){
      button.setAttribute('data-target','#agregarEducacionModal');
    } else if(mode === 'delete'){
      this.deleteEducation = educacion;
      button.setAttribute('data-target','#deleteEducacionModal');
    }else if(mode === 'edit'){
      this.editEducation = educacion;
      button.setAttribute('data-target','#editarEducacionModal');
    }

    container?.appendChild(button);
    button.click();
  }
// Funcion Agregar
  public onAgregarEducation(addform:NgForm){
    document.getElementById('agregar-educaction-form')?.click();  
    this.Education.addEducacion(addform.value).subscribe({
      next: (response:Education) =>{
        console.log(response);
        this.getEducacion();
        addform.reset();
      },
      error:(error:HttpErrorResponse)=>{
        alert(error.message);
        addform.reset();
      }
    })
  }
  
  // Funcion Editar
  public onEditarEducation(education:Education){
    this.editEducation=education;
    document.getElementById('agregar-educaction-form')?.click();
    this.Education.editarEducacion(education).subscribe({
      next:(response:Education) =>{
        console.log(response);
        this.getEducacion();
      },
      error:(error:HttpErrorResponse)=>{
        alert(error.message);
      }
    })
  }
  // Funcion Eliminar
  public onDeleteEducation(idedu:number):void{
    this.Education.deleteEducacion(idedu).subscribe({
      next:(response:void) =>{
        console.log(response);
        this.getEducacion()
      },
      error:(error:HttpErrorResponse)=>{
        alert(error.message);
      }
    })
  }
}
