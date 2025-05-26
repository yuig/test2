package z32;

/* loaded from: classes4.dex */
public final class a2 {
    public static c2 a(int i13) {
        if (i13 == 0) {
            return c2.NONE;
        }
        if (i13 == 1) {
            return c2.IMAGE_ONLY;
        }
        if (i13 == 2) {
            return c2.SHOPPING_GRID;
        }
        if (i13 == 3) {
            return c2.PIN_GRID;
        }
        if (i13 == 4) {
            return c2.AD_PIN;
        }
        if (i13 != 5) {
            return null;
        }
        return c2.COMMENT_PIN;
    }
}
