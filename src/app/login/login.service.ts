import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Personnel } from '../personnels/personnel'

const httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class LoginService {

personnel: Personnel;
  constructor(private http:HttpClient) {
this.personnel=new Personnel();
  }

  getPersonnelByCIN(cin:number){
    return  this.http.get('http://localhost:8080/appNoyau/rest/Personnel/byCIN/'+cin);

  }

}
