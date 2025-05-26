package wt;

import ck2.i;
import com.pinterest.api.model.b01;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.h80;
import com.pinterest.api.model.oe0;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import df.j1;
import es.h;
import h32.f1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jk2.g2;
import kg.t;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import lh0.g;
import lr.v;
import m60.w;
import nx.b0;
import nx.d0;
import nx.d1;
import ps.l;
import rg0.s;
import uj2.q;
import x02.i2;
import xk2.m;

/* loaded from: classes3.dex */
public final class f extends tt.b {
    public final d1 F;
    public final g G;
    public final xr.a H;
    public vu.a I;

    /* renamed from: J, reason: collision with root package name */
    public final b f131087J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, l pinAnalytics, i2 pinRepository, w eventManager, q networkStateStream, j80.b carouselUtil, ro1.c deepLinkAdUtil, d1 trackingParamAttacher, g experiments, xr.a attributionReporting, s experiences, sg0.f afterActionPlacementManager, es.a adFormats, b0 pinAuxHelper, ur.a adsDependencies, h adsCommonDisplay) {
        super(str, pinAnalytics, eventManager, pinRepository, networkStateStream, carouselUtil, deepLinkAdUtil, trackingParamAttacher, experiments, attributionReporting, experiences, afterActionPlacementManager, adFormats, pinAuxHelper, adsDependencies, adsCommonDisplay, null);
        Intrinsics.checkNotNullParameter(pinAnalytics, "pinAnalytics");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(carouselUtil, "carouselUtil");
        Intrinsics.checkNotNullParameter(deepLinkAdUtil, "deepLinkAdUtil");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(attributionReporting, "attributionReporting");
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        Intrinsics.checkNotNullParameter(afterActionPlacementManager, "afterActionPlacementManager");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(adsDependencies, "adsDependencies");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        this.F = trackingParamAttacher;
        this.G = experiments;
        this.H = attributionReporting;
        m.b(new v(this, 7));
        this.I = vu.a.SCROLL_UP;
        this.f131087J = new b(this);
    }

    @Override // qt.g
    public final void F3() {
        boolean z13;
        List list;
        List r13;
        h80 h80Var;
        List u13;
        b01 b01Var;
        Map g13;
        f30 pin = t3();
        Intrinsics.checkNotNullParameter(this.G, "<this>");
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (!ph.a.f0(pin)) {
            if (!j1.B0(t3())) {
                super.F3();
                return;
            }
            f30 t33 = t3();
            Intrinsics.checkNotNullParameter(t33, "<this>");
            ArrayList F = t.F(t33);
            Intrinsics.checkNotNullParameter(F, "<set-?>");
            this.f105128r = F;
            return;
        }
        f30 t34 = t3();
        Intrinsics.checkNotNullParameter(t34, "<this>");
        Intrinsics.checkNotNullParameter(t34, "<this>");
        oe0 f63 = t34.f6();
        bc2.q qVar = null;
        if (f63 != null && (r13 = f63.r()) != null && (h80Var = (h80) CollectionsKt.firstOrNull(r13)) != null && (u13 = h80Var.u()) != null && (b01Var = (b01) CollectionsKt.firstOrNull(u13)) != null && (g13 = b01Var.g()) != null && !g13.isEmpty()) {
            qVar = dl2.b.q0(g13, null, j1.z0(t34));
        }
        bc2.q qVar2 = qVar;
        if (qVar2 == null) {
            list = q0.f80391a;
        } else {
            bc2.c cVar = qVar2.f22677f;
            int i13 = cVar.f22648a;
            String z43 = t34.z4();
            String D = com.bumptech.glide.c.D(t34);
            String h43 = t34.h4();
            String r43 = t34.r4();
            String c43 = t34.c4();
            String uid = t34.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            Boolean d53 = t34.d5();
            Intrinsics.checkNotNullExpressionValue(d53, "getIsPromoted(...)");
            if (!d53.booleanValue()) {
                Boolean F4 = t34.F4();
                Intrinsics.checkNotNullExpressionValue(F4, "getIsDownstreamPromotion(...)");
                if (!F4.booleanValue()) {
                    z13 = false;
                    Boolean p63 = t34.p6();
                    Intrinsics.checkNotNullExpressionValue(p63, "getShouldMute(...)");
                    m21.b bVar = new m21.b(i13, cVar.f22649b, "", qVar2, z43, D, h43, r43, c43, uid, null, null, z13, true, null, p63.booleanValue(), false, null, null, null, false, 3842048);
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(t.F(t34));
                    arrayList.add(1, bVar);
                    list = arrayList;
                }
            }
            z13 = true;
            Boolean p632 = t34.p6();
            Intrinsics.checkNotNullExpressionValue(p632, "getShouldMute(...)");
            m21.b bVar2 = new m21.b(i13, cVar.f22649b, "", qVar2, z43, D, h43, r43, c43, uid, null, null, z13, true, null, p632.booleanValue(), false, null, null, null, false, 3842048);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(t.F(t34));
            arrayList2.add(1, bVar2);
            list = arrayList2;
        }
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f105128r = list;
    }

    @Override // tt.b, qt.g
    /* renamed from: L3 */
    public final void r3(dt.b view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        this.f105112b.h(this.f131087J);
    }

    @Override // qt.g, at.a
    public final void e0(String str, boolean z13) {
        d0 pinalytics = getPinalytics();
        boolean l03 = ((es.c) this.f105119i).l0(t3());
        xr.a aVar = this.H;
        if (l03) {
            aVar.a(t3(), true);
        }
        HashMap f13 = z0.f(new Pair("click_type", "clickthrough"), new Pair("closeup_navigation_type", this.f105131u.getType()), new Pair("is_cct_enabled", String.valueOf(z13)));
        if (str != null) {
            f13.put("final_destination_url", str);
        }
        if (b40.U0(t3())) {
            f13.put("is_third_party_ad", "true");
            f13.put(SbaPinRep.AUX_DATA_IS_MDL_AD, "true");
        }
        this.f105120j.a(t3(), aVar, f13);
        if (p3().containsKey("grid_click_type") && p3().get("grid_click_type") != null) {
            f13.put("grid_click_type", String.valueOf(p3().get("grid_click_type")));
        }
        String uid = t3().getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        pinalytics.n(uid, f13, this.F.b(t3()), null, w3(str), null);
        HashMap f14 = z0.f(new Pair("navigation_type", this.I.getKey()));
        int i13 = a.f131082a[this.I.ordinal()];
        if (i13 == 1) {
            pinalytics.u(f1.VIEW_WEBSITE_100, t3().getUid(), r3(this.f105125o), p3(), false);
        } else if (i13 == 2) {
            f14.put("hero_index", String.valueOf(this.f105125o));
        }
        pinalytics.u(f1.DESTINATION_VIEW, this.f119047x, r3(this.f105125o), f14, false);
        this.I = vu.a.SCROLL_UP;
    }

    @Override // qt.g
    public final void loadData() {
        String str = this.f119047x;
        if (str != null) {
            addDisposable(new g2(this.f105113c.L(str), new com.pinterest.framework.multisection.datasource.pagedlist.h(8, new c(this, 0)), 1).F(new st.c(21, new d(1, this, f.class, "init", "init(Lcom/pinterest/api/model/Pin;)V", 0)), new st.c(22, e.f131086i), i.f27923c, i.f27924d));
        }
    }

    @Override // qt.g, yk1.b
    public final void onDeactivate() {
        super.onDeactivate();
    }

    @Override // tt.b, qt.g, yk1.p, yk1.b
    public final void onUnbind() {
        this.f105112b.j(this.f131087J);
        super.onUnbind();
    }

    @Override // qt.g
    public final boolean u3() {
        return false;
    }
}
