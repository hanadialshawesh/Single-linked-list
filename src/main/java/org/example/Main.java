package org.example;
import java.util.Scanner;

/*
  Hanadi Al-shawesh
   443011994
 Data Structure (Lab2)
 single linked list
 */



public class Main {
    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);

        System.out.print("please enter 5 numbers or words ");
        Linkedlist linked = new Linkedlist();
        int i =0;
         do{
             int input1 = san.nextInt();
          linked.addFirst(input1);
          i++;
        }while(i<5);



            boolean exitCode = true;
            while (exitCode) {
                int mainchoice;

                System.out.println(" ");
                System.out.println("Please enter the service");
                System.out.println(" 1. add First 2. add Last 3. delete First 4. delete a node 5. print a linked list 6. Exit");
                mainchoice = san.nextInt();

                if (mainchoice == 1) {
                    int key;
                    System.out.println("please enter the number");
                    key = san.nextInt();
                    linked.addFirst(key);
                    linked.printLinkedList();
                }
                if (mainchoice == 2) {
                    int key;
                    System.out.println("please enter the number");
                    key = san.nextInt();
                    linked.addLast(key);
                    linked.printLinkedList();

                }
                if (mainchoice == 3) {

                    linked.printLinkedList();
                    linked.deleteFirst();
                    System.out.println("these are the numbers after delete the first one");
                    linked.printLinkedList();
                }
                if (mainchoice == 4) {
                    int key;
                    System.out.println("please enter the number to delete it ");
                    key = san.nextInt();
                    linked.deleteNode(key);
                    System.out.println("these are the numbers after delete it");
                    linked.printLinkedList();


                }
                if (mainchoice == 5) {

                    linked.printLinkedList();
                }
                if (mainchoice == 6) {
                    System.out.println("Thank you. Code exit done");
                    san.close();
                    exitCode = false;
                }
            }
        }
}