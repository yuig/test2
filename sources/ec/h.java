package ec;

/* loaded from: classes.dex */
public enum h {
    NORMAL,
    MULTIPLY,
    SCREEN,
    OVERLAY,
    DARKEN,
    LIGHTEN,
    COLOR_DODGE,
    COLOR_BURN,
    HARD_LIGHT,
    SOFT_LIGHT,
    DIFFERENCE,
    EXCLUSION,
    HUE,
    SATURATION,
    COLOR,
    LUMINOSITY,
    ADD,
    HARD_MIX;

    public f5.a toNativeBlendMode() {
        int i13 = g.f58309a[ordinal()];
        if (i13 == 2) {
            return f5.a.SCREEN;
        }
        if (i13 == 3) {
            return f5.a.OVERLAY;
        }
        if (i13 == 4) {
            return f5.a.DARKEN;
        }
        if (i13 == 5) {
            return f5.a.LIGHTEN;
        }
        if (i13 != 6) {
            return null;
        }
        return f5.a.PLUS;
    }
}
