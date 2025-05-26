package z32;

/* loaded from: classes4.dex */
public final class o1 {
    public static q1 a(int i13) {
        if (i13 == 0) {
            return q1.HIDDEN;
        }
        if (i13 == 1) {
            return q1.BOTTOM_LEFT_INSIDE;
        }
        if (i13 == 2) {
            return q1.BOTTOM_LEFT_OUTSIDE;
        }
        if (i13 == 3) {
            return q1.BOTTOM_RIGHT_INSIDE;
        }
        if (i13 == 4) {
            return q1.BOTTOM_RIGHT_OUTSIDE;
        }
        if (i13 != 5) {
            return null;
        }
        return q1.BOTTOM_CENTER_BORDER;
    }
}
