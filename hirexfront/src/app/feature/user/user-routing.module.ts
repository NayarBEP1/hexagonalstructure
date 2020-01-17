import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CreateUserComponent } from './component/create/create.component';

const routes: Routes = [
  { path: '',
    children : [
      { path: 'create', component: CreateUserComponent}
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class UserRoutingModule { }
