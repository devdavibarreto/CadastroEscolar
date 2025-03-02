import java.util.Arrays;
import java.util.Locale;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Aluno {
Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    String nome = "";
    String sobrenome = "";
    String cpf = "";
    String dataDeNascimento = "";


    protected void cadastrarAluno(){
        System.out.println("Qual o nome do aluno ? ");
         nome = scanner.next();
        System.out.println("Qual o Sobrenome do aluno ? ");
       sobrenome = scanner.next();
        System.out.println("Qual e o  cpf do aluno ? ");
        cpf = scanner.next();
        System.out.println("Qual e a data de nascimento do aluno ? ");
   dataDeNascimento = scanner.next();


    String[] dados = {nome,sobrenome,cpf,dataDeNascimento};

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

            if (x==3){
                BuscaPorCpfEstudante(dadosDoEstudante[x]);
            }
        }

        double matriculaAtiva = numeroDaMatricula();
        System.out.println(" A Matrícula do aluno se encontra Ativa : " +  matriculaAtiva );

    }

    private  double numeroDaMatricula(){

        return ThreadLocalRandom.current().nextDouble(1,2);
    }

    private String BuscaPorCpfEstudante(String dados){

       return  "O CPF DO ALUNO É: " + dados;


    }

    public void pesquisarCpf(String cpfInput ){
        String cpfCadastrado = BuscaPorCpfEstudante(cpf);

        if (cpfInput != cpfCadastrado){
            System.out.println("CPF INVÁLIDO");
        }else{
            System.out.println( "O CPF PERTENCE AO ALUNO(A) :" + cpf);
        }
    }
    public void consultarDeCpfAluno(){

    System.out.println("O CPF DO ALUNO É " + cpf);
}




}
