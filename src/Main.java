import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hidden Leaf Village (Konoha) Mission");
        System.out.println("Enter ninja name (Hyuga Neji,Uchiha Shisui): ");
        String ninjaName= scanner.nextLine();

        NinjaMissionFacade missionFacade= new NinjaMissionFacade();
        missionFacade.prepareForMission(ninjaName);
        scanner.close();
    }
}