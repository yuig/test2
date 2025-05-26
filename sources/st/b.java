package st;

import ck2.i;
import com.pinterest.api.model.f30;
import es.h;
import eu.e;
import eu.u;
import eu.x;
import h32.f1;
import h32.v0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import lh0.g;
import lh0.g1;
import lh0.z3;
import m60.w;
import nx.b0;
import nx.d0;
import nx.d1;
import ps.l;
import rg0.s;
import rr.n0;
import sg0.f;
import tq.a0;
import uj2.q;
import x02.i2;
import xk2.m;
import xk2.v;

/* loaded from: classes3.dex */
public final class b extends tt.b implements ct.a {
    public final a11.d F;
    public final h G;
    public final v H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, l pinAnalytics, i2 pinRepository, w eventManager, a11.d clickthroughHelperFactory, q networkStateStream, j80.b carouselUtil, ro1.c deepLinkAdUtil, d1 trackingParamAttacher, g adsExperiments, xr.a attributionReporting, s experiences, f afterActionPlacementManager, es.a adFormats, b0 pinAuxHelper, ur.a adsDependencies, h adsCommonDisplay) {
        super(str, pinAnalytics, eventManager, pinRepository, networkStateStream, carouselUtil, deepLinkAdUtil, trackingParamAttacher, adsExperiments, attributionReporting, experiences, afterActionPlacementManager, adFormats, pinAuxHelper, adsDependencies, adsCommonDisplay, null);
        Intrinsics.checkNotNullParameter(pinAnalytics, "pinAnalytics");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(clickthroughHelperFactory, "clickthroughHelperFactory");
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
        this.F = clickthroughHelperFactory;
        this.G = adsCommonDisplay;
        this.H = m.b(new lr.v(this, 5));
    }

    @Override // tt.b
    public final void H3(ls1.g event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.H3(event);
        z3 activate = z3.DO_NOT_ACTIVATE_EXPERIMENT;
        g gVar = this.f105116f;
        gVar.getClass();
        Intrinsics.checkNotNullParameter("enabled_with_clickthrough", "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        if (((g1) gVar.f83348a).k("android_collection_ads_click_analytics", "enabled_with_clickthrough", activate)) {
            long j13 = event.f84692j - this.A;
            d0 pinalytics = getPinalytics();
            f1 f1Var = f1.PIN_CLICKTHROUGH_END;
            String str = this.f119047x;
            HashMap p33 = p3();
            v0 v0Var = new v0();
            v0Var.C = Long.valueOf(j13);
            pinalytics.H(f1Var, str, null, p33, v0Var, false);
        }
        ct.b bVar = (ct.b) this.H.getValue();
        if (bVar != null) {
            e eVar = (e) bVar;
            eVar.f7().d(new x(eVar.d8().R0));
            eVar.D0 = null;
        }
    }

    public final void R3() {
        g gVar = this.f105116f;
        if (gVar.f() || gVar.e()) {
            this.f105112b.d(new u(t3(), kg.q.b(t3(), ((es.v) this.G).M(t3())), false));
        }
    }

    public final void S3(String str) {
        this.f119047x = str;
    }

    @Override // qt.g
    public final void loadData() {
        String str = this.f119047x;
        if (str != null) {
            i2 i2Var = this.f105113c;
            addDisposable(new jk2.i2(new jk2.x(i2Var.M(str).j(), new com.pinterest.framework.multisection.datasource.pagedlist.h(4, a.f115148j), 2), i2Var.Q(str), 0).F(new n0(27, new a0(this, 23)), new n0(28, a.f115149k), i.f27923c, i.f27924d));
        }
    }

    @Override // tt.b, qt.g
    public final void v3(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        super.v3(pin);
        ct.b bVar = (ct.b) this.H.getValue();
        if (bVar != null) {
            Intrinsics.checkNotNullParameter(this, "presenter");
            ((e) bVar).f60128a1 = this;
        }
    }
}
