import { Component } from '@angular/core';

import { CookieService } from 'ngx-cookie-service';

declare var $:any;

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})




export class AppComponent{

  constructor( private _cookieService: CookieService) {

  }


}
