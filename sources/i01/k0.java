package i01;

import com.pinterest.ads.onetap.view.CloseupCarouselView;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.ui.view.BaseRecyclerContainerView;
import h32.e4;
import h32.h2;
import h32.y1;
import java.util.HashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import pk.v2;

/* loaded from: classes5.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final nx.d0 f70664a;

    /* renamed from: b, reason: collision with root package name */
    public final String f70665b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f70666c;

    /* renamed from: d, reason: collision with root package name */
    public final h0 f70667d;

    /* renamed from: e, reason: collision with root package name */
    public final t f70668e;

    /* renamed from: f, reason: collision with root package name */
    public final h32.g0 f70669f;

    /* renamed from: g, reason: collision with root package name */
    public final h32.f1 f70670g;

    /* renamed from: h, reason: collision with root package name */
    public final nx.b0 f70671h;

    /* renamed from: i, reason: collision with root package name */
    public final ur.a f70672i;

    /* renamed from: j, reason: collision with root package name */
    public f30 f70673j;

    /* renamed from: k, reason: collision with root package name */
    public pk.x0 f70674k;

    /* renamed from: l, reason: collision with root package name */
    public pk.x0 f70675l;

    /* renamed from: m, reason: collision with root package name */
    public y1 f70676m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f70677n;

    public k0(nx.d0 pinalytics, String str, i0 imageModuleDimensionProvider, h0 arrivalMethodProvider, t impressionsModuleProvider, h32.f1 eventType, nx.b0 pinAuxHelper, ur.a adsCoreDependencies) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(imageModuleDimensionProvider, "imageModuleDimensionProvider");
        Intrinsics.checkNotNullParameter(arrivalMethodProvider, "arrivalMethodProvider");
        Intrinsics.checkNotNullParameter(impressionsModuleProvider, "impressionsModuleProvider");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(adsCoreDependencies, "adsCoreDependencies");
        this.f70664a = pinalytics;
        this.f70665b = str;
        this.f70666c = imageModuleDimensionProvider;
        this.f70667d = arrivalMethodProvider;
        this.f70668e = impressionsModuleProvider;
        this.f70669f = null;
        this.f70670g = eventType;
        this.f70671h = pinAuxHelper;
        this.f70672i = adsCoreDependencies;
        j0 j0Var = j0.Activated;
        this.f70674k = new pk.x0(4);
        this.f70675l = new pk.x0(4);
    }

    public static void c() {
        j0 j0Var = j0.Activated;
    }

    public final void a(e4 visibleEvent) {
        Intrinsics.checkNotNullParameter(visibleEvent, "visibleEvent");
        if (this.f70676m != null) {
            this.f70674k.e(visibleEvent);
        }
    }

    public final void b() {
        y1 y1Var;
        v2 i13 = this.f70674k.i();
        this.f70674k = new pk.x0(4);
        if (i13.isEmpty() || (y1Var = this.f70676m) == null) {
            return;
        }
        y1Var.f67449j = h2.CLOSEUP_IMPRESSION;
        y1Var.f67459q = i13;
        y1Var.f67439e = ep.b.f(1000000L);
        f30 f30Var = this.f70673j;
        if (f30Var == null) {
            Intrinsics.r("pin");
            throw null;
        }
        i0 i0Var = this.f70666c;
        int W2 = i0Var.W2();
        int e63 = i0Var.e6();
        ur.b bVar = (ur.b) this.f70672i;
        es.h hVar = bVar.f123060c;
        f30 f30Var2 = this.f70673j;
        if (f30Var2 == null) {
            Intrinsics.r("pin");
            throw null;
        }
        h32.k0 c13 = es.h.c(hVar, f30Var2);
        es.a aVar = bVar.f123058a;
        f30 f30Var3 = this.f70673j;
        if (f30Var3 == null) {
            Intrinsics.r("pin");
            throw null;
        }
        h32.f fVar = ((es.c) aVar).j0(f30Var3) ? new h32.f() : null;
        vr.a aVar2 = bVar.f123059b;
        f30 f30Var4 = this.f70673j;
        if (f30Var4 == null) {
            Intrinsics.r("pin");
            throw null;
        }
        String g13 = ((vr.b) aVar2).g(f30Var4);
        es.h hVar2 = bVar.f123060c;
        f30 f30Var5 = this.f70673j;
        if (f30Var5 == null) {
            Intrinsics.r("pin");
            throw null;
        }
        bs1.c.Q1(y1Var, f30Var, null, 0L, W2, e63, -1, this.f70665b, null, false, false, false, null, c13, fVar, null, g13, ((es.v) hVar2).o(f30Var5), null, null, 823552);
        this.f70675l.e(y1Var.a());
        this.f70676m = null;
        oq.x0 x0Var = ((PinCloseupFragment) this.f70668e).f46997i2;
        rq.p0 p0Var = x0Var != null ? x0Var.P : null;
        if (p0Var != null) {
            CloseupCarouselView closeupCarouselView = p0Var.f109452t;
            if (closeupCarouselView == null) {
                Intrinsics.r("carouselView");
                throw null;
            }
            BaseRecyclerContainerView.endImpressionsForCurrentChildImpressionViews$default(closeupCarouselView, false, 1, null);
        }
        e();
    }

    public final void d() {
        e();
        j0 j0Var = j0.Activated;
    }

    public final void e() {
        v2 i13 = this.f70675l.i();
        this.f70675l = new pk.x0(4);
        if (i13.isEmpty()) {
            return;
        }
        f30 f30Var = this.f70673j;
        if (f30Var == null) {
            Intrinsics.r("pin");
            throw null;
        }
        HashMap hashMap = new HashMap();
        this.f70671h.c(f30Var, hashMap);
        v7 D3 = f30Var.D3();
        if (D3 != null && kh2.d.L0(D3)) {
            hashMap.put("is_screenshot_repin", "true");
        }
        hashMap.put("closeup_navigation_type", this.f70667d.getCloseupArrivalMethod().getNavigationType().getType());
        if (b40.X0(f30Var)) {
            bs1.c.G1(SbaPinRep.AUX_DATA_VIDEO_ID, b40.i0(f30Var), hashMap);
        }
        h32.v0 v0Var = new h32.v0();
        f30 f30Var2 = this.f70673j;
        if (f30Var2 == null) {
            Intrinsics.r("pin");
            throw null;
        }
        v0Var.A = f30Var2.d5();
        f30 f30Var3 = this.f70673j;
        if (f30Var3 == null) {
            Intrinsics.r("pin");
            throw null;
        }
        this.f70664a.C(this.f70670g, f30Var3.getUid(), CollectionsKt.H0(i13), hashMap, null, v0Var, this.f70669f);
    }

    public final void f(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f70673j = pin;
    }

    public final void g() {
        if (this.f70677n && this.f70676m == null) {
            y1 y1Var = new y1();
            y1Var.f67433b = ep.b.f(1000000L);
            this.f70676m = y1Var;
            oq.x0 x0Var = ((PinCloseupFragment) this.f70668e).f46997i2;
            rq.p0 p0Var = x0Var != null ? x0Var.P : null;
            if (p0Var != null) {
                CloseupCarouselView closeupCarouselView = p0Var.f109452t;
                if (closeupCarouselView != null) {
                    closeupCarouselView.startImpressionsForCurrentChildImpressionViews();
                } else {
                    Intrinsics.r("carouselView");
                    throw null;
                }
            }
        }
    }
}
