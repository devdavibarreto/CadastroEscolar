import java.util.Arrays;
import java.util.Locale;

import java.util.Scanner;

public class Aluno {
Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    protected void cadastrarAluno(){
        System.out.println("Qual o nome do aluno ? ");
        String  nome = scanner.next();
        System.out.println("Qual o Sobrenome do aluno ? ");
        String sobrenome = scanner.next();
        System.out.println("Qual e o  cpf do aluno ? ");
        String   cpf = scanner.next();
        System.out.println("Qual e a data de nascimento do aluno ? ");
        String  dataDeNascimento = scanner.next();
        System.out.println("A matrícula do aluno esta ativa ");
        String  matriculaAtiva = scanner.next();

    String[] dados = {nome,sobrenome,cpf,dataDeNascimento,matriculaAtiva};

    // Enviando dados para a função
        exibirDadosDoAluno(dados);


}

// definindo como private para que o User ñ tenha acesso evitando bugs
    private void exibirDadosDoAluno(String[] dados) {
       String[] dadosDoEstudante = dados;

        System.out.println(Arrays.toString(dadosDoEstudante));

        // Usando for para exibir se a matrícula esta ativa ou não
        for (int x = 0; x < dadosDoEstudante.length; x++) {
            if (x == 0 || x == 1 || x == 2 || x == 3) {
                continue;
            }
            System.out.println("Matrícula do aluno se encontra Ativa : " + dadosDoEstudante[x]);

            if (x==3){
                cpfEstudante(dadosDoEstudante[x]);
            }
        }

    }
    private String cpfEstudante( String dados){

       return  "O CPF DO ALUNO É: " + dados;


    }

public void consultarDeCpfAluno(){
    System.out.println();
}



}
