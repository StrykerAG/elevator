import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        House house = new House();
        Elevator elevator = new Elevator();
        Scanner scanner = new Scanner(System.in);


        Floor floor = elevator.checkPeople(house.getFloorList().get(1), house.getFloorList().size());
        elevator.move();
        //        house.getFloorList().remove(1);
//        house.getFloorList().add(floor);
//        scanner.nextLine();
        System.out.println("Люди на этаже : " + floor.getPeople());
        for (int i : elevator.getPeopleInElevator()) {

            System.out.println("[     " + i + "     ]");
        }

        System.out.print("Максимальный этаж равен : ");



        elevator.setDirectionFloor();
        System.out.println(elevator.getDirectionFloor());
        System.out.println();
        System.out.print("Текущий этаж : ");


        System.out.println(elevator.getCurrentFloor());
        System.out.println();



            floor = elevator.checkPeople(house.getFloorList().get(2), house.getFloorList().size());

//            house.getFloorList().remove(2);
//            house.getFloorList().add(floor);
        System.out.println("Люди на этаже : " + floor.getPeople());
        for(int i : elevator.getPeopleInElevator()){
//            String sc1 = scanner.nextLine();
//            System.out.print(sc1);
            System.out.println("[     " + i +"     ]");
        }
        System.out.println();
        System.out.print("Текущий этаж : ");

        Thread.sleep(2000);

        elevator.move();
        System.out.println(elevator.getCurrentFloor());
        System.out.println();



            floor = elevator.checkPeople(house.getFloorList().get(3), house.getFloorList().size());
            elevator.move();
//            house.getFloorList().remove(3);
//            house.getFloorList().add(floor);

        System.out.println("Люди на этаже : " + floor.getPeople());
        for(int i : elevator.getPeopleInElevator()){
            System.out.println("[     " + i +"     ]");
        }

        System.out.println();
        System.out.print("Текущий этаж : ");

        Thread.sleep(2000);

        elevator.move();
        System.out.println(elevator.getCurrentFloor());
        System.out.println();



            floor = elevator.checkPeople(house.getFloorList().get(4), house.getFloorList().size());
            elevator.move();
            //            house.getFloorList().remove(4);
//            house.getFloorList().add(floor);

        System.out.println("Люди на этаже : " + floor.getPeople());
        for(int i : elevator.getPeopleInElevator()){
            System.out.println("[     " + i +"     ]");
        }

        System.out.println();
        System.out.print("Текущий этаж : ");

        Thread.sleep(2000);

        elevator.move();
        System.out.println(elevator.getCurrentFloor());
        System.out.println();


            floor = elevator.checkPeople(house.getFloorList().get(4), house.getFloorList().size());
            house.getFloorList().remove(5);
            house.getFloorList().add(floor);

        System.out.println("Люди на этаже : " + floor.getPeople());
        for(int i : elevator.getPeopleInElevator()){
            System.out.println("[     " + i +"     ]");
        }

    }
}
