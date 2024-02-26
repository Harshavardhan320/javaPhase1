import { Directive, ElementRef, HostListener, Renderer2 } from '@angular/core';

@Directive({
  selector: '[appDre]',
  standalone: true
})
export class DreDirective {

  constructor(private el: ElementRef){}

  @HostListener('click') onMouseClick(){
    this.hightlight('red');
  }
  private hightlight(color:String | null){
    this.el.nativeElement.style.backgroundColor = color;
  }
}
