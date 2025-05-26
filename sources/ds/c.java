package ds;

import xu1.i;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f56215a;

    static {
        int[] iArr = new int[i.values().length];
        try {
            iArr[i.BOTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[i.WIFI.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[i.MOBILE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[i.NONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f56215a = iArr;
    }
}
