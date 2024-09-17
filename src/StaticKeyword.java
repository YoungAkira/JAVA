public class StaticKeyword {

    public static void main(String[] args) {

        Friend friend1 = new Friend("Ryuki");
        Friend friend2 = new Friend("Kira");
        Friend friend3 = new Friend("L");
        Friend friend4 = new Friend("Akira");

        Friend.DisplayFriends();
    }
}