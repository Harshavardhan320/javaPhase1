import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BingingComponent } from './binging.component';

describe('BingingComponent', () => {
  let component: BingingComponent;
  let fixture: ComponentFixture<BingingComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [BingingComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(BingingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
