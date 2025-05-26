package el;

import il.l4;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class y {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f59555a;

    static {
        int[] iArr = new int[l4.values().length];
        f59555a = iArr;
        try {
            iArr[l4.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f59555a[l4.DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f59555a[l4.DESTROYED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
