package f42;

/* loaded from: classes4.dex */
public final class a {
    public static c a(int i13) {
        if (i13 == -1) {
            return c.UNSET;
        }
        if (i13 == 0) {
            return c.LIPCOLOR;
        }
        if (i13 == 1) {
            return c.LIPLINER;
        }
        if (i13 == 2) {
            return c.BROW;
        }
        if (i13 == 3) {
            return c.EYELINER;
        }
        if (i13 != 4) {
            return null;
        }
        return c.EYESHADOW;
    }
}
