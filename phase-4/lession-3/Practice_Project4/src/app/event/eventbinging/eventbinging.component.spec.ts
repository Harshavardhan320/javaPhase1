import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EventbingingComponent } from './eventbinging.component';

describe('EventbingingComponent', () => {
  let component: EventbingingComponent;
  let fixture: ComponentFixture<EventbingingComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [EventbingingComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(EventbingingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
