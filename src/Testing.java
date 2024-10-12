public class Testing {
    public static void main(String args[]){
            //auf1
            int[] note = {29, 37, 38, 41, 84, 67};

            // 1. Note insuficiente
            int[] insuficiente = Aufgabe1.NoteInsuficiente(note);
            System.out.print("Note insuficiente: ");
            for (int nota : insuficiente) {
                    System.out.print(nota + " ");
            }
            System.out.println();

            // 2. Valoare medie..ceva nu iasa
            double medie = Aufgabe1.ValoareMedie(note);
            System.out.println("Valoarea medie: " + medie);

            // 3. Note rotunjite
            int[] rotunjite = Aufgabe1.NoteRotunjite(note);
            System.out.print("Note rotunjite: ");
            for (int nota : rotunjite) {
                    System.out.print(nota + " ");
            }
            System.out.println();

            // 4. Nota maxima rotunjita
            int maxRotunjit = Aufgabe1.NotaMaximaRotunjita(note);
            System.out.println("Nota maxima rotunjita: " + maxRotunjit);

            System.out.println("-----------------------------------------------");

            //auf2
            int number[]={4,8,3,10,17};
            //1
            int max=Aufgabe2.maxim(number);
            System.out.println("Valoarea maxima: "+max);
            //2
            int min=Aufgabe2.minim(number);
            System.out.println("Valoarea minima: "+min);
            //3
            int max_sum=Aufgabe2.suma_maxima(number);
            System.out.println("Suma maxima: "+max_sum);
            //4
            int min_sum=Aufgabe2.suma_minima(number);
            System.out.println("Suma minima: "+min_sum);

            System.out.println("-----------------------------------------------");

            //auf4
            //1
            int[] tastaturi={40,35,70,15,45};
            System.out.println("Tastatura ieftina: "+Aufgabe4.tastatura_ieftina(tastaturi));
            //2
            int[] tast2={15,20,10,35};
            int[] usbs2={20,15,40,15};
            System.out.println("Electro scump: "+Aufgabe4.electro_scump(tast2,usbs2));
            //3
            int[] usbs3={15,45,20};
            int buget=30;
            System.out.println("Usb scump incadrat in buget: "+Aufgabe4.usb_scump(usbs3,buget));
            //4
            int b=60;
            int[] tast4={40,50,60};
            int [] usbs4={8,12};
            System.out.println("Suma maxima de bani cheltuiti incadrati in buget: "+Aufgabe4.suma_maxima_bani(b,tast4,usbs4));

    }
}
