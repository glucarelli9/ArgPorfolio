import { LoginComponent } from './components/login/login.component';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  title = 'ProyectoFinalAP';
  constructor() { }

  ngOnInit(): void {
  }

}
