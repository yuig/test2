package g32;

/* loaded from: classes4.dex */
public final class a {
    public static c a(int i13) {
        if (i13 == 0) {
            return c.DEFAULT;
        }
        if (i13 == 1) {
            return c.TRUSTED_NATIVE_CREATOR;
        }
        if (i13 == 2) {
            return c.CREATOR;
        }
        if (i13 == 3) {
            return c.NON_CREATOR_BIZ;
        }
        if (i13 != 4) {
            return null;
        }
        return c.TOP_VETTED;
    }
}
