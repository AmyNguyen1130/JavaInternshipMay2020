package codeenginestudio.huong;

public class Exercise1 {

    public static void main(String[] args) {
        Exercise1 exercise1 = new Exercise1();
        String str = "tha7t is2 pa6 Thi1s T4est 3a th5";
        System.out.println(exercise1.sortString(str));
    }

    public char[] convertStringToArray(String str) {
        char[] charArray = str.toCharArray();
        return charArray;
    }

    public boolean isNumeric(char input) {
        try {
            Integer.parseInt(String.valueOf(input));
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public String joinArrayToString(String[] strArray) {
        String joinedString = String.join(" ", strArray);
        return joinedString;
    }

    public String[] splitStringToArray(String str) {
        String[] strArray = str.split("\\s");
        return strArray;
    }

    public int findNumber(char[] Arr) {
        int num = 0;

        for (int i = 0; i < Arr.length; i++) {
            if (isNumeric(Arr[i])) {
                num = Integer.parseInt(String.valueOf(Arr[i]));
                return num;
            }
        }

        return num;
    }

    public void swap(String[] ainputArr, int indexSwap) {
        String temp = null;
        temp = ainputArr[indexSwap];
        ainputArr[indexSwap] = ainputArr[indexSwap + 1];
        ainputArr[indexSwap + 1] = temp;
    }

    public String sortString(String str) {
        String[] strArray = splitStringToArray(str);

        for (int i = 0; i < strArray.length - 1; i++) {
            for (int j = 0; j < strArray.length - 1; j++) {

                char[] itemArray1 = convertStringToArray(strArray[j]);
                char[] itemArray2 = convertStringToArray(strArray[j + 1]);

                if (findNumber(itemArray1) > findNumber(itemArray2)) {
                    swap(strArray, j);
                }

            }
        }

        return joinArrayToString(strArray);
    }


//    public String sortString(String str) {
//        String[] strArray = splitStringToArray(str);
//        String[] newStrArr = new String[strArray.length];
//        int backward = 0;

//        for (int i = 0; i < strArray.length; i++) {
//            char[] itemToArray = convertStringToArray(strArray[i]);
//            int check = 0;

//            for (int j = 0; j <= itemToArray.length - 1; j++) {
//                if (isNumeric(itemToArray[j])) {
//                    check += 1;
//                    int index = Integer.parseInt(String.valueOf(itemToArray[j])) - 1;
//                    newStrArr[index] = strArray[i];
//                    break;
//                }
//            }

//            if (check == 0 ){
//                newStrArr[strArray.length - backward - 1] = strArray[i];
//                backward ++;
//            }
//        }

//        return joinArrayToString(newStrArr);
//    }
}
