package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SpaceTravel {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        List<String> commandsAndValue = Arrays.stream(scanner.nextLine().split("\\|\\|")).collect(Collectors.toList());
        int fuel=Integer.parseInt(scanner.nextLine());
        int ammo=Integer.parseInt(scanner.nextLine());
        for(String commandAndValue:commandsAndValue)
        {
            if(commandAndValue.equals("Titan"))
            {
                System.out.println("You have reached Titan, all passengers are safe.");
                return;
            }
            String[]arrCommand=commandAndValue.split(" ");
            String command=arrCommand[0];
            int value=Integer.parseInt(arrCommand[1]);
            switch (command)
            {
                case "Travel":
                    if(value<=fuel)
                    {
                        fuel-=value;
                        System.out.printf("The spaceship travelled %d light-years.%n",value);
                    }
                    else {
                        System.out.println("Mission failed.");
                        return;
                    }

                    break;
                case "Enemy":
                    if(value<=ammo)
                    {
                        ammo-=value;
                        System.out.printf("An enemy with %d armour is defeated.%n",value);
                    }
                    else
                    {
                        if(value*2<=fuel)
                        {
                            fuel-=value*2;
                            System.out.printf("An enemy with %d armour is outmaneuvered.%n",value);
                        }
                        else
                        {
                            System.out.println("Mission failed.");
                            return;
                        }
                    }
                    break;
                case "Repair":
                    fuel+=value;
                    ammo+=value*2;
                    System.out.printf("Ammunitions added: %d.%n",value*2);
                    System.out.printf("Fuel added: %d.%n",value);
                    break;

            }
        }
    }

}
