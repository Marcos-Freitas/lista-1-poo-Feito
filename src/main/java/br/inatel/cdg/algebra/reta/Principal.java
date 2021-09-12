package br.inatel.cdg.algebra.reta;

import org.graalvm.compiler.nodes.extended.GetClassNode;

import jdk.nashorn.internal.objects.annotations.Getter;

//Feito sem o JavaX

public class Principal {
    public static void main(String[] args) {

        Ponto p1 = new Ponto(5,6);
        Ponto p2 = new Ponto(3,36);

        Reta reta = new Reta(p1, p2);

        double coefAngular = reta.calcCoeficienteAngular();
        double coefLinear = reta.calcCoeficienteLinear();

        System.out.println("Coef Angular: " + coefAngular);
        System.out.println("CoefLinear: " + coefLinear);

    }
}
