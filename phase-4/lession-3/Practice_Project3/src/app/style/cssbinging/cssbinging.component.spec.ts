import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CssbingingComponent } from './cssbinging.component';

describe('CssbingingComponent', () => {
  let component: CssbingingComponent;
  let fixture: ComponentFixture<CssbingingComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CssbingingComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(CssbingingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
