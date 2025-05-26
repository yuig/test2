package vt;

import android.widget.FrameLayout;
import com.pinterest.api.model.f30;
import com.pinterest.repository.pin.PinService;
import jk2.x;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.b0;
import nx.d0;
import nx.d1;
import rg0.s;
import x02.a2;
import x02.i2;
import xk2.v;

/* loaded from: classes3.dex */
public final class g extends tt.b implements ft.b {
    public final PinService F;
    public e G;
    public final v H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, ps.l pinAnalytics, i2 pinRepository, w eventManager, uj2.q networkStateStream, j80.b carouselUtil, ro1.c deepLinkAdUtil, d1 trackingParamAttacher, PinService pinService, lh0.g adsExperiments, xr.a attributionReporting, s experiences, sg0.f afterActionPlacementManager, es.a adFormats, b0 pinAuxHelper, ur.a adsDependencies, es.h adsCommonDisplay) {
        super(str, pinAnalytics, eventManager, pinRepository, networkStateStream, carouselUtil, deepLinkAdUtil, trackingParamAttacher, adsExperiments, attributionReporting, experiences, afterActionPlacementManager, adFormats, pinAuxHelper, adsDependencies, adsCommonDisplay, null);
        Intrinsics.checkNotNullParameter(pinAnalytics, "pinAnalytics");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(carouselUtil, "carouselUtil");
        Intrinsics.checkNotNullParameter(deepLinkAdUtil, "deepLinkAdUtil");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(pinService, "pinService");
        Intrinsics.checkNotNullParameter(adsExperiments, "adsExperiments");
        Intrinsics.checkNotNullParameter(attributionReporting, "attributionReporting");
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        Intrinsics.checkNotNullParameter(afterActionPlacementManager, "afterActionPlacementManager");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(adsDependencies, "adsDependencies");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        this.F = pinService;
        this.H = xk2.m.b(new lr.v(this, 6));
    }

    public final void R3() {
        uk2.d dVar;
        r viewState;
        ft.c cVar;
        e eVar = this.G;
        if (eVar == null || (dVar = eVar.f126582i) == null || (viewState = (r) dVar.S()) == null || (cVar = (ft.c) this.H.getValue()) == null) {
            return;
        }
        lu.k kVar = (lu.k) cVar;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        if (viewState instanceof m) {
            kVar.V0 = false;
            FrameLayout frameLayout = kVar.d8().f35324k0;
            if (frameLayout != null) {
                frameLayout.setClickable(false);
            }
            if (((m) viewState).f126617c) {
                return;
            }
            kVar.d8().n1().q();
        }
    }

    public final void S3(e adsQuizManager) {
        Intrinsics.checkNotNullParameter(adsQuizManager, "adsQuizManager");
        this.G = adsQuizManager;
        d0 pinalytics = getPinalytics();
        adsQuizManager.getClass();
        Intrinsics.checkNotNullParameter(pinalytics, "<set-?>");
        adsQuizManager.f126574a = pinalytics;
    }

    public final void T3(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f119047x = pinId;
    }

    @Override // qt.g
    public final void loadData() {
        String str = this.f119047x;
        if (str != null) {
            i2 i2Var = this.f105113c;
            addDisposable(new jk2.i2(new x(i2Var.M(str).j(), new com.pinterest.framework.multisection.datasource.pagedlist.h(7, a.f126556o), 2), i2Var.Q(str), 0).F(new st.c(11, new f(this, 2)), new st.c(12, a.f126557p), ck2.i.f27923c, ck2.i.f27924d));
        }
    }

    @Override // tt.b, qt.g
    public final void v3(f30 pin) {
        uk2.d dVar;
        uk2.d dVar2;
        Intrinsics.checkNotNullParameter(pin, "pin");
        super.v3(pin);
        ft.c cVar = (ft.c) this.H.getValue();
        if (cVar != null) {
            Intrinsics.checkNotNullParameter(this, "presenter");
            ((lu.k) cVar).T0 = this;
        }
        e eVar = this.G;
        a2 a2Var = ck2.i.f27924d;
        ck2.c cVar2 = ck2.i.f27923c;
        xj2.c cVar3 = null;
        xj2.c F = (eVar == null || (dVar2 = eVar.f126582i) == null) ? null : dVar2.F(new st.c(5, new f(this, 1)), new st.c(6, a.f126555n), cVar2, a2Var);
        e eVar2 = this.G;
        if (eVar2 != null && (dVar = eVar2.f126583j) != null) {
            cVar3 = dVar.F(new st.c(7, new f(this, 0)), new st.c(8, a.f126554m), cVar2, a2Var);
        }
        if (F != null) {
            addDisposable(F);
        }
        if (cVar3 != null) {
            addDisposable(cVar3);
        }
    }
}
