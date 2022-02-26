package Course04.FlowControl;

import java.util.Scanner;

public class ExBonus1_4 {

    public static void main(String[]args){

//        1.4. Scrie un program care citeste de la tastatura un numar
//        natural x si afiseaza simetricul sau (i.e. numarul in oglinda).

        Scanner scanner = new Scanner(System.in);


System.out.println("Introduceti numarul: ");
int x = scanner.nextInt();
int ultimaCifra = 0;
int nrInvers = 0;
while(x  >0){
    ultimaCifra = x%10;
    x = x/10;
    nrInvers = nrInvers * 10 + ultimaCifra;
}
System.out.println("Inversul numarului citit este: " + nrInvers);

scanner.close();
    }

}
