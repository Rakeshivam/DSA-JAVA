public class Getters_Setters {
    public static void main(String[] args) {

        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());

        p1.setTip(6);
        System.out.println(p1.getTip());

        p1.setColor("Red");
        System.out.println(p1.getColor());
    }
}

class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    int getTip() {
        return this.tip;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}
