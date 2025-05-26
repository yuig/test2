package ni1;

import com.pinterest.api.model.e30;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wz;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class n2 extends l82.d {

    /* renamed from: n, reason: collision with root package name */
    public static final ps0.m f90745n = new ps0.m(7, 0);

    /* renamed from: b, reason: collision with root package name */
    public final es.h f90746b;

    /* renamed from: c, reason: collision with root package name */
    public final es.a f90747c;

    /* renamed from: d, reason: collision with root package name */
    public final fs.c f90748d;

    /* renamed from: e, reason: collision with root package name */
    public final nx.b0 f90749e;

    /* renamed from: f, reason: collision with root package name */
    public final ur.a f90750f;

    /* renamed from: g, reason: collision with root package name */
    public final l82.h0 f90751g;

    /* renamed from: h, reason: collision with root package name */
    public final l82.h0 f90752h;

    /* renamed from: i, reason: collision with root package name */
    public final l82.h0 f90753i;

    /* renamed from: j, reason: collision with root package name */
    public final l82.h0 f90754j;

    /* renamed from: k, reason: collision with root package name */
    public final l82.h0 f90755k;

    /* renamed from: l, reason: collision with root package name */
    public final l82.h0 f90756l;

    /* renamed from: m, reason: collision with root package name */
    public final l82.h0 f90757m;

    public n2(es.h adsCommonDisplay, es.a adFormats, fs.c adsSalesDealsDisplay, jv.a adsPostClickHelper, nx.b0 pinAuxHelper, ur.a adsDependencies) {
        dk1.g headerZoneStateTransformer = new dk1.g(adsSalesDealsDisplay, adFormats);
        ek1.q1 mediaZoneTransformer = new ek1.q1(adsDependencies, adFormats, adsCommonDisplay, adsSalesDealsDisplay, pinAuxHelper);
        gk1.w0 overlayZoneTransformer = new gk1.w0(adsDependencies, adFormats, adsCommonDisplay, adsSalesDealsDisplay, pinAuxHelper);
        hk1.u trailingAccessoryZoneTransformer = new hk1.u(adFormats);
        fk1.v metadataTransformer = new fk1.v(adsCommonDisplay, adsSalesDealsDisplay, adFormats);
        ck1.c footerZoneTransformer = new ck1.c();
        bk1.z1 clickThroughTransformer = new bk1.z1(adFormats, adsPostClickHelper, adsCommonDisplay, pinAuxHelper, adsDependencies);
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(adsSalesDealsDisplay, "adsSalesDealsDisplay");
        Intrinsics.checkNotNullParameter(adsPostClickHelper, "adsPostClickHelper");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(adsDependencies, "adsDependencies");
        Intrinsics.checkNotNullParameter(headerZoneStateTransformer, "headerZoneStateTransformer");
        Intrinsics.checkNotNullParameter(mediaZoneTransformer, "mediaZoneTransformer");
        Intrinsics.checkNotNullParameter(overlayZoneTransformer, "overlayZoneTransformer");
        Intrinsics.checkNotNullParameter(trailingAccessoryZoneTransformer, "trailingAccessoryZoneTransformer");
        Intrinsics.checkNotNullParameter(metadataTransformer, "metadataTransformer");
        Intrinsics.checkNotNullParameter(footerZoneTransformer, "footerZoneTransformer");
        Intrinsics.checkNotNullParameter(clickThroughTransformer, "clickThroughTransformer");
        this.f90746b = adsCommonDisplay;
        this.f90747c = adFormats;
        this.f90748d = adsSalesDealsDisplay;
        this.f90749e = pinAuxHelper;
        this.f90750f = adsDependencies;
        this.f90751g = b(headerZoneStateTransformer, e2.f90656p, e2.f90657q, g2.f90690l);
        this.f90752h = b(mediaZoneTransformer, e2.f90658r, e2.f90659s, g2.f90691m);
        this.f90753i = b(overlayZoneTransformer, e2.f90662v, e2.f90663w, g2.f90693o);
        this.f90754j = b(trailingAccessoryZoneTransformer, e2.f90664x, e2.f90665y, g2.f90694p);
        this.f90755k = b(metadataTransformer, e2.f90660t, e2.f90661u, g2.f90692n);
        this.f90756l = b(footerZoneTransformer, e2.f90653m, e2.f90654n, g2.f90689k);
        this.f90757m = b(clickThroughTransformer, e2.f90651k, e2.f90652l, g2.f90688j);
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        List a13;
        y2 vmState = (y2) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        l82.e d2 = l82.d.d(new u0(vmState.f90901a, vmState.f90903b, n0.f90743a, 2096636), vmState);
        d2.f(e2.f90655o);
        m(d2, vmState);
        f30 f30Var = vmState.f90901a;
        wa2.m g13 = g(f30Var, vmState.f90905c, d2, vmState.f90907e);
        boolean z13 = true;
        d2.h(new h2(((es.c) ((ur.b) this.f90750f).f123058a).l0(f30Var), j(d2, g13), k(d2, g13), h(d2, g13, true), i(d2, g13, true), g13));
        l(d2);
        com.bumptech.glide.d.v0(d2, g13);
        l82.h0 h0Var = this.f90751g;
        bk.f.g0(d2, h0Var.e());
        l82.h0 h0Var2 = this.f90752h;
        bk.f.g0(d2, h0Var2.e());
        l82.h0 h0Var3 = this.f90753i;
        bk.f.g0(d2, h0Var3.e());
        l82.h0 h0Var4 = this.f90754j;
        bk.f.g0(d2, h0Var4.e());
        l82.h0 h0Var5 = this.f90755k;
        bk.f.g0(d2, h0Var5.e());
        l82.h0 h0Var6 = this.f90756l;
        bk.f.g0(d2, h0Var6.e());
        l82.h0 h0Var7 = this.f90757m;
        bk.f.g0(d2, h0Var7.e());
        bk.f.g0(d2, h0Var.c(new dk1.c(g13)));
        bk.f.g0(d2, h0Var2.c(new ek1.v(g13, ((u0) d2.f82218a).f90810d)));
        boolean a14 = ps0.m.a(d2);
        bk.f.g0(d2, h0Var3.c(new gk1.x(g13, vmState.E, vmState.F, a14)));
        bk.f.g0(d2, h0Var4.c(new hk1.k(g13, a14)));
        bk.f.g0(d2, h0Var5.c(new fk1.f(g13)));
        bk.f.g0(d2, h0Var6.c(new ck1.b(g13)));
        List list = ((u0) d2.f82218a).f90820n.f59328a;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((wi1.b) it.next()) instanceof zi1.c) {
                    break;
                }
            }
        }
        z13 = false;
        ek1.v1 v1Var = ((y2) d2.f82219b).W.f59347i;
        f30 f30Var2 = null;
        ek1.s1 s1Var = v1Var instanceof ek1.s1 ? (ek1.s1) v1Var : null;
        if (s1Var != null && (a13 = s1Var.a()) != null) {
            f30Var2 = (f30) CollectionsKt.firstOrNull(a13);
        }
        bk.f.g0(d2, h0Var7.c(new bk1.v(f30Var2, g13, z13)));
        zy.l0 l0Var = vmState.f90906d;
        d2.a(new r(new zy.j0(l0Var.f143086a, l0Var.f143087b)));
        String uid = f30Var.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        d2.a(new m(uid));
        Intrinsics.checkNotNullParameter(d2, "<this>");
        d2.a(b.f90597a);
        return d2.e();
    }

    @Override // l82.d
    public final l82.c0 f(u50.s sVar, u50.o oVar, l82.i0 i0Var, l82.e resultBuilder) {
        l82.f0 transformation;
        boolean z13;
        si1.a aVar;
        si1.a aVar2;
        int i13;
        int i14 = 1;
        int i15 = 0;
        z1 event = (z1) sVar;
        u0 priorDisplayState = (u0) oVar;
        y2 priorVMState = (y2) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        boolean z14 = event instanceof h1;
        l82.h0 h0Var = this.f90755k;
        l82.h0 trailingAccessoryZoneLens = this.f90754j;
        l82.h0 lens = this.f90753i;
        l82.h0 mediaZoneLens = this.f90752h;
        if (z14) {
            wa2.m mVar = ((h1) event).f90697a;
            m(resultBuilder, priorVMState);
            wa2.m g13 = g(priorVMState.f90901a, mVar, resultBuilder, priorVMState.f90907e);
            resultBuilder.h(new c2(j(resultBuilder, mVar), k(resultBuilder, mVar), h(resultBuilder, mVar, true), i(resultBuilder, mVar, true)));
            if (!Intrinsics.d(g13, priorVMState.f90905c)) {
                resultBuilder.h(new d2(g13, i15));
                resultBuilder.f(e2.f90650j);
                l(resultBuilder);
                com.bumptech.glide.d.v0(resultBuilder, mVar);
                bk.f.g0(resultBuilder, this.f90751g.c(new dk1.c(g13)));
                bk.f.g0(resultBuilder, mediaZoneLens.c(new ek1.v(g13, ((u0) resultBuilder.f82218a).f90810d)));
                boolean a13 = ps0.m.a(resultBuilder);
                bk.f.g0(resultBuilder, lens.c(new gk1.x(g13, priorVMState.E, priorVMState.F, a13)));
                bk.f.g0(resultBuilder, trailingAccessoryZoneLens.c(new hk1.k(g13, a13)));
                bk.f.g0(resultBuilder, h0Var.c(new fk1.f(g13)));
                bk.f.g0(resultBuilder, this.f90756l.c(new ck1.b(g13)));
                resultBuilder.f(new d2(g13, i14));
            }
            resultBuilder.e();
        } else if (event instanceof s1) {
            resultBuilder.h(new k2(event, 1));
            resultBuilder.e();
        } else if (event instanceof v1) {
            l82.f0 transformation2 = mediaZoneLens.c(((v1) event).f90830a);
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            Intrinsics.checkNotNullParameter(transformation2, "transformation");
            transformation2.i(resultBuilder);
        } else if (event instanceof x1) {
            l82.f0 transformation3 = lens.c(((x1) event).f90840a);
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            Intrinsics.checkNotNullParameter(transformation3, "transformation");
            transformation3.i(resultBuilder);
        } else if (event instanceof y1) {
            l82.f0 transformation4 = trailingAccessoryZoneLens.c(((y1) event).j());
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            Intrinsics.checkNotNullParameter(transformation4, "transformation");
            transformation4.i(resultBuilder);
        } else if (event instanceof w1) {
            l82.f0 transformation5 = h0Var.c(((w1) event).j());
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            Intrinsics.checkNotNullParameter(transformation5, "transformation");
            transformation5.i(resultBuilder);
        } else {
            boolean z15 = event instanceof u1;
            l82.h0 clickThroughLens = this.f90757m;
            if (z15) {
                l82.f0 transformation6 = clickThroughLens.c(((u1) event).f90828a);
                Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                Intrinsics.checkNotNullParameter(transformation6, "transformation");
                transformation6.i(resultBuilder);
            } else if (event instanceof a1) {
                l82.f0 transformation7 = lens.c(gk1.u.f65269a);
                Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                Intrinsics.checkNotNullParameter(transformation7, "transformation");
                transformation7.i(resultBuilder);
                ArrayList l13 = kotlin.collections.f0.l(oi1.o.f95315a);
                l13.addAll(((y2) resultBuilder.f82219b).X.D);
                resultBuilder.f(new i1.y(l13, 2));
            } else if (event instanceof z0) {
                resultBuilder.f(e2.A);
            } else if (event instanceof b1) {
                resultBuilder.f(new w1.g(kotlin.collections.f0.l(oi1.p.f95316a), 24));
            } else if (event instanceof e1) {
                e1 e1Var = (e1) event;
                l82.f0 transformation8 = lens.c(new gk1.b0(e1Var.k(), e1Var.j()));
                Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                Intrinsics.checkNotNullParameter(transformation8, "transformation");
                transformation8.i(resultBuilder);
            } else {
                if (event instanceof t1) {
                    y2 y2Var = (y2) resultBuilder.f82219b;
                    b0[] b0VarArr = new b0[2];
                    wa2.m mVar2 = y2Var.f90905c;
                    b0VarArr[0] = mVar2.f128870l ? new t(y32.f.RELATED_PINS_LONGPRESS) : new t(mVar2.b());
                    int i16 = m60.q0.contextual_bg;
                    vn1.c cVar = vn1.c.DEFAULT;
                    wa2.m mVar3 = y2Var.f90905c;
                    boolean d2 = mVar3.d();
                    String str = mVar3.f128879p0 ? mVar3.f128877o0 : null;
                    t1 t1Var = (t1) event;
                    si1.a j13 = t1Var.j();
                    si1.a l14 = t1Var.l();
                    int n13 = t1Var.n();
                    int m13 = t1Var.m();
                    int k13 = t1Var.k();
                    int i17 = eo1.c.lego_corner_radius_medium;
                    Boolean S4 = y2Var.f90901a.S4();
                    Intrinsics.checkNotNullExpressionValue(S4, "getIsFullWidth(...)");
                    b0VarArr[1] = new p(y2Var.f90901a, y2Var.f90903b, i16, cVar, d2, str, j13, l14, n13, m13, k13, i17, mVar3.M, S4.booleanValue());
                    resultBuilder.d(b0VarArr);
                } else if (event instanceof p1) {
                    resultBuilder.h(new k2(event, 2));
                    p1 p1Var = (p1) event;
                    l82.f0 transformation9 = clickThroughLens.c(new bk1.w(p1Var.j()));
                    Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                    Intrinsics.checkNotNullParameter(transformation9, "transformation");
                    transformation9.i(resultBuilder);
                    l82.f0 transformation10 = mediaZoneLens.c(new ek1.w(p1Var.j()));
                    Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                    Intrinsics.checkNotNullParameter(transformation10, "transformation");
                    transformation10.i(resultBuilder);
                    l82.f0 transformation11 = h0Var.c(new fk1.g(p1Var.j()));
                    Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                    Intrinsics.checkNotNullParameter(transformation11, "transformation");
                    transformation11.i(resultBuilder);
                    l82.f0 transformation12 = lens.c(new gk1.y(p1Var.j()));
                    Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                    Intrinsics.checkNotNullParameter(transformation12, "transformation");
                    transformation12.i(resultBuilder);
                } else if (event instanceof n1) {
                    if (n60.o.B(((y2) resultBuilder.f82219b).f90901a, "getIsPromoted(...)")) {
                        resultBuilder.f(k.f90725n);
                    } else {
                        l82.f0 transformation13 = h0Var.c(fk1.e.f62349a);
                        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                        Intrinsics.checkNotNullParameter(transformation13, "transformation");
                        transformation13.i(resultBuilder);
                        l82.f0 transformation14 = trailingAccessoryZoneLens.c(hk1.j.f69354a);
                        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                        Intrinsics.checkNotNullParameter(transformation14, "transformation");
                        transformation14.i(resultBuilder);
                    }
                } else if (event instanceof r1) {
                    l82.f0 transformation15 = h0Var.c(fk1.i.f62354a);
                    Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                    Intrinsics.checkNotNullParameter(transformation15, "transformation");
                    transformation15.i(resultBuilder);
                    l82.f0 transformation16 = trailingAccessoryZoneLens.c(hk1.m.f69358a);
                    Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                    Intrinsics.checkNotNullParameter(transformation16, "transformation");
                    transformation16.i(resultBuilder);
                    resultBuilder.f(k.f90726o);
                } else if (event instanceof o1) {
                    resultBuilder.h(new k2(event, 3));
                    o1 o1Var = (o1) event;
                    l82.f0 transformation17 = clickThroughLens.c(new bk1.t(o1Var.j()));
                    Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                    Intrinsics.checkNotNullParameter(transformation17, "transformation");
                    transformation17.i(resultBuilder);
                    l82.f0 transformation18 = mediaZoneLens.c(new ek1.f0(new yi1.u(o1Var.j())));
                    Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                    Intrinsics.checkNotNullParameter(transformation18, "transformation");
                    transformation18.i(resultBuilder);
                } else if (event instanceof q1) {
                    q1 q1Var = (q1) event;
                    l82.f0 transformation19 = clickThroughLens.c(new bk1.y(q1Var.f90782a));
                    Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                    Intrinsics.checkNotNullParameter(transformation19, "transformation");
                    transformation19.i(resultBuilder);
                    l82.f0 transformation20 = mediaZoneLens.c(new ek1.f0(new yi1.y(q1Var.f90782a)));
                    Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                    Intrinsics.checkNotNullParameter(transformation20, "transformation");
                    transformation20.i(resultBuilder);
                } else if (event instanceof g1) {
                    g1 g1Var = (g1) event;
                    g1Var.getClass();
                    l82.f0 transformation21 = clickThroughLens.c(new bk1.u(false));
                    Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                    Intrinsics.checkNotNullParameter(transformation21, "transformation");
                    transformation21.i(resultBuilder);
                    l82.f0 transformation22 = mediaZoneLens.c(new ek1.f0(new yi1.v(false, g1Var.f90686a)));
                    Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                    Intrinsics.checkNotNullParameter(transformation22, "transformation");
                    transformation22.i(resultBuilder);
                    gk1.w event2 = new gk1.w(g1Var.f90687b);
                    Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                    Intrinsics.checkNotNullParameter(lens, "lens");
                    Intrinsics.checkNotNullParameter(event2, "event");
                    Intrinsics.checkNotNullParameter(lens, "$lens");
                    Intrinsics.checkNotNullParameter(event2, "$event");
                    Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                    lens.a(event2, resultBuilder);
                } else if (event instanceof j1) {
                    bk.f.H(ek1.a0.f59208a, resultBuilder, mediaZoneLens);
                    bk.f.H(new gk1.z(((j1) event).f90714a), resultBuilder, lens);
                } else if (event instanceof f1) {
                    f1 event3 = (f1) event;
                    ek1.f0 event4 = new ek1.f0(new yi1.z(event3.j(), event3.k(), event3.l()));
                    Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                    Intrinsics.checkNotNullParameter(mediaZoneLens, "lens");
                    Intrinsics.checkNotNullParameter(event4, "event");
                    Intrinsics.checkNotNullParameter(mediaZoneLens, "$lens");
                    Intrinsics.checkNotNullParameter(event4, "$event");
                    Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                    mediaZoneLens.a(event4, resultBuilder);
                    y2 vmState = (y2) resultBuilder.f82219b;
                    u0 displayState = (u0) resultBuilder.f82218a;
                    Intrinsics.checkNotNullParameter(vmState, "vmState");
                    Intrinsics.checkNotNullParameter(displayState, "displayState");
                    es.a adFormats = this.f90747c;
                    Intrinsics.checkNotNullParameter(adFormats, "adFormats");
                    nx.b0 pinAuxHelper = this.f90749e;
                    Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
                    ur.a adsDependencies = this.f90750f;
                    Intrinsics.checkNotNullParameter(adsDependencies, "adsDependencies");
                    wa2.g0 g0Var = vmState.f90905c.f128851b0;
                    bk1.a2 a2Var = vmState.f90904b0;
                    int i18 = a2Var.f23175u;
                    List list = displayState.f90820n.f59328a;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (((wi1.b) it.next()) instanceof zi1.c) {
                                z13 = true;
                                break;
                            }
                        }
                    }
                    z13 = false;
                    boolean z16 = g0Var != null && g0Var.f128731m;
                    Integer num = a2Var.f23173s;
                    HashMap loggingAuxData = new oi1.t(vmState.f90901a, vmState.f90903b, z13, z16, num != null ? num.intValue() : 0, vmState.f90920r, i18, vmState.f90927y, vmState.B, vmState.C, vmState.f90921s, vmState.f90922t, vmState.f90923u, vmState.f90924v, vmState.f90919q, vmState.M, vmState.G, adFormats, pinAuxHelper, adsDependencies, false, false).a();
                    Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                    Intrinsics.checkNotNullParameter(event3, "event");
                    Intrinsics.checkNotNullParameter(adFormats, "adFormats");
                    Intrinsics.checkNotNullParameter(loggingAuxData, "loggingAuxData");
                    y2 y2Var2 = (y2) resultBuilder.f82219b;
                    wa2.m mVar4 = y2Var2.f90905c;
                    e30 R6 = y2Var2.f90901a.R6();
                    R6.v2(((y2) resultBuilder.f82219b).I);
                    f30 a14 = R6.a();
                    Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
                    boolean z17 = mVar4.f128879p0;
                    h32.i0 i0Var2 = y2Var2.f90906d.f143086a;
                    boolean z18 = y2Var2.f90907e.f90879s0;
                    if (!y2Var2.f90925w && (aVar = event3.f90670c) != null) {
                        cs.c a15 = ((es.c) adFormats).a(a14);
                        cs.c cVar2 = cs.c.TWO_BY_TWO;
                        si1.a aVar3 = event3.f90671d;
                        if (a15 == cVar2) {
                            aVar2 = aVar3;
                        } else {
                            if (!mVar4.f128873m0 || aVar3 == null) {
                                si1.a aVar4 = event3.f90672e;
                                i13 = aVar4 != null ? aVar4.f113006d : aVar.f113006d;
                            } else {
                                i13 = aVar3.f113006d;
                            }
                            aVar2 = new si1.a(aVar.f113003a, aVar.f113004b, aVar.f113005c, i13);
                        }
                        if (aVar2 != null) {
                            int i19 = event3.f90668a;
                            int i23 = event3.f90669b;
                            if (aVar2.a(i19, i23)) {
                                b0[] b0VarArr2 = new b0[2];
                                b0VarArr2[0] = new r(new zy.f0(new zy.a(h32.i0.a(i0Var2, null, null, null, (aVar.a(i19, i23) || (aVar3 != null ? aVar3.a(i19, i23) : false)) ? h32.u0.PIN_SOURCE_IMAGE : h32.u0.PIN_DESCRIPTION, 95), h32.f1.LONG_PRESS, a14.getUid(), loggingAuxData, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM)));
                                b0VarArr2[1] = mVar4.f128870l ? new t(y32.f.RELATED_PINS_LONGPRESS) : new t(mVar4.f128871l0);
                                resultBuilder.d(b0VarArr2);
                                if (!mVar4.f128890v) {
                                    if (z18) {
                                        resultBuilder.f(k.f90721j);
                                    }
                                    b0[] b0VarArr3 = new b0[1];
                                    int i24 = m60.q0.contextual_bg;
                                    vn1.c cVar3 = vn1.c.DEFAULT;
                                    String str2 = z17 ? mVar4.f128877o0 : null;
                                    int i25 = eo1.c.lego_corner_radius_medium;
                                    Boolean S42 = a14.S4();
                                    Intrinsics.f(S42);
                                    b0VarArr3[0] = new p(a14, y2Var2.f90903b, i24, cVar3, mVar4.f128867j0, str2, event3.f90673f, event3.f90674g, event3.f90675h, event3.f90676i, event3.f90677j, i25, mVar4.M, S42.booleanValue());
                                    resultBuilder.d(b0VarArr3);
                                }
                            }
                        }
                    }
                } else if (event instanceof l1) {
                    resultBuilder.f(k.f90727p);
                } else if (event instanceof k1) {
                    resultBuilder.f(new k2(event, 0));
                } else if (event instanceof v0) {
                    resultBuilder.f(k.f90722k);
                } else if (event instanceof y0) {
                    y0 event5 = (y0) event;
                    Intrinsics.checkNotNullParameter(event5, "event");
                    Intrinsics.checkNotNullParameter(mediaZoneLens, "mediaZoneLens");
                    Intrinsics.checkNotNullParameter(lens, "overlayZoneLens");
                    Intrinsics.checkNotNullParameter(trailingAccessoryZoneLens, "trailingAccessoryZoneLens");
                    Intrinsics.checkNotNullParameter(clickThroughLens, "clickThroughLens");
                    Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                    Pair pair = event5.f90897c;
                    long j14 = event5.f90898d;
                    l82.f0 transformation23 = mediaZoneLens.c(new ek1.t(pair, j14));
                    Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                    Intrinsics.checkNotNullParameter(transformation23, "transformation");
                    transformation23.i(resultBuilder);
                    boolean z19 = ((y2) resultBuilder.f82219b).f90905c.f128857e0;
                    ui1.q qVar = event5.f90895a;
                    if (z19) {
                        resultBuilder.a(new u(new bk1.b1(((y2) resultBuilder.f82219b).f90901a, (Intrinsics.d(qVar, ui1.d.f122291a) || (qVar instanceof ui1.k)) ? false : true, bk1.g2.InterceptedByTouchHandler)));
                    } else if (qVar != null) {
                        if (qVar instanceof ui1.d) {
                            transformation = lens.c(gk1.p.f65253a);
                        } else if (Intrinsics.d(qVar, ui1.h.f122295a)) {
                            transformation = trailingAccessoryZoneLens.c(new hk1.i(((y2) resultBuilder.f82219b).f90905c.f128875n0));
                        } else if (qVar instanceof ui1.k) {
                            transformation = trailingAccessoryZoneLens.c(new hk1.l(((ui1.k) qVar).f122298a));
                        } else if (Intrinsics.d(qVar, ui1.f.f122293a)) {
                            transformation = clickThroughLens.c(new bk1.h0(j14));
                        } else if (Intrinsics.d(qVar, ui1.i.f122296a)) {
                            transformation = clickThroughLens.c(new bk1.j0(j14));
                        } else if (qVar instanceof ui1.m) {
                            ek1.v1 v1Var = ((y2) resultBuilder.f82219b).W.f59347i;
                            ek1.s1 s1Var = v1Var instanceof ek1.s1 ? (ek1.s1) v1Var : null;
                            if (s1Var != null) {
                                ui1.m mVar5 = (ui1.m) qVar;
                                int i26 = mVar5.f122300a;
                                transformation = clickThroughLens.c(new bk1.l0(mVar5.f122300a, i26 != -1 ? (f30) s1Var.f59368a.get(i26) : null, event5.f90898d, n60.o.B(((y2) resultBuilder.f82219b).f90901a, "getIsPromoted(...)")));
                            }
                        } else if (Intrinsics.d(qVar, ui1.n.f122301a)) {
                            transformation = clickThroughLens.c(new bk1.m0(j14));
                        } else if (Intrinsics.d(qVar, ui1.p.f122303a)) {
                            transformation = clickThroughLens.c(new bk1.o0(j14));
                        } else if (Intrinsics.d(qVar, ui1.o.f122302a)) {
                            transformation = clickThroughLens.c(new bk1.n0(j14));
                        } else if (Intrinsics.d(qVar, ui1.l.f122299a)) {
                            transformation = clickThroughLens.c(new bk1.k0(j14));
                        } else if (Intrinsics.d(qVar, ui1.e.f122292a)) {
                            transformation = clickThroughLens.c(new bk1.i0(j14));
                        } else {
                            if (!Intrinsics.d(qVar, ui1.j.f122297a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            transformation = lens.c(gk1.v.f65272a);
                        }
                        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                        Intrinsics.checkNotNullParameter(transformation, "transformation");
                        transformation.i(resultBuilder);
                        if (Intrinsics.d(qVar, ui1.n.f122301a) || Intrinsics.d(qVar, ui1.p.f122303a) || Intrinsics.d(qVar, ui1.f.f122293a) || (qVar instanceof ui1.k)) {
                            resultBuilder.f(k.f90728q);
                        }
                    } else {
                        l82.f0 transformation24 = clickThroughLens.c(new bk1.g0(j14));
                        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                        Intrinsics.checkNotNullParameter(transformation24, "transformation");
                        transformation24.i(resultBuilder);
                    }
                } else if (Intrinsics.d(event, w0.f90834a)) {
                    resultBuilder.f(k.f90723l);
                } else if (event instanceof c1) {
                    c1 c1Var = (c1) event;
                    bk.f.H(new ek1.d0(c1Var.j()), resultBuilder, mediaZoneLens);
                    bk.f.H(new gk1.a0(c1Var.j()), resultBuilder, lens);
                } else if (Intrinsics.d(event, x0.f90839a)) {
                    resultBuilder.f(e2.f90666z);
                } else if (event instanceof i1) {
                    if (Intrinsics.d(((y2) resultBuilder.f82219b).f90901a.getUid(), ((i1) event).j())) {
                        resultBuilder.f(k.f90724m);
                    }
                } else if (event instanceof m1) {
                    bk.f.H(new ek1.c0(((m1) event).j()), resultBuilder, mediaZoneLens);
                    bk.f.H(new gk1.r(false), resultBuilder, lens);
                } else if (Intrinsics.d(event, d1.f90637a)) {
                    gk1.s event6 = gk1.s.f65263a;
                    Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                    Intrinsics.checkNotNullParameter(lens, "lens");
                    Intrinsics.checkNotNullParameter(event6, "event");
                    Intrinsics.checkNotNullParameter(lens, "$lens");
                    Intrinsics.checkNotNullParameter(event6, "$event");
                    Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                    lens.a(event6, resultBuilder);
                }
            }
        }
        return resultBuilder.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x00f0, code lost:
    
        if (com.pinterest.api.model.b40.X0(r50) == false) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final wa2.m g(com.pinterest.api.model.f30 r50, wa2.m r51, l82.e r52, ni1.x2 r53) {
        /*
            Method dump skipped, instructions count: 797
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ni1.n2.g(com.pinterest.api.model.f30, wa2.m, l82.e, ni1.x2):wa2.m");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e8, code lost:
    
        if (r0 == false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(l82.e r25, wa2.m r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ni1.n2.h(l82.e, wa2.m, boolean):boolean");
    }

    public final boolean i(l82.e eVar, wa2.m mVar, boolean z13) {
        y2 y2Var = (y2) eVar.f82219b;
        f30 f30Var = y2Var.f90901a;
        x2 x2Var = y2Var.f90907e;
        boolean z14 = mVar.W;
        wa2.g0 g0Var = mVar.f128851b0;
        boolean z15 = z14 && (g0Var == null || !g0Var.o());
        boolean z16 = x2Var.f90882u;
        i2 i2Var = new i2(4, eVar, z13);
        es.v vVar = (es.v) this.f90746b;
        return vVar.i0(f30Var, z15, mVar.X, mVar.O, mVar.N, z16, x2Var.f90884v, i2Var) || vVar.Y(f30Var, mVar.O, mVar.N, x2Var.f90843a0, new i2(3, eVar, z13)) || vVar.H(f30Var, z14 && (g0Var == null || !g0Var.o()), mVar.X, mVar.O, mVar.N);
    }

    public final boolean j(l82.e eVar, wa2.m mVar) {
        f30 f30Var = ((y2) eVar.f82219b).f90901a;
        wz j13 = po1.c.j(f30Var);
        String h10 = j13 != null ? po1.c.h(j13) : null;
        if (!f30Var.d5().booleanValue() || h10 == null || h10.length() == 0) {
            return false;
        }
        return h(eVar, mVar, false);
    }

    public final boolean k(l82.e eVar, wa2.m mVar) {
        f30 f30Var = ((y2) eVar.f82219b).f90901a;
        if (!f30Var.d5().booleanValue()) {
            return false;
        }
        wa2.g0 g0Var = mVar.f128851b0;
        return (g0Var != null && g0Var.j()) || (((es.v) this.f90746b).j0(f30Var) && n60.o.y(f30Var, "getIsThirdPartyAd(...)")) || i(eVar, mVar, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x016f, code lost:
    
        if ((r2 != null ? r2.f() : null) == com.pinterest.api.model.rj0.a.APPROVED) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0179 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0182 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0288  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(l82.e r33) {
        /*
            Method dump skipped, instructions count: 936
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ni1.n2.l(l82.e):void");
    }

    public final void m(l82.e eVar, y2 y2Var) {
        boolean z13;
        y2 y2Var2 = (y2) eVar.f82219b;
        boolean z14 = y2Var2.f90907e.f90850e;
        boolean G1 = dl2.b.G1(y2Var2);
        f30 f30Var = y2Var.f90901a;
        boolean z15 = y2Var.f90905c.f128873m0;
        defpackage.d activateExperiment = new defpackage.d(10, eVar);
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        es.a adFormats = this.f90747c;
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        es.h adsCommonDisplay = this.f90746b;
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        Intrinsics.checkNotNullParameter(activateExperiment, "activateExperiment");
        int i13 = 0;
        int i14 = 1;
        if (z15) {
            activateExperiment.invoke();
            ArrayList z16 = ((es.v) adsCommonDisplay).z(f30Var, z14, G1, Boolean.TRUE);
            if (z16 != null && !z16.isEmpty()) {
                es.c cVar = (es.c) adFormats;
                if (!cVar.S(f30Var) && cVar.y(f30Var)) {
                    z13 = true;
                    eVar.f(new m2(z13, i13));
                    eVar.h(new m2(z13, i14));
                }
            }
        }
        z13 = false;
        eVar.f(new m2(z13, i13));
        eVar.h(new m2(z13, i14));
    }
}
