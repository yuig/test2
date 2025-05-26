package so;

import android.content.Context;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t8 implements bf2.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114635a;

    /* renamed from: b, reason: collision with root package name */
    public final oa f114636b;

    /* renamed from: c, reason: collision with root package name */
    public final int f114637c;

    /* renamed from: d, reason: collision with root package name */
    public final af2.a f114638d;

    public /* synthetic */ t8(oa oaVar, af2.a aVar, int i13, int i14) {
        this.f114635a = i14;
        this.f114636b = oaVar;
        this.f114638d = aVar;
        this.f114637c = i13;
    }

    @Override // wk2.a
    public final Object get() {
        Object cVar;
        int i13 = 0;
        int i14 = this.f114635a;
        int i15 = this.f114637c;
        oa oaVar = this.f114636b;
        int i16 = 1;
        switch (i14) {
            case 0:
                if (i15 == 0) {
                    return new xe2.i();
                }
                if (i15 == 1) {
                    return new sy0.b();
                }
                if (i15 == 2) {
                    return new qy0.b((pb0.a) oaVar.f113834o1.get());
                }
                if (i15 == 3) {
                    return new ss1.f();
                }
                if (i15 == 4) {
                    return new n82.b();
                }
                throw new AssertionError(i15);
            case 1:
                if (i15 == 0) {
                    return new ap.o((Context) oaVar.f113902s0.get(), (pb0.a) oaVar.f113834o1.get(), com.pinterest.widget.configuration.k.o0(), (tb0.h) oaVar.f113797m0.get(), oa.B0(oaVar), (i92.k) oaVar.f113921t1.get(), (m60.w) oaVar.f113885r0.get(), (b60.b) oaVar.f113850p0.get(), (lb0.q) oaVar.O0.get(), (lb0.r) oaVar.f113622c1.get());
                }
                if (i15 != 1) {
                    throw new AssertionError(i15);
                }
                pq2.c1 retrofit = (pq2.c1) oaVar.f113623c2.get();
                p00.b converterFactory = (p00.b) oaVar.N8.get();
                rz.c adapterFactory = (rz.c) oaVar.f114011y1.get();
                rq2.a gsonConverterFactory = oaVar.J2();
                t00.l noToastOnFailureRouterFactory = (t00.l) oaVar.f113951ud.get();
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
                Intrinsics.checkNotNullParameter(gsonConverterFactory, "gsonConverterFactory");
                Intrinsics.checkNotNullParameter(noToastOnFailureRouterFactory, "noToastOnFailureRouterFactory");
                pq2.c1 j13 = df.j1.j(retrofit, rz.c.b(adapterFactory, noToastOnFailureRouterFactory, null, false, 61));
                j13.a(adapterFactory);
                j13.b(converterFactory);
                j13.b(gsonConverterFactory);
                Object b13 = j13.d().b(t20.a.class);
                Intrinsics.checkNotNullExpressionValue(b13, "create(...)");
                t20.a aVar = (t20.a) b13;
                dl2.b.I(aVar);
                return aVar;
            default:
                af2.a aVar2 = this.f114638d;
                switch (i15) {
                    case 0:
                        return new ni0.f(((sa) aVar2).f114598a, (uj2.q) oaVar.f113947u9.get());
                    case 1:
                        return new u42.c((nu1.a) ((sa) aVar2).f114605h.get());
                    case 2:
                        return new nu1.a((lu1.b) oaVar.f113961v5.get());
                    case 3:
                        sa saVar = (sa) aVar2;
                        return new ni0.f((uj2.q) oaVar.f113947u9.get(), (ni0.e) saVar.f114608k.get(), saVar.f114598a);
                    case 4:
                        return new i6(this, i16);
                    case 5:
                        es.a aVar3 = (es.a) oaVar.P6.get();
                        nx.b0 b0Var = (nx.b0) oaVar.R8.get();
                        xr.a aVar4 = (xr.a) oaVar.f113756jc.get();
                        return a02.e.y1((vr.a) oaVar.Q8.get(), oaVar.X1(), aVar4, aVar3, b0Var, oa.g0(oaVar));
                    case 6:
                        return new xv.g((ew.m) oaVar.Lf.get(), (dw.b) ((sa) aVar2).f114610m.get(), (tb0.h) oaVar.f113797m0.get(), (es.a) oaVar.P6.get());
                    case 7:
                        nx.d0 pinalytics = (nx.d0) oaVar.f113817n2.get();
                        nx.d1 trackingParamAttacher = (nx.d1) oaVar.f113730i2.get();
                        nx.o0 pinalyticsManager = (nx.o0) oaVar.T1.get();
                        pb0.a clock = (pb0.a) oaVar.f113834o1.get();
                        a11.d clickThroughHelperFactory = (a11.d) oaVar.f113668ec.get();
                        nx.b0 pinAuxHelper = (nx.b0) oaVar.R8.get();
                        ur.a adsCoreDependencies = (ur.a) oaVar.Kb.get();
                        es.a adFormats = (es.a) oaVar.P6.get();
                        fw.d adsGmaLogger = (fw.d) oaVar.Z8.get();
                        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
                        Intrinsics.checkNotNullParameter(pinalyticsManager, "pinalyticsManager");
                        Intrinsics.checkNotNullParameter(clock, "clock");
                        Intrinsics.checkNotNullParameter(clickThroughHelperFactory, "clickThroughHelperFactory");
                        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
                        Intrinsics.checkNotNullParameter(adsCoreDependencies, "adsCoreDependencies");
                        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
                        Intrinsics.checkNotNullParameter(adsGmaLogger, "adsGmaLogger");
                        return new dw.b(pinalytics, trackingParamAttacher, pinalyticsManager, clock, clickThroughHelperFactory.a(pinalytics), pinAuxHelper, adsCoreDependencies, adFormats, adsGmaLogger);
                    case 8:
                        sa saVar2 = (sa) aVar2;
                        return new zv.g((ew.m) oaVar.Lf.get(), sa.a(saVar2), (dw.b) saVar2.f114610m.get(), (tb0.h) oaVar.f113797m0.get(), (es.a) oaVar.P6.get(), 0);
                    case 9:
                        sa saVar3 = (sa) aVar2;
                        return new zv.g((ew.m) oaVar.Lf.get(), sa.a(saVar3), (dw.b) saVar3.f114610m.get(), (tb0.h) oaVar.f113797m0.get(), (es.a) oaVar.P6.get(), 1);
                    case 10:
                        sa saVar4 = (sa) aVar2;
                        return new zv.g((ew.m) oaVar.Lf.get(), sa.a(saVar4), (dw.b) saVar4.f114610m.get(), (tb0.h) oaVar.f113797m0.get(), (es.a) oaVar.P6.get(), 2);
                    case 11:
                        sa saVar5 = (sa) aVar2;
                        return new zv.g((ew.m) oaVar.Lf.get(), sa.a(saVar5), (dw.b) saVar5.f114610m.get(), (tb0.h) oaVar.f113797m0.get(), (es.a) oaVar.P6.get(), 3);
                    case 12:
                        return new ep.c(28);
                    case 13:
                        sa saVar6 = (sa) aVar2;
                        return new aj0.d(saVar6.f114598a, (uj2.q) oaVar.f113947u9.get(), (x02.i2) oaVar.F3.get(), (ku1.l) saVar6.f114617t.get(), (x02.x2) oaVar.f113800m3.get());
                    case 14:
                        return new ku1.l((m60.w) oaVar.f113885r0.get(), ((sa) aVar2).f114605h, (lu1.b) oaVar.f113961v5.get());
                    case 15:
                        return new pk0.b(6);
                    case 16:
                        yk1.j jVar = (yk1.j) oaVar.Qc.get();
                        oa oaVar2 = ((sa) aVar2).f114603f;
                        return new yi0.a(jVar, new g70.h((m60.w) oaVar2.f113885r0.get(), (x02.x0) oaVar2.f113765k3.get(), new lh0.u((lh0.z0) oaVar2.D0.get()), (i92.k) oaVar2.f113921t1.get(), (b60.b) oaVar2.f113850p0.get(), (tb0.h) oaVar2.f113797m0.get()));
                    case 17:
                        return new ep.c(29);
                    case 18:
                        uk1.d presenterPinalytics = ((sa) aVar2).f114598a;
                        uj2.q networkStateStream = (uj2.q) oaVar.f113947u9.get();
                        x02.x2 userRepository = (x02.x2) oaVar.f113800m3.get();
                        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
                        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
                        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
                        return new yo0.b(presenterPinalytics, networkStateStream, userRepository, null, null, null, RecyclerViewTypes.VIEW_TYPE_PEAR_EXPLORER_HEADER);
                    case 19:
                        return new pk0.b(7);
                    case 20:
                        cVar = new cg0.c(0, ((sa) aVar2).f114598a, (uj2.q) oaVar.f113947u9.get());
                        break;
                    case 21:
                        return new ch0.d((ug0.i) oaVar.P5.get(), (rg0.s) oaVar.Q5.get(), (m60.w) oaVar.f113885r0.get(), (lu1.b) oaVar.f113961v5.get());
                    case 22:
                        return new cg0.c(1, ((sa) aVar2).f114598a, (uj2.q) oaVar.f113947u9.get());
                    case 23:
                        sa saVar7 = (sa) aVar2;
                        return new rk1.g(saVar7.f114598a, (oa2.p) saVar7.D.get());
                    case 24:
                        return new x5(this, i16);
                    case 25:
                        return new pk0.b(9);
                    case 26:
                        cVar = new wq0.a(((sa) aVar2).f114600c, 0);
                        break;
                    case 27:
                        sa saVar8 = (sa) aVar2;
                        return new xv.g(saVar8.f114598a, saVar8.f114601d, (x02.i2) oaVar.F3.get(), (i21.c) saVar8.H.get());
                    case 28:
                        cVar = new pa(this, i13);
                        break;
                    case 29:
                        sa saVar9 = (sa) aVar2;
                        return new qi1.b(saVar9.f114600c, saVar9.f114598a, (ni1.d0) oaVar.Gb.get(), (ni1.t2) oaVar.f113950uc.get());
                    case 30:
                        return new wq0.a(((sa) aVar2).f114600c, 1);
                    case 31:
                        return new pk0.b(8);
                    case 32:
                        sa saVar10 = (sa) aVar2;
                        return new aj0.d(saVar10.f114601d, saVar10.f114598a, (uj2.q) oaVar.f113947u9.get(), saVar10.f114601d, (x02.i2) oaVar.F3.get(), oaVar.S2());
                    case 33:
                        sa saVar11 = (sa) aVar2;
                        uk1.d pinalytics2 = saVar11.f114598a;
                        uj2.q networkStateStream2 = (uj2.q) oaVar.f113947u9.get();
                        nx.f0 pinalyticsFactory = (nx.f0) oaVar.f113747j2.get();
                        Intrinsics.checkNotNullParameter(pinalytics2, "pinalytics");
                        Intrinsics.checkNotNullParameter(networkStateStream2, "networkStateStream");
                        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
                        qa2.n gridFeatureConfig = saVar11.f114602e;
                        Intrinsics.checkNotNullParameter(gridFeatureConfig, "gridFeatureConfig");
                        return new ye1.k(pinalytics2, networkStateStream2, new ze1.c(gridFeatureConfig.f103320a.f128792q0, 2), ye1.i.f138861i, pinalyticsFactory);
                    case 34:
                        return new cg0.c(10, ((sa) aVar2).f114598a, (uj2.q) oaVar.f113947u9.get());
                    case 35:
                        sa saVar12 = (sa) aVar2;
                        return new se1.d(saVar12.f114598a, (uj2.q) oaVar.f113947u9.get(), new lh0.f4((lh0.z0) saVar12.f114603f.D0.get()), saVar12.f114600c, saVar12.f114602e, saVar12.f114599b, (lb0.r) oaVar.f113622c1.get(), (nx.f0) oaVar.f113747j2.get());
                    case 36:
                        sa saVar13 = (sa) aVar2;
                        return new xv.g(saVar13.f114598a, (uj2.q) oaVar.f113947u9.get(), saVar13.f114599b, (qa) saVar13.Q.get());
                    case 37:
                        return new qa(this);
                    case 38:
                        sa saVar14 = (sa) aVar2;
                        return new yi0.a(saVar14.f114598a, (ra) saVar14.S.get());
                    case 39:
                        return new ra(this);
                    case 40:
                        return new cg0.c(9, ((sa) aVar2).f114598a, (uj2.q) oaVar.f113947u9.get());
                    default:
                        throw new AssertionError(i15);
                }
                return cVar;
        }
    }
}
