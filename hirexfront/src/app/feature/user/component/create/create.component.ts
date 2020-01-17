import { Component, OnInit } from '@angular/core';
import { User } from '../../shared/user';
import { NgForm, FormGroup, Validators, FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';
import { CreateUserService } from '../../service/create/create.service';

@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateUserComponent implements OnInit {

  user: User = new User();
  registerForm: FormGroup;
  submitted = false;

  constructor(private formBuilder: FormBuilder, private router: Router, private createUser: CreateUserService) { }

  ngOnInit() {
    this.validations();
  }

  onSubmit() {
    this.submitted = true;
    if (this.registerForm.invalid) { return; }
    this.createUser.createUser(this.registerForm.value)
      .subscribe(() => {
        console.log('done');
      });
  }

  get f() { return this.registerForm.controls; }

  validations() {
    this.registerForm = this.formBuilder.group({
      name: ['', Validators.required],
      lastName: ['', Validators.required],
      email: ['', Validators.required],
      pass: ['', [Validators.required]],
      emailFormControl: ['', [Validators.required]]
    });

  }
}
