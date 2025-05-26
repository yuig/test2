package ei2;

import io.opentelemetry.api.trace.StatusCode;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f58968a;

    static {
        int[] iArr = new int[StatusCode.values().length];
        try {
            iArr[StatusCode.UNSET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StatusCode.OK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[StatusCode.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f58968a = iArr;
    }
}
