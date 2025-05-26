package ads_mobile_sdk;

import kp.n;

/* loaded from: classes2.dex */
public final class za0 {

    /* renamed from: b, reason: collision with root package name */
    public static final za0 f14687b = new za0(new n(9));

    /* renamed from: c, reason: collision with root package name */
    public static final za0 f14688c = new za0(new n(13));

    /* renamed from: a, reason: collision with root package name */
    public final a.ag f14689a;

    static {
        new za0(new n(15));
        new za0(new n(14));
        new za0(new n(10));
        new za0(new n(12));
        new za0(new n(11));
    }

    public za0(a.pb pbVar) {
        if (kr2.a()) {
            this.f14689a = new xa0(pbVar);
        } else if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            this.f14689a = new va0(pbVar);
        } else {
            this.f14689a = new wa0(pbVar);
        }
    }
}
