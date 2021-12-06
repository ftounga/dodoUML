package dodo.uml;

import dodo.uml.data.MentoratData;
import dodo.uml.response.AuthenticationResponse;
import dodo.uml.service.AuthentificationService;
import dodo.uml.service.MentoratAttributionService;

import java.util.Scanner;

public class MentoraApp{

    private boolean isAuthenticated;
    private AuthentificationService authentificationService;

    private MentoratAttributionService mentoratAttributionService;

    public MentoraApp(){
        this.isAuthenticated = false;
        this.authentificationService = new AuthentificationService();
    }

    public void start(){
        boolean continueProcess = true;
        Scanner scanner = new Scanner(System.in);
        MentoratData mentoratData = new MentoratData();
        this.authentificationService.setMentoratData(mentoratData);
        while (continueProcess) {
            System.out.print( "What do yo to do ? \n" );
            System.out.print( "- Log in: 1 \n" );
            System.out.print( "- Sign up: 2 \n" );
            System.out.print( "- Log out: 3 \n" );
            System.out.print( "- Exit: 0 \n" );
            int mode = scanner.nextInt();

            switch(mode) {
                case 1:
                    authenicateInput();
                    break;
                case 2:
                    System.out.print( "This fonctionality is not implemented yet. \n" );
                    break;
                case 3:
                    System.out.print( "This fonctionality is not implemented yet. \n" );
                    break;
                case 0:
                    System.out.print( "End \n" );
                    continueProcess = false;
                    break;
                default:
                    // code block
                    continueProcess = false;
                    break;
            }
        }
    }

    public void authenicateInput(){
        if (!isAuthenticated ){
            Scanner scanner = new Scanner(System.in);
            System.out.print( "Your name: \n" );
            String name = scanner.nextLine();
            System.out.print( "Your password: \n" );
            String password = scanner.nextLine();
            AuthenticationResponse authenticationResponse = authentificationService.authenticate(name, password);
            if (authenticationResponse.isAuthenticated()){
                System.out.print( authenticationResponse.getMessage() + " \n" );
                isAuthenticated = true;
            } else {
                isAuthenticated = false;
                System.out.print( authenticationResponse.getMessage() + " \n" );
                if(authenticationResponse.getLinkReinitialization() != null){
                    System.out.print( "You can reset your password here" + authenticationResponse.getLinkReinitialization()+ " \n" );
                }
            }
        }else {
            System.out.print("Your are already authenticated \n" );
        }


    }

}
