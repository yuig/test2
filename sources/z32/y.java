package z32;

/* loaded from: classes4.dex */
public final class y {
    public static a0 a(int i13) {
        if (i13 == 0) {
            return a0.NONE;
        }
        if (i13 == 1) {
            return a0.SMALL;
        }
        if (i13 == 2) {
            return a0.MEDIUM;
        }
        if (i13 == 3) {
            return a0.EXTRA_LARGE;
        }
        if (i13 != 4) {
            return null;
        }
        return a0.EXTRA_SMALL;
    }
}
