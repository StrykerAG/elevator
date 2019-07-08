import java.util.ArrayList;
import java.util.List;

public class House {
    private List<Floor> floorList;

    public House() {

        Randomaizer random = new Randomaizer();
        Floor floor = new Floor();
        List<Floor> floorList = new ArrayList<>();
        int peopleNumber, floorNumber, destinationFloor;

        floorNumber = random.getRandomNumberInRange(5, 20);


        //for(int i = 1; i < ((int) (Math.random() * 10)) + 5; i++) {
        for (int i = 1; i <= floorNumber; i++) {
            floor.setNum(i);


            peopleNumber = random.getRandomNumberInRange(0, 10);
            List<Integer> people = new ArrayList<>();

            if (peopleNumber != 0) {
                for (int j = 1; j <= peopleNumber; j++) {
                    do {
                        destinationFloor = random.getRandomNumberInRange(1, floorNumber);
                    }
                    while (destinationFloor == i);

                    people.add(destinationFloor);
                }
            }

            floor.setPeople(people);
            floorList.add(floor);
            floor = new Floor();
        }

        this.floorList = floorList;
    }

    public House(List<Floor> floorList) {
        this.floorList = floorList;
    }

    public List<Floor> getFloorList() {
        return floorList;
    }

    public void setFloorList(List<Floor> floorList) {
        this.floorList = floorList;
    }
}


