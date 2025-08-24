class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}
class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}
class EmailId {
    private String username;
    private String password;
    public EmailId() {
        this.username = "";
        this.password = "";
    }
    public EmailId(String username, String password) throws InvalidUsernameException, InvalidPasswordException {
        if (!isValidUsername(username)) {
            throw new InvalidUsernameException("Invalid username");
        }
        if (!isValidPassword(password)) {
            throw new InvalidPasswordException("Invalid password");
        }
        this.username = username;
        this.password = password;
    }

    private boolean isValidUsername(String username) {
        return username.contains("@") && username.length() > 1;
    }
    private boolean isValidPassword(String password) {
        return password.length() >= 8;
    }
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                System.out.println("Usage: java EmailId <username> <password>");
                return;
            }

            String username = args[0];
            String password = args[1];

            EmailId email = new EmailId(username, password);

            System.out.println("Email ID created successfully:");
            System.out.println("Username: " + email.getUsername());
            System.out.println("Password: " + email.getPassword());
        } catch (InvalidUsernameException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

