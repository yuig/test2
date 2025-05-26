package kotlin.text;

/* loaded from: classes2.dex */
public class a extends CharsKt__CharJVMKt {
    public static int a(char c13) {
        int digit = Character.digit((int) c13, 10);
        if (digit >= 0) {
            return digit;
        }
        throw new IllegalArgumentException("Char " + c13 + " is not a decimal digit");
    }

    public static final boolean b(char c13, char c14, boolean z13) {
        if (c13 == c14) {
            return true;
        }
        if (!z13) {
            return false;
        }
        char upperCase = Character.toUpperCase(c13);
        char upperCase2 = Character.toUpperCase(c14);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}
