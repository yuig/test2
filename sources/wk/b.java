package wk;

import il.d3;
import il.o5;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f130043a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f130044b;

    static {
        int[] iArr = new int[d3.values().length];
        f130044b = iArr;
        try {
            iArr[d3.SHA1.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f130044b[d3.SHA224.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f130044b[d3.SHA256.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f130044b[d3.SHA384.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f130044b[d3.SHA512.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr2 = new int[o5.values().length];
        f130043a = iArr2;
        try {
            iArr2[o5.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f130043a[o5.CRUNCHY.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f130043a[o5.LEGACY.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f130043a[o5.RAW.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
