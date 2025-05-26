package gk1;

import bk1.u1;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import df.j1;
import ek1.c2;
import h32.c1;
import h32.f1;
import i2.j2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import la0.l1;
import net.quikkly.android.utils.BitmapUtils;
import ni1.m2;
import ni1.x2;

/* loaded from: classes2.dex */
public final class w0 extends l82.d {

    /* renamed from: g, reason: collision with root package name */
    public static final ps0.y f65282g = new ps0.y(14, 0);

    /* renamed from: b, reason: collision with root package name */
    public final fs.c f65283b;

    /* renamed from: c, reason: collision with root package name */
    public final es.h f65284c;

    /* renamed from: d, reason: collision with root package name */
    public final es.a f65285d;

    /* renamed from: e, reason: collision with root package name */
    public final ur.a f65286e;

    /* renamed from: f, reason: collision with root package name */
    public final nx.b0 f65287f;

    public w0(ur.a adsDependencies, es.a adFormats, es.h adsCommonDisplay, fs.c adsSalesDealsDisplay, nx.b0 pinAuxHelper) {
        Intrinsics.checkNotNullParameter(adsSalesDealsDisplay, "adsSalesDealsDisplay");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(adsDependencies, "adsDependencies");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        this.f65283b = adsSalesDealsDisplay;
        this.f65284c = adsCommonDisplay;
        this.f65285d = adFormats;
        this.f65286e = adsDependencies;
        this.f65287f = pinAuxHelper;
    }

    public static final rm1.q g(w0 w0Var, boolean z13, boolean z14) {
        w0Var.getClass();
        return z13 ? z14 ? rm1.q.SOUND_SLASH_FILL : rm1.q.MUTE_FILL : rm1.q.SOUND_FILL;
    }

    public static qj1.b i(l82.e eVar, boolean z13) {
        x0 x0Var = (x0) eVar.f82219b;
        f30 f30Var = x0Var.f65293a;
        x2 x2Var = x0Var.f65299g;
        int m13 = m(eVar);
        int k13 = k(eVar);
        u50.b0 l13 = l(eVar);
        boolean z14 = x2Var.f90885v0;
        boolean z15 = x0Var.H;
        int i13 = z14 ? wy1.b.grid_cell_indicator_shadow_size : z15 ? wy1.b.grid_cell_indicator_shadow_vr_size : wy1.b.grid_cell_indicator_shadow_size;
        boolean z16 = x2Var.f90887w0;
        boolean z17 = x2Var.f90883u0;
        int i14 = z17 ? z14 ? wy1.b.grid_cell_expand_tappable_size_small : z16 ? wy1.b.grid_cell_expand_tappable_size : wy1.b.grid_cell_expand_tappable_size_balanced : wy1.b.grid_cell_expand_tappable_size;
        int i15 = b40.C0(f30Var) ? RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM : 255;
        if (z16) {
            return new qj1.b(new pj1.f(eo1.c.margin_half, pj1.c.END, null, new pj1.j(null, eo1.b.color_background_default, rm1.c.DEFAULT, k13, k13, z15 ? rm1.q.SOUND_SLASH_FILL : rm1.q.MUTE_FILL, m13, null, false, false, false, pj1.b.MUTED, false, i15, null, x0Var.H, new u50.c(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN), null, false, false, null, null, l13, -731906239, 15), 44), !z13, wy1.b.grid_cell_indicator_shadow_size, i14, null);
        }
        return new qj1.b(new pj1.f(eo1.c.margin_half, pj1.c.END, null, new pj1.j(null, eo1.b.color_themed_transparent, rm1.c.LIGHT, 0, 0, z15 ? rm1.q.SOUND_SLASH_FILL : rm1.q.MUTE_FILL, m60.r0.default_pds_icon_size, null, false, false, true, pj1.b.MUTED, true, i15, new u50.c(0), x0Var.H, null, null, false, false, null, null, null, -262144167, 31), 44), !z13, i13, i14, z17 ? Integer.valueOf(m60.r0.margin_quarter) : null);
    }

    public static uj1.b j(l82.e eVar, boolean z13, boolean z14) {
        x0 x0Var = (x0) eVar.f82219b;
        x2 x2Var = x0Var.f65299g;
        int m13 = m(eVar);
        int k13 = k(eVar);
        u50.b0 l13 = l(eVar);
        boolean z15 = x2Var.f90885v0;
        int i13 = z15 ? wy1.b.grid_cell_indicator_shadow_size_small : wy1.b.grid_cell_indicator_shadow_size;
        rm1.m mVar = z15 ? rm1.n.MAXIMIZE : rm1.q.MAXIMIZE;
        boolean z16 = x2Var.f90887w0;
        boolean z17 = x2Var.f90883u0;
        int i14 = z17 ? z15 ? wy1.b.grid_cell_expand_tappable_size_small : z16 ? wy1.b.grid_cell_expand_tappable_size : wy1.b.grid_cell_expand_tappable_size_balanced : wy1.b.grid_cell_expand_tappable_size;
        if (z16) {
            return new uj1.b(new pj1.f(eo1.c.margin_half, pj1.c.END, null, new pj1.j(null, eo1.b.color_background_default, rm1.c.DEFAULT, k13, k13, mVar, m13, null, false, false, false, pj1.b.FULLSCREEN, false, 0, null, x0Var.H, new u50.c(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN), null, false, false, null, null, l13, -698351807, 15), 44), z13 && z14, wy1.b.grid_cell_indicator_shadow_size, i14, null);
        }
        return new uj1.b(new pj1.f(eo1.c.margin_half, pj1.c.END, null, new pj1.j(null, eo1.b.color_themed_transparent, rm1.c.LIGHT, 0, 0, rm1.q.MAXIMIZE, m13, null, false, false, true, pj1.b.FULLSCREEN, true, 0, new u50.c(0), x0Var.H, null, null, false, false, null, null, null, -228589735, 31), 44), z13 && z14, i13, i14, z17 ? Integer.valueOf(m60.r0.margin_quarter) : null);
    }

    public static int k(l82.e eVar) {
        return ((x0) eVar.f82219b).f65299g.f90885v0 ? wy1.b.inline_save_button_padding_small : wy1.b.inline_save_button_padding;
    }

    public static u50.b0 l(l82.e eVar) {
        return ((x0) eVar.f82219b).f65299g.f90885v0 ? new u50.b0(eo1.c.sema_rounding_200) : new u50.b0(eo1.c.sema_rounding_300);
    }

    public static int m(l82.e eVar) {
        return ((x0) eVar.f82219b).f65299g.f90885v0 ? eo1.c.space_300 : m60.r0.default_pds_icon_size;
    }

    public static vj1.b n(l82.e eVar) {
        x0 x0Var = (x0) eVar.f82219b;
        x2 x2Var = x0Var.f65299g;
        int m13 = m(eVar);
        int k13 = k(eVar);
        u50.b0 l13 = l(eVar);
        return new vj1.b(new pj1.f(eo1.c.margin_half, pj1.c.END, pj1.d.BOTTOM, new pj1.j(null, eo1.b.color_background_default, rm1.c.DEFAULT, k13, k13, x2Var.f90885v0 ? rm1.n.ANGLED_PIN : rm1.q.ANGLED_PIN, m13, null, false, ((x0) eVar.f82219b).f65305m, false, null, false, 0, null, x0Var.H, new u50.c(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN), null, false, false, null, null, l13, -671121599, 15), 40));
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        x0 vmState = (x0) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        l82.e d2 = l82.d.d(new l(), vmState);
        Intrinsics.checkNotNullParameter(d2, "<this>");
        d2.a(b.f65214a);
        return d2.e();
    }

    @Override // l82.d
    public final l82.c0 f(u50.s sVar, u50.o oVar, l82.i0 i0Var, l82.e resultBuilder) {
        int i13;
        c1 c13;
        String str;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        x0 x0Var;
        oi1.n nVar;
        d0 event = (d0) sVar;
        l priorDisplayState = (l) oVar;
        x0 priorVMState = (x0) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (event instanceof x) {
            resultBuilder.h(new u00.e(event, 28));
            x xVar = (x) event;
            h(resultBuilder, xVar.f65288a, xVar.f65290c, xVar.f65291d);
            if (!((x0) resultBuilder.f82219b).G) {
                resultBuilder.h(o0.f65251n);
                o(resultBuilder, (l) resultBuilder.f82218a, xVar.f65289b);
            }
        } else if (event instanceof y) {
            resultBuilder.h(new t0(event, 2));
        } else {
            if (!(event instanceof r)) {
                boolean z18 = event instanceof u;
                oi1.n nVar2 = oi1.n.f95314a;
                oi1.l lVar = oi1.l.f95312a;
                oi1.f fVar = oi1.f.f95306a;
                es.a aVar = this.f65285d;
                if (z18) {
                    x0 x0Var2 = (x0) resultBuilder.f82219b;
                    l lVar2 = (l) resultBuilder.f82218a;
                    f30 f30Var = x0Var2.f65293a;
                    boolean F1 = dl2.b.F1(x0Var2);
                    boolean G = ((es.c) aVar).G(f30Var);
                    x2 x2Var = x0Var2.f65299g;
                    oi1.n nVar3 = nVar2;
                    boolean N1 = j1.N1(f30Var, x0Var2.f65295c, x0Var2.f65296d, x0Var2.f65304l, F1, G, new j2(10, resultBuilder, x2Var), new u0(x2Var, 0), new u0(x2Var, 1), new s0(x0Var2, 1), this.f65284c, this.f65285d, x2Var.f90893z0);
                    ArrayList arrayList = new ArrayList();
                    x0Var2.getClass();
                    List list = lVar2.f65239a;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (((jj1.d) it.next()) instanceof sj1.b) {
                                arrayList.add(lVar);
                                break;
                            }
                        }
                    }
                    if (!N1 && !x0Var2.E) {
                        for (jj1.d dVar : lVar2.f65239a) {
                            if (dVar instanceof qj1.b) {
                                arrayList.add(fVar);
                                nVar = nVar3;
                            } else if (dVar instanceof uj1.b) {
                                nVar = nVar3;
                                arrayList.add(nVar);
                            } else {
                                nVar = nVar3;
                                if (dVar instanceof pj1.f) {
                                    arrayList.add(oi1.g.f95307a);
                                }
                            }
                            nVar3 = nVar;
                        }
                    }
                    resultBuilder.h(new i1.y(arrayList, 6));
                } else {
                    int i14 = 4;
                    if (event instanceof b0) {
                        boolean N12 = j1.N1(priorVMState.f65293a, priorVMState.f65295c, priorVMState.f65296d, priorVMState.f65304l, dl2.b.F1(priorVMState), ((es.c) aVar).G(priorVMState.f65293a), new r0(resultBuilder, priorVMState, 3), new s0(priorVMState, 2), new s0(priorVMState, 3), new s0(priorVMState, 4), this.f65284c, this.f65285d, priorVMState.f65299g.f90893z0);
                        x0 x0Var3 = (x0) resultBuilder.f82219b;
                        f30 f30Var2 = x0Var3.f65293a;
                        List list2 = ((l) resultBuilder.f82218a).f65239a;
                        b0 b0Var = (b0) event;
                        boolean z19 = b0Var.f65216b;
                        List<jj1.d> list3 = list2;
                        boolean z23 = list3 instanceof Collection;
                        if (!z23 || !list3.isEmpty()) {
                            Iterator it2 = list3.iterator();
                            while (it2.hasNext()) {
                                if (((jj1.d) it2.next()) instanceof rj1.b) {
                                    z13 = true;
                                    break;
                                }
                            }
                        }
                        z13 = false;
                        if (!z23 || !list3.isEmpty()) {
                            Iterator it3 = list3.iterator();
                            while (it3.hasNext()) {
                                if (((jj1.d) it3.next()) instanceof tj1.b) {
                                    z14 = true;
                                    break;
                                }
                            }
                        }
                        z14 = false;
                        if (!z23 || !list3.isEmpty()) {
                            Iterator it4 = list3.iterator();
                            while (it4.hasNext()) {
                                if (((jj1.d) it4.next()) instanceof lj1.b) {
                                    z15 = true;
                                    break;
                                }
                            }
                        }
                        z15 = false;
                        if (!z23 || !list3.isEmpty()) {
                            Iterator it5 = list3.iterator();
                            while (it5.hasNext()) {
                                if (((jj1.d) it5.next()) instanceof vj1.b) {
                                    z16 = true;
                                    break;
                                }
                            }
                        }
                        z16 = false;
                        ArrayList arrayList2 = new ArrayList();
                        oi1.h hVar = oi1.h.f95308a;
                        oi1.j jVar = oi1.j.f95310a;
                        oi1.i iVar = oi1.i.f95309a;
                        if (z19 && !b40.F0(f30Var2)) {
                            for (jj1.d dVar2 : list3) {
                                if (dVar2 instanceof pj1.l) {
                                    arrayList2.add(((pj1.l) dVar2).e());
                                }
                                if (dVar2 instanceof jj1.b) {
                                    arrayList2.add(iVar);
                                }
                                if (dVar2 instanceof lj1.b) {
                                    arrayList2.add(hVar);
                                }
                            }
                        } else if (z13 || z14 || (((z17 = x0Var3.E) && N12) || z16)) {
                            if (!z23 || !list3.isEmpty()) {
                                Iterator it6 = list3.iterator();
                                while (true) {
                                    if (!it6.hasNext()) {
                                        break;
                                    }
                                    if (((jj1.d) it6.next()) instanceof uj1.b) {
                                        arrayList2.add(nVar2);
                                        break;
                                    }
                                }
                            }
                            if (!z23 || !list3.isEmpty()) {
                                Iterator it7 = list3.iterator();
                                while (true) {
                                    if (!it7.hasNext()) {
                                        break;
                                    }
                                    if (((jj1.d) it7.next()) instanceof qj1.b) {
                                        arrayList2.add(fVar);
                                        break;
                                    }
                                }
                            }
                            if (!z23 || !list3.isEmpty()) {
                                Iterator it8 = list3.iterator();
                                while (true) {
                                    if (!it8.hasNext()) {
                                        break;
                                    }
                                    if (((jj1.d) it8.next()) instanceof sj1.b) {
                                        arrayList2.add(lVar);
                                        break;
                                    }
                                }
                            }
                            if (!z23 || !list3.isEmpty()) {
                                Iterator it9 = list3.iterator();
                                while (true) {
                                    if (!it9.hasNext()) {
                                        break;
                                    }
                                    if (((jj1.d) it9.next()) instanceof rj1.b) {
                                        arrayList2.add(jVar);
                                        break;
                                    }
                                }
                            }
                            if (!z23 || !list3.isEmpty()) {
                                Iterator it10 = list3.iterator();
                                while (true) {
                                    if (!it10.hasNext()) {
                                        break;
                                    }
                                    if (((jj1.d) it10.next()) instanceof tj1.b) {
                                        arrayList2.add(oi1.m.f95313a);
                                        break;
                                    }
                                }
                            }
                            if (!z23 || !list3.isEmpty()) {
                                Iterator it11 = list3.iterator();
                                while (true) {
                                    if (!it11.hasNext()) {
                                        break;
                                    }
                                    if (((jj1.d) it11.next()) instanceof vj1.b) {
                                        arrayList2.add(oi1.p.f95316a);
                                        break;
                                    }
                                }
                            }
                            if (z15) {
                                arrayList2.add(hVar);
                            }
                        } else {
                            x0Var3.getClass();
                            if (z17 && b40.X0(f30Var2) && !f30Var2.d5().booleanValue()) {
                                for (jj1.d dVar3 : list3) {
                                    if (dVar3 instanceof pj1.l) {
                                        arrayList2.add(((pj1.l) dVar3).e());
                                    }
                                    if (dVar3 instanceof lj1.b) {
                                        arrayList2.add(hVar);
                                    }
                                }
                            } else if (z15) {
                                for (jj1.d dVar4 : list3) {
                                    if (dVar4 instanceof pj1.l) {
                                        arrayList2.add(((pj1.l) dVar4).e());
                                    }
                                }
                                arrayList2.add(hVar);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            resultBuilder.f(new fk1.u(arrayList2, 1));
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            List list4 = ((l) resultBuilder.f82218a).f65239a;
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj : list4) {
                                if (obj instanceof pj1.l) {
                                    arrayList4.add(obj);
                                }
                            }
                            pj1.l lVar3 = (pj1.l) CollectionsKt.firstOrNull(arrayList4);
                            if (lVar3 != null) {
                                arrayList3.add(new Pair(lVar3.e(), Boolean.valueOf(!b0Var.j() || N12)));
                            }
                            boolean z24 = list4 instanceof Collection;
                            if (!z24 || !list4.isEmpty()) {
                                Iterator it12 = list4.iterator();
                                while (it12.hasNext()) {
                                    if (((jj1.d) it12.next()) instanceof qj1.b) {
                                        x0Var = priorVMState;
                                        arrayList3.add(new Pair(fVar, Boolean.valueOf(x0Var.E)));
                                        break;
                                    }
                                }
                            }
                            x0Var = priorVMState;
                            if (!z24 || !list4.isEmpty()) {
                                Iterator it13 = list4.iterator();
                                while (true) {
                                    if (!it13.hasNext()) {
                                        break;
                                    }
                                    if (((jj1.d) it13.next()) instanceof kj1.a) {
                                        arrayList3.add(new Pair(oi1.e.f95305a, Boolean.TRUE));
                                        break;
                                    }
                                }
                            }
                            if (!z24 || !list4.isEmpty()) {
                                Iterator it14 = list4.iterator();
                                while (true) {
                                    if (!it14.hasNext()) {
                                        break;
                                    }
                                    if (((jj1.d) it14.next()) instanceof xj1.b) {
                                        arrayList3.add(new Pair(oi1.r.f95318a, Boolean.TRUE));
                                        break;
                                    }
                                }
                            }
                            if (!z24 || !list4.isEmpty()) {
                                Iterator it15 = list4.iterator();
                                while (true) {
                                    if (!it15.hasNext()) {
                                        break;
                                    }
                                    if (((jj1.d) it15.next()) instanceof jj1.b) {
                                        arrayList3.add(new Pair(iVar, Boolean.TRUE));
                                        break;
                                    }
                                }
                            }
                            if (!z24 || !list4.isEmpty()) {
                                Iterator it16 = list4.iterator();
                                while (true) {
                                    if (!it16.hasNext()) {
                                        break;
                                    }
                                    if (((jj1.d) it16.next()) instanceof nj1.a) {
                                        arrayList3.add(new Pair(oi1.k.f95311a, Boolean.TRUE));
                                        break;
                                    }
                                }
                            }
                            if (!z24 || !list4.isEmpty()) {
                                Iterator it17 = list4.iterator();
                                while (true) {
                                    if (!it17.hasNext()) {
                                        break;
                                    }
                                    if (((jj1.d) it17.next()) instanceof rj1.b) {
                                        arrayList3.add(new Pair(jVar, Boolean.TRUE));
                                        break;
                                    }
                                }
                            }
                            if (!z24 || !list4.isEmpty()) {
                                Iterator it18 = list4.iterator();
                                while (true) {
                                    if (!it18.hasNext()) {
                                        break;
                                    }
                                    if (((jj1.d) it18.next()) instanceof lj1.b) {
                                        arrayList3.add(new Pair(hVar, Boolean.valueOf(x0Var.f())));
                                        break;
                                    }
                                }
                            }
                            if (!arrayList3.isEmpty()) {
                                resultBuilder.f(new i1.y(arrayList3, 5));
                            }
                        }
                    } else if (event instanceof v) {
                        resultBuilder.a(new k0(new ni1.l(((x0) resultBuilder.f82219b).f65293a)));
                    } else if (event instanceof p) {
                        x0 x0Var4 = (x0) resultBuilder.f82219b;
                        f30 f30Var3 = x0Var4.f65293a;
                        boolean z25 = !x0Var4.i();
                        if (b40.C0(f30Var3)) {
                            resultBuilder.d(new l0(new zy.f0(new zy.a(com.bumptech.glide.d.z0(((x0) resultBuilder.f82219b).f65298f.f143086a, c.f65218k), f1.TAP, f30Var3.getUid(), null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_PEAR_EXPLORER_HEADER))), new m0(new k92.n(new k92.c(new u50.k0(m60.x0.audio_unavailable_in_location_text), null, null, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL), null)));
                        } else {
                            o(resultBuilder, priorDisplayState, z25);
                            resultBuilder.f(new fd1.h(z25, 26));
                            h32.i0 z03 = com.bumptech.glide.d.z0(((x0) resultBuilder.f82219b).f65298f.f143086a, new l1(z25 ? h32.u0.VIDEO_MUTE_BUTTON : h32.u0.VIDEO_UNMUTE_BUTTON, 8));
                            f1 f1Var = f1.TAP;
                            String uid = f30Var3.getUid();
                            HashMap hashMap = new HashMap();
                            if (n60.o.B(f30Var3, "getIsPromoted(...)")) {
                                es.c cVar = (es.c) aVar;
                                if (cVar.U(f30Var3)) {
                                    str = "promoted_idea_pin";
                                } else {
                                    Boolean Q5 = f30Var3.Q5();
                                    Intrinsics.checkNotNullExpressionValue(Q5, "getPromotedIsMaxVideo(...)");
                                    str = Q5.booleanValue() ? "promoted_max_width_pin" : cVar.G(f30Var3) ? "promoted_direct_to_site_pin" : "promoted_pin";
                                }
                            } else {
                                str = b40.Q0(f30Var3) ? "organic_idea_pin" : "organic_legacy_video_pin";
                            }
                            hashMap.put("pin_type", str);
                            hashMap.put("is_third_party_ad", String.valueOf(f30Var3.i5().booleanValue()));
                            resultBuilder.a(new l0(new zy.f0(new zy.a(z03, f1Var, uid, hashMap, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM))));
                        }
                    } else if (event instanceof o) {
                        o(resultBuilder, priorDisplayState, ((o) event).j());
                        resultBuilder.f(o0.f65248k);
                    } else if (event instanceof t) {
                        resultBuilder.f(o0.f65249l);
                    } else if (event instanceof a0) {
                        resultBuilder.f(new t0(event, 0));
                    } else if (Intrinsics.d(event, m.f65243a)) {
                        resultBuilder.f(o0.f65250m);
                    } else if (Intrinsics.d(event, n.f65245a)) {
                        vb0.j.f125466a.T(false, "Unhandled event: " + event, tb0.p.PLATFORM);
                    } else if (!(event instanceof c0)) {
                        if (event instanceof s) {
                            x0 x0Var5 = (x0) resultBuilder.f82219b;
                            if (this.f65283b.i(x0Var5.f65293a, x0Var5.f65299g.c(), new u1(14, resultBuilder))) {
                                List list5 = ((l) resultBuilder.f82218a).f65239a;
                                if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                                    Iterator it19 = list5.iterator();
                                    while (true) {
                                        if (!it19.hasNext()) {
                                            break;
                                        }
                                        if (((jj1.d) it19.next()) instanceof rj1.b) {
                                            resultBuilder.f(c.f65221n);
                                            break;
                                        }
                                    }
                                }
                            }
                        } else if (event instanceof q) {
                            boolean f13 = ((x0) resultBuilder.f82219b).f();
                            resultBuilder.h(new t0(event, 1));
                            resultBuilder.f(new qf1.f0(event, f13, i14));
                            q qVar = (q) event;
                            if (qVar.j() && qVar.k()) {
                                String uid2 = ((x0) resultBuilder.f82219b).f65293a.getUid();
                                Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                                resultBuilder.h(new qf1.z(uid2, 27));
                                resultBuilder.a(new i0(uid2));
                            }
                        } else if (event instanceof w) {
                            x0 x0Var6 = (x0) resultBuilder.f82219b;
                            f30 f30Var4 = x0Var6.f65293a;
                            String uid3 = f30Var4.getUid();
                            Intrinsics.checkNotNullExpressionValue(uid3, "getUid(...)");
                            x2 x2Var2 = x0Var6.f65299g;
                            if (x2Var2.f90863k0 && ((w) event).f65281a && x0Var6.f()) {
                                f0 f0Var = new f0(uid3);
                                j0 j0Var = new j0(uid3);
                                i13 = 0;
                                resultBuilder.d(f0Var, j0Var);
                            } else {
                                i13 = 0;
                            }
                            if (Intrinsics.d(x0Var6.L, f30Var4.getUid()) && !((w) event).f65281a && x0Var6.f()) {
                                resultBuilder.h(c.f65222o);
                                h32.i0 i0Var2 = ((x0) resultBuilder.f82219b).h().f143086a;
                                f1 f1Var2 = f1.DL_AD_CLOSEUP_OVERLAY_IMPRESSION;
                                String uid4 = f30Var4.getUid();
                                x0 x0Var7 = (x0) resultBuilder.f82219b;
                                int i15 = x0Var7.C;
                                Integer num = x0Var7.f65315w;
                                if (num != null) {
                                    i13 = num.intValue();
                                }
                                HashMap a13 = new oi1.t(x0Var7.f65293a, x0Var7.f65294b, x0Var7.A, x0Var7.f65307o, i13, x0Var7.f65316x, i15, x0Var7.f65313u, x0Var7.f65317y, x0Var7.f65318z, x0Var7.f65295c, x0Var7.f65296d, x0Var7.f65308p, x0Var7.f65309q, x0Var7.f65314v, x0Var7.B, x0Var7.f65306n, this.f65285d, this.f65287f, this.f65286e, false, false).a();
                                String uid5 = f30Var4.getUid();
                                boolean m13 = x0Var6.m();
                                String d2 = x0Var6.d();
                                Short o13 = ((es.v) this.f65284c).o(x0Var6.f65293a);
                                boolean F12 = dl2.b.F1(x0Var6);
                                ur.b bVar = (ur.b) this.f65286e;
                                c13 = c2.c(uid5, f30Var4, m13, d2, x2Var2.f90856h, false, false, bVar.f123058a, (r29 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : null, (r29 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : o13, F12, x2Var2.f90850e, this.f65284c, bVar.f123059b);
                                resultBuilder.a(new l0(new zy.e0(new zy.a(i0Var2, f1Var2, uid4, a13, c13, null, false, false, RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL))));
                            }
                        } else if (event instanceof z) {
                            x0 x0Var8 = (x0) resultBuilder.f82219b;
                            String uid6 = x0Var8.f65293a.getUid();
                            Intrinsics.checkNotNullExpressionValue(uid6, "getUid(...)");
                            if (x0Var8.f65299g.f90863k0 && ((z) event).f65320a && x0Var8.f()) {
                                zn2.a aVar2 = zn2.b.f142311b;
                                resultBuilder.a(new h0(dl2.b.P2(10, zn2.d.SECONDS), uid6));
                            }
                        }
                    }
                }
                return resultBuilder.e();
            }
            resultBuilder.f(new oh1.u(15, priorDisplayState, event));
        }
        return resultBuilder.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
    
        if (r5 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
    
        r18 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0312, code lost:
    
        if (r0 == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0079, code lost:
    
        if (((gk1.x0) r78.f82219b).f65299g.f90853f0 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x02dd, code lost:
    
        if (r4 == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0381, code lost:
    
        if (r10.V(r3, r79.O, r79.N, r2.f65299g.Y, new bk1.u1(13, r6)) != false) goto L92;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x06f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0755  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x07cc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0539 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x06d2  */
    /* JADX WARN: Type inference failed for: r3v44, types: [kj1.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(l82.e r78, wa2.m r79, boolean r80, boolean r81) {
        /*
            Method dump skipped, instructions count: 2011
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gk1.w0.h(l82.e, wa2.m, boolean, boolean):void");
    }

    public final void o(l82.e eVar, l lVar, boolean z13) {
        x2 x2Var = ((x0) eVar.f82219b).f65299g;
        eVar.h(new m2(z13, 4));
        eVar.f(new v0(lVar, this, z13, eVar, z13 ? pj1.b.MUTED : pj1.b.UNMUTED, x2Var, b40.C0(((x0) eVar.f82219b).f65293a) ? 163 : 255, x2Var.f90887w0 ? new u50.c(255) : new u50.c(0)));
    }
}
