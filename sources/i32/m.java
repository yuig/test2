package i32;

/* loaded from: classes4.dex */
public final class m {
    public static o a(int i13) {
        if (i13 == 1) {
            return o.ACTION_UPSELL_NO_IMAGE;
        }
        if (i13 == 2) {
            return o.ACTION_UPSELL_MULTI_IMAGE;
        }
        if (i13 == 3) {
            return o.ACTION_UPSELL_ROUND_IMAGE;
        }
        if (i13 == 4) {
            return o.ACTION_UPSELL_SQARE_IMAGE;
        }
        if (i13 != 5) {
            return null;
        }
        return o.ACTION_UPSELL_RECTANGULAR_IMAGE;
    }
}
