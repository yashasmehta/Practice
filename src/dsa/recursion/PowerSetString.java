package dsa.recursion;

// find powerset of string. Eg. abc = { abc, ab, ac, a, bc, b, c, "" }
public class PowerSetString {
    public void powerSet(String str, int i, String curr) {
        if(i == str.length()) {
            System.out.println(curr);
            return;
        }

        powerSet(str, i+1, curr + str.charAt(i));
        powerSet(str, i+1, curr);
    }

    public static void main(String[] args) {
        PowerSetString powerSetString = new PowerSetString();
        powerSetString.powerSet("abc", 0, "");
    }
}
