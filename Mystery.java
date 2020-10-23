public class Mystery {
    public static void main(String[] args) {
        String hear = "bad";
        String song = "good";
        String good = "hear";
        String walk = "talk";
        String talk = "feel";
        String feel = "walk";
        claim(feel, song, feel);       // to walk the walk is good
        claim(good, hear, song);       // to hear the good is bad
        claim(talk, "song", feel);     // to feel the walk is song
        claim("claim", talk, walk);    // to claim the talk is feel
    }

    public static void claim(String hear, String good, String song) {
        System.out.println("to " + hear + " the " + song + " is " + good);
    }
}