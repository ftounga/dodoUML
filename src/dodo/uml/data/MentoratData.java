package dodo.uml.data;

import dodo.uml.model.Mentor;
import dodo.uml.model.User;

import java.util.ArrayList;
import java.util.List;

public class MentoratData {

    private List<User> users;

    public MentoratData() {
        this.users = new ArrayList<>();
        initialize();
    }

    private void initialize() {
        Mentor mentor = new Mentor();
        mentor.setEmail("melanie@gmail.com");
        mentor.setFirstName("ADJOH");
        mentor.setLastName("Melanie");
        mentor.setPassword("Dieumerci");
        mentor.getCompetences().add("java");

        this.users.add(mentor);
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public User findUserByUserNameAndPassword(String userName, String password){
        User result= null;
        for(User user : users){
            if(user.getFirstName().equals(userName) && user.getPassword().equals(password)){
                result = user;
            }
        }
       return result;
    }

    public boolean isthisUserNameExist(String userName){
        for(User user : users){
            if(user.getFirstName().equals(userName)){
                return true;
            }
        }
        return false;
    }
}
