package ii1;

import wa2.p;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f72317a;

    static {
        int[] iArr = new int[p.values().length];
        try {
            iArr[p.STATE_HIDDEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[p.STATE_REPORTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[p.STATE_FILTER_PIN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f72317a = iArr;
    }
}
