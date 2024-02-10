public class Main {

    private static final String VALIDATE_PATTERN = "^[a-zA-Z0-9-_]+$";

    public static void main(String[] args) {
        check("login", "pass", "pass");
        check("login", "pass", "pass2");
        check("login", "passpasspasspasspasspasspasspasspasspasspasspasspasspasspasspass", "pass");
        check("loginloginloginloginloginloginloginloginloginlogin", "pass", "pass");
        check("login", "pass%%%%", "pass");
        check("login%%%%%", "pass", "pass");

    }

    private static void check(String login, String pass, String confirmPas) {
        try {
            checkLogin(login);
            checkPassword(pass, confirmPas);
        } catch (WrongLoginException e) {
            System.out.println("Ошибка с введенным логином: " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("Ошибка с введенным паролем: " + e.getMessage());
        }
    }

    private static void checkLogin(String login) throws WrongLoginException {
        if (!login.matches(VALIDATE_PATTERN)) {
            throw new WrongLoginException("Логин может содержакть в себе только латинские буквы, цыфры и знаки подчеркивания");
        }
        if (login.length() > 20) {
            throw new WrongLoginException("Логин не может быть длинее 20 симвалов");
        }
    }

    private static void checkPassword(String pass, String confirmPass) throws WrongPasswordException {
        if (!pass.matches(VALIDATE_PATTERN)) {
            throw new WrongPasswordException("Пароль может содержать только латинские буквы, цыфры и знаки подчеркивания ");
        }
        if (pass.length() > 20) {
            throw new WrongPasswordException("Логин не может быть длинее 20 симвалов");
        }
        if (!pass.equals(confirmPass)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }
}