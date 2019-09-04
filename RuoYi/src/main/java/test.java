public class test {

    public static void main(String[] args) {
        String password = "AA0000fff111";
        String regex = "^(?:(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])).{6,12}$";
        System.out.println(password.matches(regex));
    }


}