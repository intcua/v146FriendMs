package constants;

import java.util.Calendar;
import tools.Triple;

public class ServerConstants {

    public static boolean TESPIA = false; // Used for activating GMST.
    public static String SQL_PORT = "3306",
            SQL_DATABASE = "v146fr",
            SQL_USER = "root",
            SQL_PASSWORD = "Foreverl0ve@Zz";

    public static byte Class_Bonus_EXP(final int job) {
        switch (job) {
            case 501:
            case 530:
            case 531:
            case 532:
            case 2300:
            case 2310:
            case 2311:
            case 2312:
            case 3100:
            case 3110:
            case 3111:
            case 3112:
            case 800:
            case 900:
            case 910:
                return 10;
        }
        return 0;
    }

    public static boolean getEventTime() {
        int time = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        switch (Calendar.DAY_OF_WEEK) {
            case 1:
                return time >= 1 && time <= 5;
            case 2:
                return time >= 4 && time <= 9;
            case 3:
                return time >= 7 && time <= 12;
            case 4:
                return time >= 10 && time <= 15;
            case 5:
                return time >= 13 && time <= 18;
            case 6:
                return time >= 16 && time <= 21;
        }
        return time >= 19 && time <= 24;
    }
    public static final short MAPLE_VERSION = (short) 146;
    public static final String ACCMASTER = "jun9xlsls";
    public static final String MAPLE_PATCH = "1";
    public static final String SOURCE_REVISION = "24";
    public static final boolean BLOCK_CS = false;  //true = cash shop disabled
    public static final boolean Old_Maps = false; //example: it will use old maple event's henesys instead of current one
    public static final boolean Use_Localhost = false; //true = packets are logged, false = others can connect to server
    public static final boolean Redirector = true; //false = not using redirector
    public static final boolean LOG_SHARK = false;  //true = enable shark to log 
    public static boolean MultiLevel = true; //true = enable multi leveling
    public static final boolean AntiKS = false;
    public static final int miracleRate = 1; //cube tier up rate
    public static final byte SHOP_DISCOUNT = 0; //Discount Rate (%) Higher than 100 or lower than 1 means no discount

        // Login Backgrounds
    public static Triple<String, Integer, Boolean>[] backgrounds = new Triple[]{ //boolean for randomize
        new Triple<>("red3", 0, true),
        new Triple<>("red2", 0, true),
        new Triple<>("red1", 0, false)
    };

    public static enum PlayerGMRank {

        NORMAL('@', 0),
        INTERN('!', 1),
        GM('!', 2),
        SUPERGM('!', 3),
        ADMIN('!', 4);
        private final char commandPrefix;
        private final int level;

        PlayerGMRank(char ch, int level) {
            commandPrefix = ch;
            this.level = level;
        }

        public String getCommandPrefix() {
            return String.valueOf(commandPrefix);
        }

        public int getLevel() {
            return level;
        }
    }

    public static enum CommandType {

        NORMAL(0),
        TRADE(1);
        private final int level;

        CommandType(int level) {
            this.level = level;
        }

        public int getType() {
            return level;
        }
    }
}
