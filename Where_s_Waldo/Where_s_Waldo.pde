void setup() {
      PImage waldo = loadImage("Waldo2ElectricBoogaloo.jpeg"); // 5. Change this to match your file name.
      size(500, 500);
      waldo.resize(500, 500);
      image(waldo, 0, 0);
     //doh = minim.loadSample("homer-doh.wav"); //drag and drop from project onto sketch
    // woohoo = minim.loadSample("homer-woohoo.wav"); //drag and drop from project onto sketch
}

void draw() {
      // 6. Use this print statement to find out the coordinates of Waldo
      // println("X: " + mouseX + " Y: " + mouseY); 
      println("X:" + mouseX + "Y:" + mouseY);
if(mouseX == 119 && mouseY == 396){
println("waldo found!");
}
      // 7. If the mouse is on Waldo, print “Waldo found!”

      // 8. If Waldo is found, also use the method below to play “Woohoo”
      // Change the name of the sound file if you need to 
      // 9. If the mouse is pressed and they’re not on Waldo, play “Doh”
      // Change the name of the sound file if you need to 
}

/*void playWoohoo() {
     woohoo.stop();
     woohoo.trigger();
}

void playDoh() {
     doh.stop();
     doh.trigger();
}

import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample doh;
AudioSample woohoo;*/