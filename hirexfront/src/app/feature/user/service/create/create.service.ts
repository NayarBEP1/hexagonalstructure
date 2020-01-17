import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from '../../../../../environments/environment';
import { User } from '../../shared/user';

@Injectable({
  providedIn: 'root'
})
export class CreateUserService {

  constructor(private http: HttpClient) { }

  createUser(user: User) {
    return this.http.post('/api/user/create', user);
  }
}
