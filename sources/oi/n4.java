package oi;

import com.google.android.gms.internal.measurement.qb;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class n4 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f94967a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f94968b;

    static {
        int[] iArr = new int[com.google.android.gms.internal.measurement.l2.values().length];
        f94968b = iArr;
        try {
            iArr[com.google.android.gms.internal.measurement.l2.AD_STORAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f94968b[com.google.android.gms.internal.measurement.l2.ANALYTICS_STORAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f94968b[com.google.android.gms.internal.measurement.l2.AD_USER_DATA.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f94968b[com.google.android.gms.internal.measurement.l2.AD_PERSONALIZATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[qb.values().length];
        f94967a = iArr2;
        try {
            iArr2[qb.DEBUG.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f94967a[qb.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f94967a[qb.WARN.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f94967a[qb.VERBOSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
