package dodo.uml.response;

public class AuthenticationResponse {

    private boolean isAuthenticated;
    private String message;
    private String linkReinitialization;


    public AuthenticationResponse(boolean isAuthenticated, String message, String linkReinitialization) {
        this.isAuthenticated = isAuthenticated;
        this.message = message;
        this.linkReinitialization = linkReinitialization;
    }

    public AuthenticationResponse() {
    }

    public boolean isAuthenticated() {
        return isAuthenticated;
    }

    public void setAuthenticated(boolean authenticated) {
        isAuthenticated = authenticated;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getLinkReinitialization() {
        return linkReinitialization;
    }

    public void setLinkReinitialization(String linkReinitialization) {
        this.linkReinitialization = linkReinitialization;
    }
}
