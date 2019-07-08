public class Main {
    public static void main(String[] args) throws InterruptedException {

        House house = new House();
        Elevator elevator = new Elevator();
        Floor floor = new Floor();

        floor = elevator.checkPeople(house.getFloorList().get(1), house.getFloorList().size());
        house.getFloorList().remove(1);
        house.getFloorList().add(floor);
        for (int i : elevator.getPeopleInElevator()) {
            System.out.println("[     " + i + "     ]" + "Люди на этаже : " + floor.getPeople());
        }

        System.out.print("Максимальный этаж равен : ");



        elevator.setDirectionFloor();
        System.out.println(elevator.getDirectionFloor());
        System.out.println();
        System.out.print("Текущий этаж : ");




        elevator.move();
        System.out.println(elevator.getCurrentFloor());
        System.out.println();


        if(elevator.getPeopleInElevator().size() < 5) {
            floor = elevator.checkPeople(house.getFloorList().get(2), house.getFloorList().size());
            house.getFloorList().remove(2);
            house.getFloorList().add(floor);
        }
        for(int i : elevator.getPeopleInElevator()){
            System.out.println("[     " + i +"     ]" + "Люди на этаже : " + floor.getPeople());
        }
        System.out.println();
        System.out.print("Текущий этаж : ");

        Thread.sleep(2000);

        elevator.move();
        System.out.println(elevator.getCurrentFloor());
        System.out.println();


        if(elevator.getPeopleInElevator().size() < 5) {
            floor = elevator.checkPeople(house.getFloorList().get(3), house.getFloorList().size());
            house.getFloorList().remove(3);
            house.getFloorList().add(floor);
        }

        for(int i : elevator.getPeopleInElevator()){
            System.out.println("[     " + i +"     ]" + "Люди на этаже : " + floor.getPeople());
        }

        System.out.println();
        System.out.print("Текущий этаж : ");

        Thread.sleep(2000);

        elevator.move();
        System.out.println(elevator.getCurrentFloor());
        System.out.println();


        if(elevator.getPeopleInElevator().size() < 5) {
            floor = elevator.checkPeople(house.getFloorList().get(4), house.getFloorList().size());
            house.getFloorList().remove(4);
            house.getFloorList().add(floor);
        }

        for(int i : elevator.getPeopleInElevator()){
            System.out.println("[     " + i +"     ]" + "Люди на этаже : " + floor.getPeople());
        }

        System.out.println();
        System.out.print("Текущий этаж : ");

        Thread.sleep(2000);

        elevator.move();
        System.out.println(elevator.getCurrentFloor());
        System.out.println();

        if(elevator.getPeopleInElevator().size() < 5) {
            floor = elevator.checkPeople(house.getFloorList().get(4), house.getFloorList().size());
            house.getFloorList().remove(5);
            house.getFloorList().add(floor);
        }

        for(int i : elevator.getPeopleInElevator()){
            System.out.println("[     " + i +"     ]" + "Люди на этаже : " + floor.getPeople());
        }

    }
}
