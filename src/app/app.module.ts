import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { HttpClientModule} from '@angular/common/http';

import { AppComponent } from './app.component';
import { AppRoutes } from './app.routing';
import { SidebarModule } from './sidebar/sidebar.module';
import { FooterModule } from './shared/footer/footer.module';
import { NavbarModule} from './shared/navbar/navbar.module';
import { FixedPluginModule} from './shared/fixedplugin/fixedplugin.module';
import { NguiMapModule} from '@ngui/map';
import { FormsModule } from '@angular/forms';
import { ToastrModule } from 'ngx-toastr';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatCardModule } from '@angular/material/card';
import { MatIconModule } from '@angular/material/icon';
import { CarouselModule } from 'ngx-bootstrap/carousel';

import { DashboardComponent }   from './dashboard/dashboard.component';
import { TypographyComponent }   from './typography/typography.component';
import { IconsComponent }   from './icons/icons.component';
import { MapsComponent }   from './maps/maps.component';
import { NotificationsComponent }   from './notifications/notifications.component';
import { UpgradeComponent }   from './upgrade/upgrade.component';

import { ClientComponent }   from './clients/client/client.component';
import { ListClientsComponent }   from './clients/listClients/listClients.component';
import { ForfaitComponent } from './forfaits/forfait/forfait.component';
import { AjoutForfaitComponent } from './forfaits/ajout-forfait/ajout-forfait.component';
import { PersonnelComponent } from './personnels/personnel/personnel.component';
import { ListpersonnelsComponent } from './personnels/listpersonnels/listpersonnels.component';
import { AjoutClientComponent } from './clients/ajout-client/ajout-client.component';
import { MaterielComponent } from './materiels/materiel/materiel.component';
import { AjoutMaterielComponent } from './materiels/ajout-materiel/ajout-materiel.component';
import { ListParcoursComponent } from './parcours/list-parcours/list-parcours.component';
import { AjoutParcoursComponent } from './parcours/ajout-parcours/ajout-parcours.component';
import { ClientService } from './clients/client.service';
import { ForfaitService } from './forfaits/forfait.service';
import { PersonnelService } from './personnels/personnel.service';
import { MaterielService } from './materiels/materiel.service';
import { ParcoursService } from './parcours/parcours.service';
import { AchatParcoursService } from './achatParcours/achat-parcours.service';
import { LoginService } from './login/login.service';

import { LoginComponent } from './login/login.component';
import { ClubComponent } from './club/club.component';

import { CookieService } from 'ngx-cookie-service';
import { UpdateParcoursComponent } from './parcours/update-parcours/update-parcours.component';
import { UpdateForfaitComponent } from './forfaits/update-forfait/update-forfait.component';
import { AjoutAchatForfaitComponent } from './achatForfait/ajout-achat-forfait/ajout-achat-forfait.component';
import { AjoutAchatParcoursComponent } from './achatParcours/ajout-achat-parcours/ajout-achat-parcours.component';


@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    ClientComponent,
    ListClientsComponent,
    TypographyComponent,
    IconsComponent,
    MapsComponent,
    NotificationsComponent,
    UpgradeComponent,
    ForfaitComponent,
    PersonnelComponent,
    ListpersonnelsComponent,
    AjoutClientComponent,
    MaterielComponent,
    ListParcoursComponent,
    AjoutMaterielComponent,
    AjoutParcoursComponent,
    LoginComponent,
    AjoutForfaitComponent,
    ClubComponent,
    UpdateParcoursComponent,
    UpdateForfaitComponent,
    AjoutAchatForfaitComponent,
    AjoutAchatParcoursComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(AppRoutes),
    SidebarModule,
    NavbarModule,
    FooterModule,
    HttpClientModule,
    MatIconModule,
     FormsModule,
     ToastrModule.forRoot(),
     CarouselModule.forRoot(),
     BrowserAnimationsModule,
     MatCardModule,
    FixedPluginModule,
    NguiMapModule.forRoot({apiUrl: 'https://maps.google.com/maps/api/js?key=YOUR_KEY_HERE'})

  ],
  providers: [ClientService, ForfaitService, PersonnelService, MaterielService, ParcoursService, CookieService,LoginService, AchatParcoursService],
  bootstrap: [AppComponent]
})
export class AppModule { }
