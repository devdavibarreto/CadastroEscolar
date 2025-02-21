import java.util.Arrays;

public class Aluno {

    String nome = "";
    String sobrenome = "";
    String cpf = "";
    String dataDeNascimento = "";
    String matriculaAtiva = "";
    private String[] nomes;

    protected void exibirDadosDoAluno(){
        String dadosDoAluno[] = {nome,sobrenome,cpf,dataDeNascimento,matriculaAtiva};
        System.out.println(Arrays.toString(dadosDoAluno));

        for(int x = 0; x < dadosDoAluno.length;x++){
            if (x == 0 || x == 1 || x == 2 ||x == 3){
               continue;
            }
            System.out.println("Matrícula do aluno se encontra : " + dadosDoAluno[x]);
        }
  }


  public String ExibirAlunos(){

      System.out.println("oi");
      return "";
  }

}
