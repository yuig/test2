package ok;

/* loaded from: classes.dex */
public abstract class p implements w {
    public static String a(char c13) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i13 = 0; i13 < 4; i13++) {
            cArr[5 - i13] = "0123456789ABCDEF".charAt(c13 & 15);
            c13 = (char) (c13 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public int b(int i13, CharSequence charSequence) {
        int length = charSequence.length();
        bf.b.q(i13, length);
        while (i13 < length) {
            if (c(charSequence.charAt(i13))) {
                return i13;
            }
            i13++;
        }
        return -1;
    }

    public abstract boolean c(char c13);
}
