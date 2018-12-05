import { Component, OnInit } from '@angular/core';
import { PersonnelService } from '../personnel.service';
import { HttpClient } from '@angular/common/http';
import { Personnel } from '../personnel'

@Component({
  selector: 'app-listpersonnels',
    moduleId: module.id,
  templateUrl: './listpersonnels.component.html',
  styleUrls: ['./listpersonnels.component.css']
})
export class ListpersonnelsComponent implements OnInit {

  personnels: any;
constructor( private _personnelService: PersonnelService) {}

  ngOnInit(){
  this.getPersonnels();

}

getPersonnels(){
this._personnelService.getPersonnels().subscribe(response => {
  this.personnels = response;
});
}

showPersonnelForEdit(pers: Personnel){
this._personnelService.personnel=Object.assign({},pers);;

}

deletePersonnel(idPersonnel: number){
this._personnelService.deletePersonnel(idPersonnel).subscribe( data =>{
  this.getPersonnels();
});
}
}
