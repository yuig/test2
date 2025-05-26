package eo;

import android.widget.ImageView;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f59706a;

    static {
        int[] iArr = new int[ImageView.ScaleType.values().length];
        f59706a = iArr;
        try {
            iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f59706a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f59706a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f59706a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f59706a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f59706a[ImageView.ScaleType.FIT_START.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f59706a[ImageView.ScaleType.MATRIX.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f59706a[ImageView.ScaleType.FIT_XY.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
