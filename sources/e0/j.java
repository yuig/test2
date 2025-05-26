package e0;

import androidx.camera.core.impl.y;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class j {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f56714a;

    static {
        int[] iArr = new int[y.values().length];
        f56714a = iArr;
        try {
            iArr[y.READY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f56714a[y.NONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f56714a[y.FIRED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
