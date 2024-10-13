import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Aufgabe1
        Scanner scanner=new Scanner(System.in);
        System.out.print("Introduceti numarul de note: ");
        int n=scanner.nextInt();
        int[] note=new int[n];
        System.out.println("Introduceti notele: ");
        for(int i=0;i<n;i++){
            note[i]=scanner.nextInt();
        }
        Aufgabe1 sistem_notare=new Aufgabe1();
        //1
        int[] noteInsuficiente=sistem_notare.NoteInsuficiente(note);
        System.out.print("Note insuficiente: ");
        for (int nota : noteInsuficiente) {
            System.out.print(nota + " ");
        }
        System.out.println();
        //2
        double medie=sistem_notare.ValoareMedie(note);
        System.out.println("Media: "+ medie);
        //3
        int[] rotunjite = sistem_notare.NoteRotunjite(note);
        System.out.print("Note rotunjite: ");
        for (int nota : rotunjite) {
            System.out.print(nota + " ");
        }
        System.out.println();
        //4
        int maxRotunjit = sistem_notare.NotaMaximaRotunjita(note);
        System.out.println("Nota maxima rotunjita: " + maxRotunjit);

        System.out.println("-----------------------------------------------");


        //Aufgabe2
        System.out.print("Introduceti numarul de elemente: ");
        int m=scanner.nextInt();
        int[] elem=new int[m];
        System.out.println("Introduceti elementele: ");
        for(int i=0;i<m;i++){
            elem[i]=scanner.nextInt();
        }
        Aufgabe2 operations=new Aufgabe2();
        //1
        System.out.println("Valoarea maxima: "+operations.maxim(elem));
        //2
        System.out.println("Valoarea minima: "+operations.minim(elem));
        //3
        System.out.println("Suma maxima: "+operations.suma_maxima(elem));
        //4
        System.out.println("Suma minima: "+operations.suma_minima(elem));

        System.out.println("-----------------------------------------------");


        //Aufgabe3
        System.out.print("Introduceti numarul de elemente: ");
        int k=scanner.nextInt();
        int[] num1=new int[k];
        int[] num2=new int[k];
        System.out.println("Introduceti elementele pt primu numar: ");
        for(int i=0;i<k;i++){
            num1[i]=scanner.nextInt();
        }
        System.out.println("Introduceti elementele pt al doilea numar: ");
        for(int i=0;i<k;i++){
            num2[i]=scanner.nextInt();
        }
        Aufgabe3 op=new Aufgabe3();
        //1
        int[] sum_result=op.suma(num1,num2);
        System.out.print("Suma: ");
        for(int nr:sum_result){
            System.out.print(nr);
        }
        System.out.println();
        //2
        int[] sub_result=op.diferenta(num1,num2);
        System.out.print("Diff: ");
        for(int nr: sub_result){
            System.out.print(nr);
        }
        System.out.println();
        //3
        int[] mul_result= op.mul(num1,2);
        System.out.print("Mul: ");
        for(int nr:mul_result){
            System.out.print(nr);
        }
        System.out.println();
        //4
        int[] div_result= op.div(num2,2);
        System.out.print("Div: ");
        for(int nr:div_result){
            System.out.print(nr);
        }
        System.out.println();
        System.out.println("-----------------------------------------------");


        //Aufgabe4
        System.out.print("Introduceti numarul de tastaturi: ");
        int t = scanner.nextInt();
        int[] tastaturi= new int[t];
        System.out.println("Introduceti pretul acestora:");
        for (int i = 0; i < t; i++) {
            tastaturi[i] = scanner.nextInt();
        }
        System.out.print("Introduceti numarul de usb-uri: ");
        int u = scanner.nextInt();
        int[] usbs = new int[u];
        System.out.println("Introduceti pretul acestora:");
        for (int i = 0; i < u; i++) {
            usbs[i] = scanner.nextInt();
        }
        System.out.print("Introduceti un buget: ");
        int buget=scanner.nextInt();
        Aufgabe4 op_gadget=new Aufgabe4();
        //1
        System.out.println("Tastatura ieftina: "+op_gadget.tastatura_ieftina(tastaturi));
        //2
        System.out.println("Electro scump: "+op_gadget.gagdet_scump(tastaturi,usbs));
        //3
        System.out.println("Usb scump incadrat in buget: "+op_gadget.usb_scump(usbs,buget));
        //4
        System.out.println("Suma maxima de bani cheltuiti incadrati in buget: "+op_gadget.suma_maxima_buget(buget,tastaturi,usbs));





    }
}