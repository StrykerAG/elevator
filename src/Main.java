import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        House house = new House();
        Elevator elevator = new Elevator();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Всего этажей в доме " + house.getFloorList().size());
        for (int i = 1; i < 100; i++) {
            Floor floor = elevator.checkPeople(house.getFloorList().get(i), house.getFloorList().size());
            elevator.move();
            scanner.nextLine();
            System.out.println("Люди на этаже : " + floor.getPeople());
            System.out.println("Текущий этаж : " + elevator.getCurrentFloor());
            for (int j : elevator.getPeopleInElevator()) {
                System.out.println("[     " + j + "     ]");
            }
            elevator.setDirectionFloor();
            int maxFloor = elevator.getDirectionFloor();
            System.out.println("Максимальный этаж равен : " + maxFloor);
        }


    }
}
