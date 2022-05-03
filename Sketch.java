import processing.core.PApplet;

public class Sketch extends PApplet {

  String message = "";
  float circleX = 100;
  float circleY = 100;
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255);
    textSize(30);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    text(message, 25, 200);
    
	if(keyPressed){
    if(key == 'r'){
      background(255, 0, 0);
    }else if(key == 'b'){
      background(0, 4, 255);
    }else if(key == 'g'){
      background(0, 255, 0);
    }
  }
  
  if (mousePressed) {
    
  ellipse(mouseX, mouseY, 25, 25);
  }
    
  }

  public void keyPressed() {
    if (keyPressed) {
    if (keyCode == UP) {
      circleY--;
    } 
    else if (keyCode == DOWN) {
      circleY++;
    } 
    else if(keyCode == LEFT){
      circleX--;
    }
    else if(keyCode == RIGHT){
     circleX++; 
    }
  } 

  ellipse(circleX, circleY, 50, 50);
}
  
  public void mouseDragged(){

    //make a sun
    fill(252, 227, 3);
    ellipse((float) (width/1.333), (float) (height*.175), (float) (width/5), (float) (height/4));
  }

  public void keyTyped() {
  message += key;
}
  
  // define other methods down here.
}