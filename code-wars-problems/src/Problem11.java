public class Problem11 {
    public boolean isPalindrome(int x) {
        int reversed = 0;
        int xCopy = x;
        while (x != 0){
            int digit = x % 10;
            reversed = (reversed * 10) + digit;
            x /= 10;
        }

        if(xCopy < 0){
            return false;
        }

        return reversed == xCopy;

    }
}
