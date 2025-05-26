package ads_mobile_sdk;

import a.l0;
import a.zb;
import android.content.Context;
import android.os.SystemClock;
import java.util.Optional;
import kh2.m2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j3 implements a.t5 {

    /* renamed from: a, reason: collision with root package name */
    public final zb f6611a;

    /* renamed from: b, reason: collision with root package name */
    public final wi.k f6612b;

    /* renamed from: c, reason: collision with root package name */
    public final Optional f6613c;

    /* renamed from: d, reason: collision with root package name */
    public final p82 f6614d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f6615e;

    /* renamed from: f, reason: collision with root package name */
    public final h92 f6616f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6617g;

    public j3(zb clock, wi.k adRequest, Optional bannerRequest, p82 requestConfigurationWrapper, Context context, h92 requestType, boolean z13) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(bannerRequest, "bannerRequest");
        Intrinsics.checkNotNullParameter(requestConfigurationWrapper, "requestConfigurationWrapper");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        this.f6611a = clock;
        this.f6612b = adRequest;
        this.f6613c = bannerRequest;
        this.f6614d = requestConfigurationWrapper;
        this.f6615e = context;
        this.f6616f = requestType;
        this.f6617g = z13;
    }

    @Override // a.t5
    public final ol0 a() {
        return ol0.AD_REQUEST;
    }

    @Override // a.t5
    public final Object c(bl2.c cVar) {
        wi.a0 a13 = this.f6614d.a();
        l0 l0Var = cm0.f3958f;
        boolean a14 = (l3.c.g() && this.f6612b.f129958e.getBoolean("_emulatorLiveAds", false)) ? false : a13.a(this.f6615e);
        wi.k kVar = this.f6612b;
        this.f6611a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        wi.y yVar = a13.f129925a;
        h92 h92Var = this.f6616f;
        int value = a13.f129929e.getValue();
        vi.d dVar = (vi.d) m2.U0(this.f6613c);
        return new pk0(new i3(kVar, elapsedRealtime, yVar, a13.f129926b, a13.f129927c, a14, h92Var, value, dVar != null ? dVar.g() : false, this.f6617g));
    }
}
