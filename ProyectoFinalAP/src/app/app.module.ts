import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { NgCircleProgressModule } from 'ng-circle-progress';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { LogoArgPComponent } from './components/logo-arg-p/logo-arg-p.component';
import { SocialComponent } from './components/social/social.component';
import { BannerComponent } from './components/banner/banner.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { AcercaDeComponent } from './components/acerca-de/acerca-de.component';
import { ExpComponent } from './components/exp/exp.component';
import { EducComponent } from './components/educ/educ.component';
import { HysComponent } from './components/hys/hys.component';
import { HtmlParser } from '@angular/compiler';
@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LogoArgPComponent,
    SocialComponent,
    BannerComponent,
    AcercaDeComponent,
    ExpComponent,
    EducComponent,
    HysComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    NgCircleProgressModule.forRoot({
      "backgroundPadding": 7,
      "radius": 60,
      "space": -2,
      "outerStrokeWidth": 2,
      "outerStrokeColor": "#8eb6c9",
      "innerStrokeColor": "#e7e8ea",
      "innerStrokeWidth": 2,
      "animateTitle": false,
      "animationDuration": 1000,
      "showUnits": false,
      "clockwise": false,
      
    })
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
