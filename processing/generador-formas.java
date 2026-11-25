//Se ejecuta primero pero una sola vez
void setup(){
  size(64,64);
}

//Se ejecuta en un loop
void draw(){

  //Iterar para 3 figuras geométricas
  for (int i = 0; i < 3; i++){
    //Configuración
    background(255);  //Color de fondo
    pushMatrix();     //Traslación de objetos
    strokeWeight(4);  //Borde
    
    //Generaremos círculos en diferentes tamaños y lugares
    //con la condición que no se renderice fuera del lienzo
    float r = random(8, 24);  //Radio
    float x = random(r, width - r);  //Eje X
    float y = random(r, height - r);  //Eje Y
    
    //Color de borde
    stroke(random(100), random(100), random(100));
    
    //Mover plano
    translate(x, y);
    
    //Condición 0 = círculos
    if (i == 0){
      circle(0, 0, (r*2));
      saveFrame("data/circle###.png");
    }else if (i == 1){
      //Cuadrados
      rectMode(CENTER);
      rotate(random(-0.1, 0.1));
      square(0, 0, (r*2));
      saveFrame("data/square###.png");
    }else if (i == 2){
      //Triángulos
      rotate(random(-0.1, 0.1));
      triangle(0, -r, r, r, -r, r);
      saveFrame("data/triangle###.png");
    }
    
    popMatrix();
  }//end for()
  
  if (frameCount == 100){
    exit();
  }
}