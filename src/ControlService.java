import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class ControlService {

    public static void checkLoginAndPassword(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException{

        String allowedSymbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_";

        if (login.length() > 20) {
            throw new WrongLoginException("Логин не может быть длиннее 20 символов.");
        } else if (password.length() > 20) {
            throw new WrongPasswordException("Пароль не может быть длиннее 20 символов.");
        } else if (!password.equals(confirmPassword)){
            throw new WrongPasswordException("Пароли не совпадают.");
        }

        char [] loginSymbols = login.toCharArray();
        char [] passwordSymbols = password.toCharArray();

        for (int i = 0; i < loginSymbols.length ; i++) {
            if (allowedSymbols.contains(Character.toString(loginSymbols[i]))) {
                continue;
            } else {
                throw new WrongLoginException("Неверный символ в логине.");
            }
        }
            for (int j = 0; j < passwordSymbols.length ; j++) {
                if (allowedSymbols.contains(Character.toString(passwordSymbols[j]))) {
                    continue;
                } else {
                    throw new WrongPasswordException("Неверный символ в пароле.");
                }
            }
        }
}
