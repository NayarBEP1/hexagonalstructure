import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { CreateUserComponent } from './component/create/create.component';
import { UserRoutingModule } from './user-routing.module';
import { MaterialModule } from '../../shared/material/material.module';

@NgModule({
  declarations: [
    CreateUserComponent,
  ],
  imports: [
    CommonModule,
    UserRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    MaterialModule
  ],
  providers: []
})
export class UserModule { }
