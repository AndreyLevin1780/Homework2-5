import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String login = "Andrey";
        String password = "Abcd_1234";
        String confirmPassword = "Abcd_1234";

        try {
            ControlService.checkLoginAndPassword(login, password, confirmPassword);
        } catch (WrongPasswordException | WrongLoginException e) {
           System.out.println(e);
        }
    }
}