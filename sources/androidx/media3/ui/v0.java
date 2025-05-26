package androidx.media3.ui;

import android.text.Layout;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f19112a;

    static {
        int[] iArr = new int[Layout.Alignment.values().length];
        f19112a = iArr;
        try {
            iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f19112a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f19112a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
