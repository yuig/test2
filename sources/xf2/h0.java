package xf2;

import io.embrace.android.embracesdk.spans.ErrorCode;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f134863a;

    static {
        int[] iArr = new int[ErrorCode.values().length];
        try {
            iArr[ErrorCode.FAILURE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ErrorCode.USER_ABANDON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ErrorCode.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f134863a = iArr;
    }
}
