import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NewExpeComponent } from './new-expe.component';

describe('NewExpeComponent', () => {
  let component: NewExpeComponent;
  let fixture: ComponentFixture<NewExpeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NewExpeComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NewExpeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
