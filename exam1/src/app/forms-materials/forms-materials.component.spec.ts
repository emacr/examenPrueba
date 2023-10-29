import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormsMaterialsComponent } from './forms-materials.component';

describe('FormsMaterialsComponent', () => {
  let component: FormsMaterialsComponent;
  let fixture: ComponentFixture<FormsMaterialsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [FormsMaterialsComponent]
    });
    fixture = TestBed.createComponent(FormsMaterialsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
