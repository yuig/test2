package la0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k1 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final l82.h0 f82417b;

    /* renamed from: c, reason: collision with root package name */
    public final l82.h0 f82418c;

    /* renamed from: d, reason: collision with root package name */
    public final l82.h0 f82419d;

    /* renamed from: e, reason: collision with root package name */
    public final l82.h0 f82420e;

    public k1(o82.i0 listTransformer, lt.j pinalyticsStateTransformer, x31.o filterBarTransformer, lt.j impressionStateTransformer) {
        Intrinsics.checkNotNullParameter(listTransformer, "listTransformer");
        Intrinsics.checkNotNullParameter(pinalyticsStateTransformer, "pinalyticsStateTransformer");
        Intrinsics.checkNotNullParameter(filterBarTransformer, "filterBarTransformer");
        Intrinsics.checkNotNullParameter(impressionStateTransformer, "impressionStateTransformer");
        this.f82417b = b(listTransformer, new kotlin.jvm.internal.d0() { // from class: la0.g1
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((g) obj).f82396a;
            }
        }, new kotlin.jvm.internal.d0() { // from class: la0.h1
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((m1) obj).f82431d;
            }
        }, f1.f82393k);
        this.f82418c = b(pinalyticsStateTransformer, new kotlin.jvm.internal.d0() { // from class: la0.i1
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((g) obj).f82401f;
            }
        }, new kotlin.jvm.internal.d0() { // from class: la0.j1
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((m1) obj).f82433f;
            }
        }, f1.f82394l);
        this.f82419d = b(impressionStateTransformer, new kotlin.jvm.internal.d0() { // from class: la0.d1
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((g) obj).f82402g;
            }
        }, new kotlin.jvm.internal.d0() { // from class: la0.e1
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((m1) obj).f82433f;
            }
        }, f1.f82392j);
        this.f82420e = b(filterBarTransformer, new kotlin.jvm.internal.d0() { // from class: la0.x0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((g) obj).f82400e;
            }
        }, new kotlin.jvm.internal.d0() { // from class: la0.y0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((m1) obj).f82434g;
            }
        }, new i1.j(this, 26));
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        m1 vmState = (m1) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        yk2.o oVar = new yk2.o();
        oVar.addAll(u1.f82470a);
        Intrinsics.checkNotNullParameter(vmState, "<this>");
        String str = (String) vmState.f82436i.get("android_curation_collage_image_download");
        if (v50.a.a(str) || v50.a.b(str)) {
            oVar.add(t1.DownloadImage);
        }
        Intrinsics.checkNotNullParameter(vmState, "<this>");
        String str2 = (String) vmState.f82436i.get("android_curation_duplicate_collage");
        if (v50.a.a(str2) || v50.a.b(str2)) {
            oVar.add(t1.Duplicate);
        }
        Unit unit = Unit.f80348a;
        yk2.o a13 = kotlin.collections.g1.a(oVar);
        o82.a0 a0Var = new o82.a0();
        int i13 = ka0.b0.collages_retrieval_empty_state_title;
        String[] formatArgs = new String[0];
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        u50.k0 k0Var = new u50.k0(i13, new ArrayList(0));
        int i14 = ka0.b0.collages_retrieval_empty_state_message;
        String[] formatArgs2 = new String[0];
        Intrinsics.checkNotNullParameter(formatArgs2, "formatArgs");
        l82.e d2 = l82.d.d(new g(a0Var, vmState.f82432e, k0Var, new u50.k0(i14, new ArrayList(0)), o1.f82456a, new zy.a0(), zy.b.f143058a, a13, false), vmState);
        bk.f.T(d2, this.f82417b);
        bk.f.T(d2, this.f82418c);
        Intrinsics.checkNotNullParameter(d2, "<this>");
        d2.a(b.f82370a);
        if (vmState.f82432e) {
            bk.f.T(d2, this.f82420e);
        }
        return d2.e();
    }

    @Override // l82.d
    public final l82.c0 f(u50.s sVar, u50.o oVar, l82.i0 i0Var, l82.e resultBuilder) {
        Object obj;
        ka0.o lVar;
        int i13 = 0;
        y event = (y) sVar;
        g priorDisplayState = (g) oVar;
        m1 priorVMState = (m1) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (event instanceof o) {
            ll1.d[] events = {((o) event).f82455a};
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            l82.h0 lens = this.f82418c;
            Intrinsics.checkNotNullParameter(lens, "lens");
            Intrinsics.checkNotNullParameter(events, "events");
            Intrinsics.checkNotNullParameter(events, "$events");
            Intrinsics.checkNotNullParameter(lens, "$lens");
            Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
            int length = events.length;
            while (i13 < length) {
                lens.a(events[i13], resultBuilder);
                i13++;
            }
        } else if (event instanceof p) {
            o82.g0[] events2 = {((p) event).f82457a};
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            l82.h0 lens2 = this.f82417b;
            Intrinsics.checkNotNullParameter(lens2, "lens");
            Intrinsics.checkNotNullParameter(events2, "events");
            Intrinsics.checkNotNullParameter(events2, "$events");
            Intrinsics.checkNotNullParameter(lens2, "$lens");
            Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
            int length2 = events2.length;
            while (i13 < length2) {
                lens2.a(events2[i13], resultBuilder);
                i13++;
            }
        } else if (event instanceof n) {
            if (priorVMState.f82432e) {
                x31.g[] events3 = {((n) event).f82438a};
                Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                l82.h0 lens3 = this.f82420e;
                Intrinsics.checkNotNullParameter(lens3, "lens");
                Intrinsics.checkNotNullParameter(events3, "events");
                Intrinsics.checkNotNullParameter(events3, "$events");
                Intrinsics.checkNotNullParameter(lens3, "$lens");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                int length3 = events3.length;
                while (i13 < length3) {
                    lens3.a(events3[i13], resultBuilder);
                    i13++;
                }
            }
        } else if (event instanceof k) {
            int i14 = w0.f82474a[((m1) resultBuilder.f82219b).f82430c.ordinal()];
            if (i14 == 1) {
                lVar = new ka0.l(((k) event).f82414a);
            } else {
                if (i14 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                lVar = new ka0.n(((k) event).f82414a);
            }
            h32.i0 i0Var2 = priorVMState.f82433f.f143086a;
            h32.f1 f1Var = h32.f1.TAP;
            k kVar = (k) event;
            String str = kVar.f82414a;
            HashMap hashMap = new HashMap();
            bs1.c.G1("grid_index", String.valueOf(kVar.f82415b), hashMap);
            Unit unit = Unit.f80348a;
            resultBuilder.d(new l0(new zy.f0(new zy.a(i0Var2, f1Var, str, hashMap, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM))), new t0(lVar));
        } else if (event instanceof j) {
            resultBuilder.d(new n0(((j) event).f82412a, ((g) resultBuilder.f82218a).f82403h));
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            resultBuilder.a(a.f82364a);
        } else {
            if (event instanceof h) {
                resultBuilder.d(new t0(new ka0.l(null)), kh2.d.Q0(priorVMState, h32.u0.COLLAGES_TAB_CREATE_NEW, h32.f1.TAP));
            } else if (event instanceof m) {
                resultBuilder.d(new t0(new ka0.l(null)), kh2.d.Q0(priorVMState, h32.u0.COLLAGES_TAB_EMPTY_STATE_BUTTON, h32.f1.TAP));
            } else if (event instanceof w) {
                w wVar = (w) event;
                m1 m1Var = (m1) resultBuilder.f82219b;
                if (wVar instanceof v) {
                    resultBuilder.d(new q0(new ta0.i0(((v) wVar).f82471a)), kh2.d.Q0(m1Var, h32.u0.COLLAGE_COMPOSER_OVERFLOW_MENU_DUPLICATE, h32.f1.TAP));
                } else if (wVar instanceof t) {
                    resultBuilder.h(new p90.n0(wVar, 27));
                    resultBuilder.d(new p0(r1.f82463a), kh2.d.Q0(m1Var, h32.u0.COLLAGE_COMPOSER_OVERFLOW_MENU_DELETE, h32.f1.TAP));
                } else {
                    if (!(wVar instanceof u)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    resultBuilder.d(new r0(new ta0.w(((u) wVar).f82468a)), kh2.d.Q0(m1Var, h32.u0.COLLAGE_COMPOSER_OVERFLOW_MENU_DOWNLOAD, h32.f1.TAP));
                }
            } else if (event instanceof s) {
                zb0.f fVar = ((s) event).f82464a;
                Integer h10 = fVar.h();
                int i15 = ka0.z.collages_retrieval_delete_alert;
                if (h10 != null && h10.intValue() == i15 && (fVar instanceof zb0.c)) {
                    String id3 = ((m1) resultBuilder.f82219b).f82435h;
                    g gVar = (g) resultBuilder.f82218a;
                    Intrinsics.checkNotNullParameter(gVar, "<this>");
                    Intrinsics.checkNotNullParameter(id3, "id");
                    Iterator it = gVar.f82396a.e().f93756a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (Intrinsics.d(((o82.u0) obj).f93723c, id3)) {
                            break;
                        }
                    }
                    o82.u0 u0Var = (o82.u0) obj;
                    resultBuilder.d(new m0(u0Var != null ? u0Var.f93721a : null, id3));
                }
            } else if (event instanceof i) {
                ta0.p pVar = ((i) event).f82409a;
                if (Intrinsics.d(pVar, ta0.n.f116890a)) {
                    resultBuilder.f(c1.f82381m);
                } else if (Intrinsics.d(pVar, ta0.o.f116891a)) {
                    resultBuilder.f(c1.f82382n);
                    resultBuilder.d(new u0(new k92.n(new k92.c(new u50.k0(qa0.f.collage_download_success), null, null, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL), null)));
                } else {
                    if (!(pVar instanceof ta0.m)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    resultBuilder.f(c1.f82383o);
                    resultBuilder.d(new u0(new k92.n(new k92.c(new u50.k0(((ta0.m) pVar).f116889a), null, null, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL), null)));
                }
            } else if (event instanceof l) {
                ta0.b0 b0Var = ((l) event).f82421a;
                if (Intrinsics.d(b0Var, ta0.z.f116923a)) {
                    resultBuilder.f(c1.f82378j);
                } else if (b0Var instanceof ta0.y) {
                    resultBuilder.f(c1.f82379k);
                    resultBuilder.d(new u0(new k92.n(new k92.c(new u50.k0(((ta0.y) b0Var).f116922a), null, null, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL), null)));
                } else {
                    if (!(b0Var instanceof ta0.a0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    resultBuilder.f(c1.f82380l);
                    resultBuilder.a(new u0(new k92.n(new k92.c(new u50.k0(qa0.f.collage_duplicate_success), null, null, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL), null)));
                }
            } else if (event instanceof x) {
                zy.l[] events4 = {((x) event).f82478a};
                Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                l82.h0 lens4 = this.f82419d;
                Intrinsics.checkNotNullParameter(lens4, "lens");
                Intrinsics.checkNotNullParameter(events4, "events");
                Intrinsics.checkNotNullParameter(events4, "$events");
                Intrinsics.checkNotNullParameter(lens4, "$lens");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                int length4 = events4.length;
                while (i13 < length4) {
                    lens4.a(events4[i13], resultBuilder);
                    i13++;
                }
            } else if (Intrinsics.d(event, r.f82461a)) {
                resultBuilder.a(h0.f82407a);
            } else if (Intrinsics.d(event, q.f82459a)) {
                resultBuilder.a(i0.f82410a);
            }
        }
        return resultBuilder.e();
    }
}
