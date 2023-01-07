import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListarRespuestaComponent } from './listar-respuesta.component';

describe('ListarRespuestaComponent', () => {
  let component: ListarRespuestaComponent;
  let fixture: ComponentFixture<ListarRespuestaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListarRespuestaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListarRespuestaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
