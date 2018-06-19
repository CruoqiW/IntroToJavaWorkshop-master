PImage rainbow;
  PImage unicorn;

void setup(){
 
size(800,600);
rainbow=loadImage("rainbow.png1");
rainbow.resize(800,600);
unicorn=loadImage("unicorn.png");  
background(rainbow);
unicorn.resize(200,145);


}
void draw(){
background(rainbow);
  image(unicorn,mouseX,mouseY);
}