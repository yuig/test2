package rf1;

import com.pinterest.api.model.rj0;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class q {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f107879a;

    static {
        int[] iArr = new int[rj0.a.values().length];
        try {
            iArr[rj0.a.APPROVED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[rj0.a.REJECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[rj0.a.REQUESTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[rj0.a.UNAFFILIATED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f107879a = iArr;
    }
}
