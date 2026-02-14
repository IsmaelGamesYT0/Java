package LearnJava.RPGGame;

public class Warrior {
    public String NameWarrior;
    public int HealthWarrior;
    public Sword sword;

    public Warrior(String NameWarrior, int HealthWarrior, String SwordName, int SwordDamage) {
        this.NameWarrior = NameWarrior;
        this.HealthWarrior = HealthWarrior;
        this.sword = new Sword(SwordName, SwordDamage);
    }

    public boolean isAlive() {
        return HealthWarrior > 0;
    }

    public int attack(Warrior target) {
        int damage = this.sword.SwordDamage;
        target.takeDamage(damage);
        return damage;
    }

    public int attack(Warrior target, int bloqueio) {
        int damage = this.sword.SwordDamage;
        target.takeDamage(damage - bloqueio);
        return damage;
    }
    
    public void takeDamage(int damage) {
        this.HealthWarrior -= damage;
        if (this.HealthWarrior < 0) {
            this.HealthWarrior = 0;
        }
    }
}