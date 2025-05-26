package kl;

import il.d3;
import il.o5;
import il.w1;
import il.y2;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f80000a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f80001b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f80002c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int[] f80003d;

    static {
        int[] iArr = new int[w1.values().length];
        f80003d = iArr;
        try {
            iArr[w1.IEEE_P1363.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f80003d[w1.DER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[y2.values().length];
        f80002c = iArr2;
        try {
            iArr2[y2.NIST_P256.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f80002c[y2.NIST_P384.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f80002c[y2.NIST_P521.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr3 = new int[o5.values().length];
        f80001b = iArr3;
        try {
            iArr3[o5.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f80001b[o5.CRUNCHY.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f80001b[o5.LEGACY.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f80001b[o5.RAW.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        int[] iArr4 = new int[d3.values().length];
        f80000a = iArr4;
        try {
            iArr4[d3.SHA256.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f80000a[d3.SHA384.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f80000a[d3.SHA512.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
    }
}
