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

    void message() {
        System.out.println(this.name + "'s eyes brim over with tears. \"Oh Mary, Jessica, forgive me!\"");
    }
}
