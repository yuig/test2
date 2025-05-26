package xo2;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f135635a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(char c13) {
        if ('0' <= c13 && c13 < ':') {
            return c13 - '0';
        }
        if ('a' <= c13 && c13 < 'g') {
            return c13 - 'W';
        }
        if ('A' <= c13 && c13 < 'G') {
            return c13 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c13);
    }
}
