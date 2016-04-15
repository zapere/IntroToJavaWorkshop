void setup() {
  size(800, 800);
}
int magenta = 75;
int cyan = 10;
int cyanSpace = 10;
int magentaSpace = 30;
void draw() {
  

fill(102,238,204);
  
if(mousePressed){
  fill(204,34,187);
  ellipse(mouseX,mouseY,magenta,magenta);
  ellipse(mouseX+magentaSpace,mouseY+magentaSpace,magenta,magenta);
  ellipse(mouseX,mouseY+magentaSpace,magenta,magenta);
  ellipse(mouseX+magentaSpace,mouseY,magenta,magenta);
}
  else{ 
ellipse(mouseX+cyanSpace,mouseY+cyanSpace,cyan,cyan);
ellipse(mouseX,mouseY+cyanSpace,cyanSpace,cyanSpace);
ellipse(mouseX+cyanSpace,mouseY,cyan,cyan);
ellipse(mouseX+cyanSpace,mouseY,cyan,cyan);

  }
}

