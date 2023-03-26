public class Fighter extends Character {
    public Fighter(String name, int strength, int intelligence, int agility, int endurance, int level, int xp, Race race) {
        super(name, strength, intelligence, agility, endurance, level, xp, race);
    }

    public Fighter(String name, int strength, int intelligence, int agility, int endurance, Race race) {
        super(name, strength, intelligence, agility, endurance, race);
    }

    @Override
    public double getUtok() {
        return 3 * getStrength();
    }

    @Override
    public double getVlastnostKObrane(Character obrance) {
        return obrance.getStrength();
    }

}
