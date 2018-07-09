PImage mustache;
PImage friend;
PImage TopHat;
void setup() {
  friend = loadImage ("shep.jpg");
  size(800, 600);
  friend.resize(width, height);
  mustache = loadImage ("beard.png");
    mustache.resize(300,600);
    background(friend);
    TopHat = loadImage ("TopHat.png");
    TopHat.resize(150,250);
}
void draw() {
 
  if (mousePressed) {
    background(friend);
     image (mustache, mouseX, mouseY);
  }
  image(TopHat,350,0);
}