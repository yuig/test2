package ec;

import android.graphics.Paint;

/* loaded from: classes.dex */
public enum w {
    MITER,
    ROUND,
    BEVEL;

    public Paint.Join toPaintJoin() {
        int i13 = u.f58351b[ordinal()];
        if (i13 == 1) {
            return Paint.Join.BEVEL;
        }
        if (i13 == 2) {
            return Paint.Join.MITER;
        }
        if (i13 != 3) {
            return null;
        }
        return Paint.Join.ROUND;
    }
}
