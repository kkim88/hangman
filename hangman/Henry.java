package hangman;

public class Henry extends Dummy {
    public Henry () {
        super ("Henry", 35, "Fraud");
    }

    void biography() {
        System.out.println(this.name + " has been convicted of fraud, selling a fake wonder drug claimed to cure any disease." +
                " many people have died due to forgoing proper medical care in \nfavor of taking this medicine. While he" +
                " guilty of selling the medicine, he is not the one behind the scheme and had only taken the sales job" +
                " to support \nhis wife and child. Henry is taking the fall for someone else, and the only way to find out" +
                " who is to prevent his execution and question him further!");
    }

    public static void goodEnd() {
        System.out.println("As Henry is released, a woman who you presume to be his wife rushes out from the crowd to " +
                "embrace him. He turns to you. \n\n\"Thank you!\" he says. \"You saved my life! Now I can go home!\"" +
                "\n\nYou tell him not quite. He still has to answer questions about his shady employer." +
                "\n\n\"Aww,\" he sighs, bowing his head.");
    }

    public static void badEnd() {
        System.out.println("Henry's eyes brim over with tears. \"Oh Mary, Jessica, forgive me!\" A lone woman in the crowd reaches for him, but there is nothing that can be done.");
    }
}
