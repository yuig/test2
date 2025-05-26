package ads_mobile_sdk;

/* loaded from: classes2.dex */
public enum vx implements a.w {
    SAFE_BROWSING_URL_API_TYPE_UNSPECIFIED(0),
    PVER3_NATIVE(1),
    PVER4_NATIVE(2),
    ANDROID_SAFETYNET(3),
    FLYWHEEL(4),
    REAL_TIME(5),
    PVER5_NATIVE_REAL_TIME(6),
    ANDROID_SAFEBROWSING_REAL_TIME(7),
    ANDROID_SAFEBROWSING(8),
    CLIENT_SIDE_DETECTION(9);


    /* renamed from: a, reason: collision with root package name */
    public final int f12703a;

    vx(int i13) {
        this.f12703a = i13;
    }

    @Override // a.w
    public final int a() {
        return this.f12703a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + vx.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f12703a + " name=" + name() + '>';
    }
}
