package dodo.uml.service;

import dodo.uml.data.MentoratData;
import dodo.uml.model.User;
import dodo.uml.response.AuthenticationResponse;

public class
AuthentificationService {

    private MentoratData mentoratData;

    public AuthentificationService() {

    }

    public AuthenticationResponse authenticate(String name, String password){

        AuthenticationResponse authenticationResponse = new AuthenticationResponse();
        User user = mentoratData.findUserByUserNameAndPassword(name, password);
        if(user !=null){
            authenticationResponse.setAuthenticated(true);
            authenticationResponse.setMessage("You have been authenticated successfully");
            return authenticationResponse;
        } else {
            authenticationResponse.setAuthenticated(false);
            authenticationResponse.setMessage("Error occured during authentication");
            if(mentoratData.isthisUserNameExist(name)){
                authenticationResponse.setLinkReinitialization("http://www.dodo.com/reinitialize");
            }
            return authenticationResponse;
        }

    }

    /** TODO
    public void signup(SignUpForm form){

    }**/

    public AuthentificationService(MentoratData mentoratData) {
        this.mentoratData = mentoratData;
    }

    public MentoratData getMentoratData() {
        return mentoratData;
    }

    public void setMentoratData(MentoratData mentoratData) {
        this.mentoratData = mentoratData;
    }
}
