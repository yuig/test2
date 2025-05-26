package ads_mobile_sdk;

/* loaded from: classes2.dex */
public enum dy implements a.w {
    UNKNOWN(0),
    PHISHING_INTERSTITIAL(1),
    CLIENT_SIDE_PHISHING_INTERSTITIAL(2),
    MALWARE_INTERSTITIAL(3),
    UWS_INTERSTITIAL(4),
    BILLING_INTERSTITIAL(5),
    BINARY_MALWARE_DOWNLOAD_WARNING(6);


    /* renamed from: a, reason: collision with root package name */
    public final int f4513a;

    dy(int i13) {
        this.f4513a = i13;
    }

    @Override // a.w
    public final int a() {
        return this.f4513a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + dy.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f4513a + " name=" + name() + '>';
    }
}
