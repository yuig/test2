package fk1;

import a.cb;
import bi1.a0;
import bk1.u1;
import c2.m4;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.rj0;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.z90;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import df.j1;
import h32.f1;
import i1.a1;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kh2.m2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import kotlin.text.z;
import l82.c0;
import m60.r0;
import ni1.e0;
import ni1.x2;
import so.yc;
import u50.b0;
import u50.d0;
import u50.f0;
import u50.h0;
import u50.i0;
import u50.k0;
import u50.o0;
import wa2.g0;
import wa2.x;
import zp.u0;

/* loaded from: classes2.dex */
public final class v extends l82.d {

    /* renamed from: f, reason: collision with root package name */
    public static final ps0.m f62375f = new ps0.m(14, 0);

    /* renamed from: b, reason: collision with root package name */
    public final qb0.f f62376b;

    /* renamed from: c, reason: collision with root package name */
    public final es.h f62377c;

    /* renamed from: d, reason: collision with root package name */
    public final fs.c f62378d;

    /* renamed from: e, reason: collision with root package name */
    public final es.a f62379e;

    static {
        new Date(1643673600000L);
    }

    public v(es.h adsCommonDisplay, fs.c adsSalesDealsDisplay, es.a adFormats) {
        qb0.a numberFormatter = new qb0.a();
        Intrinsics.checkNotNullParameter(numberFormatter, "numberFormatter");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        Intrinsics.checkNotNullParameter(adsSalesDealsDisplay, "adsSalesDealsDisplay");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        this.f62376b = numberFormatter;
        this.f62377c = adsCommonDisplay;
        this.f62378d = adsSalesDealsDisplay;
        this.f62379e = adFormats;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00fc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void E(l82.e r22) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fk1.v.E(l82.e):void");
    }

    public static i0 M(l82.e eVar) {
        String j13;
        String j14;
        rj0 u63 = ((w) eVar.f82219b).f62380a.u6();
        Intrinsics.f(u63);
        boolean z13 = ((w) eVar.f82219b).f62383d.f90842a;
        k0 k0Var = new k0(wy1.f.sponsored_pins_simple_prefix);
        k0 k0Var2 = new k0(wy1.f.sponsored_pins_eu_prefix, new k0(wy1.f.sponsored_pins_simple_prefix));
        rj0.a f13 = u63.f();
        rj0.a aVar = rj0.a.APPROVED;
        yc ycVar = yc.f114734a;
        String str = "";
        if (f13 == aVar) {
            eVar.a(new k(ycVar));
            if (z13) {
                int i13 = wy1.f.sponsored_pins_prefix;
                String[] strArr = new String[1];
                wy0 e13 = u63.e();
                if (e13 != null && (j14 = dl2.b.j1(e13)) != null) {
                    str = j14;
                }
                strArr[0] = str;
                return new k0(wy1.f.sponsored_pins_eu_prefix, new k0(strArr, i13));
            }
        }
        if (u63.f() != aVar) {
            if (u63.f() == rj0.a.REJECTED) {
                return h0.f120562a;
            }
            eVar.a(new k(ycVar));
            return z13 ? k0Var2 : k0Var;
        }
        int i14 = wy1.f.sponsored_pins_prefix;
        String[] strArr2 = new String[1];
        wy0 e14 = u63.e();
        if (e14 != null && (j13 = dl2.b.j1(e14)) != null) {
            str = j13;
        }
        strArr2[0] = str;
        return new k0(strArr2, i14);
    }

    public static ej1.b g(l82.e eVar) {
        wy0 e13;
        String Z2;
        f30 f30Var = ((w) eVar.f82219b).f62380a;
        int i13 = o.f62360a[mi1.e.b(f30Var).ordinal()];
        String str = "";
        if (i13 != 1) {
            if (i13 == 2 || i13 == 3 || i13 == 4) {
                return new ej1.b(h0.f120562a, "", false);
            }
            throw new NoWhenBranchMatchedException();
        }
        rj0 u63 = f30Var.u6();
        if (u63 == null || (e13 = u63.e()) == null || (Z2 = e13.Z2()) == null) {
            wy0 a63 = f30Var.a6();
            String j13 = a63 != null ? dl2.b.j1(a63) : null;
            if (j13 != null) {
                str = j13;
            }
        } else {
            str = Z2;
        }
        return new ej1.b(new k0(new String[]{str}, wy1.f.sponsored_by_prefix), str, true);
    }

    public static void h(l82.e eVar) {
        rl1.q qVar;
        wy0 I5 = ((w) eVar.f82219b).f62380a.I5();
        if (I5 != null) {
            k0 N0 = m2.N0(dl2.b.A0(I5), dl2.b.W1(I5) || cb.y(I5, "getIsVerifiedMerchant(...)"));
            qVar = new rl1.q(dl2.b.o1(I5) ? "" : dl2.b.t0(I5), dl2.b.M0(I5), false, rl1.r.XS, (i0) N0, false, fm1.c.VISIBLE, 0, (rl1.c) new rl1.d(I5.q2().intValue()), (fm1.a) null, 1376);
        } else {
            qVar = new rl1.q((String) null, (String) null, false, (rl1.r) null, (i0) null, false, (fm1.c) null, 0, (rl1.c) null, (fm1.a) null, 2047);
        }
        ps0.m.b(eVar, new bj1.b(new ej1.d(e0.f90644c, new k0(wy1.f.added_by), vn1.c.DEFAULT, tn1.c.f118617i, 0, null, null, null, null, null, 1008), new bj1.d(qVar)));
    }

    public static ej1.d k(f0 f0Var, wa2.m mVar) {
        return new ej1.d(e0.f90644c, f0Var, d7.b.T(mVar), tn1.c.f118617i, f0Var.f120559a.length() > 0 ? 1 : 0, null, null, null, null, null, 992);
    }

    public static ej1.d m(k0 text, wa2.m mVar, List list, ej1.c cVar) {
        g0 g0Var = mVar.f128851b0;
        List b13 = (g0Var == null || !g0Var.f128742x) ? list : kotlin.collections.e0.b(vn1.e.REGULAR);
        d0[] spanPrimitives = {new u50.j(c.f62344b)};
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(spanPrimitives, "spanPrimitives");
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new Pair(spanPrimitives[0], o0.f120576c));
        return new ej1.d(c.f62343a, text, null, b13, 1, null, new o0(text, z0.m(arrayList)), ej1.d.f59103l, ej1.d.f59104m, cVar, 36);
    }

    public static List o(v32.c cVar) {
        if (cVar == v32.c.NONE) {
            cVar = v32.c.LIKE;
        }
        int i13 = o.f62361b[cVar.ordinal()];
        return kotlin.collections.f0.k(i13 != 1 ? i13 != 2 ? i13 != 3 ? i13 != 4 ? i13 != 5 ? null : Integer.valueOf(cz1.b.ic_reaction_face_wow_simple_nonpds) : Integer.valueOf(cz1.b.ic_reaction_face_good_idea_simple_nonpds) : Integer.valueOf(cz1.b.ic_reaction_face_thanks_simple_nonpds) : Integer.valueOf(cz1.b.ic_reaction_face_haha_simple_nonpds) : Integer.valueOf(cz1.b.ic_reaction_face_love_simple_nonpds));
    }

    public static boolean u(f30 f30Var, l82.e eVar) {
        x2 x2Var = ((w) eVar.f82219b).f62383d;
        return me.o.c(x2Var.Q, x2Var.W) && me.o.f(f30Var, x2Var);
    }

    public static boolean v(l82.e eVar, wa2.m mVar) {
        h32.g0 g0Var;
        if (((w) eVar.f82219b).f62389j) {
            return true;
        }
        g0 g0Var2 = mVar.f128851b0;
        if (g0Var2 == null || (g0Var = g0Var2.f128727i) == null) {
            g0Var = h32.g0.FLOWED_PIN;
        }
        return mVar.O || g0Var == h32.g0.SHOP_TAB_UPSELL || g0Var == h32.g0.STELA_PRODUCTS;
    }

    public final void A(l82.e eVar, wa2.m mVar) {
        g0 g0Var = mVar.f128851b0;
        if (g0Var == null) {
            return;
        }
        f30 f30Var = ((w) eVar.f82219b).f62380a;
        ej1.d k13 = k(new f0(j(eVar, mVar)), mVar);
        if (g0Var.f()) {
            if (!com.bumptech.glide.c.d1(f30Var, mVar, this.f62379e) || mVar.O) {
                boolean r13 = r(eVar, mVar);
                if (r13) {
                    k13 = ej1.d.e(k13, null, tn1.c.f118617i, null, vn1.g.BODY_100, 887);
                }
                ej1.d dVar = k13;
                if (mVar.Z) {
                    dVar = ej1.d.e(dVar, vn1.c.LIGHT, null, null, null, 1019);
                }
                if (r13) {
                    ps0.m.b(eVar, dVar, new ak1.b(new b0(e0.f90647f), "maybeAddShoppingPinSubtitle, Brand reorder - lego_grid_cell_inner_small_padding"));
                } else {
                    ps0.m.b(eVar, dVar, new ak1.b(new b0(e0.f90645d), "maybeAddShoppingPinSubtitle - lego_grid_cell_inner_padding"));
                }
            }
        }
    }

    public final void B(l82.e eVar, wa2.m mVar) {
        g0 g0Var = mVar.f128851b0;
        if (g0Var != null && g0Var.k()) {
            String C = C(eVar, mVar);
            if (C.length() == 0) {
                return;
            }
            f30 f30Var = ((w) eVar.f82219b).f62380a;
            h32.g0 b13 = g0Var != null ? g0Var.b() : null;
            es.v vVar = (es.v) this.f62377c;
            if (!vVar.E(f30Var, b13) || vVar.h(f30Var)) {
                ej1.d l13 = l(eVar, mVar, C, null, null, null);
                Pair pair = p(eVar, mVar) ? new Pair(new b0(r0.lego_grid_cell_inner_small_padding), "maybeAddShoppingPinTitle, simplerAttrExp - lego_grid_cell_inner_small_padding") : r(eVar, mVar) ? new Pair(new b0(r0.lego_grid_cell_inner_small_padding), "maybeAddShoppingPinTitle, Brand reorder - lego_grid_cell_inner_small_padding") : new Pair(new b0(e0.f90645d), "maybeAddShoppingPinTitle, default - lego_grid_cell_inner_padding");
                ps0.m.b(eVar, I(f30Var, n60.o.B(f30Var, "getIsPromoted(...)") && q(eVar), p(eVar, mVar), ((w) eVar.f82219b).f62383d.F, mVar.O, l13), new ak1.b((b0) pair.f80346a, (String) pair.f80347b));
            }
        }
    }

    public final String C(l82.e eVar, wa2.m mVar) {
        f30 f30Var = ((w) eVar.f82219b).f62380a;
        b20.c cVar = new b20.c(f30Var);
        boolean z13 = ((w) eVar.f82219b).f62389j;
        boolean t13 = t(eVar, mVar);
        g0 g0Var = mVar.f128851b0;
        boolean z14 = mVar.O;
        boolean z15 = cVar.z(g0Var, z13, z14, t13);
        String str = mVar.f128887t0;
        if (str == null) {
            str = f30Var.r4();
        }
        return cVar.t(false, z15, g0Var, z13, z14, str, ps0.m.k(eVar, this.f62377c));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0174  */
    /* JADX WARN: Type inference failed for: r0v40, types: [fj1.c] */
    /* JADX WARN: Type inference failed for: r2v14, types: [fj1.c] */
    /* JADX WARN: Type inference failed for: r2v19, types: [fj1.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(l82.e r46, wa2.m r47) {
        /*
            Method dump skipped, instructions count: 1144
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fk1.v.D(l82.e, wa2.m):void");
    }

    public final void F(l82.e eVar, wa2.m mVar) {
        w wVar = (w) eVar.f82219b;
        f30 f30Var = wVar.f62380a;
        boolean L = L(eVar, mVar);
        String j13 = j(eVar, mVar);
        f0 f0Var = new f0(j13);
        if ((!com.bumptech.glide.c.d1(f30Var, mVar, this.f62379e) || mVar.O) && L && !z.j(j13)) {
            boolean r13 = r(eVar, mVar);
            j0 j0Var = new j0();
            ej1.d k13 = k(f0Var, mVar);
            j0Var.f80434a = k13;
            if (r13 && !wVar.f62383d.K) {
                j0Var.f80434a = y(eVar, mVar, k13, j13);
            }
            eVar.f(new t(j0Var, r13 ? new ak1.b(new b0(e0.f90647f), null) : new ak1.b(new b0(e0.f90645d), null), 0));
        }
    }

    public final void G(l82.e eVar, wa2.m mVar) {
        w wVar = (w) eVar.f82219b;
        x2 x2Var = wVar.f62383d;
        boolean p13 = p(eVar, mVar);
        boolean t13 = t(eVar, mVar);
        g0 g0Var = mVar.f128851b0;
        h32.g0 b13 = g0Var != null ? g0Var.b() : null;
        es.v vVar = (es.v) this.f62377c;
        f30 f30Var = wVar.f62380a;
        if ((!vVar.E(f30Var, b13) || vVar.h(f30Var)) && L(eVar, mVar)) {
            String C = C(eVar, mVar);
            j0 j0Var = new j0();
            ej1.d l13 = l(eVar, mVar, C, null, null, null);
            j0Var.f80434a = l13;
            if (!t13 && !x2Var.K) {
                j0Var.f80434a = y(eVar, mVar, l13, C);
            }
            boolean z13 = n60.o.B(f30Var, "getIsPromoted(...)") && q(eVar);
            ak1.b bVar = p13 ? new ak1.b(new b0(r0.lego_grid_cell_inner_small_padding), null) : (t13 || z13) ? new ak1.b(new b0(r0.lego_grid_cell_inner_small_padding), null) : new ak1.b(new b0(e0.f90645d), null);
            j0Var.f80434a = I(wVar.f62380a, z13, p13, ((w) eVar.f82219b).f62383d.F, mVar.O, (ej1.d) j0Var.f80434a);
            eVar.f(new t(j0Var, bVar, 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(l82.e r26, wa2.m r27) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fk1.v.H(l82.e, wa2.m):void");
    }

    public final ej1.d I(f30 f30Var, boolean z13, boolean z14, boolean z15, boolean z16, ej1.d dVar) {
        u22.c f13 = ((es.v) this.f62377c).f(f30Var, z14, z16, z15);
        if (!z13 || f13 == u22.c.DEFAULT) {
            return dVar;
        }
        return ej1.d.e(dVar, null, tn1.c.f118617i, null, vn1.g.BODY_100, 887);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01bb  */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [u50.k0] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J(l82.e r44, wa2.m r45) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fk1.v.J(l82.e, wa2.m):void");
    }

    public final void K(f30 f30Var, wa2.m mVar, g0 g0Var, l82.e eVar, es.h hVar) {
        int i13 = ((w) eVar.f82219b).f62386g;
        if (b40.k(f30Var).size() <= i13) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        boolean q13 = q(eVar);
        if (q13) {
            H(eVar, mVar);
        }
        boolean D2 = dl2.b.D2(f30Var, g0Var, ((es.v) hVar).j0(f30Var), i13);
        int i14 = D2 ? 1 : 2;
        if (q13) {
            z(eVar, f30Var, mVar, g0Var, i14, i13, arrayList);
            eVar.f(new w1.g(arrayList, 26));
            arrayList.clear();
            x(eVar, mVar, i13, ej1.c.ID_PRODUCT_PRICE);
        } else {
            x(eVar, mVar, i13, ej1.c.ID_PRODUCT_PRICE);
            z(eVar, f30Var, mVar, g0Var, i14, i13, arrayList);
        }
        if (D2) {
            float L = b40.L(i13, f30Var);
            Integer K = b40.K(i13, f30Var);
            arrayList.add(new dj1.a(L, K != null ? K.intValue() : 0, d7.b.T(mVar)));
            arrayList.add(new ak1.b(new b0(r0.lego_grid_cell_inner_padding), "prepareShoppingLegoProducts, with rating - lego_grid_cell_inner_padding"));
        }
        eVar.f(new w1.g(arrayList, 27));
        arrayList.clear();
        D(eVar, mVar);
        int i15 = e0.f90644c;
        arrayList.add(new ak1.b(new b0(i15), "prepareShoppingLegoProducts - GRID_CARD_PADDING_RES"));
        if (!D2) {
            arrayList.add(new ej1.d(i15, null, null, null, 0, null, null, null, null, ej1.c.ID_CATALOG_CAROUSEL_DUMMY_LBL, 510));
            arrayList.add(new ak1.b(new b0(r0.lego_grid_cell_chips_spacing), "prepareShoppingLegoProducts, no rating - lego_grid_cell_chips_spacing"));
        }
        eVar.f(new w1.g(arrayList, 28));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean L(l82.e r14, wa2.m r15) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fk1.v.L(l82.e, wa2.m):boolean");
    }

    @Override // l82.d
    public final c0 c(l82.i0 i0Var) {
        w vmState = (w) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        l82.e d2 = l82.d.d(new d(), vmState);
        Intrinsics.checkNotNullParameter(d2, "<this>");
        d2.a(b.f62342a);
        return d2.e();
    }

    @Override // l82.d
    public final c0 f(u50.s sVar, u50.o oVar, l82.i0 i0Var, l82.e resultBuilder) {
        v7 D3;
        g0 g0Var;
        z90 Z5;
        List f13;
        j event = (j) sVar;
        d priorDisplayState = (d) oVar;
        w priorVMState = (w) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (event instanceof f) {
            resultBuilder.h(new u00.e(event, 26));
            wa2.m config = ((f) event).f62350a;
            resultBuilder.f(p.f62362i);
            w wVar = (w) resultBuilder.f82219b;
            if (!wVar.f62396q) {
                if (n60.o.B(wVar.f62380a, "getIsPromoted(...)")) {
                    f30 f30Var = ((w) resultBuilder.f82219b).f62380a;
                    es.c cVar = (es.c) this.f62379e;
                    if (cVar.P(f30Var)) {
                        resultBuilder.f(new m4((!cVar.P(f30Var) || (Z5 = f30Var.Z5()) == null || (f13 = Z5.f()) == null) ? 0 : f13.size(), this, 20));
                    }
                    String h10 = cVar.h(((w) resultBuilder.f82219b).f62380a);
                    String str = "";
                    if (h10 == null) {
                        h10 = "";
                    }
                    int i13 = e0.f90644c;
                    ej1.d dVar = new ej1.d(i13, new f0(h10), vn1.c.DEFAULT, tn1.c.f118617i, 2, null, null, null, null, null, 992);
                    w wVar2 = (w) resultBuilder.f82219b;
                    f30 f30Var2 = wVar2.f62380a;
                    boolean z13 = config.N;
                    boolean z14 = wVar2.f62383d.f90870o;
                    boolean E1 = dl2.b.E1(wVar2);
                    q qVar = q.f62363i;
                    defpackage.d dVar2 = new defpackage.d(23, resultBuilder);
                    es.v vVar = (es.v) this.f62377c;
                    if (vVar.I(f30Var2, z13, config.O, z14, E1, qVar, dVar2)) {
                        resultBuilder.f(new s(dVar, 1));
                    }
                    w wVar3 = (w) resultBuilder.f82219b;
                    f30 pin = wVar3.f62380a;
                    x2 x2Var = wVar3.f62383d;
                    boolean z15 = x2Var.E;
                    defpackage.d activateExperiment = new defpackage.d(25, resultBuilder);
                    fs.c cVar2 = this.f62378d;
                    cVar2.getClass();
                    Intrinsics.checkNotNullParameter(pin, "pin");
                    Intrinsics.checkNotNullParameter(activateExperiment, "activateExperiment");
                    if (cVar2.g(pin, config.N, config.O, fs.a.METADATA, z15, activateExperiment)) {
                        String i14 = cVar.i(pin);
                        if (i14 == null) {
                            i14 = "";
                        }
                        ps0.m.b(resultBuilder, new fj1.c(new ej1.d(i13, new f0(i14), vn1.c.SUBTLE, null, 2, null, null, null, null, null, 1000), null, eo1.c.sema_space_100, rm1.q.ANGLED_PIN, rm1.c.SUBTLE, rm1.i.SM, fj1.a.START, g92.d.VR, 2), new ak1.b(new b0(e0.f90645d), "possiblyAddPromotionPieces - lego_grid_cell_inner_padding"));
                    }
                    f30 f30Var3 = ((w) resultBuilder.f82219b).f62380a;
                    g0 g0Var2 = config.f128851b0;
                    if (g0Var2 != null && g0Var2.m() && this.f62378d.o(f30Var3, config.N, config.O, Boolean.TRUE, dl2.b.a0((w) resultBuilder.f82219b), new u1(12, resultBuilder))) {
                        String a13 = cVar2.a(pin);
                        String b13 = cVar2.b(pin);
                        if (a13 != null) {
                            str = a13;
                        } else if (b13 != null) {
                            str = b13;
                        }
                        ps0.m.b(resultBuilder, new gj1.b(new ej1.d(i13, new f0(str), vn1.c.INFO, kotlin.collections.e0.b(vn1.e.BOLD), 0, null, null, null, null, null, 992)), new ak1.b(new b0(e0.f90645d), "possiblyAddPromotionPieces - lego_grid_cell_inner_padding"));
                        g0Var = g0Var2;
                    } else {
                        g0Var = g0Var2;
                        if (this.f62378d.k(pin, config.N, config.O, g0Var2 != null && g0Var2.f128738t, dl2.b.a0(wVar3), x2Var.f90851e0, new defpackage.d(24, resultBuilder)) && vVar.N(pin, dl2.b.E1(wVar3), new yj1.d(wVar3, 2))) {
                            String a14 = cVar2.a(pin);
                            String b14 = cVar2.b(pin);
                            if (a14 != null) {
                                str = a14;
                            } else if (b14 != null) {
                                str = b14;
                            }
                            ps0.m.b(resultBuilder, new gj1.b(new ej1.d(i13, new f0(str), vn1.c.INFO, kotlin.collections.e0.b(vn1.e.REGULAR), 0, null, null, null, null, null, 992)), new ak1.b(new b0(e0.f90645d), "possiblyAddPromotionPieces - lego_grid_cell_inner_padding"));
                        }
                    }
                    f30 f30Var4 = ((w) resultBuilder.f82219b).f62380a;
                    if (g0Var != null) {
                        Boolean O5 = f30Var4.O5();
                        Intrinsics.checkNotNullExpressionValue(O5, "getPromotedIsCatalogCarouselAd(...)");
                        if (O5.booleanValue()) {
                            K(f30Var4, config, g0Var, resultBuilder, this.f62377c);
                        } else {
                            J(resultBuilder, config);
                        }
                    }
                    if (g0Var == null) {
                        if (!s(resultBuilder, config)) {
                            E(resultBuilder);
                        }
                        H(resultBuilder, config);
                        G(resultBuilder, config);
                        F(resultBuilder, config);
                        D(resultBuilder, config);
                    }
                } else {
                    g0 g0Var3 = config.f128851b0;
                    if (g0Var3 != null) {
                        J(resultBuilder, config);
                    }
                    if (g0Var3 == null) {
                        w wVar4 = (w) resultBuilder.f82219b;
                        String str2 = wVar4.f62388i;
                        f30 f30Var5 = wVar4.f62380a;
                        Intrinsics.checkNotNullParameter(f30Var5, "<this>");
                        String closeupTrafficSource = config.f128875n0;
                        Intrinsics.checkNotNullParameter(closeupTrafficSource, "closeupTrafficSource");
                        Intrinsics.checkNotNullParameter(config, "config");
                        boolean z16 = (Intrinsics.d(closeupTrafficSource, "messages") || config.f128894y || (Intrinsics.d(closeupTrafficSource, "board") && (D3 = f30Var5.D3()) != null && kh2.w.i0(D3) && wVar4.f62385f) || b40.e0(f30Var5) <= 0 || (!b40.c(f30Var5) && (!b40.b(f30Var5) || b40.P0(f30Var5)))) ? false : true;
                        if (!config.F && z16 && !Intrinsics.d(str2, f30Var5.getUid())) {
                            resultBuilder.h(new u0(14, f30Var5));
                            resultBuilder.f(new ed1.m(f30Var5, this, config, 21));
                            resultBuilder.f(r.f62365k);
                        }
                        E(resultBuilder);
                        G(resultBuilder, config);
                        F(resultBuilder, config);
                        D(resultBuilder, config);
                    }
                }
            }
        } else if (event instanceof g) {
            resultBuilder.h(new a0(event, 13));
        } else if (event instanceof h) {
            List<u50.o> list = ((d) resultBuilder.f82218a).f62348a;
            ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
            for (u50.o oVar2 : list) {
                if (oVar2 instanceof hj1.b) {
                    h hVar = (h) event;
                    oVar2 = hj1.b.e(x.e(((hj1.b) oVar2).f(), new wa2.h0(hVar.k()), new wa2.v(o(hVar.j()))));
                }
                arrayList.add(oVar2);
            }
            resultBuilder.f(new w1.g(arrayList, 29));
        } else if (event instanceof e) {
            resultBuilder.h(new tk0.h0(6, resultBuilder));
            resultBuilder.f(r.f62366l);
        } else if (event instanceof i) {
            List d2 = ((w) resultBuilder.f82219b).d();
            if (!d2.isEmpty()) {
                resultBuilder.f(new u(d2, 0));
            }
        }
        return resultBuilder.e();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.lambda$collectConnectedVars$1(InitCodeVariables.java:124)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:121)
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public final ij1.o i(l82.e r21, com.pinterest.api.model.f30 r22, wa2.m r23, boolean r24, boolean r25, qa2.a r26, mi1.f r27, ni1.x2 r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fk1.v.i(l82.e, com.pinterest.api.model.f30, wa2.m, boolean, boolean, qa2.a, mi1.f, ni1.x2, boolean):ij1.o");
    }

    public final String j(l82.e eVar, wa2.m mVar) {
        f30 f30Var = ((w) eVar.f82219b).f62380a;
        b20.c cVar = new b20.c(f30Var);
        boolean z13 = ((w) eVar.f82219b).f62389j;
        boolean u13 = u(f30Var, eVar);
        boolean z14 = mVar.f128876o;
        g0 g0Var = mVar.f128851b0;
        boolean I2 = dl2.b.I2(f30Var, g0Var, z14, u13);
        boolean t13 = t(eVar, mVar);
        boolean z15 = mVar.O;
        boolean z16 = cVar.z(g0Var, z13, z15, t13);
        String str = mVar.f128887t0;
        if (str == null) {
            str = f30Var.r4();
        }
        return cVar.m(cVar.t(true, z16, g0Var, z13, z15, str, ps0.m.k(eVar, this.f62377c)), cVar.u(g0Var, z13, z15), z16, I2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0105, code lost:
    
        if (r1.booleanValue() != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ej1.d l(l82.e r24, wa2.m r25, java.lang.String r26, java.util.List r27, java.lang.Integer r28, ej1.c r29) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fk1.v.l(l82.e, wa2.m, java.lang.String, java.util.List, java.lang.Integer, ej1.c):ej1.d");
    }

    public final n n(l82.e eVar, wa2.m mVar, boolean z13) {
        String str;
        w wVar = (w) eVar.f82219b;
        f30 pin = wVar.f62380a;
        x2 x2Var = wVar.f62383d;
        wy0 N = b40.N(pin);
        String Z2 = N != null ? N.Z2() : null;
        String str2 = Z2 == null ? "" : Z2;
        Integer num = z13 ? 1 : null;
        boolean L = ((es.c) this.f62379e).L(pin);
        es.h hVar = this.f62377c;
        if (L) {
            return new n(new f0(((es.v) hVar).w(str2)), Integer.MAX_VALUE, null);
        }
        boolean z14 = x2Var.f90845b0;
        defpackage.d dVar = new defpackage.d(20, eVar);
        es.v vVar = (es.v) hVar;
        if (!vVar.W(pin, mVar.O, mVar.N, z14, dVar)) {
            return new n(new f0(str2), num != null ? num.intValue() : 3, null);
        }
        int colorRes = vn1.c.DEFAULT.getColorRes();
        int colorRes2 = vn1.c.SUBTLE.getColorRes();
        vVar.getClass();
        Intrinsics.checkNotNullParameter(pin, "pin");
        wy0 N2 = b40.N(pin);
        String Z22 = N2 != null ? N2.Z2() : null;
        if (Z22 == null || (str = Z22.concat(" · ")) == null) {
            str = "";
        }
        String u13 = es.v.u(pin);
        o0 j13 = com.bumptech.glide.c.j1(new es.l(str, colorRes, colorRes2, u13 != null ? u13 : ""));
        return new n(j13.b(), num != null ? num.intValue() : 2, j13);
    }

    public final boolean p(l82.e eVar, wa2.m mVar) {
        w wVar = (w) eVar.f82219b;
        f30 f30Var = wVar.f62380a;
        x2 x2Var = wVar.f62383d;
        boolean e13 = mi1.e.e(f30Var, x2Var.f90842a);
        defpackage.d activateExperiments = new defpackage.d(21, eVar);
        Intrinsics.checkNotNullParameter(activateExperiments, "activateExperiments");
        boolean z13 = false;
        if (e13 || mVar.O || mVar.N) {
            activateExperiments.invoke();
            if (!x2Var.F) {
                z13 = true;
            }
        }
        eVar.a(new k(yc.f114734a));
        return b40.y0(f30Var, z13, ((es.c) this.f62379e).L(f30Var));
    }

    public final boolean q(l82.e eVar) {
        w wVar = (w) eVar.f82219b;
        return ((es.v) this.f62377c).F(wVar.f62380a, wVar.f62383d.f90841J, new defpackage.d(22, eVar));
    }

    public final boolean r(l82.e eVar, wa2.m mVar) {
        return (n60.o.B(((w) eVar.f82219b).f62380a, "getIsPromoted(...)") && q(eVar)) || t(eVar, mVar);
    }

    public final boolean s(l82.e eVar, wa2.m mVar) {
        w wVar = (w) eVar.f82219b;
        return n60.o.B(wVar.f62380a, "getIsPromoted(...)") && wVar.f62383d.G && p(eVar, mVar);
    }

    public final boolean t(l82.e eVar, wa2.m mVar) {
        f30 f30Var = ((w) eVar.f82219b).f62380a;
        if (n60.o.B(f30Var, "getIsPromoted(...)")) {
            return false;
        }
        b20.c cVar = new b20.c(f30Var);
        boolean z13 = ((w) eVar.f82219b).f62389j;
        boolean u13 = u(f30Var, eVar);
        boolean z14 = mVar.f128876o;
        g0 g0Var = mVar.f128851b0;
        boolean I2 = dl2.b.I2(f30Var, g0Var, z14, u13);
        boolean z15 = mVar.O;
        boolean z16 = cVar.z(g0Var, z13, z15, false);
        String str = mVar.f128887t0;
        if (str == null) {
            str = f30Var.r4();
        }
        String t13 = cVar.t(true, z16, g0Var, z13, z15, str, ps0.m.k(eVar, this.f62377c));
        String m13 = cVar.m(t13, cVar.u(g0Var, z13, z15), z16, I2);
        if (t13.length() == 0 || m13.length() == 0) {
            return false;
        }
        return q(eVar);
    }

    public final void w(l82.e eVar) {
        String str;
        f30 f30Var = ((w) eVar.f82219b).f62380a;
        if (((es.c) this.f62379e).L(f30Var)) {
            aj1.a[] aVarArr = new aj1.a[3];
            aVarArr[0] = new ak1.b(new b0(c.f62345c), "maybeAddPharmaAdDisclosure, top - sema_space_200");
            com.pinterest.api.model.g t33 = f30Var.t3();
            if (t33 == null || (str = t33.Y()) == null) {
                str = "";
            }
            aVarArr[1] = new cj1.b(new ej1.d(0, ep.b.x(str, "string", str), null, tn1.c.f118617i, Integer.MAX_VALUE, null, null, null, null, null, 997));
            aVarArr[2] = new ak1.b(new b0(c.f62346d), "maybeAddPharmaAdDisclosure, bottom - 10dp");
            ps0.m.b(eVar, aVarArr);
            eVar.a(new l(new zy.e0(new zy.a(com.bumptech.glide.d.z0(((w) eVar.f82219b).h().f143086a, r.f62364j), f1.VIEW, f30Var.getUid(), null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_PEAR_EXPLORER_HEADER))));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
    
        if (r3 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00cd, code lost:
    
        if (r3 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e9, code lost:
    
        if (r3 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0105, code lost:
    
        if (r3 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x012d, code lost:
    
        if (r3 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0143, code lost:
    
        if (r3 == null) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(l82.e r28, wa2.m r29, int r30, ej1.c r31) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fk1.v.x(l82.e, wa2.m, int, ej1.c):void");
    }

    public final ej1.d y(l82.e eVar, wa2.m mVar, ej1.d dVar, String str) {
        f30 f30Var = ((w) eVar.f82219b).f62380a;
        return (mVar.Y && (j1.F1(f30Var) && !f30Var.d5().booleanValue())) ? ej1.d.e(dVar, null, null, com.bumptech.glide.c.j1(new a1(this, mVar, str, 12)), null, 959) : dVar;
    }

    public final void z(l82.e eVar, f30 f30Var, wa2.m mVar, g0 g0Var, int i13, int i14, ArrayList arrayList) {
        List list;
        String j13 = b40.j(i14, f30Var);
        if (g0Var.f128720b) {
            if (!z.j(j13)) {
                switch (ej1.d.f59102k.f101325a) {
                    case 10:
                        list = ej1.d.f59105n;
                        break;
                    default:
                        list = tn1.c.f118616h;
                        break;
                }
                ej1.d l13 = l(eVar, mVar, j13, list, Integer.valueOf(i13), ej1.c.ID_PRODUCT_TITLE);
                boolean z13 = n60.o.B(f30Var, "getIsPromoted(...)") && q(eVar);
                arrayList.add(I(f30Var, z13, p(eVar, mVar), ((w) eVar.f82219b).f62383d.F, mVar.O, l13));
                if (z13 || t(eVar, mVar)) {
                    arrayList.add(new ak1.b(new b0(r0.lego_grid_cell_inner_small_padding), "maybeAddProductTitle, Brand reorder - lego_grid_cell_inner_small_padding"));
                } else {
                    arrayList.add(new ak1.b(new b0(r0.lego_grid_cell_inner_padding), "maybeAddProductTitle - lego_grid_cell_inner_padding"));
                }
            }
        }
    }
}
