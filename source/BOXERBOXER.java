import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class BOXERBOXER extends PApplet {

public void setup() {
  
  background(0);
  
}

public void draw(){
  if (frameCount % 10 == 0) {
    fill(random(1, 255),random(1, 255),random(1, 255),random(1, 255));
    noStroke();
    //stroke(random(1, 255),random(1, 255),random(1, 255),random(1, 255));
    pushMatrix();
    translate(500, 500);
    rotate(radians(frameCount * 3.1459f % 360));
    rect(random(-500,500), random(-500,500), random(-500,500), random(-500,500));
    popMatrix();
  }
}
  public void settings() {  size(1000, 1000);  smooth(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "BOXERBOXER" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
