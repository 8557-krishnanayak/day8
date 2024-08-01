public class ExceptionHierarchy {
    public static void main(String[] args) {

        try{
            String str = null;
            str.length();
            int number = 10 / 0;
            System.out.println("Hello");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (NullPointerException e){
            System.out.println("Null Pointer Exception");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
