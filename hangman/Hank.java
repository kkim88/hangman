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

    void message() {
        System.out.println(this.name + " is completely silent as he is led closer and closer to the gallows. His face is" +
                " devoid of any emotion, having accepted his cruel, unfair fate.");
    }
}
