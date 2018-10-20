package memoria;
/*Caso 1:
* 10 locaciones en total
* Programa +  Espacio
*    C     +     1
*    D     +     2
*    E     +     2   */
public class controlMemoria {
    Main mn = new Main();

    public void spacenullBF(int num,String letra) { //Codigo para encontrar los espacios libres en Best Fit.
        int contador = 0, box;
        boolean achei = true, flag = false;
        for (int i = 0; i < 10; i++) {
            if (mn.memoria[i].isEmpty()) {
                contador++;
            } else {
                if (!mn.memoria[i].isEmpty()) {
                    box = contador;
                    contador = 0;
                    if (box == num) {
                        achei = false;
                        for (int j = 0; j < num; j++) {
                            mn.memoria[(i - 1) - j] = letra;
                        }
                        break;
                    }
                }
            }
        }
        if (achei) {
            flag = true;
            contador = 0;
            while (flag) {
                flag = false;
                for (int p = 0; p < 10; p++) {
                    if (mn.memoria[p].isEmpty()) {
                        contador++;
                        if (contador >= num) {
                            contador = 0;
                            flag = false;
                            for (int x = 0; x < num; x++) {
                                mn.memoria[p - x] = letra;
                            }
                            break;
                        }
                    } else if (!mn.memoria[p].isEmpty()) {
                        contador = 0;
                    }
                }
            }
        }
    }

    public void spacenullWF(int num, String letra) {//Codigo para encontrar los espacios libres en Worst Fit.
        int contador = 0, box = 0, indice = -1;
        for (int i = 0; i < 10; i++) {
            if (mn.memoria[i].isEmpty()) {
                contador++;
            } else if (!mn.memoria[i].isEmpty()) {
                if ((contador >= num) && (contador >= box)){
                    box = contador;
                    indice = i - box;
                }
                contador = 0;
            }
        }
        if(indice > -1) {
            for (int j = 0; j < num; j++) {
                mn.memoria[indice + j] = letra;
            }
        }
    }

    public void spacenullFF(int num, String letra) {
        int contador = 0;
        for (int i = 0; i < 10; i++) {
            if (mn.memoria[i].isEmpty()) {
                contador++;
            } else if(!mn.memoria[i].isEmpty()) {
                contador = 0;
            }
            if (contador == num) {
                for (int j = 0; j < num; j++) {
                    mn.memoria[(i) - j] = letra;
                }
                break;
            }
        }
    }


    public void caso1(int C,int D,int E){ //caso1

        System.out.println("BestFit:");
        spacenullBF(C, "C");
        spacenullBF(D, "D");
        spacenullBF(E, "E");
        for(int i=0;i<10;i++) {
            System.out.print("|" + mn.memoria[i]);
        }
        mn.memoria = new String[]{"", "A", "", "", "", "", "B", "B", "B", ""};

        System.out.println("\nWorstFit:");
        spacenullWF(C,"C");
        spacenullWF(D,"D");
        spacenullWF(E,"E");
        for(int i=0;i<10;i++) {
            System.out.print("|" + mn.memoria[i]);
        }
        mn.memoria = new String[]{"", "A", "", "", "", "", "B", "B", "B", ""};

        System.out.println("\nFirstFit:");
        spacenullFF(C,"C");
        spacenullFF(D,"D");
        spacenullFF(E,"E");
        for(int i=0;i<10;i++) {
            System.out.print("|" + mn.memoria[i]);
        }
        mn.memoria = new String[]{"", "A", "", "", "", "", "B", "B", "B", ""};
    }

    public void caso2(int C,int D,int E,int F){//demás casos
        System.out.println("BestFit:");
        spacenullBF(C, "C");
        spacenullBF(D, "D");
        spacenullBF(E, "E");
        spacenullBF(F, "F");
        for(int i=0;i<10;i++) {
            System.out.print("|" + mn.memoria[i]);
        }
        mn.memoria = new String[]{"", "", "A", "", "", "", "B", "", "", ""};

        System.out.println("\nWorstFit:");
        spacenullWF(C,"C");
        spacenullWF(D,"D");
        spacenullWF(E,"E");
        spacenullWF(F,"F");
        for(int i=0;i<10;i++) {
            System.out.print("|" + mn.memoria[i]);
        }
        mn.memoria = new String[]{"", "", "A", "", "", "", "B", "", "", ""};

        System.out.println("\nFirstFit:");
        spacenullFF(C,"C");
        spacenullFF(D,"D");
        spacenullFF(E,"E");
        spacenullFF(F,"F");
        for(int i=0;i<10;i++) {
            System.out.print("|" + mn.memoria[i]);
        }
        mn.memoria = new String[]{"", "", "A", "", "", "", "B", "", "", ""};
    }

    public void caso3(int C,int D, int E, int F){
        System.out.println("BestFit:");
        spacenullBF(C, "C");
        spacenullBF(D, "D");
        spacenullBF(E, "E");
        spacenullBF(F, "F");
        for(int i=0;i<10;i++) {
            System.out.print("|" + mn.memoria[i]);
        }
        mn.memoria = new String[]{"", "", "A", "", "", "", "B", "", "", "G"};

        System.out.println("\nWorstFit:");
        spacenullWF(C,"C");
        spacenullWF(D,"D");
        spacenullWF(E,"E");
        spacenullWF(F,"F");
        for(int i=0;i<10;i++) {
            System.out.print("|" + mn.memoria[i]);
        }
        mn.memoria = new String[]{"", "", "A", "", "", "", "B", "", "", "G"};

        System.out.println("\nFirstFit:");
        spacenullFF(C,"C");
        spacenullFF(D,"D");
        spacenullFF(E,"E");
        spacenullFF(F,"F");
        for(int i=0;i<10;i++) {
            System.out.print("|" + mn.memoria[i]);
        }
        mn.memoria = new String[]{"", "", "A", "", "", "", "B", "", "", "G"};
    }
}