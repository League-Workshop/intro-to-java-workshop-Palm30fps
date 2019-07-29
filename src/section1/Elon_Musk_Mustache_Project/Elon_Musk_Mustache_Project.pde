PImage mustache;
PImage friend;
void setup() {mustache=loadImage("ElonMustache.png"); 
  friend=loadImage("ElonMuskProject.jpeg");
  size(800,600);
  friend.resize(width,height);


}




void draw() {
  background(friend);


if(mousePressed)
{image(mustache, mouseX,mouseY);}



}
