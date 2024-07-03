package Luciano.Javaprincipal.SEMANAUM;

public class BoletimEstudantil {
    public static void main(String[] args) {

        int notaFinal = 6;

        if(notaFinal>7)
        System.out.println("APROVADO");
        else if(notaFinal==6)
        System.out.println("PROVA DE RECUPERACION");
        else
            System.out.println("REPROVADO");
   }
}
