//! Access modifiers or Access specifiers

public class Access_modifiers {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // Created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.color);

        p1.setTip(6);
        System.out.println(p1.tip);

        // p1.setColor("Red");
        p1.color = "Red";
        System.out.println(p1.color);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "rakeshkushwaha";
        myAcc.setPassword("123rk");
    }
}

class BankAccount {
    public String username;
    // private String password;

    public void setPassword(String pwd) {
        // password = pwd;
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class students {
    String name;
    int age;
    float percentage; // CGPA

    void percentage(int phy, int che, int maths) {
        percentage = (phy + che + maths) / 3;
    }

}