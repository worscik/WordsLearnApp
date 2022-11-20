package words.app.UserController.User;

import java.util.HashMap;

public class GlobalUsersMap {

    User user;

    private HashMap<String,String> globalUsers = new HashMap<>();

    public HashMap<String, String> getGlobalUsers() {
        return globalUsers;
    }

    public void setGlobalUsers(HashMap<String, String> globalUsers) {
        this.globalUsers = globalUsers;
    }

    public void addUserToGlobalMap(User user){
        globalUsers.put("Monika","dupka123");
        globalUsers.put(user.getName(), user.getPassword());
        System.out.println(globalUsers);
    }

    public HashMap<String, String> showMap(){
        return globalUsers;
    }

}
