public class SaveStudentOrder
{
    public static void main(String[] args) {
        StudentOrder so = new StudentOrder();
        so.mFirstName = "Алексей";
        so.mLastName = "Бирюков";
        so.wFirstName = "Алина";
        so.wLastName = "Бирюкова";

       long ans = saveStudentOrder(so);
        System.out.println(ans);
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder: " + studentOrder.mFirstName);

        return answer;
    }
}
