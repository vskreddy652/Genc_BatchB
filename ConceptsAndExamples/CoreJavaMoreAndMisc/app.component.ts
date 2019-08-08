import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  styles: [`
    .app {
      display: block;
      text-align: center;
      padding: 25px;
      background: #f5f5f5;
    }
  `],
  template: `
    <div class="app">
    <div *ngFor="let ccount of cArray">
    <counter [count]="ccount"></counter>
    </div>    
    </div>
  `
})
export class AppComponent {
  //initialCount: number = 10;
  cArray:number[] = [8,9,10];
}