package com.Assassin;

import java.util.Scanner;

public class Main {
    static void add(String relative,StringBuilder address){
        int v2,v3;
        v2=Integer.parseInt(address.toString(),16);
        v3=Integer.parseInt(relative, 16);
        System.out.println("Answer is :  "+Integer.toHexString(v2+v3).toUpperCase());
    }
    public static void main(String[] args) throws InterruptedException
    {
        String opcode;
        StringBuilder address=new StringBuilder();
        while(true)
        {
            address=new StringBuilder();
            System.out.println("Please Enter Instruction as this example  : (17202D) or 0 to exit:");
            Scanner sc = new Scanner(System.in);
            opcode = sc.next().toUpperCase();
            String relative;
            int state;
            char[] array = opcode.toCharArray();
            if(opcode.equals("0"))break;
            if(array.length==6||array.length==8)
            {
                address.append(opcode.substring(3));
                //System.out.println(array[2]);
                System.out.println("Address: "+address.toString());
                switch (array[2]) {
                    case '2':
                    {
                        System.out.println("please enter program counter value");
                        relative=sc.next().toUpperCase();
                        add(relative,address);
                        break;
                    }
                    case '3':
                    {
                        System.out.println("please enter program counter value");
                        relative=sc.next().toUpperCase();
                        add(relative,address);
                        break;
                    }
                    case '4':
                    {
                        System.out.println("please enter base register value");
                        relative=sc.next().toUpperCase();
                        add(relative,address);
                        break;
                    }
                    case '5':
                    {
                        System.out.println("please enter base register value");
                        relative=sc.next().toUpperCase();
                        add(relative,address);
                        break;
                    }
                    case '8':
                    {
                        System.out.println("please enter index register value");
                        relative=sc.next().toUpperCase();
                        add(relative,address);
                        break;
                    }

                }
            }
            else
            {
                System.out.println("Wrong Choice !");
            }
        }
    }
}
