import com.google.gson.Gson;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);

        int menu = 0;

        List<Filme> historicosDeFilmes = new ArrayList<>();
        ConsumoApi consumo = new ConsumoApi();

        Gson gson = new Gson();


        do {
            //MENU

            System.out.println("*********MENU*********");
            System.out.println("1 - Bucar Filme ");
            System.out.println("2 - Historico de pesquisas");
            System.out.println("0 - Sair");
            menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {

                //BUSCA DE FILME
                System.out.println("Digite filme desejado: ");
                String filmeBusca = scanner.nextLine();


                //SALVANDO NA LISTA
                String json = consumo.buscaDeFilme(filmeBusca);
                Filme filme = gson.fromJson(json, Filme.class);
                historicosDeFilmes.add(filme);

                System.out.println(filme);


            } else if (menu == 2) {

                // MOSTRAR LISTA
                for (Filme historicosDeFilme : historicosDeFilmes) {
                    System.out.println(historicosDeFilme);
                }

            } else if (menu == 0) {

                //FECHAR PROGRAMA
                System.out.println("Saindo");
                break;

            } else if (menu != 3) {

                //OPÇÃO NÃO VALIDA
                System.out.println("Opção invalida");

            }

        } while (true);


    }
}