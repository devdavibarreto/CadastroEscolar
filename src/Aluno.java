import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Aluno {
Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    String nome ="";
    String sobrenome = "";
    String cpf = "";
    String dataDeNascimento = "";
    String matriculaAtiva = "";


    protected String[] cadastraraluno(){
        System.out.println("Qual o nome do aluno ? ");
        nome = scanner.next();
        System.out.println("Qual o Sobrenome do aluno ? ");
    sobrenome = scanner.next();
        System.out.println("Qual e o  cpf do aluno ? ");
        cpf = scanner.next();
        System.out.println("Qual e a data de nascimento do aluno ? ");
        dataDeNascimento = scanner.next();
        System.out.println("A matrícula do aluno esta ativa ");
        matriculaAtiva = scanner.next();

    String[] dados = {nome,sobrenome,cpf,dataDeNascimento,matriculaAtiva};

    return dados;
}
    protected void exibirDadosDoAluno() {
       String[] dadosDoEstudante = {nome, sobrenome, cpf, dataDeNascimento, matriculaAtiva};

        System.out.println(Arrays.toString(dadosDoEstudante));

        for (int x = 0; x < dadosDoEstudante.length; x++) {
            if (x == 0 || x == 1 || x == 2 || x == 3) {
                continue;
            }
            System.out.println("Matrícula do aluno se encontra Ativa : " + dadosDoEstudante[x]);
        }
    }


}
