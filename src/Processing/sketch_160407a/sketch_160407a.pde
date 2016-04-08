void setup() {
  size(800, 800);
}

void draw() {
  
   //2. make it a nice color
fill(102,238,204);
   //3. if the mouse is pressed, fill the circle with a different color          
if(mousePressed)
  fill(204,34,187);
   //1. draw an ellipse
ellipse(mouseX,mouseY,500,500);
}

