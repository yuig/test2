package c11;

import i01.g;
import i01.h;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f24512a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f24513b;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.LOADING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h.COMPLETE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f24512a = iArr;
        int[] iArr2 = new int[g.values().length];
        try {
            iArr2[g.MODULE_ELIGIBILITY_UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[g.LOADING.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[g.COMPLETE.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f24513b = iArr2;
    }
}
