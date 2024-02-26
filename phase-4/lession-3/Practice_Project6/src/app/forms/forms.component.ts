import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-forms',
  standalone: true,
  imports: [FormsModule,ReactiveFormsModule, CommonModule],
  templateUrl: './forms.component.html',
  styleUrl: './forms.component.css'
})
export class FormsComponent implements OnInit {
submit() {
  console.log("submited")
}
  vld!: any;
  ngOnInit(): void {
    
  }
  constructor(private fv: FormBuilder){
    this.vld = this.fv.group({
      username:["", [Validators.required, Validators.minLength(3)]],
      password:["", [Validators.required, Validators.minLength(5)]],
      phonenumber:["", [Validators.required, Validators.minLength(10)]],
    });  
  }

  

  

}
