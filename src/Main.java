import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        double peso;
        double estatura;
        double imc;

        System.out.println("Escriba su peso en kilogramos");
        peso=teclado.nextDouble();
        System.out.println("Escriba su estatura ");
        estatura=teclado.nextDouble();
        imc=peso/(estatura*2);
        if(imc<=18.5){
            System.out.println("su situacion es un pejo bajo");
        }else if(imc<=18.5 && imc>=24.9){
            System.out.println("su situacion es de peso normal");
        }else if(imc >=25 && imc <=25.9){
            System.out.println("su situacion es sobre peso de grado 1");
        }else if(imc >= 27 && imc <=29.9){
            System.out.println("su situacion es sobre peso de grado 2");
        }else if(imc >= 30 && imc <=34.9){
            System.out.println("su situacion es obecidad de tipo 1");
        }else if(imc >= 35 && imc <=39.9){
            System.out.println("su situacion es obecidad de tipo 2");
        }else if(imc >= 40 && imc <=49.9){
            System.out.println("su situacion es obecidad morbida");
        }else{
            System.out.println("su situacion es obecidad extrema");
        }
        System.out.println("su indice de masa corporal es (IMC)"+imc);
    }
}