package f42;

/* loaded from: classes2.dex */
public final class j {
    public static l a(int i13) {
        if (i13 == 0) {
            return l.NONE;
        }
        if (i13 == 1) {
            return l.PRODUCT;
        }
        if (i13 == 2) {
            return l.FULL_LOOK;
        }
        if (i13 == 3) {
            return l.PARTIAL_LOOK;
        }
        if (i13 != 4) {
            return null;
        }
        return l.LENS_PHOTO;
    }
}
