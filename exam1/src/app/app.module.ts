import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FormularioComponent } from './formulario/formulario.component';

import { MatSlideToggleModule } from '@angular/material/slide-toggle'; //angular material
import { HomeComponent } from './home/home.component';
import { FormsMaterialsComponent } from './forms-materials/forms-materials.component'; //hago importe 

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
   
  ],
  imports: [
    BrowserModule,
    MatSlideToggleModule, //agrego importe
    AppRoutingModule,
    BrowserAnimationsModule,
    FormsMaterialsComponent,
    FormularioComponent
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
