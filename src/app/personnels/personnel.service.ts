import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Personnel } from './personnel'


const httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};


@Injectable()
export class PersonnelService {

personnel: Personnel;
    constructor(private http: HttpClient ) {
      this.personnel= new Personnel();
    }


    getPersonnels(){
        return  this.http.get('http://localhost:8080/appNoyau/rest/Personnel/all');
    }

    addPersonnel(personnel){
        let pers = JSON.stringify(personnel);
        return this.http.post('http://localhost:8080/appNoyau/rest/Personnel/addPersonnel', pers , httpOptions );
    }

    updatePersonnel(personnel) {
      console.log('hello');
        let pers = JSON.stringify(personnel);
        return this.http.put('http://localhost:8080/appNoyau/rest/Personnel/updatePersonnel', pers, httpOptions);
    }

    deletePersonnel(id: number){
        return this.http.delete('http://localhost:8080/appNoyau/rest/Personnel/deletePersonnel/'+id);
    }


}
