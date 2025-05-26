package z32;

/* loaded from: classes4.dex */
public final class c1 {
    public static e1 a(int i13) {
        if (i13 == 0) {
            return e1.NONE;
        }
        if (i13 == 1) {
            return e1.DEFAULT;
        }
        if (i13 == 2) {
            return e1.LARGE;
        }
        if (i13 == 3) {
            return e1.MEDIUM;
        }
        if (i13 != 4) {
            return null;
        }
        return e1.SMALL;
    }
}
