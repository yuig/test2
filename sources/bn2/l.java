package bn2;

import am2.c0;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class l {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f23584a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f23585b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f23586c;

    static {
        int[] iArr = new int[c0.values().length];
        f23586c = iArr;
        try {
            iArr[c0.FINAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f23586c[c0.SEALED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f23586c[c0.OPEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f23586c[c0.ABSTRACT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[m.values().length];
        f23585b = iArr2;
        try {
            iArr2[m.OVERRIDABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f23585b[m.CONFLICT.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f23585b[m.INCOMPATIBLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        int[] iArr3 = new int[g.values().length];
        f23584a = iArr3;
        try {
            iArr3[g.OVERRIDABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f23584a[g.CONFLICT.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f23584a[g.INCOMPATIBLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f23584a[g.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
    }
}
