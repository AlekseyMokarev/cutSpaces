public class App {
    public static void main(String[] args) throws Exception {
        //test 1
        String initialString = "_On__my___home_world";
        String resultString = cutSpaces(initialString);
        System.out.println("Test1 - "+resultString);
        //test 2
        String initialString2 = "_______On__________my___________home_________world_______";
        String resultString2 = cutSpaces(initialString2);
        System.out.println("Test2 - "+resultString2);
        //test 3
        String initialString3 = "On__________my___________home_________world";
        String resultString3 = cutSpaces(initialString3);
        System.out.println("Test3 - "+resultString3);
    }

    private static String cutSpaces(String s){
        StringBuilder sb = new StringBuilder(s);
        for(int i=1; i<sb.length();i++){
            if(sb.charAt(i)=='_'&&sb.charAt(i-1)=='_'){
                sb.deleteCharAt(i);
                i--;
            }      
        }
        if(sb.length()>0&&sb.charAt(0)=='_'){
            sb.deleteCharAt(0);
            if(sb.length()>0&&sb.charAt(sb.length()-1)=='_'){
                sb.deleteCharAt(sb.length()-1);
            }
        }
        return sb.toString();
    }
}




