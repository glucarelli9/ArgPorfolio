import { AppComponent } from './app.component';
import { LoginComponent } from './components/login/login.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PortadaComponentComponent } from './portada-component/portada-component.component';


const routes: Routes = [
  { path: '', component: PortadaComponentComponent, pathMatch:'full' },
  {path: 'login', component: LoginComponent},
  {path: 'porfolio',component: PortadaComponentComponent}
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
  })
  export class AppRoutingModule { }