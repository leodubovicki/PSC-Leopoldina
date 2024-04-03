import java.util.Scanner;

public class DiarioDeNotas{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 'Aluno' se você for um aluno e 'Professor'");
        String usuario = sc.nextLine();

        if (usuario.equalsignoreCase("Professor")){
            System.out.println("Digite o seu nome");
            String nome = sc.nextLine();
            System.out.println("Ola Professor" + nome + "seja bem vindo");

        }else if(usuario.equalsignoreCase("Aluno")){
            System.out.println("Digite o seu nome");
            String nome = sc.nextLine();
            System.out.prontln("Ola Aluno" + nome + "seja bem vindo");
            System.out.println("Digite suas notas");
            double nota1, nota2, nota3;

            nota1 = sc.nextDouble();
            nota2 = sc.nextDouble();
            nota3 = sc.nextDouble();

            double media = (nota1 + nota2 + nota3)/3;
            System.out.println("Sua média é" + media);
            

        }else{
            System.out.println("Opção invalida ");
            
        }
        

        }
        
    }
