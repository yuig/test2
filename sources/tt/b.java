package tt;

import bz.i;
import com.pinterest.ads.feature.owc.view.base.AdsCarouselIndexModule;
import com.pinterest.ads.feature.owc.view.core.AdsCoreScrollingModule;
import com.pinterest.api.model.f30;
import com.pinterest.feature.browser.view.InAppBrowserView;
import df.j1;
import dh0.d;
import es.h;
import h32.a4;
import h32.c1;
import h32.d4;
import h32.f1;
import h32.g0;
import h32.i0;
import h32.v0;
import h32.w0;
import h32.z1;
import i32.y0;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import kh2.m2;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.b0;
import nx.d0;
import nx.d1;
import nx.o0;
import ps.l;
import qt.g;
import rg0.o;
import rg0.s;
import ro1.c;
import sg0.f;
import t3.s1;
import tk2.e;
import uj2.q;
import x02.i2;

/* loaded from: classes3.dex */
public class b extends g implements dt.a, li0.b {
    public long A;
    public Boolean B;
    public z1 C;
    public Long D;
    public final a E;

    /* renamed from: x, reason: collision with root package name */
    public String f119047x;

    /* renamed from: y, reason: collision with root package name */
    public final s f119048y;

    /* renamed from: z, reason: collision with root package name */
    public o0 f119049z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, l pinAnalytics, w eventManager, i2 pinRepository, q networkStateStream, j80.b carouselUtil, c deepLinkAdUtil, d1 trackingParamAttacher, lh0.g adsExperiments, xr.a attributionReporting, s experiences, f afterActionPlacementManager, es.a adFormats, b0 pinAuxHelper, ur.a adsDependencies, h adsCommonDisplay, qs.a aVar) {
        super(adsDependencies, attributionReporting, adFormats, adsCommonDisplay, pinAnalytics, pinAuxHelper, trackingParamAttacher, eventManager, carouselUtil, afterActionPlacementManager, adsExperiments, deepLinkAdUtil, pinRepository, networkStateStream, str);
        Intrinsics.checkNotNullParameter(pinAnalytics, "pinAnalytics");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(carouselUtil, "carouselUtil");
        Intrinsics.checkNotNullParameter(deepLinkAdUtil, "deepLinkAdUtil");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(adsExperiments, "adsExperiments");
        Intrinsics.checkNotNullParameter(attributionReporting, "attributionReporting");
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        Intrinsics.checkNotNullParameter(afterActionPlacementManager, "afterActionPlacementManager");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(adsDependencies, "adsDependencies");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        this.f119047x = str;
        this.f119048y = experiences;
        this.E = new a(this, aVar, eventManager);
    }

    public static void I3(b bVar, y0 y0Var) {
        Map g13 = z0.g(new Pair(o.CONTEXT_PIN_ID.getValue(), bVar.f119047x), new Pair(o.IS_PROMOTED.getValue(), String.valueOf(bVar.t3().d5().booleanValue())));
        bVar.getClass();
        bVar.addDisposable(nl.b.s(s1.f(((d) bVar.f119048y).g(y0Var, g13, new tg0.c(false, false)).H(e.f118017c), "observeOn(...)"), new hs.a(9, bVar, y0Var), null, null, 6));
    }

    public final void G3(long j13) {
        if (this.f105129s) {
            return;
        }
        d0 pinalytics = getPinalytics();
        f1 f1Var = f1.PIN_IAB_DURATION;
        String str = this.f119047x;
        c1 r33 = r3(this.f105125o);
        HashMap p33 = p3();
        v0 v0Var = new v0();
        v0Var.C = Long.valueOf(j13);
        pinalytics.H(f1Var, str, r33, p33, v0Var, false);
    }

    public void H3(ls1.g event) {
        Intrinsics.checkNotNullParameter(event, "event");
        G3(event.f84692j - this.A);
    }

    public final void J3(long j13) {
        G3((System.currentTimeMillis() * 1000000) - j13);
    }

    public final void K3() {
        getPinalytics().o(f1.AD_DISCLOSURE_CLICKTHROUGH, (r19 & 2) != 0 ? null : null, (r19 & 4) != 0 ? null : null, (r19 & 8) != 0 ? null : this.f119047x, (r19 & 32) != 0 ? null : p3(), null, r3(this.f105125o), null, false);
    }

    @Override // qt.g
    /* renamed from: L3, reason: merged with bridge method [inline-methods] */
    public void r3(dt.b view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        this.f105112b.h(this.E);
    }

    public final void M3(String str) {
        if (isBound()) {
            if (str == null) {
                str = this.f105126p;
            }
            if (str != null) {
                ((dt.b) getView()).loadUrl(str);
            }
        }
    }

    public final void N3(boolean z13) {
        this.B = Boolean.valueOf(z13);
    }

    public final void Q3(d4 viewType, a4 viewParameterType, g0 g0Var, i timeSpentLoggingManager) {
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(viewParameterType, "viewParameterType");
        Intrinsics.checkNotNullParameter(timeSpentLoggingManager, "timeSpentLoggingManager");
        w0 e13 = getPinalytics().e();
        String str = e13 != null ? e13.G : null;
        HashMap f13 = getPinalytics().f();
        qq2.c cVar = new qq2.c(f13 != null ? j1.R1(f13) : new nx.z0(), str);
        i0 source = getPinalytics().p();
        if (source == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(source, "source");
        timeSpentLoggingManager.f(new i0(viewType, viewParameterType, source.f67083c, g0Var, source.f67085e, source.f67086f), cVar);
    }

    @Override // li0.b
    public final void Z0(String domain) {
        Intrinsics.checkNotNullParameter(domain, "url");
        if (isBound()) {
            try {
                dt.b bVar = (dt.b) getView();
                String domain2 = new URL(domain).getHost();
                Intrinsics.checkNotNullExpressionValue(domain2, "getHost(...)");
                fu.h hVar = (fu.h) bVar;
                hVar.getClass();
                Intrinsics.checkNotNullParameter(domain2, "domain");
                hVar.a8().o0(domain2);
            } catch (MalformedURLException e13) {
                fu.h hVar2 = (fu.h) ((dt.b) getView());
                hVar2.getClass();
                Intrinsics.checkNotNullParameter(domain, "domain");
                hVar2.a8().o0(domain);
                e13.getLocalizedMessage();
            }
        }
    }

    @Override // li0.b
    public final void g3(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
    }

    @Override // qt.g, yk1.p, yk1.b
    public void onUnbind() {
        this.f105112b.j(this.E);
        super.onUnbind();
    }

    @Override // li0.b
    public final boolean q0() {
        return false;
    }

    @Override // qt.g
    public void v3(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        dt.b bVar = (dt.b) getView();
        d0 pinalytics = getPinalytics();
        fu.h hVar = (fu.h) bVar;
        if (pinalytics != null) {
            hVar.H0 = pinalytics;
            AdsCoreScrollingModule d83 = hVar.d8();
            d83.n1().setPinalytics(pinalytics);
            Intrinsics.checkNotNullParameter(pinalytics, "<set-?>");
            d83.E0 = pinalytics;
        } else {
            hVar.getClass();
        }
        super.v3(pin);
        fu.h hVar2 = (fu.h) ((dt.b) getView());
        hVar2.getClass();
        Intrinsics.checkNotNullParameter(this, "webViewClient");
        hVar2.a8().g0(this, hVar2);
        Intrinsics.checkNotNullParameter(this, "presenter");
        hVar2.C0 = this;
        N3(m2.u1(hVar2.f8()));
        InAppBrowserView inAppBrowserView = hVar2.a8().f35366r;
        if (inAppBrowserView != null) {
            inAppBrowserView.j("ads", hVar2.getPin(), hVar2);
        }
        int i13 = this.f105125o;
        AdsCarouselIndexModule adsCarouselIndexModule = hVar2.f53228h0;
        if (adsCarouselIndexModule == null) {
            Intrinsics.r("carouselIndexModule");
            throw null;
        }
        adsCarouselIndexModule.a(i13);
        hVar2.d8().H1(i13);
    }
}
