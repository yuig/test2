package vs;

import ao2.j0;
import com.pinterest.ads.screen.AdsLocation;
import com.pinterest.navigation.Navigation;
import kotlin.jvm.internal.Intrinsics;
import rr.n0;
import x02.i2;

/* loaded from: classes3.dex */
public final class z implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final m60.w f126533a;

    /* renamed from: b, reason: collision with root package name */
    public final i2 f126534b;

    /* renamed from: c, reason: collision with root package name */
    public final ix.d f126535c;

    /* renamed from: d, reason: collision with root package name */
    public final kw.a f126536d;

    /* renamed from: e, reason: collision with root package name */
    public final es.a f126537e;

    /* renamed from: f, reason: collision with root package name */
    public final gs1.a f126538f;

    /* renamed from: g, reason: collision with root package name */
    public final nm.o f126539g;

    /* renamed from: h, reason: collision with root package name */
    public final es.h f126540h;

    public z(m60.w eventManager, i2 pinRepository, ix.d adsGmaConfigManager, kw.a adsGmaQuarantine, es.a adFormats, gs1.a clipboardProvider, nm.o pinterestGson, es.h adsCommonDisplay) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(adsGmaConfigManager, "adsGmaConfigManager");
        Intrinsics.checkNotNullParameter(adsGmaQuarantine, "adsGmaQuarantine");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(clipboardProvider, "clipboardProvider");
        Intrinsics.checkNotNullParameter(pinterestGson, "pinterestGson");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        this.f126533a = eventManager;
        this.f126534b = pinRepository;
        this.f126535c = adsGmaConfigManager;
        this.f126536d = adsGmaQuarantine;
        this.f126537e = adFormats;
        this.f126538f = clipboardProvider;
        this.f126539g = pinterestGson;
        this.f126540h = adsCommonDisplay;
    }

    @Override // l82.g
    public final void e(j0 scope, l82.h hVar, u50.r eventIntake) {
        e0 request = (e0) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof a0) {
            String str = ((a0) request).f126468a;
            gs1.d dVar = (gs1.d) this.f126538f;
            dVar.getClass();
            new fk2.g(new uv0.a(14, dVar, str), 0).i(new xo.b(13), new n0(17, q.f126506m));
            return;
        }
        if (request instanceof b0) {
            kotlin.jvm.internal.j.z(scope, null, null, new x(this, request, eventIntake, null), 3);
            return;
        }
        if (request instanceof c0) {
            kotlin.jvm.internal.j.z(scope, null, null, new y(this, request, eventIntake, null), 3);
        } else if (Intrinsics.d(request, d0.f126478a)) {
            this.f126533a.d(new za.c(Navigation.w1(AdsLocation.ADS_DEBUGGER)));
        }
    }
}
