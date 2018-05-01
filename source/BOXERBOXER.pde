void setup() {
  size(1000, 1000);
  background(0);
  smooth();
}

void draw(){
  if (frameCount % 10 == 0) {
    fill(random(1, 255),random(1, 255),random(1, 255),random(1, 255));
    noStroke();
    //stroke(random(1, 255),random(1, 255),random(1, 255),random(1, 255));
    pushMatrix();
    translate(500, 500);
    rotate(radians(frameCount * 3.1459 % 360));
    rect(random(-500,500), random(-500,500), random(-500,500), random(-500,500));
    popMatrix();
  }
}
