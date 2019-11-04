public class Player {
    private String name;
    private int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

        public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void guess () {
        number = (int) (Math.random() * 101);
    }
}