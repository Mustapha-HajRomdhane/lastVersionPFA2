import { Component, OnInit } from '@angular/core';
import {Router } from '@angular/router';

import { LoginService } from './login.service';
import { CookieService } from 'ngx-cookie-service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
pers: any ;

  constructor( private router: Router, private _loginService: LoginService, private _cookieService: CookieService) {

  }

  ngOnInit() {
  }



  loginUser(e){
    e.preventDefault();
    var userCIN = e.target.elements[0].value;
    var password = e.target.elements[1].value;

    this._loginService.getPersonnelByCIN(userCIN).subscribe( response =>{
    this.pers = response;
    this._loginService.personnel=Object.assign({},this.pers);;

    if (userCIN == this._loginService.personnel.cin && password == this._loginService.personnel.motDePasse){

      this._cookieService.set('role', this._loginService.personnel.role);
       this.router.navigate(['dashboard']);
    }
    });



  }


}
