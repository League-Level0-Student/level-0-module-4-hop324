int x1 = 325;
int x2 = 400;
void setup(){
  PImage face = loadImage("spongebob.jpg");
  size(700, 700);
  face.resize(width, height);
  background(face);
}
void draw(){
  if(mouseX <= 325){
mouseX = 325;
}
if (mouseX >= 360){
  mouseX = 360;
}
if(mouseY <= 225){
mouseY = 225;}
if(mouseY >= 275){
mouseY = 275;}
  fill(#FFFFFF);
  ellipse(335, 250, 80, 100);
  fill(#000000);
  ellipse(mouseX, mouseY, 30, 30);
 fill(#FFFFFF);
 ellipse(400, 275, 80, 100);
 fill(#000000);
 ellipse(mouseX+ 50, mouseY +25, 30, 30);

}