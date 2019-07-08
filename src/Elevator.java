import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Elevator {
    private int capacity = 5;
    private String direction;
    private int currentFloor;
    private int directionFloor;
    private List<Integer> peopleInElevator;

    public Elevator() {
        this.currentFloor = 1;
        this.direction = "up";
        this.peopleInElevator = new ArrayList<>();
    }

    public void moveUp() {
        this.currentFloor++;
    }

    public void moveDown() {
        this.currentFloor--;
    }

    public void move() {
        if (direction.equals("up")) {
            moveUp();
        } else moveDown();
    }

    public void setDirectionFloor() {
        if (direction.equals("up")) {
            if (currentFloor < Collections.max(this.peopleInElevator)) {
                directionFloor = Collections.max(this.peopleInElevator);
            } else {
                if (currentFloor > Collections.min(this.peopleInElevator)) {
                    directionFloor = Collections.min(this.peopleInElevator);
                } else {
                    direction = "up";
                    directionFloor = Collections.max(this.peopleInElevator);
                }
            }
        }
    }

    public Floor checkPeople(Floor floor, int floorNumber) {
        Randomaizer random = new Randomaizer();

        for (int i = 0; i < this.peopleInElevator.size(); i++) {
            if (this.peopleInElevator.get(i) == currentFloor) {
                floor.getPeople().add(random.getRandomNumberInRange(1, floorNumber));
                this.peopleInElevator.remove(i);
            }
        }
        for (int i = 0; i < floor.getPeople().size(); i++) {
            if ((direction.equals("up") && floor.getPeople().get(i) > currentFloor)
                    ||
                    (direction.equals("down") && floor.getPeople().get(i) < currentFloor)) {
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
