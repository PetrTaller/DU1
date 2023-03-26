public class Undead implements Race {
    @Override
    public double bonusStrength() {
        return 1;
    }
    @Override
    public double bonusIntelligence() {
        return 1.1;
    }
    @Override
    public double bonusAgility() {
        return 1;
    }
    @Override
    public double bonusEndurance() {
        return 1;
    }

    @Override
    public String getRace() {
        return null;
    }
}