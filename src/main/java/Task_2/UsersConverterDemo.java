package Task_2;

public class UsersConverterDemo {
    public static final String USERS_FILE_FROM = "D:\\Java\\HomeworkGoIt10\\src\\main\\java\\Task_2\\file";
    public static final String USERS_FILE_TO = "D:\\Java\\HomeworkGoIt10\\src\\main\\java\\Task_2\\file.json";

    public static void main(String[] args) {
        new UserConverter().convert(USERS_FILE_FROM,USERS_FILE_TO);
    }
}
