package bp;

import com.pinterest.api.model.pc;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class i {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f23636a;

    static {
        int[] iArr = new int[pc.values().length];
        f23636a = iArr;
        try {
            iArr[pc.NEW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f23636a[pc.CONTACT_REQUEST_NOT_APPROVED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f23636a[pc.PENDING_APPROVAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
