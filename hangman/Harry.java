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

    void message() {
        System.out.println(this.name + "'s burn with anger. \n\"Y'all have the wrong man!\" he shouts.");
    }
}
