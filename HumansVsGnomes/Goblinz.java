package HumansVsGnomes;

public class Goblinz {
    private int strength = 3;
    String stamina;
    String name;
    String color;
    private int health = 10;

    public Goblinz() {
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Goblinz(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return this.strength;
    }

    public Humanz attack(Humanz h) {
        int zhealth = h.getHealth();
        int gstrength = this.getStrength();
        int nzhealth = zhealth + gstrength;
        h.setHealth(nzhealth);
        return h;
    }

    public char move() {
        double doubleRandomNumber = Math.random() * 5.0;
        int randomNumber = (int)doubleRandomNumber;
        char move = ' ';
        System.out.println("randomNumber = " + randomNumber);
        if (randomNumber == 0) {
            move = ' ';
        } else if (randomNumber == 1) {
            move = 'U';
        } else if (randomNumber == 2) {
            move = 'R';
        } else if (randomNumber == 3) {
            move = 'L';
        } else if (randomNumber == 4) {
            move = 'D';
        }

        return move;
    }
}
