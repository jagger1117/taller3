
package ejercicio19;

public class Ejercicio19 {
    float lado;
    float altura;
    float hipotenusa;
    
    void ca(){
         altura=(float)((Math.pow(lado,2))*(float)(Math.pow(3,0.5))/4);
         }
      void ch(){
        hipotenusa=(float)((lado*(Math.pow(3,0.5)))/2) ;;
    }
    
      void area(){
          ca();
        float area= (lado*altura)/2;
        System.out.println("el area es " + area);
    }
    
  
    void perimetro(){
        float perimetro=3*lado;
        System.out.println("el perimetro es " + perimetro);
    }
    public static void main(String[] args) {
    
        Formulario form = new Formulario();
        form.setVisible(true);
    }
}
