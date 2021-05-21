
public class Test {

    public static void main(String[] args) {

        Forum forum = new Forum();
        forum.addMember(new Person("Moshe 1"));
        forum.addMember(new Person("Moshe 2"));
        forum.addMember(new Person("Moshe 3"));
        forum.addMember(new Person("Moshe 4"));

        Forum subForum = new Forum();
        subForum.addMember(new Person("Moshe 5"));
        subForum.addMember(new Person("Moshe 6"));

        forum.addMember(subForum);

        forum.introducesYourself();

    }

}
