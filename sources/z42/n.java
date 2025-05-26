package z42;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class n {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f140852a;

    static {
        int[] iArr = new int[o.values().length];
        try {
            iArr[o.DIRECT_TO_INBOX.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o.SEND_REQUEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[o.BLOCKED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f140852a = iArr;
    }
}
