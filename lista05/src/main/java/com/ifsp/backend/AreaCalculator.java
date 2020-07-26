package com.ifsp.backend;

public class AreaCalculator {

    /**
     * Círculo
     */
    public double calcular(double raio) {
        double n = 3.14159;
        double area;
        area = n * (raio * raio);
        return area;
    }

    /**
     * Quadrado
     */
    public double calcular(double base, double altura) {
        double area;
        area = base * altura;
        return area;
    }

    /**
     * Triângulo
     */
    public double calcular(int base, double altura) {
        double area;
        area = (base * altura) / 2;
        return area;
    }
        
    public String calcular(String texto) {
        return "Uso incorreto";
    }
}
