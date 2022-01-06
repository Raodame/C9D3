import java.util.ArrayList;
public class Friends {

    public ArrayList<String> friends;

    public Friends(){
        friends = new ArrayList<String>();
        friends.add("Bob");
        friends.add("John");
        friends.add("Joe");
    }

    public Friends(String friend1, String friend2, String friend3){
        friends = new ArrayList<String>();
        friends.add(friend1);
        friends.add(friend2);
        friends.add(friend3);
    }

    public Friends(Friends f){
        this(f.friends.get(0), f.friends.get(1), f.friends.get(2));
    }

    public String getFriends() {
        return friends.get(0) + ", " + friends.get(1) + ", " + friends.get(2);
    }

    public void setFriends(String friend1, String friend2, String friend3) {
        friends.set(0, friend1);
        friends.set(1, friend2);
        friends.set(2, friend3);
    }
}

class Runner{
    public static void main(String[] args) {
        Friends Henry = new Friends();
        System.out.println(Henry.getFriends());
    }
}