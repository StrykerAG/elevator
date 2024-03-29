import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Elevator {
    private int capacity = 5;
    public String direction;
    private int currentFloor;
    private int directionFloor;
    private List<Integer> peopleInElevator;

    public Elevator() {
        this.currentFloor = 1;
        this.direction = "up";
        this.peopleInElevator = new ArrayList<>();
    }

    public void moveUp() {
        if (direction.equals("up") && directionFloor >= currentFloor) {
            this.currentFloor++;
        }
    }

    public void moveDown() {
        if (direction.equals("down") && directionFloor <= currentFloor) {
            this.currentFloor--;
        }
    }


    public void setDirectionFloor() {
        if (direction.equals("up")) {
            if (currentFloor < Collections.max(this.peopleInElevator)) {
                directionFloor = Collections.max(this.peopleInElevator);
            } else {
                if (currentFloor > Collections.min(this.peopleInElevator)) {
                    directionFloor = Collections.min(this.peopleInElevator);
                    direction = "down";
                } else {
                    direction = "up";
                    directionFloor = Collections.max(this.peopleInElevator);
                }
            }
        }
    }

    public Floor checkPeople(Floor floor, int floorNumber) {
        Randomaizer random = new Randomaizer();

        peopleInElevator = peopleInElevator.stream().filter(integer -> integer != currentFloor).collect(Collectors.toList());
        floor.getPeople().add(random.getRandomNumberInRange(1, floorNumber));
        for (int i = 0; i < floor.getPeople().size(); i++) {
            if ((direction.equals("up") && floor.getPeople().get(i) > currentFloor)
                    ||
                    (direction.equals("down") && floor.getPeople().get(i) < currentFloor)) {
                if (peopleInElevator.size() < capacity)
                    this.peopleInElevator.add(floor.getPeople().get(i));
                floor.getPeople().remove(i);
            }
            if (this.peopleInElevator.size() == capacity) {
                break;
            }
        }
        return floor;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public int getDirectionFloor() {
        return directionFloor;
    }

    public void setDirectionFloor(int directionFloor) {
        this.directionFloor = directionFloor;
    }

    public List<Integer> getPeopleInElevator() {
        return peopleInElevator;
    }

    public void setPeopleInElevator(List<Integer> peopleInElevator) {
        this.peopleInElevator = peopleInElevator;
    }
}
