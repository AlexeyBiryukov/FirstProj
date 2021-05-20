public class StudentOrderValidator
{
    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll() {
        StudentOrder studentOrder = readStudentOrder();

        answerCityRegister cityAnswer = checkCityRegister(studentOrder);
        answerWedding weddingAnswer = checkWedding(studentOrder);
        answerChildren childAnswer = checkChildren(studentOrder);
        answerStudent studAnswer = checkStudent(studentOrder);

        sendMail(studentOrder);
    }

    static StudentOrder readStudentOrder() {
        StudentOrder studentOrder = new StudentOrder();
        return studentOrder;
    }

    static answerCityRegister checkCityRegister(StudentOrder studentOrder) {
        System.out.println("CityRegister is running");
        return new answerCityRegister();
    }

    static answerWedding checkWedding(StudentOrder studentOrder) {
        System.out.println("Wedding check is running");
        return new answerWedding();
    }

    static answerChildren checkChildren(StudentOrder studentOrder) {
        System.out.println("Children check is running");
        return new answerChildren();
    }

    static answerStudent checkStudent(StudentOrder studentOrder) {
        System.out.println("Student check is running");
        return new answerStudent();
    }

    static void sendMail(StudentOrder studentOrder) {

    }
}
