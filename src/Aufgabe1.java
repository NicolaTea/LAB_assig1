public class Aufgabe1 {
    //1
    public static int[] NichtAusreichend(int[] noten){
        //numaram notele<40
        int counter=0;
        for(int note:noten){
            if(note<40){
                counter++;
            }
        }
        //creeam un array cu notele insuficiente
        int[] nichtausreichend=new int[counter];
        int idx=0;
        for(int note:noten){
            if(note<40){
                nichtausreichend[idx++]=note;
            }
        }
        return nichtausreichend;
    }

    //2
    public static double Durchschnittwert(int[] noten){
        int sum=0;
        for(int note:noten){
            sum+=note;
        }
        return Math.round((double)sum/noten.length*100)/100; //calcul+rotunjire 2 decimale
    }

    //3
    public static int[] AbgerundeteNoten(int[] noten){
        int[] abgerundet=new int[noten.length];
        for(int i=0;i<noten.length;i++){
            abgerundet[i]=RundeNote(noten[i]);
        }
        return abgerundet;

    }

    public static int RundeNote(int note){ //metoda aux
        if(note<38){
            return note;
        }
        int diff=5-(note%5);
        if(diff<3){
            return note+diff;  //rotunjim la urm. multiplu de 5
        }
        return note;
    }

    //4
    public static int MaximalAbgerundeteNote(int [] noten){
        int max=0;
        int[] abgerundet=AbgerundeteNoten(noten);
        for(int note: abgerundet){
            if(note>max){
                max=note;
            }
        }
        return max;
    }

}
