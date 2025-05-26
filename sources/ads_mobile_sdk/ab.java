package ads_mobile_sdk;

/* loaded from: classes2.dex */
public enum ab implements a.w {
    DEVICE_IDENTIFIER_NO_ID(0),
    DEVICE_IDENTIFIER_APP_SPECIFIC_ID(1),
    DEVICE_IDENTIFIER_GLOBAL_ID(2),
    DEVICE_IDENTIFIER_ADVERTISER_ID(3),
    DEVICE_IDENTIFIER_ADVERTISER_ID_UNHASHED(4),
    DEVICE_IDENTIFIER_ANDROID_AD_ID(5),
    DEVICE_IDENTIFIER_GFIBER_ADVERTISING_ID(6),
    DEVICE_IDENTIFIER_PER_APP_ID(7),
    DEVICE_IDENTIFIER_PER_APP_ID_V2(8),
    DEVICE_IDENTIFIER_CONNECTED_TV_IFA(9);


    /* renamed from: a, reason: collision with root package name */
    public final int f2342a;

    ab(int i13) {
        this.f2342a = i13;
    }

    @Override // a.w
    public final int a() {
        return this.f2342a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + ab.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f2342a + " name=" + name() + '>';
    }
}
