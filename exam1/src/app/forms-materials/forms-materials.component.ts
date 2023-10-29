import { Component,ElementRef, ViewChild } from '@angular/core';
import {MatInputModule} from '@angular/material/input';
import {MatFormFieldModule} from '@angular/material/form-field';
import {  FormsModule } from '@angular/forms';

@Component({
  selector: 'app-forms-materials',
  templateUrl: './forms-materials.component.html',
  styleUrls: ['./forms-materials.component.css'],
  standalone: true,
  imports: [FormsModule, MatInputModule,MatFormFieldModule],
})

export class FormsMaterialsComponent {
  //agrego informacion de forms para que se guarde en consola
formdata ={
  name:'',
  comment:''
};
onSubmit(){
  console.log(this.formdata);
}
}
