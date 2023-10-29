import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
//importes de componentes
import { FormularioComponent } from './formulario/formulario.component';
import { HomeComponent } from './home/home.component';
import { FormsMaterialsComponent } from './forms-materials/forms-materials.component';

const routes: Routes = [
  //rutas de componentes creados
  { path: 'formulario', component: FormularioComponent },
  {path: 'home', component: HomeComponent},
  {path: 'forms-materials', component: FormsMaterialsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
