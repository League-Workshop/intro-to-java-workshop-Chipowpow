PImage rainbow;
  PImage unicorn;
void setup(){
  rainbow = loadImage("chipowporainbow.png");
  size(800, 600);
  rainbow.resize(width,height);
  
  unicorn = loadImage ("scaryunicorn.jpg");
  unicorn.resize(90,90);
}
  
  void draw()
  {
    background(rainbow);
  image(unicorn,mouseX,mouseY);
  }