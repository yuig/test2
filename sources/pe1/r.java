package pe1;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.br0;
import com.pinterest.api.model.e30;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.u7;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.wy0;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import h32.f1;
import h32.v0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kh2.u2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;
import lh0.f4;
import m60.w;
import nx.b0;
import nx.d0;
import nx.d1;
import nx.f0;
import qa2.h0;
import rl2.g0;
import x02.c2;
import x02.i2;
import x02.x0;
import xk2.v;
import z32.f2;
import z32.m0;

/* loaded from: classes5.dex */
public class r extends hd1.b implements mj0.g, l {
    public final hd1.c R;
    public final d1 S;
    public final w T;
    public final il1.a U;
    public final i2 V;
    public final com.pinterest.feature.pin.r W;
    public final String X;
    public final b0 Y;
    public boolean Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(hd1.c listParams, String str, a11.d clickThroughHelperFactory, d1 trackingParamAttacher, w eventManager, il1.a fragmentFactory, i2 pinRepository, com.pinterest.feature.pin.r repinAnimationUtil, String trafficSource, b0 pinAuxHelper) {
        super(listParams, str, 12);
        Intrinsics.checkNotNullParameter(listParams, "listParams");
        Intrinsics.checkNotNullParameter(clickThroughHelperFactory, "clickThroughHelperFactory");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(fragmentFactory, "fragmentFactory");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(repinAnimationUtil, "repinAnimationUtil");
        Intrinsics.checkNotNullParameter(trafficSource, "trafficSource");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        this.R = listParams;
        this.S = trackingParamAttacher;
        this.T = eventManager;
        this.U = fragmentFactory;
        this.V = pinRepository;
        this.W = repinAnimationUtil;
        this.X = trafficSource;
        this.Y = pinAuxHelper;
        uk1.d dVar = listParams.f68886c;
        d0 d0Var = dVar.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        o(34, new xv.g(dVar, listParams.f68887d, clickThroughHelperFactory.a(d0Var), trackingParamAttacher));
        int[] iArr = mj0.j.f87276a;
        f2 f2Var = f2.NONE;
        f2 f2Var2 = listParams.f68903t;
        mj0.j.a(this, listParams.f68901r, this, f2Var2 != f2Var, f2Var2, null, 32);
        Object[] objArr = {listParams.E, listParams.F, listParams.G};
        for (int i13 = 0; i13 < 3; i13++) {
            if (objArr[i13] == null) {
                return;
            }
        }
        ArrayList A = c0.A(objArr);
        Object obj = A.get(0);
        Object obj2 = A.get(1);
        Object obj3 = A.get(2);
        hd1.c cVar = this.R;
        uk1.d dVar2 = cVar.f68886c;
        ze1.c cVar2 = new ze1.c((String) null, 3);
        Intrinsics.g(obj, "null cannot be cast to non-null type com.pinterest.experiment.StructuredFeedLibraryExperiments");
        f4 f4Var = (f4) obj;
        hd1.c cVar3 = this.R;
        wa2.i iVar = cVar3.f68901r;
        Intrinsics.g(obj2, "null cannot be cast to non-null type com.pinterest.analytics.PinalyticsFactory");
        Intrinsics.g(obj3, "null cannot be cast to non-null type com.pinterest.common.kit.data.PrefsManagerUser");
        o(37, new se1.c(dVar2, cVar.f68887d, cVar2, f4Var, iVar, cVar3.f68889f, (f0) obj2, null, false, false, null, (lb0.r) obj3, this.X, 8064));
        d0 d0Var2 = this.R.f68886c.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var2, "getPinalytics(...)");
        o(38, new yi0.a(d0Var2, this.R.f68889f));
    }

    public static final void i0(r rVar, f30 f30Var, String str) {
        v0 v0Var;
        String i03;
        HashMap o13 = rVar.Y.o(f30Var, str);
        if (o13 == null) {
            o13 = new HashMap();
        }
        HashMap hashMap = o13;
        if (b40.X0(f30Var) && (i03 = b40.i0(f30Var)) != null) {
            hashMap.put(SbaPinRep.AUX_DATA_VIDEO_ID, i03);
        }
        String b13 = rVar.S.b(f30Var);
        if (b13 == null || b13.length() == 0) {
            HashSet hashSet = tb0.h.f117076w;
            tb0.g.f117075a.q(new Throwable("Builder was null in logRepin"), "Builder was null in logRepin", tb0.p.REPIN);
            v0Var = null;
        } else {
            v0 v0Var2 = new v0();
            v0Var2.G = b13;
            v0Var = v0Var2;
        }
        if (v0Var != null) {
            d0 d0Var = rVar.R.f68886c.f122379a;
            Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
            d0Var.H(f1.PIN_REPIN, f30Var.getUid(), null, hashMap, v0Var, false);
        }
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final void T(dl1.s model) {
        Intrinsics.checkNotNullParameter(model, "model");
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final void Z() {
        super.Z();
        this.Z = false;
    }

    public boolean a6(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        wy0 f13 = ((b60.d) this.R.f68894k).f();
        return g0.V(pin, f13 != null ? f13.getUid() : null);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final void b0(List itemsToSet, boolean z13) {
        Intrinsics.checkNotNullParameter(itemsToSet, "itemsToSet");
        super.b0(j0(itemsToSet), z13);
    }

    @Override // hd1.b, com.pinterest.framework.multisection.datasource.pagedlist.c, sq0.e0
    public final int getItemViewType(int i13) {
        Integer num;
        dl1.s item = getItem(i13);
        if (item instanceof vh) {
            vh vhVar = (vh) item;
            if (vhVar.i0()) {
                return 34;
            }
            if (vhVar.f42868z == m0.STRUCTURED_FEED_HERO) {
                return 37;
            }
            return super.getItemViewType(i13);
        }
        if (!(item instanceof f30)) {
            if (item instanceof br0) {
                return 38;
            }
            return super.getItemViewType(i13);
        }
        int itemViewType = super.getItemViewType(i13);
        if (this.R.f68903t == f2.NONE) {
            return itemViewType;
        }
        int[] iArr = mj0.j.f87276a;
        v vVar = mj0.j.f87277b;
        return (!((Map) vVar.getValue()).containsKey(Integer.valueOf(itemViewType)) || (num = (Integer) ((Map) vVar.getValue()).get(Integer.valueOf(itemViewType))) == null) ? itemViewType : num.intValue();
    }

    public final ArrayList j0(List list) {
        f4 f4Var;
        List list2 = list;
        boolean z13 = (list2.isEmpty() ^ true) || (d().isEmpty() ^ true);
        ArrayList H0 = CollectionsKt.H0(list2);
        if (!t0() && !this.Z && z13 && (f4Var = this.R.E) != null && u2.K0(f4Var)) {
            H0.add(new br0(null, 1, null));
            this.Z = true;
        }
        return H0;
    }

    public void l2(f30 pin, h0 h0Var) {
        Unit unit;
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (a6(pin)) {
            new kc1.w(this, 27).invoke(pin);
            return;
        }
        gb2.d dVar = this.P;
        com.pinterest.feature.pin.r rVar = this.W;
        hd1.c cVar = this.R;
        if (dVar != null) {
            String uid = pin.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            c2 c2Var = new c2(uid);
            boolean z13 = dVar instanceof gb2.b;
            String str = dVar.f64745a;
            if (z13) {
                c2Var.f131300e = ((gb2.b) dVar).f64744b;
                c2Var.f131301f = str;
            } else {
                c2Var.f131300e = str;
            }
            c2Var.f131304i = false;
            c2Var.f131305j = pin.z4();
            c2Var.f131306k = this.S.b(pin);
            com.pinterest.feature.pin.j jVar = cVar.f68906w;
            if (jVar != null) {
                String str2 = z13 ? ((gb2.b) dVar).f64744b : str;
                u(jVar.a(pin, c2Var, new vd1.a(4, new aw0.j(this, pin, str2, dVar, 18)), new vd1.a(5, new ed1.m(this, pin, str2, 4))));
                if (str != null) {
                    u7 x03 = v7.x0();
                    x03.P(str);
                    v7 a13 = x03.a();
                    Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                    int intValue = pin.e6().intValue() + 1;
                    e30 R6 = pin.R6();
                    R6.C1(a13);
                    R6.U1(Integer.valueOf(intValue));
                    f30 a14 = R6.a();
                    Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
                    x0 x0Var = cVar.f68907x;
                    v7 v7Var = x0Var != null ? (v7) x0Var.O(str) : null;
                    if (v7Var != null) {
                        e30 R62 = a14.R6();
                        R62.C1(v7Var);
                        a14 = R62.a();
                    }
                    pe.i.r1(this.V, a14);
                    rVar.getClass();
                    if (com.pinterest.feature.pin.r.b()) {
                        this.T.d(new com.pinterest.feature.pin.t(a14, com.pinterest.feature.pin.r.a(h0Var), false));
                    }
                }
                unit = Unit.f80348a;
            } else {
                unit = null;
            }
            if (unit != null) {
                return;
            }
        }
        e02.a aVar = cVar.f68902s;
        if (aVar != null) {
            rVar.getClass();
            e02.a.b(aVar, pin, false, this.U, null, null, null, null, null, null, null, null, null, null, null, null, false, com.pinterest.feature.pin.r.b(), com.pinterest.feature.pin.r.a(h0Var), null, null, null, null, 3997688);
        }
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final void w(List itemsToSet, boolean z13) {
        Intrinsics.checkNotNullParameter(itemsToSet, "itemsToSet");
        super.w(j0(itemsToSet), z13);
    }
}
