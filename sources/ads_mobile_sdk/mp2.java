package ads_mobile_sdk;

import a.ye;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class mp2 implements a.le {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f8327a;

    /* renamed from: b, reason: collision with root package name */
    public final r0 f8328b;

    /* renamed from: c, reason: collision with root package name */
    public final n1 f8329c;

    /* renamed from: d, reason: collision with root package name */
    public final ye f8330d;

    /* renamed from: e, reason: collision with root package name */
    public final a.sa f8331e;

    /* renamed from: f, reason: collision with root package name */
    public volatile ao2.o1 f8332f;

    public mp2(j0 backgroundScope, r0 adConfiguration, n1 adEventEmitter, ye rewardedEventEmitter, a.sa thirdPartyVideoEventEmitter) {
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        Intrinsics.checkNotNullParameter(rewardedEventEmitter, "rewardedEventEmitter");
        Intrinsics.checkNotNullParameter(thirdPartyVideoEventEmitter, "thirdPartyVideoEventEmitter");
        this.f8327a = backgroundScope;
        this.f8328b = adConfiguration;
        this.f8329c = adEventEmitter;
        this.f8330d = rewardedEventEmitter;
        this.f8331e = thirdPartyVideoEventEmitter;
    }
}
