package utilz;

import java.util.HashMap;
import java.util.Map;

public class Constants {

    public static class Directions {
        public static final int LEFT = 0;
        public static final int UP = 1;
        public static final int RIGHT = 2;
        public static final int DOWN = 3;
    }

    public static class PlayerConstants {
        public static final int IDLE = 0;
        public static final int RUNNING = 1;
        public static final int JUMP = 2;
        public static final int FALLING = 3;
        public static final int GROUND = 4;
        public static final int HIT = 5;
        public static final int ATTACK_1 = 6;
        public static final int ATTACK_JUMP_1 = 7;
        public static final int ATTACK_JUMP_2 = 8;

        public static Map<String, Map<String, Integer>> characterFrames = new HashMap<>();

        static {
            Map<String, Integer> archerBotFrames = new HashMap<>(); // x = 81, y = 76 
            archerBotFrames.put("attackCharge", 4);
            archerBotFrames.put("attackEffect", 4);
            archerBotFrames.put("attackReady", 2);
            archerBotFrames.put("attackRelease", 4);
            archerBotFrames.put("death", 6);
            archerBotFrames.put("hit", 2);
            archerBotFrames.put("idle", 5);
            archerBotFrames.put("run", 8);
            archerBotFrames.put("specialAttackWithEffect", 9);
            archerBotFrames.put("specialAttackWithoutEffect", 9);
            characterFrames.put("archerBot", archerBotFrames);
        }

        static {
            Map<String, Integer> assassinFrames = new HashMap<>(); // x = 142, y = 107
            assassinFrames.put("attackAB", );
            assassinFrames.put("death", );
            assassinFrames.put("run", );
            assassinFrames.put("teleportBash", );
            assassinFrames.put("walk", );
            characterFrames.put("assassin", assassinFrames);
        }

        static {
            Map<String, Integer> assaultDroidFrames = new HashMap<>(); // x = 151, y = 38
            assaultDroidFrames.put("attackHigh", );
            assaultDroidFrames.put("attackLow", );
            assaultDroidFrames.put("gunHeldDown", );
            assaultDroidFrames.put("gunHeldRaised", );
            assaultDroidFrames.put("hitDeath", );
            assaultDroidFrames.put("idle", );
            assaultDroidFrames.put("walk", );
            characterFrames.put("assaultDroid", assaultDroidFrames);
        }

        static {
            Map<String, Integer> babyBoxerFrames = new HashMap<>(); // x = 128, y = 48 
            babyBoxerFrames.put("babyBoxerSpriteSheet", );
            characterFrames.put("babyBoxer", babyBoxerFrames);
        }

        static {
            Map<String, Integer> babySamuraiFrames = new HashMap<>(); // x = 128, y = 48 
            babySamuraiFrames.put("babySamuraiSpriteSheet", );
            characterFrames.put("babySamurai", babySamuraiFrames);
        }

        static {
            Map<String, Integer> babyWelderFrames = new HashMap<>(); // x = 128, y = 48 
            babyWelderFrames.put("babyWelderSpriteSheet", );
            characterFrames.put("babyWelder", babyWelderFrames);
        }

        static {
            Map<String, Integer> bigSciFiMonsterFrames = new HashMap<>(); // x = 145, y = 75 
            bigSciFiMonsterFrames.put("attackA", );
            bigSciFiMonsterFrames.put("attackB", );
            bigSciFiMonsterFrames.put("damagedDeath", );
            bigSciFiMonsterFrames.put("idle", );
            bigSciFiMonsterFrames.put("run", );
            characterFrames.put("bigSciFiMonster", bigSciFiMonsterFrames);
        }

        static {
            Map<String, Integer> botWheelBotFrames = new HashMap<>(); // x = 117, y = 26 
            botWheelBotFrames.put("charge", );
            botWheelBotFrames.put("damaged", );
            botWheelBotFrames.put("death", );
            botWheelBotFrames.put("gasDashEffect", );
            botWheelBotFrames.put("idle", );
            botWheelBotFrames.put("moveWithEffect", );
            botWheelBotFrames.put("moveWithoutEffect", );
            botWheelBotFrames.put("shootWithEffect", );
            botWheelBotFrames.put("shootWithoutEffect", );
            botWheelBotFrames.put("wake", );
            characterFrames.put("botWheelBot", botWheelBotFrames);
        }

        static {
            Map<String, Integer> chainMaceBotFrames = new HashMap<>(); // x = 126, y = 39 
            chainMaceBotFrames.put("attack", );
            chainMaceBotFrames.put("charge", );
            chainMaceBotFrames.put("chargeTransition", );
            chainMaceBotFrames.put("death", );
            chainMaceBotFrames.put("hit", );
            chainMaceBotFrames.put("idle", );
            chainMaceBotFrames.put("run", );
            characterFrames.put("chainMaceBot", chainMaceBotFrames);
        }

        static {
            Map<String, Integer> droidAssassinFrames = new HashMap<>(); // x = 145, y = 48
            droidAssassinFrames.put("baseAttack", 19);
            droidAssassinFrames.put("dashAttack", 14);
            droidAssassinFrames.put("deathHit", 7);
            droidAssassinFrames.put("idle", 10);
            droidAssassinFrames.put("idleAttack", 14);
            droidAssassinFrames.put("run", 8);
            characterFrames.put("droidAssassin", droidAssassinFrames);
        }

        static {
            Map<String, Integer> droidPoliceFrames = new HashMap<>(); // x = 128, y = 48 
            droidPoliceFrames.put("attackA", );
            droidPoliceFrames.put("attackB", );
            droidPoliceFrames.put("death", );
            droidPoliceFrames.put("idle", );
            droidPoliceFrames.put("jumpFallLand", );
            droidPoliceFrames.put("run", );
            characterFrames.put("droidPolice", droidPoliceFrames);
        }

        static {
            Map<String, Integer> droidZapperFrames = new HashMap<>(); // x = , y = 
            droidZapperFrames.put("attack", );
            droidZapperFrames.put("damagedDeath", );
            droidZapperFrames.put("run", );
            droidZapperFrames.put("wake", );
            characterFrames.put("droidZapper", droidZapperFrames);
        }

        static {
            Map<String, Integer> droneZapperFrames = new HashMap<>(); // x = , y = 
            droneZapperFrames.put("attack", );
            droneZapperFrames.put("damagedDeath", );
            droneZapperFrames.put("run", );
            droneZapperFrames.put("wake", );
            characterFrames.put("droneZapper", droneZapperFrames);
        }

        static {
            Map<String, Integer> exterminatorBotFrames = new HashMap<>(); // x = 97, y = 108 
            exterminatorBotFrames.put("airborneAttack", );
            exterminatorBotFrames.put("appear", );
            exterminatorBotFrames.put("death", );
            exterminatorBotFrames.put("idle", );
            exterminatorBotFrames.put("normalAttack", );
            exterminatorBotFrames.put("takeDamage", );
            exterminatorBotFrames.put("vanish", );
            exterminatorBotFrames.put("walk", );
            characterFrames.put("exterminatorBot", exterminatorBotFrames);
        }

        static {
            Map<String, Integer> flamethrowerBotFrames = new HashMap<>(); // x = 94, y = 64 
            flamethrowerBotFrames.put("flamethrowerSpriteSheet", );
            characterFrames.put("flamethrowerBot", flamethrowerBotFrames);
        }

        static {
            Map<String, Integer> guardianFrames = new HashMap<>(); // x = 128, y = 48 
            guardianFrames.put("guardianSpriteSheet", );
            characterFrames.put("guardian", guardianFrames);
        }

        static {
            Map<String, Integer> heroAFrames = new HashMap<>(); // x = 93, y = 63 ?
            heroAFrames.put("blueSwordAttack", );
            heroAFrames.put("blueSwordDamagedDeath", );
            heroAFrames.put("blueSwordIdle", );
            heroAFrames.put("blueSwordPrep", );
            heroAFrames.put("blueSwordRun", );
            heroAFrames.put("disarmedDamagedDeath", );
            heroAFrames.put("disarmedIdle", );
            heroAFrames.put("disarmedRun", );
            heroAFrames.put("greenSwordAttack", );
            heroAFrames.put("greenSwordDamagedDeath", );
            heroAFrames.put("greenSwordIdle", );
            heroAFrames.put("greenSwordPrep", );
            heroAFrames.put("greenSwordRun", );
            heroAFrames.put("redSwordAttack", );
            heroAFrames.put("redSwordDamagedDeath", );
            heroAFrames.put("redSwordIdle", );
            heroAFrames.put("redSwordPrep", );
            heroAFrames.put("redSwordRun", );
            heroAFrames.put("whiteSwordAttack", );
            heroAFrames.put("whiteSwordDamagedDeath", );
            heroAFrames.put("whiteSwordIdle", );
            heroAFrames.put("whiteSwordPrep", );
            heroAFrames.put("whiteSwordRun", );
            characterFrames.put("heroA", heroAFrames);
        }

        static {
            Map<String, Integer> heroBFrames = new HashMap<>(); // x = 128, y = 64 
            heroBFrames.put("baseAttack", );
            heroBFrames.put("blasterHeavy", );
            heroBFrames.put("blasterLight", );
            heroBFrames.put("chainAttack", );
            heroBFrames.put("damagedDeathKnockBack", );
            heroBFrames.put("dashTeleport", );
            heroBFrames.put("idle", );
            heroBFrames.put("jetpackOnOffFall", );
            heroBFrames.put("jumpFallBlasterLanding", );
            heroBFrames.put("ladderClimb", );
            heroBFrames.put("landing", );
            heroBFrames.put("runAttack", );
            heroBFrames.put("runHop", );
            heroBFrames.put("runWithBlaster", );
            heroBFrames.put("superChargedAttack", );
            heroBFrames.put("upgradedRun", );
            characterFrames.put("heroB", heroBFrames);
        }

        static {
            Map<String, Integer> landmineBotFrames = new HashMap<>(); // x = 104, y = 81 
            landmineBotFrames.put("landmineBotSpriteSheet", );
            characterFrames.put("landmineBot", landmineBotFrames);
        }

        static {
            Map<String, Integer> lostWelderFrames = new HashMap<>(); // x = 128, y = 64 
            lostWelderFrames.put("attack", 9);
            lostWelderFrames.put("damaged", 4);
            lostWelderFrames.put("death", 13);
            lostWelderFrames.put("idle", 4);
            lostWelderFrames.put("walk", 6);
            characterFrames.put("lostWelder", lostWelderFrames);
        }

        static {
            Map<String, Integer> mechaFrames = new HashMap<>(); // x = 135, y = 60 
            mechaFrames.put("attack", );
            mechaFrames.put("damagedDeath", );
            mechaFrames.put("idle", );
            mechaFrames.put("prepAttack", );
            mechaFrames.put("walk", );
            characterFrames.put("mecha", mechaFrames);
        }

        // Deals AOE damage
        static {
            Map<String, Integer> medSciFiMonsterFrames = new HashMap<>(); // x = 135, y = 62 
            medSciFiMonsterFrames.put("attackA", );
            medSciFiMonsterFrames.put("attackB", );
            medSciFiMonsterFrames.put("damagedDeath", );
            medSciFiMonsterFrames.put("idle", );
            medSciFiMonsterFrames.put("run", );
            characterFrames.put("medSciFiMonster", medSciFiMonsterFrames);
        }

        static {
            Map<String, Integer> mudBenderFrames = new HashMap<>(); // x = 86, y = 37 
            mudBenderFrames.put("damagedDeath", );
            mudBenderFrames.put("run", );
            mudBenderFrames.put("slapAttack", );
            mudBenderFrames.put("slideAttack", );
            mudBenderFrames.put("teleportDown", );
            mudBenderFrames.put("teleportUp", );
            characterFrames.put("mudBender", mudBenderFrames);
        }

        static {
            Map<String, Integer> mudGuardFrames = new HashMap<>(); // x = 82, y = 23 
            mudGuardFrames.put("attackA", );
            mudGuardFrames.put("attackB", );
            mudGuardFrames.put("damagedDeath", );
            mudGuardFrames.put("idle", );
            mudGuardFrames.put("run", );
            characterFrames.put("mudGuard", mudGuardFrames);
        }

        static {
            Map<String, Integer> mudSummonerDroidFrames = new HashMap<>(); // x = 63, y = 41 
            mudSummonerDroidFrames.put("damagedDeath", );
            mudSummonerDroidFrames.put("idle", );
            mudSummonerDroidFrames.put("mudSummonAttack", );
            mudSummonerDroidFrames.put("mudSummonDeathDamaged", );
            mudSummonerDroidFrames.put("mudSummonMove", );
            mudSummonerDroidFrames.put("run", );
            mudSummonerDroidFrames.put("summon", );
            characterFrames.put("mudSummonerDroid", mudSummonerDroidFrames);
        }

        static {
            Map<String, Integer> roninMageFrames = new HashMap<>(); // x = 128, y = 48 
            roninMageFrames.put("buildUp", );
            roninMageFrames.put("death", );
            roninMageFrames.put("idle", );
            roninMageFrames.put("jumpAttack", );
            roninMageFrames.put("slamAttack", );
            roninMageFrames.put("walk", );
            characterFrames.put("roninMage", roninMageFrames);
        }

        static {
            Map<String, Integer> samuraiBanditBloodFrames = new HashMap<>(); // x = 64, y = 64 
            samuraiBanditBloodFrames.put("bloodExplosionSpell", 19);
            samuraiBanditBloodFrames.put("death", 8);
            samuraiBanditBloodFrames.put("jumpAttack", 13);
            samuraiBanditBloodFrames.put("run", 6);
            samuraiBanditBloodFrames.put("shoot", 5);
            characterFrames.put("samuraiBanditBlood", samuraiBanditBloodFrames);
        }

        static {
            Map<String, Integer> samuraiBanditIceFrames = new HashMap<>(); // x = 64, y = 64 
            samuraiBanditIceFrames.put("iceExplosionSpell", 19); // x = 196, y = 62
            samuraiBanditIceFrames.put("death", 8);
            samuraiBanditIceFrames.put("jumpAttack", 13);
            samuraiBanditIceFrames.put("run", 6);
            samuraiBanditIceFrames.put("shoot", 5);
            characterFrames.put("samuraiBanditIce", samuraiBanditIceFrames);
        }


        static {
            Map<String, Integer> shadowOfStormsFrames = new HashMap<>(); // x = 137, y = 91 
            shadowOfStormsFrames.put("attackA", );
            shadowOfStormsFrames.put("attackB", );
            shadowOfStormsFrames.put("chargeHeal", );
            shadowOfStormsFrames.put("damagedDeath", );
            shadowOfStormsFrames.put("idle", );
            shadowOfStormsFrames.put("run", );
            characterFrames.put("shadowOfStorms", shadowOfStormsFrames);
        }

        static {
            Map<String, Integer> shielderDroidFrames = new HashMap<>(); // x = 90, y = 31 
            shielderDroidFrames.put("damageDeath", );
            shielderDroidFrames.put("idle", );
            shielderDroidFrames.put("shieldDepleted", );
            shielderDroidFrames.put("shieldPrep", );
            shielderDroidFrames.put("shieldPulse", );
            shielderDroidFrames.put("shockAttack", );
            shielderDroidFrames.put("walk", );
            characterFrames.put("shielderDroid", shielderDroidFrames);
        }

        static {
            Map<String, Integer> shotgunnerBotFrames = new HashMap<>(); // x = 92, y = 35 
            shotgunnerBotFrames.put("attackA", );
            shotgunnerBotFrames.put("attackB", );
            shotgunnerBotFrames.put("death", );
            shotgunnerBotFrames.put("idle", );
            shotgunnerBotFrames.put("run", );
            shotgunnerBotFrames.put("shotgunBlastA", );
            shotgunnerBotFrames.put("shotgunBlastB", );
            shotgunnerBotFrames.put("specialEffect", );
            shotgunnerBotFrames.put("takeDamage", );
            characterFrames.put("shotgunnerBot", shotgunnerBotFrames);
        }

        static {
            Map<String, Integer> smallSciFiMonsterFrames = new HashMap<>(); // x = 82, y = 39 
            smallSciFiMonsterFrames.put("attack", );
            smallSciFiMonsterFrames.put("idle", );
            smallSciFiMonsterFrames.put("takeDamage", );
            characterFrames.put("smallSciFiMonster", smallSciFiMonsterFrames);
        }

        static {
            Map<String, Integer> sorcererBotFrames = new HashMap<>(); // x = 118, y = 107 
            sorcererBotFrames.put("sorcererBotSpriteSheet", );
            characterFrames.put("sorcererBot", sorcererBotFrames);
        }

        static {
            Map<String, Integer> spiritBoxerFrames = new HashMap<>(); // x = 137, y = 44 
            spiritBoxerFrames.put("attackA", 6);
            spiritBoxerFrames.put("attackB", 13);
            spiritBoxerFrames.put("attackC", 10);
            spiritBoxerFrames.put("damagedDeath", 10); // damaged (6), death (6)
            spiritBoxerFrames.put("fullComboAttack", 29);
            spiritBoxerFrames.put("idle", 4);
            spiritBoxerFrames.put("run", 6);
            characterFrames.put("spiritBoxer", spiritBoxerFrames);
        }

        static {
            Map<String, Integer> stormHeadDroidFrames = new HashMap<>(); // x = 119, y = 124 
            stormHeadDroidFrames.put("attack", );
            stormHeadDroidFrames.put("death", );
            stormHeadDroidFrames.put("idle", );
            stormHeadDroidFrames.put("run", );
            stormHeadDroidFrames.put("takeDamage", );
            characterFrames.put("stormHeadDroid", stormHeadDroidFrames);
        }

        static {
            Map<String, Integer> stormSamuraiFrames = new HashMap<>(); // x = 134, y = 47 
            stormSamuraiFrames.put("attackA", );
            stormSamuraiFrames.put("attackB", );
            stormSamuraiFrames.put("damagedDeath", );
            stormSamuraiFrames.put("idle", );
            stormSamuraiFrames.put("idleKneel", );
            stormSamuraiFrames.put("run", );
            characterFrames.put("stormSamurai", stormSamuraiFrames);
        }

        static {
            Map<String, Integer> theMerchantFrames = new HashMap<>(); // x = 64, y = 64 
            theMerchantFrames.put("idle", );
            theMerchantFrames.put("walk", );
            characterFrames.put("theMerchant", theMerchantFrames);
        }

        static {
            Map<String, Integer> toasterBotFrames = new HashMap<>(); // x = 106, y = 22 
            toasterBotFrames.put("toasterBotSpriteSheet", );
            characterFrames.put("toasterBot", toasterBotFrames);
        }

        static {
            Map<String, Integer> tripleSaberBotFrames = new HashMap<>(); // x = 121, y = 70 
            tripleSaberBotFrames.put("appear", );
            tripleSaberBotFrames.put("dartTelekinesisAttack", );
            tripleSaberBotFrames.put("deathVanish", );
            tripleSaberBotFrames.put("idle", );
            tripleSaberBotFrames.put("move", );
            tripleSaberBotFrames.put("quickSpinAttack", );
            tripleSaberBotFrames.put("sabertoothTelekinesisAttack", );
            tripleSaberBotFrames.put("takeDamage", );
            tripleSaberBotFrames.put("telekinesisAttack", );
            characterFrames.put("tripleSaberBot", tripleSaberBotFrames);
        }

        static {
            Map<String, Integer> warDroidFrames = new HashMap<>(); // x = 156, y = 48 
            warDroidFrames.put("attackA", );
            warDroidFrames.put("attackB", );
            warDroidFrames.put("hitDeath", );
            warDroidFrames.put("idle", );
            warDroidFrames.put("movement", );
            warDroidFrames.put("wake", );
            characterFrames.put("warDroid", warDroidFrames);
        }

        public static int GetSpriteAmount(String character, String action) {
            return characterFrames.getOrDefault(character, new HashMap<>()).getOrDefault(action, 1);
        }
    }
}