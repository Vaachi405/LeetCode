class Solution {
    public int flipLights(int n, int presses) {
        if (presses == 0) {
            return 1;   // no presses → only initial state
        }

        if (n == 1) {
            return 2;   // ON or OFF
        }

        if (n == 2) {
            if (presses == 1) return 3;
            return 4;
        }

        // n >= 3
        if (presses == 1) return 4;
        if (presses == 2) return 7;

        return 8;
    }
}