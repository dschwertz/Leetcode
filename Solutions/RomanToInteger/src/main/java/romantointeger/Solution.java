package romantointeger;

class Solution {
    public int romanToInt(String s) {
        int value = switch (s.charAt(0)) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new IllegalArgumentException("Invalid Roman Numeral");
        };

        for (int i = 1; i < s.length(); ++i) {
            switch (s.charAt(i)) {
                case 'I':
                    ++value;
                    break;
                case 'V':
                    if (s.charAt(i - 1) == 'I') value += 3;
                    else value += 5;
                    break;
                case 'X':
                    if (s.charAt(i - 1) == 'I') value += 8;
                    else value += 10;
                    break;
                case 'L':
                    if (s.charAt(i - 1) == 'X') value += 30;
                    else value += 50;
                    break;
                case 'C':
                    if (s.charAt(i - 1) == 'X') value += 80;
                    else value += 100;
                    break;
                case 'D':
                    if (s.charAt(i - 1) == 'C') value += 300;
                    else value += 500;
                    break;
                case 'M':
                    if (s.charAt(i - 1) == 'C') value += 800;
                    else value += 1000;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid Roman Numeral");
            }
        }
        return value;
    }

    public int romanToIntOptimized(String s) {
        int value = 0;
        int num;

        for (int i = s.length() - 1; i >= 0; --i) {
            num = switch (s.charAt(i)) {
                case 'I' -> 1;
                case 'V' -> 5;
                case 'X' -> 10;
                case 'L' -> 50;
                case 'C' -> 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> throw new IllegalArgumentException("Invalid Roman Numeral");
            };
            if (4 * num < value) value -= num;
            else value += num;
        }
        return value;
    }
}
