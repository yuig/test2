package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class tp1 {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f11623a;

    /* renamed from: b, reason: collision with root package name */
    public final vo f11624b;

    /* renamed from: c, reason: collision with root package name */
    public final un1 f11625c;

    /* renamed from: d, reason: collision with root package name */
    public final np1 f11626d;

    /* renamed from: e, reason: collision with root package name */
    public final oh0 f11627e;

    public tp1(r0 adConfiguration, vo commonConfiguration, un1 networkConnectivityManager, np1 offlineDatabase, oh0 flags) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(commonConfiguration, "commonConfiguration");
        Intrinsics.checkNotNullParameter(networkConnectivityManager, "networkConnectivityManager");
        Intrinsics.checkNotNullParameter(offlineDatabase, "offlineDatabase");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.f11623a = adConfiguration;
        this.f11624b = commonConfiguration;
        this.f11625c = networkConnectivityManager;
        this.f11626d = offlineDatabase;
        this.f11627e = flags;
    }
}
