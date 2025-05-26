package ev0;

import com.pinterest.api.model.rj0;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f60242a;

    static {
        int[] iArr = new int[rj0.a.values().length];
        try {
            iArr[rj0.a.APPROVED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[rj0.a.REQUESTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[rj0.a.REJECTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f60242a = iArr;
    }
}
