import { NgModule } from '@angular/core';
import { MatButtonModule, ErrorStateMatcher, ShowOnDirtyErrorStateMatcher, MatInputModule } from '@angular/material';

const MaterialComponents = [ MatButtonModule, MatInputModule ];

@NgModule({
  providers: [{provide: ErrorStateMatcher, useClass: ShowOnDirtyErrorStateMatcher}],
  imports: [MaterialComponents],
  exports: [MaterialComponents]
})
export class MaterialModule { }
