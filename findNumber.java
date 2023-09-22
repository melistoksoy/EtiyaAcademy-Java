public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[]{2,6,3,7,9,8};
        int numberFind = 6;

        boolean isNumberExist=false;
        for (int number : numbers){
            if (number==numberFind){
                isNumberExist = true;
                break;

            }
        }
		
        if (isNumberExist){
            System.out.println("number exists.");
        }else {
            System.out.println("number not exists.");
        }



    }
}
