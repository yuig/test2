package el;

import il.i4;
import il.o5;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class r {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f59522a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f59523b;

    static {
        int[] iArr = new int[i4.values().length];
        f59523b = iArr;
        try {
            iArr[i4.SYMMETRIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f59523b[i4.ASYMMETRIC_PRIVATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[o5.values().length];
        f59522a = iArr2;
        try {
            iArr2[o5.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f59522a[o5.LEGACY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f59522a[o5.RAW.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f59522a[o5.CRUNCHY.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
