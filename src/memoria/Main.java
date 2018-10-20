package memoria;

import java.util.Scanner;

public class Main {

    public static String [] memoria = new String[]{"", "A", "", "", "", "", "B", "B", "B", ""};
    public static int opcao = 0;

    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        System.out.print("Opcao [1;3]: ");
        opcao = ler.nextInt();
        boolean flag = true;
        controlMemoria cm = new controlMemoria();
        while (flag == true) {
            switch (opcao) {
                case 1:
                    System.out.println("*** CASO 1 ***");
                    memoria = new String[]{"", "A", "", "", "", "", "B", "B", "B", ""};
                    cm.caso1(1,2,2); //Pasa por parametro los espacios de la memoria que se van a usar.
                    System.out.println("\n***************");
                    System.out.println("Selecione o caso [1;3]");
                    opcao = ler.nextInt();
                    break;
                case 2:
                    System.out.println("*** CASO 2 ***");
                    memoria = new String[]{"", "", "A", "", "", "", "B", "", "", ""};
                    cm.caso2(3,1,2,1);
                    System.out.println("\n***************");
                    opcao = ler.nextInt();
                    break;
                case 3:
                    System.out.println("*** CASO 3 ***");
                    memoria = new String[]{"", "", "A", "", "", "", "B", "", "", "G"};
                    cm.caso3(2,3,2,1);
                    System.out.println("\n***************");
                    opcao = ler.nextInt();
                    break;
                default:
                    flag = false;
                    System.out.println("Saiu");
                    break;
            }
        }
    }
}
