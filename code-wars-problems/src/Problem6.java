public class Problem6 {
    public String solution(int n) {
        if (n < 1 || n > 3999) {
            return "";
        }

        StringBuilder roman = new StringBuilder();

        while (n >= 1000) {
            roman.append("M");
            n -= 1000;
        }

        if (n >= 900) {
            roman.append("CM");
            n -= 900;
        } else if (n >= 500) {
            roman.append("D");
            n -= 500;
        } else if (n >= 400) {
            roman.append("CD");
            n -= 400;
        }

        while (n >= 100) {
            roman.append("C");
            n -= 100;
        }

        if (n >= 90) {
            roman.append("XC");
            n -= 90;
        } else if (n >= 50) {
            roman.append("L");
            n -= 50;
        } else if (n >= 40) {
            roman.append("XL");
            n -= 40;
        }

        while (n >= 10) {
            roman.append("X");
            n -= 10;
        }

        if (n >= 9) {
            roman.append("IX");
            n -= 9;
        } else if (n >= 5) {
            roman.append("V");
            n -= 5;
        } else if (n >= 4) {
            roman.append("IV");
            n -= 4;
        }

        while (n >= 1) {
            roman.append("I");
            n -= 1;
        }

        return roman.toString();
    }


}
