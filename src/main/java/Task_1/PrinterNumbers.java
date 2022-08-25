package Task_1;

public class PrinterNumbers {
    public static final String RELATIVE_PATH = "D:\\Java\\HomeworkGoIt10\\src\\main\\java\\Task_1\\phone_numbers";

    public static void main(String[] args) {
        ValidatorNumbersPhone phoneNumbersValidator = new ValidatorNumbersPhone();
        phoneNumbersValidator.print(RELATIVE_PATH);
    }
}
