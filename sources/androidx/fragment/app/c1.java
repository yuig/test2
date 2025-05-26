package androidx.fragment.app;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f18298a;

    static {
        int[] iArr = new int[androidx.lifecycle.r.values().length];
        f18298a = iArr;
        try {
            iArr[androidx.lifecycle.r.RESUMED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f18298a[androidx.lifecycle.r.STARTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f18298a[androidx.lifecycle.r.CREATED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f18298a[androidx.lifecycle.r.INITIALIZED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
