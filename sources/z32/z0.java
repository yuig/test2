package z32;

/* loaded from: classes4.dex */
public final class z0 {
    public static b1 a(int i13) {
        if (i13 == 0) {
            return b1.NONE;
        }
        if (i13 == 1) {
            return b1.MEDIUM;
        }
        if (i13 == 2) {
            return b1.SMALL;
        }
        if (i13 == 3) {
            return b1.LARGE;
        }
        if (i13 != 4) {
            return null;
        }
        return b1.EXTRA_SMALL;
    }
}
