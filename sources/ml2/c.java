package ml2;

/* loaded from: classes2.dex */
public class c extends b {
    public static int a(int i13) {
        if (i13 < 0) {
            return -1;
        }
        return i13 > 0 ? 1 : 0;
    }

    public static int b(double d2) {
        if (Double.isNaN(d2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d2 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d2 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d2);
    }

    public static int c(float f13) {
        if (Float.isNaN(f13)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f13);
    }

    public static long d(double d2) {
        if (Double.isNaN(d2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d2);
    }
}
