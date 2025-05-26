package zp;

import com.pinterest.api.model.rj0;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f142335a;

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
        f142335a = iArr;
    }
}
