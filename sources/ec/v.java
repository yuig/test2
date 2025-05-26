package ec;

import android.graphics.Paint;

/* loaded from: classes.dex */
public enum v {
    BUTT,
    ROUND,
    UNKNOWN;

    public Paint.Cap toPaintCap() {
        int i13 = u.f58350a[ordinal()];
        return i13 != 1 ? i13 != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
    }
}
