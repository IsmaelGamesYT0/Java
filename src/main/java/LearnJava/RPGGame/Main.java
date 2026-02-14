package LearnJava.RPGGame;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Warrior warrior1 = new Warrior("Roronoa Zoro", 100, "Wado Ichimonji", 20);
        Warrior warrior2 = new Warrior("Dracule Mihawk", 150, "Yoru Kokutō", 40);
        
        Scanner scanner = new Scanner(System.in);
        int opcao;
        int bloqueio = 30;
        int curar;

        System.out.println("\n=================================");
        System.out.println("Olá, Seja bem-vindo ao meu jogo de RPG.");
        System.out.println("Siga abaixo qual é o seu guerreiro e a sua espada.");
        System.out.println("=================================");

        System.out.println("Guerreiro: " + warrior1.NameWarrior +
                " | Espada: " + warrior1.sword.SwordName +
                " | Dano: " + warrior1.sword.SwordDamage +
                " | Vida: " + warrior1.HealthWarrior);

        System.out.println("=================================");
        System.out.println("E agora veja quem será seu oponente.");
        System.out.println("Guerreiro: " + warrior2.NameWarrior +
                " | Espada: " + warrior2.sword.SwordName +
                " | Dano: " + warrior2.sword.SwordDamage +
                " | Vida: " + warrior2.HealthWarrior);
        System.out.println("=================================");

        boolean rodando = true;

        while (rodando) {
            System.out.println("=================================");
            System.out.println("Qual ação você deseja fazer?");
            System.out.println("[1] - Atacar  [2] Defender (reduz dano recebido)  [3] Curar (pouco, com limite)  [4] Sair");
            System.out.print("Escolha: ");

            if (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Opção inválida. Digite 1, 2, 3 ou 4");
                continue;
            }

            opcao = scanner.nextInt();
            System.out.println("=================================");

            switch (opcao) {
                case 1: {
                    // Player ataca
                    int danoCausado = warrior1.attack(warrior2, bloqueio);
                    System.out.println(warrior1.NameWarrior + " atacou com " + warrior1.sword.SwordName +
                            " e causou " + danoCausado + " de dano!");
                    System.out.println("Vida de " + warrior2.NameWarrior + ": " + warrior2.HealthWarrior);

                    if (!warrior2.isAlive()) {
                        System.out.println("\n" + warrior2.NameWarrior + " foi derrotado! Você venceu! 🏆");
                        rodando = false;
                        break;
                    }

                    // Inimigo contra-ataca
                    int danoRecebido = warrior2.attack(warrior1);
                    System.out.println("\n" + warrior2.NameWarrior + " contra-atacou com " + warrior2.sword.SwordName +
                            " e causou " + danoRecebido + " de dano!");
                    System.out.println("Vida de " + warrior1.NameWarrior + ": " + warrior1.HealthWarrior);

                    if (!warrior1.isAlive()) {
                        System.out.println("\n" + warrior1.NameWarrior + " foi derrotado... Você perdeu. 💀");
                        rodando = false;
                        break;
                    }
                }

                case 2: {    
                    int danoRecebido = warrior2.attack(warrior1, bloqueio);
                    System.out.println("\n" + warrior2.NameWarrior + " atacou com " + warrior2.sword.SwordName +
                            " e causou " + danoRecebido + " de dano!");
                    
                    System.out.println("\n" + warrior1.NameWarrior + " defendeu e reduziu o dano para " + danoRecebido);
                    System.out.println("Vida de " + warrior1.NameWarrior + ": " + warrior1.HealthWarrior);

                    if (!warrior1.isAlive()) {
                        System.out.println("\n" + warrior1.NameWarrior + " foi derrotado... Você perdeu. 💀");
                        rodando = false;
                        break;
                    }
                }

                case 3: {
                    if (warrior1.HealthWarrior <= 50) {
                        curar = warrior1.HealthWarrior + 20;
                        System.out.println("Sua vida foi curada e agora é " + curar);
                        break;
                    }
                }

                case 4: {
                    System.out.print("\nSaindo...");
                    System.out.print(" 3...");
                    Thread.sleep(700);
                    System.out.print(" 2...");
                    Thread.sleep(700);
                    System.out.print(" 1...");
                    Thread.sleep(700);
                    System.out.println("\nObrigado por jogar meu RPG!");
                    rodando = false;
                    break;
                }
                default: {
                    System.out.println("Opção inválida. Digite 1 ou 2.");
                    break;
                }
            }
        }
        scanner.close();
    }
}