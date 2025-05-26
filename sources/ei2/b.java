package ei2;

import io.embrace.android.embracesdk.Severity;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f58967a;

    static {
        int[] iArr = new int[Severity.values().length];
        try {
            iArr[Severity.INFO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Severity.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Severity.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f58967a = iArr;
    }
}
