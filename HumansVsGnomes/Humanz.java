package HumansVsGnomes;

public class Humanz {
    private int health = 10;
    private int strength = 4;

    public Humanz() {
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return this.strength;
    }

    public Goblinz attack(Goblinz h) {
        int zhealth = h.getHealth();
        int gstrength = this.getStrength();
        int nzhealth = zhealth + gstrength;
        h.setHealth(nzhealth);
        return h;
    }
}
