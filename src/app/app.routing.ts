import { Routes } from '@angular/router';

import { DashboardComponent }   from './dashboard/dashboard.component';
import { TypographyComponent }   from './typography/typography.component';
import { IconsComponent }   from './icons/icons.component';
import { MapsComponent }   from './maps/maps.component';
import { NotificationsComponent }   from './notifications/notifications.component';
import { UpgradeComponent }   from './upgrade/upgrade.component';

import { ClientComponent }   from './clients/client/client.component';
import { ListClientsComponent }   from './clients/listClients/listClients.component';
import { ForfaitComponent } from './forfaits/forfait/forfait.component';
import { PersonnelComponent } from './personnels/personnel/personnel.component';
import { ListpersonnelsComponent } from './personnels/listpersonnels/listpersonnels.component';
import { AjoutClientComponent } from './clients/ajout-client/ajout-client.component';
import { MaterielComponent } from './materiels/materiel/materiel.component';
import { AjoutMaterielComponent } from './materiels/ajout-materiel/ajout-materiel.component';
import { ListParcoursComponent } from './parcours/list-parcours/list-parcours.component';
import { AjoutParcoursComponent } from './parcours/ajout-parcours/ajout-parcours.component';
import { AjoutForfaitComponent } from './forfaits/ajout-forfait/ajout-forfait.component';
import { UpdateParcoursComponent } from './parcours/update-parcours/update-parcours.component';
import { AjoutAchatForfaitComponent } from './achatForfait/ajout-achat-forfait/ajout-achat-forfait.component';
import { AjoutAchatParcoursComponent } from './achatParcours/ajout-achat-parcours/ajout-achat-parcours.component';

import { LoginComponent } from './login/login.component';
import { ClubComponent } from './club/club.component';


export const AppRoutes: Routes = [
    {
        path: '',
        redirectTo: 'dashboard',
        pathMatch: 'full',
    },
    {
        path: 'dashboard',
        component: DashboardComponent
    },
    {
        path: 'client',
        component: ClientComponent
    },
    {
        path: 'listClients',
        component: ListClientsComponent
    },
    {
        path: 'forfait',
        component: ForfaitComponent
    },
    {
      path:'ajoutForfait',
      component:AjoutForfaitComponent
    },
    {
        path: 'personnel',
        component: PersonnelComponent
    },
    {
        path: 'listpersonnels',
        component: ListpersonnelsComponent
    },
    {
        path: 'typography',
        component: TypographyComponent
    },
    {
        path: 'icons',
        component: IconsComponent
    },
    {
        path: 'maps',
        component: MapsComponent
    },
    {
        path: 'notifications',
        component: NotificationsComponent
    },
    {
        path: 'upgrade',
        component: UpgradeComponent
    },
    {
        path: 'forfait',
        component: ForfaitComponent
    },
    {
        path: 'ajoutClient',
        component: AjoutClientComponent
    },
    {
        path: 'materiel',
        component: MaterielComponent
    },
    {
        path: 'ajoutMateriel',
        component: AjoutMaterielComponent
    },
    {
        path: 'parcours',
        component: ListParcoursComponent
    },
    {
        path: 'ajoutParcours',
        component: AjoutParcoursComponent
    },
    {
      path: 'updateParcours',
      component:UpdateParcoursComponent
    },
    {
      path: 'login',
      component: LoginComponent
    },
    {
      path:'ajoutAchatForfait',
      component: AjoutAchatForfaitComponent
    },
    {
      path:'ajoutAchatParcours',
      component: AjoutAchatParcoursComponent

    },
    {
      path:'accueil',
      component: ClubComponent
    }
]
