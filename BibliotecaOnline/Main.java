
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // pensei em criar em array list mas n sei mexer com isso
        // fazer aquele esquema de polimorfia que checa se algo é filho é muito confuso
        Ebook book1 = new Ebook("O Principe","Maquiavel","Politica",0.4f);
        Ebook book2 = new Ebook("Alimentos"," Loro José","Culinaria",50.5f);
        VideoDigital video1 = new VideoDigital("Como usar o Git Hub","Coisa Ruim","Vendas de Alma",2.3f,10.4f);
        VideoDigital video2 = new VideoDigital("Tutorial Java","Tinhoso","Programacao",6.66f,777f);

        System.out.println(" ");
        System.out.println("Lembrando que até eu saber fazer printar Lista em Array corretamente vou melhorar isso");
        System.out.println("Por enquanto sua escolha irá imprimir tudo dos obejtos");
        while (true) {
            System.out.println("Oque deseja Fazer:");
            System.out.println("1-Ver a Descrição dos Itens");
            System.out.println("2-Visualizar os Videos");
            System.out.println("3-Baixar os Itens");
            System.out.println("4-Sair");

            int escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha){
                // poderia fazer um for em arraylist do ItemBiblioteca iguala  professora, mas eu n entendi como fazer pra conseguir isso
                case 1:
                    book1.descricao();
                    book2.descricao();
                    video1.descricao();
                    video2.descricao();
                    System.out.println("Processo Finalizado - Enter para continuar...");
                    sc.nextLine();
                    break;

                case 2:
                    video1.visualizar();
                    System.out.println("Pressione Enter para continuar...");
                    sc.nextLine();  // Aguarda o usuário pressionar Enter
                    video2.visualizar();
                    System.out.println("Processo Finalizado - Enter para continuar...");
                    sc.nextLine();
                    break;

                case 3:
                    book1.baixar();
                    System.out.println("Pressione Enter para continuar...");
                    sc.nextLine();
                    book2.baixar();
                    System.out.println("Pressione Enter para continuar...");
                    sc.nextLine();
                    video1.baixar();
                    System.out.println("Pressione Enter para continuar...");
                    sc.nextLine();
                    video2.baixar();
                    System.out.println("Processo Finalizado - Enter para continuar...");
                    sc.nextLine();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Escolha invalida");
            }
        }


    }
}
