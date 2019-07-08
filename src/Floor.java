import java.util.List;

public class Floor {
    private int num;
    private List<Integer> people;

    public Floor() {
    }

    public Floor(int num, List<Integer> people) {
        this.num = num;
        this.people = people;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public List<Integer> getPeople() {
        return people;
    }

    public void setPeople(List<Integer> people) {
        this.people = people;
    }
}
