public class Programa1 {
    public static void main(String[] args) {
        System.out.println("Semaforo");
        int color = 0;
        int i, j, k, con, c1, c2, c3;
        String color1 = "";
        i = 0;
        j = 0;
        k = 0;
        c1 = 1;
        c2 = 0;
        c3 = 0;
        con = 0;
        // System.out.println(i + ":" + j + ":" + k + " \"Verde\"");
        for (i = 0; i < 24; i++) {
            for (j = 0; j < 60; j++) {
                for (k = 0; k < 60; k++) {
                    if (con == 20) {
                        color++;
                        if (color == 0) {
                            // color1 = "Verde";
                            c1++;
                        } else {
                            // color1 = "Rojo";
                            color = -1;
                            c2++;
                        }
                        con = 0;
                    }
                    if (con == 15) {
                        // color1 = "Amarillo";
                        c3++;
                    }
                    // System.out.println(i + ":" + j + ":" + k + " \"" + color1 + "\"");

                    con++;
                }
            }
        }
        System.out.println("Verde -> " + c1);
        System.out.println("Rojo -> " + c2);
        System.out.println("Amarillo -> " + c3);
    }
}