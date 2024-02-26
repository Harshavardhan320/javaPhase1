import { Directive, ElementRef, HostListener, Renderer2 } from '@angular/core';

@Directive({
  selector: '[appDre]',
  standalone: true
})
export class DreDirective {

  constructor(private el: ElementRef){}

  @HostListener('click') click(){
    this.hightlight('red', 'overline');
  }
  @HostListener('mouseenter') onMouseEnter(){
    this.hightlight('blue', 'underline');
  }
  @HostListener('mouseleave') onMouseleave(){
    this.hightlight('green', 'overline');
  }
  private hightlight(color:String | null, text:String | null){
    this.el.nativeElement.style.backgroundColor = color;
    this.el.nativeElement.style.textDecoration= text;
    this.el.nativeElement.style.fontSize='23px';
  }
}
