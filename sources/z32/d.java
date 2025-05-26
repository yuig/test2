package z32;

/* loaded from: classes4.dex */
public final class d {
    public static f a(int i13) {
        if (i13 == 0) {
            return f.DEFAULT;
        }
        if (i13 == 1) {
            return f.TEXT_ONLY;
        }
        if (i13 == 2) {
            return f.MODULE_IN_FEED;
        }
        if (i13 == 3) {
            return f.PINTEREST_PICKS;
        }
        if (i13 == 4) {
            return f.GULP;
        }
        if (i13 != 5) {
            return null;
        }
        return f.NO_HEADER;
    }
}
