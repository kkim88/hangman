package hangman;

public class Harry extends Dummy {
    public Harry () {
        super("Harry", 48, "Theft");
    }

    void biography() {
        System.out.println(this.name + " has been sentenced to death for the crime of robbing the local bank. However, there is" +
                " no evidence linking him to the crime. Harry is a loner with no \nfriends or immediate family in the area" +
                " and is greatly disliked by the community due to his unfriendly disposition and tendency to get into" +
                " altercations \nwith people who trespass on his property. It is highly likely that he is being used as a" +
                " scapegoat and the true culprit is at large. Save him before it's \ntoo late!");
    }

    public static void goodEnd() {
        System.out.println("Free, Harry jumps from the gallows. The gathered crowd quickly moves to give him space. " +
                "\"THIS is why I hate y'all\" he spits, then stalks away without even \nsparing you a glance. A thank you " +
                "would've been nice. Jerk.");
    }

    public static void badEnd() {
        System.out.println("Harry's eyes burn with anger. \n\"Y'all have the wrong man!\" he shouts. His cries fall on deaf ears as the noose is put around his neck.");
    }
}
