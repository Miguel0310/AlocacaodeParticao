package memoria;

import java.util.Scanner;

public class Main {

    public static String [] memoria = new String[]{"", "A", "", "", "", "", "B", "B", "B", ""};
    public static int opcao = 0;

    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        System.out.print("Opcao: ");
        opcao = ler.nextInt();
        boolean flag = true;
        controlMemoria cm = new controlMemoria();
        while (flag == true) {
            switch (opcao) {
                case 1:
                    cm.opciones(1,2,2); //Pasa por parametro los espacios de la memoria que se van a usar.
                    opcao = ler.nextInt();
                    break;
                case 2:
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
