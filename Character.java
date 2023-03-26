public abstract class Character {

    protected  String name;
    protected int strength;
    protected int intelligence;
    protected int agility;
    protected int endurance;
    protected int level;
    protected int xp;
    protected Race race;
    protected int role;
    
    public double getStrength(){
        return strength * race.bonusStrength();
    }
    public double getIntelligence(){
        return intelligence * race.bonusIntelligence();
    }
    public double getAgility(){
        return agility * race.bonusAgility();
    }
    public double getEndurance(){
        return endurance * race.bonusEndurance();
    }

    public Character(String name, int strength, int intelligence, int agility, int endurance, int level, int xp, Race race) {
        this.name = name;
        this.strength = strength;
        this.intelligence = intelligence;
        this.agility = agility;
        this.endurance = endurance;
        this.level = level;
        this.xp = xp;
        this.race = race;
    }
    public Character(String name, int strength, int intelligence, int agility, int endurance,Race race) {
        this.name = name;
        this.strength = strength;
        this.intelligence = intelligence;
        this.agility = agility;
        this.endurance = endurance;
        this.level = 1;
        this.xp = 0;
        this.race = race;
    }

    public static Character createCharacter(int role, String name, int strength, int intelligence, int agility, int endurance,Race race){
        if(role == 1){ 
            return new Fighter(name,strength,intelligence,agility,endurance,race);
        }
        if(role == 2){ 
            return new Adventurer(name,strength,intelligence,agility,endurance,race);
        }
        if(role == 3){ 
            return new Mage(name,strength,intelligence,agility,endurance,race);
        }
        return null;
    }

    public double getRana(Character obrance){
        return getUtok() - obrance.getObrana(this);
    }

    public abstract double getUtok();
    public double getObrana(Character protivnik){
        return getEndurance() + protivnik.getVlastnostKObrane(this);
    }

    public abstract double getVlastnostKObrane(Character obrance);

    public int getHp(){
        return level*10;
    }

    public void levelUp(){
        while(xp >= 100 * level){
            xp -= 100 * level;
            level++;
        }
    }
}
