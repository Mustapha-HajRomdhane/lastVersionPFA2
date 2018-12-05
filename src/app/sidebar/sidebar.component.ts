import { Component, OnInit } from '@angular/core';

declare var $:any;

export interface RouteInfo {
    path: string;
    title: string;
    icon: string;
    class: string;
}

export const ROUTES: RouteInfo[] = [
    { path: 'dashboard', title: 'TABLEAU DE BORD',  icon: 'ti-panel', class: '' },
    { path: 'listClients', title: 'CLIENTS',  icon:'ti-user', class: '' },
    { path: 'forfait', title: 'FORFAITS',  icon:'ti-star', class: '' },
    { path: 'parcours', title: 'PARCOURS',  icon:'ti-view-list-alt', class: '' },
    { path: 'materiel', title: 'MATERIELS',  icon:'ti-view-list-alt', class: '' },
    { path: 'listpersonnels', title: 'PERSONNELS',  icon:'ti-user', class: '' },
//    { path: 'typography', title: 'Typography',  icon:'ti-text', class: '' },
  //  { path: 'icons', title: 'Icons',  icon:'ti-pencil-alt2', class: '' },
  //  { path: 'maps', title: 'Maps',  icon:'ti-map', class: '' },
  //  { path: 'notifications', title: 'Notifications',  icon:'ti-bell', class: '' },
  //  { path: 'upgrade', title: 'Upgrade to PRO',  icon:'ti-export', class: 'active-pro' },
];

@Component({
    moduleId: module.id,
    selector: 'sidebar-cmp',
    templateUrl: 'sidebar.component.html',
})

export class SidebarComponent implements OnInit {
    public menuItems: any[];
    ngOnInit() {
        this.menuItems = ROUTES.filter(menuItem => menuItem);
    }
    isNotMobileMenu(){
        if($(window).width() > 991){
            return false;
        }
        return true;
    }

}
