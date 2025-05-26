package k41;

import b22.l;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f78305a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f78306b;

    static {
        int[] iArr = new int[l.values().length];
        try {
            iArr[l.WIDE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[l.COMPACT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f78305a = iArr;
        int[] iArr2 = new int[zo.c.values().length];
        try {
            iArr2[zo.c.SINGLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[zo.c.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[zo.c.DENSE.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f78306b = iArr2;
    }
}
