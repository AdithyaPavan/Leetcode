class Solution {
    public int maxDiff(int num) {
        String s = Integer.toString(num);
        char maxReplace = ' ';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '9') {
                maxReplace = s.charAt(i);
                break;
            }
        }
        String a = (maxReplace == ' ') ? s : s.replace(maxReplace, '9');

        String b = s;
        if (s.charAt(0) != '1') {
            b = s.replace(s.charAt(0), '1');
        } else {
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) != '0' && s.charAt(i) != '1') {
                    b = s.replace(s.charAt(i), '0');
                    break;
                }
            }
        }

        return Integer.parseInt(a) - Integer.parseInt(b);

    }
}