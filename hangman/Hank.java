package hangman;

public class Hank extends Dummy {
    public Hank() {
        super("Hank", 27, "Murder");
    }

    void biography() {
        System.out.println(this.name + " has been convicted of the murder of a young woman. Although police were unable" +
                " to find the body, Hank was seen near the victim's home in the last few \ndays the victim was seen. Hank" +
                " is from out of town and with no one to vouch for him or ways to confirm his alibi, he was convicted of" +
                " the crime. However, the \nvictim's parents just reached out to you saying their daughter is alive and well" +
                " having run away to elope with her boyfriend. Save Hank from being punished \nfor a crime that never occurred!");
    }

    public static void goodEnd() {
        System.out.println("Hank hyperventilates as he is released from custody. After a few seconds, he looks at you with " +
                "sheer gratitude in his eyes. \n\nA passing couple stops to stare at the commotion and the wife squeals. " +
                "\n\n\"Honey, look, look, an execution!\" she squeals. Everyone turns to stare at her. It's the so-called " +
                "\"murder victim\". She looks around. \"...what?\" she asks. \n\nThat's it. you're done for the day.");

    }

    public static void badEnd() {
        System.out.println("Hank is completely silent as the executioner shoves him onto the platform. His face is" +
                " devoid of any emotion, having accepted his cruel, unfair fate.");
    }
}
