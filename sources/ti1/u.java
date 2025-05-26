package ti1;

import ua2.b1;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class u {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f117752a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f117753b;

    static {
        int[] iArr = new int[b1.values().length];
        try {
            iArr[b1.VERTICAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b1.FIXED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f117752a = iArr;
        int[] iArr2 = new int[cs.d.values().length];
        try {
            iArr2[cs.d.IMAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[cs.d.NOT_SUPPORTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[cs.d.VIDEO.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f117753b = iArr2;
    }
}
