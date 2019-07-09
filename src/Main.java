import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        House house = new House();
        Elevator elevator = new Elevator();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Всего этажей в доме " + house.getFloorList().size());
        if (elevator.direction.equals("up")) {
            for (int i = 0; i < house.getFloorList().size(); i++) {
                Floor floor = elevator.checkPeople(house.getFloorList().get(i), house.getFloorList().size());
                elevator.moveUp();
                scanner.nextLine();
                System.out.println("Люди на этаже : " + floor.getPeople());
                System.out.println("Текущий этаж : " + elevator.getCurrentFloor());
                for (int j : elevator.getPeopleInElevator()) {
                    System.out.println("[     " + j + "     ]");
                }
                elevator.setDirectionFloor();
                int maxFloor = elevator.getDirectionFloor();
                System.out.println("Максимальный этаж равен : " + maxFloor);
                if (elevator.getCurrentFloor() == elevator.getDirectionFloor()) {
                    for (int a = house.getFloorList().size() - 1; a > 0; a--) {
                        floor = elevator.checkPeople(house.getFloorList().get(a), house.getFloorList().size());
                        elevator.moveDown();
                        scanner.nextLine();
                        System.out.println("Люди на этаже : " + floor.getPeople());
                        System.out.println("Текущий этаж : " + elevator.getCurrentFloor());
                        for (int j : elevator.getPeopleInElevator()) {
                            System.out.println("[     " + j + "     ]");
                        }
                    }
                }


            }
        }
    }
}

