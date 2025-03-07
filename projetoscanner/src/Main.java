import java.util.Scanner;
        public class Main {
            public static void main(String[] args) {
                Scanner newscanner = new Scanner(System.in);

                // Nome do usuário
                System.out.println("Digite o seu nome: ");
                String nome = newscanner.nextLine();

                // Idade atual
                System.out.println("Digite sua idade: ");
                int idadeAtual = newscanner.nextInt();

                // Altura em Metros
                System.out.println("Digite a sua altura em metros: ");
                double alturaMetros = newscanner.nextDouble();

                //Peso
                System.out.println("Digite o seu peso: ");
                double peso = newscanner.nextDouble();

                // Conversão de Hoje para 30 anos e também altura de metros para centímetros
                int calculoCinquenta = 50 - idadeAtual ;
                int alturaCm = (int)(alturaMetros * 100);

                // Resposta sobre nome e idade
                System.out.println("Olá " + nome + "!" + " Faltam " + calculoCinquenta + " anos, para voce ter 50 anos. ");

                // Resposta sobre a altura de metros para cm
                System.out.println("Sua altura em centímetros é: " + alturaCm + " cm.");

                newscanner.close();

            }
        }