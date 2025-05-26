package ads_mobile_sdk;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class mh2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f8228a;

    /* renamed from: b, reason: collision with root package name */
    public final dj.e f8229b;

    /* renamed from: c, reason: collision with root package name */
    public final aj.r f8230c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f8231d;

    public mh2(long j13, String requestId, dj.e signalRequest, aj.r signals) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(signalRequest, "signalRequest");
        Intrinsics.checkNotNullParameter(signals, "signals");
        this.f8228a = j13;
        this.f8229b = signalRequest;
        this.f8230c = signals;
        this.f8231d = new LinkedHashSet();
    }
}
