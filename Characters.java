import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class Characters {
    public static void selectCharacterAtSpot(int character) {
        int x = 200 + ((character % 5) * 100);
        int drag = character / 5;
        int y = 220 + ((character / 5) * 100);
    }

    public static void spotlight() {
        GameMouse.click(1375, 10);
    }
}

// public enum Day {
//     FALLEN_DOMINION, ADMIRAL, SHADOWLEAF, SUCCUBUS, COMMANDO, MYSTIC, 
//     CLOUD_WALKER, NINJA_ASSASSIN, EMBERSTAR, MACHINIST, WAR_CHIEF, PSYCHOPATH, 
//     FROST_MAGE, PILOT, POISONED_ONE, OLD_CURSE, DEATH_MAGE, CHAPLAIN, 
//     RIFLEMAN, PHOENIX, VANGUARD_WARRIOR, EMBER_BLADE, HIDDEN_NEEDLE, 
//     TUSKED_STORM, VENGEANCE_SPIRIT, SAVAGE_ONE, SILENCER, SOULHUNTER, 
//     IMPERIAL_EXECUTIONER, DISEASE_BRINGER, IRON_HOOF, DEPTHS_VOICE, 
//     SWORDMASTER, ARCANE_SAPPER, CLERIC, BRUTE, WARRIOR_MONK, LIGHTNING_MASTER
// }