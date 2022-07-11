public class TarefaFulano {

    public static void main(String args[]){

        System.out.println ("Notas do aluno Fulano");


        double nota1 = 0.5;
        System.out.println("nota 1: " + nota1);
        double nota2 = 8.5;
        System.out.println("nota 2: " + nota2);
        double nota3 = 5.0;
        System.out.println("nota 3: " + nota3);
        double nota4 = 7.0;
        System.out.println("nota 4: " + nota4);
        double nota5 = (nota1+nota2+nota3+nota4)/4;
        System.out.println("Média Final: " + nota5);

        if (nota5 >= 7) {
            System.out.println("Aprovado");
        } else if (nota5 >= 5){
            System.out.println("Recuperação");
        } else {
        System.out.println("Reprovado");

        }


    }
}
