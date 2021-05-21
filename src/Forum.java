import java.util.ArrayList;
import java.util.List;

public class Forum extends Entity {

    private List<Entity> members = new ArrayList<>();

    public void addMember(Entity entity) {
        members.add(entity);
    }

    @Override
    public void introducesYourself() {
        // members.forEach(entity -> entity.introducesYourself());
        members.forEach(Entity::introducesYourself);
    }
}
