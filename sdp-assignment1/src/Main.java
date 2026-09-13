public class Main {
    public static void main(String[] args) {
        CharacterDirector director = new CharacterDirector();
        Character mage = director.buildMage(new Character.Builder());

        Character character = new Character.Builder()
                .setCharacterClass("Light")
                .setLevel(25)
                .setHealthPoints(100)
                .setWeapon("Sword")
                .build();

        System.out.println("Mage: " + mage.getCharacterClass() + " Level:  " + mage.getLevel() + " HP: " + mage.getHealthPoints() + " Weapon: " + mage.getWeapon());
        System.out.println("Class: " + character.getCharacterClass() + " Level:  " + character.getLevel() + " HP: " + character.getHealthPoints() + " Weapon: " + character.getWeapon());
    }
}