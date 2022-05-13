import { Component } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { AppComponent } from './app.component';


const appRoutes = [
   
    { path: 'login', component: LoginComponent,  pathMatch: 'full'}
  ];
  export const routing = RouterModule.forRoot(appRoutes);