import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddRepuestaComponent } from './add-repuesta.component';

describe('AddRepuestaComponent', () => {
  let component: AddRepuestaComponent;
  let fixture: ComponentFixture<AddRepuestaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddRepuestaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddRepuestaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
