public class Character {
    private final String characterClass;
    private final int level;
    private final int healthPoints;
    private final String weapon;

    public String getCharacterClass() {
        return characterClass;
    }

    public int getLevel() {
        return level;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public String getWeapon() {
        return weapon;
    }

    private Character(Builder builder){
        this.characterClass = builder.characterClass;
        this.level = builder.level;
        this.healthPoints = builder.healthPoints;
        this.weapon = builder.weapon;
    }

    public static class Builder {
        private String characterClass;
        private int level;
        private int healthPoints;
        private String weapon;

        public Builder setCharacterClass(String characterClass){
            this.characterClass = characterClass;
            return this;
        }

        public Builder setLevel(int level){
            this.level = level;
            return this;
        }

        public Builder setHealthPoints(int healthPoints){
            this.healthPoints = healthPoints;
            return this;
        }

        public Builder setWeapon(String weapon){
            this.weapon = weapon;
            return this;
        }

        public Character build(){
            return new Character(this);
        }

    }
}