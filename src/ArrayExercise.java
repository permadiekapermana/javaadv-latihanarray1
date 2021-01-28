public class ArrayExercise {
    public static String[] createArray() {
        String[] strArray = {
            "i’m",
            " in",
            " java practice"
        };
        return strArray;
    }

    public static void main(String[] args) throws Exception {
        
        for(int i=0;i<createArray().length;i++) {
            System.out.print(createArray()[i]);
		}

    }
}
