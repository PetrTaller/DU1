import java.util.Scanner;
import java.io.File;

public class Game {

    Scanner sc = new Scanner(System.in);
    File file = new File("Character.txt");
    
    public int in1 = 0;
    
public void act1(){

    while(in1 == 0){

        System.out.println("Vítejte ve nedokončené aréně!");
        System.out.print("Pro vytvoreni nove postavy napiste \"1\" a pro hrani uz s vytvorenou postavou napiste \"2\": ");
        in1 = sc.nextInt();
        
        if(in1 != 1 && in1 !=2 ){

            in1 = 0;
            System.out.println("Neplatne zadani, zkuste znovu!\n ");

        }

        if(in1 == 2){

            if(file.length()== 0){

                System.out.println("Zadna postava neexistuje.");
                in1=0;
        
            }
        }
    }
}

public String name;
public int role;
public int race;

public void act2(){

        System.out.println("Napiste jmeno:");
        name = sc.nextLine();

        System.out.println("Vyberte si roli:");
        System.out.println("\"1\" Fighter\n\"2\" Adventurer\n\"3\" Mage");
        role = sc.nextInt();

        System.out.println("Vyberte si rasu:");
        System.out.println("\"1\" Human\n\"2\" Elf\n\"3\" Dark Elf\n\"4\" Dwarf\n\"5\" Troll\n\"6\" Undead");
        race = sc.nextInt();

    }
}

// ^^^^ tohle by se dalo do souboru a pak se z nej cetlo ale nevim jak funguje create character v tříde character který jsem opsal z projektoru o hodině