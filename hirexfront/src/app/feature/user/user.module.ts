import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { CreateUserComponent } from './create/create.component';
import { UserRoutingModule } from './user-routing.module';

@NgModule({
  declarations: [
    CreateUserComponent,
  ],
  imports: [
    CommonModule,
    UserRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: []
})
export class UserModule { }
