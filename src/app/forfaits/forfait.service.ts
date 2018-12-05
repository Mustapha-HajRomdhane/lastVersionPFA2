import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Forfait } from './forfait'

const httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};


@Injectable()
export class ForfaitService {

    forfait:Forfait;
    constructor(private http: HttpClient ) {
      this.forfait=new Forfait();
    }


    getForfaits(){
        return  this.http.get('http://localhost:8080/appNoyau/rest/Forfait/all');
    }


    addForfait(forfait){
        let body = JSON.stringify(forfait);
        return this.http.post('http://localhost:8080/appNoyau/rest/Forfait/addForfait', body , httpOptions );
    }

    updateForfait(forfait){
      let body=JSON.stringify(forfait);
      return this.http.put('http://localhost:8080/appNoyau/rest/Forfait/updateForfait',body,httpOptions);
    }

    deleteForfait(id:number){
      return this.http.delete('http://localhost:8080/appNoyau/rest/Forfait/deleteForfait/'+id);
    }

}
