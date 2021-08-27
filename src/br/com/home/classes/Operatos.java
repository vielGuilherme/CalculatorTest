package br.com.home.classes;

public class Operatos {

//    public Operatos(int a, int b) {
//        this.a = a;
//        this.b = b;
//    }

    public int sum(int a, int b){
        return a + b;
    }
    public int sub(int a, int b){
        return a - b;
    }
    public double div(int a, int b){
        if (b == 0){
            System.out.println("Impossivel dividir por zero");
        }
        return a / b;
    }
    public int mult(int a, int b){
        return a * b;
    }
}
