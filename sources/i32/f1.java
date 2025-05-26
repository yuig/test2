package i32;

/* loaded from: classes4.dex */
public final class f1 {
    public static h1 a(int i13) {
        if (i13 == 0) {
            return h1.SMALL;
        }
        if (i13 == 1) {
            return h1.MEDIUM;
        }
        if (i13 == 2) {
            return h1.LARGE;
        }
        if (i13 != 3) {
            return null;
        }
        return h1.EXTRA_LARGE;
    }
}
