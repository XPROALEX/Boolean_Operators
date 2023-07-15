public class Main {
    public static void main (String[] args){
       boolean a= 2 <= 2  && !true; //nella prima parte il 2 <= 2 è vero, l'operatore Not(!) trasforma !true in false  quindi l'operatore AND(&&) confronta vero&&false risultato finale FALSE
       boolean b = !false && 3 > 2; //l'operatore Not(!) trasforma !false in true, 3>2=true,l'operatore AND(&&) true&&true risultato finale TRUE
       boolean t=false;
       boolean f=true;
       boolean c= !(!t || f); //l'operatore Not(!) trasforma !t in true,f=true,l'operatore OR || true||true=true ma l'operatore Not(!) trasforma il valore finale in FALSE
       boolean d= 6 > 6 ^ !(true && true); //6>6 = False,l'operatore Not(!) trasforma !(true) in false, l'operatore Logical Exclusive OR (^) trovando valori uguali restituise un FALSE
       System.out.println("Exercise A="+a+"\nExercise B="+b+"\nExercise C="+c+"\nExercise D="+d);

    }
}

