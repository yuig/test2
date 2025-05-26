package eo;

import android.widget.ImageView;

/* loaded from: classes.dex */
public abstract /* synthetic */ class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f59728a;

    static {
        int[] iArr = new int[ImageView.ScaleType.values().length];
        f59728a = iArr;
        try {
            iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f59728a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f59728a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f59728a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f59728a[ImageView.ScaleType.FIT_START.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f59728a[ImageView.ScaleType.FIT_END.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f59728a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
