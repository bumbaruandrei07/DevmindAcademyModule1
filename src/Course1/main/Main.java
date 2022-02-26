package Course1.main;

import Course1.classes.AllCharacters;
import Course1.classes.Numbers;



public class Main {

    public static void main(String[] args) {

        System.out.println("============METHOD 1 EX1==============");

        System.out.println("1");
        System.out.println("22");
        System.out.println("333");
        System.out.println("4444");
        System.out.println("55555");

        System.out.println("=============METHOD 2 EX1===============");

        String y = "1", u = "22", i = "333", o = "4444", p = "55555";

        System.out.println(y + "\n" + u + "\n" + i + "\n" + o + "\n" + p);

        System.out.println("=============METHOD 3 EX1===============");

        DisplayNumbers(1, 22, 333, 4444, 55555);

        System.out.println("=============METHOD 4 EX1===============");

        int arrayInt[] = new int[5];

        arrayInt[0] = 1;
        arrayInt[1] = 22;
        arrayInt[2] = 333;
        arrayInt[3] = 4444;
        arrayInt[4] = 55555;
        System.out.println(
                arrayInt[0] + "\n" + arrayInt[1] + "\n" + arrayInt[2] + "\n" + arrayInt[3] + "\n" + arrayInt[4]);

        System.out.println("=============METHOD 5 EX1===============");

        Numbers n1 = new Numbers(111, 2222, 3333333, 4444, 55555);
        System.out.println(n1);

        System.out.println("===========METHOD 1 EX2=================");

        System.out.print("******\n");
        System.out.print("------\n");
        System.out.print("~~~~~~\n");

        System.out.println("============METHOD 2 EX2================");

        String[] characters = new String[3];
        characters[0] = "******";
        characters[1] = "------";
        characters[2] = "~~~~~~";
        System.out.print(characters[0] + "\n" + characters[1] + "\n" + characters[2] + "\n");

//		 System.out.println("ANOTHER METHOD USING AN ARRAYLIST");
//		System.out.println("===============METHOD 3 EX2=============");
//
//		ArrayList characterList = new ArrayList();
//		characterList.add("******");
//		characterList.add("------");
//		characterList.add("~~~~~~");
//		System.out.print(characterList);
//
//		characterList.remove("~~~~~~");
//		System.out.println(characterList);

        System.out.println("==============METHOD 4 EX2==============");

        AllCharacters all = new AllCharacters("******", "------", "~~~~~~");
        all.DisplayNumbers();
        System.out.println(all);

//		System.out.println("=========================================");

    }

    public static void DisplayNumbers(int z, int x, int v, int n, int m) {

        System.out.println(z + "\n" + x + "\n" + v + "\n" + n + "\n" + m);
    }

}