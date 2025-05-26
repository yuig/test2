package xt;

import com.pinterest.api.model.f30;
import com.pinterest.repository.pin.PinService;
import java.util.List;
import kh2.m2;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.b0;
import nx.d1;
import ps.l;
import rg0.s;
import uj2.q;
import x02.a2;
import x02.i2;
import xk2.m;
import xk2.v;

/* loaded from: classes3.dex */
public final class c extends tt.b {
    public final PinService F;
    public final es.h G;
    public f H;
    public final v I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, l pinAnalytics, i2 pinRepository, w eventManager, q networkStateStream, j80.b carouselUtil, ro1.c deepLinkAdUtil, d1 trackingParamAttacher, PinService pinService, lh0.g adsExperiments, xr.a attributionReporting, s experiences, sg0.f afterActionPlacementManager, es.a adFormats, b0 pinAuxHelper, ur.a adsDependencies, es.h adsCommonDisplay) {
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
        this.G = adsCommonDisplay;
        this.I = m.b(new lr.v(this, 8));
    }

    @Override // qt.g
    public final void F3() {
        List X0 = m2.X0(t3(), this.G);
        Intrinsics.checkNotNullParameter(X0, "<set-?>");
        this.f105128r = X0;
    }

    @Override // tt.b, qt.g
    /* renamed from: L3 */
    public final void r3(dt.b view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        f fVar = this.H;
        a2 a2Var = ck2.i.f27924d;
        ck2.c cVar = ck2.i.f27923c;
        if (fVar != null) {
            addDisposable(fVar.f135875r.F(new st.c(23, new a(this, 1)), new st.c(24, b.f135852j), cVar, a2Var));
        }
        xj2.c F = this.f105113c.y().F(new st.c(25, new a(this, 2)), new st.c(26, b.f135853k), cVar, a2Var);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
    }

    public final void R3(f showcaseManager) {
        Intrinsics.checkNotNullParameter(showcaseManager, "showcaseManager");
        this.H = showcaseManager;
    }

    @Override // qt.g
    public final void loadData() {
        String str = this.f119047x;
        if (str != null) {
            i2 i2Var = this.f105113c;
            jk2.i2 i2Var2 = new jk2.i2(i2Var.M(str).j(), i2Var.Q(str), 0);
            Intrinsics.checkNotNullExpressionValue(i2Var2, "switchIfEmpty(...)");
            addDisposable(nl.b.s(i2Var2, new a(this, 0), null, null, 6));
        }
    }

    @Override // tt.b, qt.g, yk1.p, yk1.b
    public final void onUnbind() {
        clearDisposables();
        super.onUnbind();
    }

    @Override // tt.b, qt.g
    public final void v3(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        super.v3(pin);
        if (((ht.a) this.I.getValue()) != null) {
            Intrinsics.checkNotNullParameter(this, "presenter");
        }
    }
}
