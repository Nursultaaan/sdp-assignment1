public class CharacterDirector {
    
    public Character buildMage(Character.Builder builder) {
        return builder.setCharacterClass("Mage")
                .setLevel(12)
                .setHealthPoints(250)
                .setWeapon("Magic Staff")
                .build();
    }
}
