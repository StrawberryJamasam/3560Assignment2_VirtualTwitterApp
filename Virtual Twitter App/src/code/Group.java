package code;

import java.util.List;
import java.util.ArrayList;

/* Class creates a group, can add additional users and groups */
public class Group implements Members
{
    private String ID;
    private List<Members> members;

    /* Constructor */
    public Group(String groupID)
    {
        ID = groupID;
        members = new ArrayList<>();
    }

    public void addMember(Members m)
    {
        members.add(m);
    }

    public List<Members> getMembers()
    {
        return members;
    }

    public String getID()
    {
        return ID;
    }
    
    @Override
    public String toString()
    {
        return ID;
    }
}
