import java.util.*;
import java.io.*;


public class MainRunner{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Choose which Operating System Instance you would like to create:");
        System.out.println("1. OS \n2. MobileOS");
        System.out.print("Enter your choice : ");
        int choice = scn.nextInt();
        OSFactory osf = new OSFactory();
        if(choice == 1){
            System.out.println("You have Chosen OS!!");
            System.out.println("Choose which instance would you like to create :");
            System.out.println("1. Windows \n2. OSX \n3. Ubuntu");
            System.out.print("Enter your choice : ");
            int key = scn.nextInt();
            OS os = null;
            switch (key) {
                case 1:
                    os = osf.createInstance("Windows");
                    break;
                case 2:
                    os = osf.createInstance("OSX");
                    break;
                case 3:
                    os = osf.createInstance("Ubuntu");
                    break;
                default:
                    break;
            }
            if(os == null)System.out.println("Wrong Choice"); else os.show();
        }else{
            System.out.println("You have Chosen MobileOS!!");
            System.out.println("Choose which instance would you like to create :");
            System.out.println("1. Android \n2. IOS \n3. Windows Mobile");
            System.out.print("Enter your choice : ");
            int key = scn.nextInt();
            MobileFactory mbf = new MobileFactory();
            MobileOS os = null;
            switch (key) {
                case 1:
                    os = mbf.createInstance("Android");
                    break;
                case 2:
                    os = mbf.createInstance("IOS");
                    break;
                case 3:
                    os = mbf.createInstance("Windows Mobile");
                    break;
                default:
                    break;
            }
            if(os == null)System.out.println("Wrong Choice"); else os.show();
        }
        
    }
}