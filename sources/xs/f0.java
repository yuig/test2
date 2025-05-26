package xs;

import com.pinterest.api.model.b1;
import com.pinterest.api.model.f30;
import com.pinterest.cartingLibrary.analytics.AdsCartingJsonLogger$AdsCartingErrorPayload;
import com.pinterest.cartingLibrary.analytics.AdsCartingJsonLogger$AdsCartingSuccessPayload;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import h32.c1;
import h32.f1;
import h32.w0;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import lh0.m3;
import m60.x0;
import pu.l0;
import pu.m0;
import u50.k0;

/* loaded from: classes3.dex */
public final class f0 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f135715b = 2;

    /* renamed from: c, reason: collision with root package name */
    public final Object f135716c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f135717d;

    public f0(es.a adFormats, ur.a adsDependencies) {
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(adsDependencies, "adsDependencies");
        this.f135716c = adFormats;
        this.f135717d = adsDependencies;
    }

    private l82.c0 l(u50.s sVar, u50.o oVar, i0 i0Var, l82.e resultBuilder) {
        c1 c1Var;
        String failReason;
        int i13;
        y event = (y) sVar;
        m priorDisplayState = (m) oVar;
        g0 priorVMState = (g0) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (event instanceof p) {
            return new l82.c0(m.e(priorDisplayState, null, null, null, null, false, null, null, kotlin.collections.e0.b(h.f135730a), false, 383), g0.b(priorVMState, null, (priorVMState.f135726d > 0 ? 1 : 0) != 0 ? 0L : priorVMState.f135726d, RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL), q0.f80391a);
        }
        boolean z13 = event instanceof x;
        Object obj = this.f135716c;
        if (z13) {
            x xVar = (x) event;
            int i14 = xVar.f135765c;
            h0 h0Var = new h0(i14, xVar.f135763a);
            b1 cartingData = xVar.f135764b;
            m e13 = m.e(priorDisplayState, null, null, null, null, false, null, h0Var, kotlin.collections.e0.b(new j(cartingData, i14)), false, 319);
            a0 a0Var = (a0) obj;
            h32.i0 context = priorVMState.f135729g.f143086a;
            a0Var.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            String pinUid = priorVMState.f135723a;
            Intrinsics.checkNotNullParameter(pinUid, "id");
            HashMap auxData = priorVMState.f135728f;
            Intrinsics.checkNotNullParameter(auxData, "auxData");
            Intrinsics.checkNotNullParameter(cartingData, "cartingData");
            f1 f1Var = f1.PIN_CARTING_RETAILER_CLICK;
            Boolean bool = Boolean.FALSE;
            Boolean bool2 = Boolean.TRUE;
            int i15 = xVar.f135765c;
            c a13 = a0.a(new zy.a(context, f1Var, pinUid, auxData, new c1(null, bool, null, bool2, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, z.b(cartingData, pinUid, Integer.valueOf(i15))), null, false, false, RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL));
            k80.a aVar = a0Var.f135697a;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(pinUid, "pinUid");
            if (aVar.a()) {
                wr.c.a(aVar.f78589a, new AdsCartingJsonLogger$AdsCartingSuccessPayload("retailer_row_click", pinUid, Integer.valueOf(i15)), null, null, 14);
            }
            return new l82.c0(e13, priorVMState, kotlin.collections.e0.b(a13));
        }
        if (event instanceof u) {
            a0 a0Var2 = (a0) obj;
            h32.i0 context2 = priorVMState.f135729g.f143086a;
            b1 b1Var = priorDisplayState.f135746f;
            h0 h0Var2 = priorDisplayState.f135747g;
            long j13 = h0Var2 != null ? h0Var2.f135736b : 0L;
            i13 = h0Var2 != null ? h0Var2.f135735a : 0;
            a0Var2.getClass();
            Intrinsics.checkNotNullParameter(context2, "context");
            String id3 = priorVMState.f135723a;
            Intrinsics.checkNotNullParameter(id3, "id");
            HashMap auxData2 = priorVMState.f135728f;
            Intrinsics.checkNotNullParameter(auxData2, "auxData");
            f1 f1Var2 = f1.PIN_IAB_START;
            z0.d();
            Boolean bool3 = Boolean.FALSE;
            return new l82.c0(priorDisplayState, priorVMState, kotlin.collections.e0.b(a0.a(new zy.a(context2, f1Var2, id3, auxData2, new c1(null, bool3, null, Boolean.TRUE, bool3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, b1Var != null ? z.b(b1Var, id3, Integer.valueOf(i13)) : null), new w0(null, null, null, null, z0.d(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, bool3, null, null, Long.valueOf(j13), null, null, null, null, null, null, null, null), false, false, RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY))));
        }
        if (event instanceof w) {
            h0 h0Var3 = priorDisplayState.f135747g;
            m e14 = m.e(priorDisplayState, null, null, null, null, false, null, null, null, false, 447);
            a0 a0Var3 = (a0) obj;
            h32.i0 context3 = priorVMState.f135729g.f143086a;
            long j14 = h0Var3 != null ? h0Var3.f135736b : 0L;
            long a14 = ((pb0.g) ((pb0.a) this.f135717d)).a();
            i13 = h0Var3 != null ? h0Var3.f135735a : 0;
            a0Var3.getClass();
            Intrinsics.checkNotNullParameter(context3, "context");
            String id4 = priorVMState.f135723a;
            Intrinsics.checkNotNullParameter(id4, "id");
            HashMap auxData3 = priorVMState.f135728f;
            Intrinsics.checkNotNullParameter(auxData3, "auxData");
            f1 f1Var3 = f1.PIN_IAB_DURATION;
            z0.d();
            Boolean bool4 = Boolean.FALSE;
            w0 w0Var = new w0(null, null, null, null, z0.d(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, bool4, null, null, Long.valueOf(a14 - j14), null, null, null, null, null, null, null, null);
            Boolean bool5 = Boolean.TRUE;
            b1 b1Var2 = priorDisplayState.f135746f;
            return new l82.c0(e14, priorVMState, kotlin.collections.e0.b(a0.a(new zy.a(context3, f1Var3, id4, auxData3, new c1(null, bool4, null, bool5, bool4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, b1Var2 != null ? z.b(b1Var2, id4, Integer.valueOf(i13)) : null), w0Var, false, false, RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY))));
        }
        if (event instanceof v) {
            m e15 = m.e(priorDisplayState, null, null, null, null, false, null, null, q0.f80391a, false, 319);
            a0 a0Var4 = (a0) obj;
            h32.i0 context4 = priorVMState.f135729g.f143086a;
            h0 h0Var4 = priorDisplayState.f135747g;
            i13 = h0Var4 != null ? h0Var4.f135735a : 0;
            a0Var4.getClass();
            Intrinsics.checkNotNullParameter(context4, "context");
            String id5 = priorVMState.f135723a;
            Intrinsics.checkNotNullParameter(id5, "id");
            HashMap auxData4 = priorVMState.f135728f;
            Intrinsics.checkNotNullParameter(auxData4, "auxData");
            f1 f1Var4 = f1.PIN_CARTING_MDL_SUCCEEDED;
            Boolean bool6 = Boolean.FALSE;
            Boolean bool7 = Boolean.TRUE;
            b1 b1Var3 = priorDisplayState.f135746f;
            return new l82.c0(e15, priorVMState, kotlin.collections.e0.b(a0.a(new zy.a(context4, f1Var4, id5, auxData4, new c1(null, bool6, null, bool7, bool6, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, b1Var3 != null ? z.b(b1Var3, id5, Integer.valueOf(i13)) : null), null, false, false, RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL))));
        }
        if (event instanceof q) {
            return priorVMState.f135725c != e0.CARTING_INITIAL ? new l82.c0(priorDisplayState, priorVMState, q0.f80391a) : new l82.c0(m.e(priorDisplayState, null, null, null, null, false, null, null, kotlin.collections.e0.b(h.f135732c), false, 383), g0.b(priorVMState, e0.CARTING_LOADING, 0L, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL), q0.f80391a);
        }
        if (event instanceof t) {
            t tVar = (t) event;
            m e16 = m.e(priorDisplayState, null, null, null, null, false, tVar.f135759b, null, kotlin.collections.e0.b(new k(tVar.f135759b)), false, 351);
            g0 b13 = g0.b(priorVMState, e0.CARTING_SUCCESS, tVar.f135758a, RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE);
            h32.i0 i0Var2 = priorVMState.f135729g.f143086a;
            ((a0) obj).getClass();
            return new l82.c0(e16, b13, kotlin.collections.e0.b(a0.b(i0Var2, priorVMState.f135723a, priorVMState.f135728f, tVar.f135759b)));
        }
        if (event instanceof r) {
            r rVar = (r) event;
            m e17 = m.e(priorDisplayState, null, null, null, null, false, rVar.f135755a, null, kotlin.collections.e0.b(h.f135733d), false, 351);
            g0 b14 = g0.b(priorVMState, e0.CARTING_EMPTY, 0L, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL);
            a0 a0Var5 = (a0) obj;
            h32.i0 context5 = priorVMState.f135729g.f143086a;
            a0Var5.getClass();
            Intrinsics.checkNotNullParameter(context5, "context");
            String pinUid2 = priorVMState.f135723a;
            Intrinsics.checkNotNullParameter(pinUid2, "id");
            HashMap auxData5 = priorVMState.f135728f;
            Intrinsics.checkNotNullParameter(auxData5, "auxData");
            c b15 = a0.b(context5, pinUid2, auxData5, rVar.f135755a);
            k80.a aVar2 = a0Var5.f135697a;
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(pinUid2, "pinUid");
            if (aVar2.a()) {
                wr.c.a(aVar2.f78589a, new AdsCartingJsonLogger$AdsCartingSuccessPayload("no_retailers", pinUid2, null), null, null, 14);
            }
            return new l82.c0(e17, b14, kotlin.collections.e0.b(b15));
        }
        if (!(event instanceof s)) {
            if (event instanceof n) {
                q0 q0Var = q0.f80391a;
                return new l82.c0(m.e(priorDisplayState, null, null, null, null, false, null, null, q0Var, false, 383), priorVMState, q0Var);
            }
            if (Intrinsics.d(event, o.f135751a) || Intrinsics.d(event, o.f135752b)) {
                return new l82.c0(m.e(priorDisplayState, null, null, null, null, false, null, null, kotlin.collections.e0.b(h.f135731b), false, 383), g0.b(priorVMState, !priorDisplayState.f135745e ? e0.CARTING_BROWSER : priorVMState.f135725c, 0L, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL), q0.f80391a);
            }
            throw new NoWhenBranchMatchedException();
        }
        m e18 = m.e(priorDisplayState, null, null, null, null, false, null, null, kotlin.collections.e0.b(h.f135734e), false, 383);
        g0 b16 = g0.b(priorVMState, e0.CARTING_ERROR, 0L, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL);
        a0 a0Var6 = (a0) obj;
        h32.i0 context6 = priorVMState.f135729g.f143086a;
        s sVar2 = (s) event;
        Throwable th3 = sVar2.f135756a;
        a0Var6.getClass();
        Intrinsics.checkNotNullParameter(context6, "context");
        String id6 = priorVMState.f135723a;
        Intrinsics.checkNotNullParameter(id6, "id");
        HashMap auxData6 = priorVMState.f135728f;
        Intrinsics.checkNotNullParameter(auxData6, "auxData");
        Integer num = sVar2.f135757b;
        if (num != null) {
            Boolean bool8 = Boolean.FALSE;
            c1Var = new c1(null, bool8, null, Boolean.TRUE, bool8, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new b32.b(null, null, null, null, null, null, Short.valueOf((short) num.intValue()), null));
        } else {
            c1Var = null;
        }
        c a15 = a0.a(new zy.a(context6, f1.PIN_CARTING_API_FAILURE, id6, auxData6, c1Var, null, false, false, RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL));
        if (th3 == null || (failReason = th3.getMessage()) == null) {
            failReason = "unknown_error";
        }
        String num2 = num != null ? num.toString() : null;
        k80.a aVar3 = a0Var6.f135697a;
        aVar3.getClass();
        Intrinsics.checkNotNullParameter(failReason, "failReason");
        if (aVar3.a()) {
            wr.c.a(aVar3.f78589a, new AdsCartingJsonLogger$AdsCartingErrorPayload("carting_api_error", failReason, num2), null, null, 14);
        }
        return new l82.c0(e18, b16, kotlin.collections.e0.b(a15));
    }

    @Override // l82.d
    public final l82.c0 c(i0 i0Var) {
        switch (this.f135715b) {
            case 0:
                g0 vmState = (g0) i0Var;
                Intrinsics.checkNotNullParameter(vmState, "vmState");
                return new l82.c0(new m(), g0.b(vmState, e0.CARTING_INITIAL, 0L, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL), q0.f80391a);
            case 1:
                return h((pu.x) i0Var);
            case 2:
                tu.c0 vmState2 = (tu.c0) i0Var;
                Intrinsics.checkNotNullParameter(vmState2, "vmState");
                return new l82.c0(new tu.g(), vmState2, q0.f80391a);
            default:
                ga1.w vmState3 = (ga1.w) i0Var;
                Intrinsics.checkNotNullParameter(vmState3, "vmState");
                return new l82.c0(new ga1.a(new zy.a0(), true, null, ((m3) this.f135717d).b() ? new k0(x0.next) : new k0(x0.done)), vmState3, kotlin.collections.e0.b(ga1.r.f64651a));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v50, types: [pu.b0] */
    @Override // l82.d
    public final l82.c0 f(u50.s sVar, u50.o oVar, i0 i0Var, l82.e resultBuilder) {
        String str;
        l82.c0 c0Var;
        List list;
        int i13 = this.f135715b;
        Object obj = this.f135717d;
        Object obj2 = this.f135716c;
        switch (i13) {
            case 0:
                return l(sVar, oVar, i0Var, resultBuilder);
            case 1:
                pu.r event = (pu.r) sVar;
                pu.a priorDisplayState = (pu.a) oVar;
                pu.x priorVMState = (pu.x) i0Var;
                Intrinsics.checkNotNullParameter(event, "event");
                Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
                Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                boolean z13 = event instanceof pu.q;
                pu.y yVar = pu.y.f101380d;
                if (z13) {
                    pu.q qVar = (pu.q) event;
                    l82.c0 e13 = ((l82.d) obj).e(qVar.f101368a, priorDisplayState.f101329b, priorVMState.f101374b);
                    tu.g gVar = (tu.g) e13.f82212a;
                    tu.c0 c0Var2 = (tu.c0) e13.f82213b;
                    pu.y yVar2 = qVar.f101368a instanceof tu.m ? yVar : priorVMState.f101376d;
                    pu.a e14 = pu.a.e(priorDisplayState, null, gVar, null, 5);
                    pu.x b13 = pu.x.b(priorVMState, null, c0Var2, null, yVar2, 5);
                    List list2 = e13.f82214c;
                    ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new pu.v((tu.b0) it.next()));
                    }
                    return new l82.c0(e14, b13, arrayList);
                }
                if (event instanceof pu.k) {
                    q0 q0Var = q0.f80391a;
                    return new l82.c0(pu.a.e(priorDisplayState, null, null, q0Var, 3), priorVMState, q0Var);
                }
                if (event instanceof pu.p) {
                    mu.m mVar = ((pu.p) event).f101367a;
                    if (!(mVar instanceof mu.k)) {
                        l82.c0 e15 = ((l82.d) obj2).e(mVar, priorDisplayState.f101328a, priorVMState.f101373a);
                        mu.a aVar = (mu.a) e15.f82212a;
                        mu.x xVar = (mu.x) e15.f82213b;
                        pu.a e16 = pu.a.e(priorDisplayState, aVar, null, null, 6);
                        pu.x b14 = pu.x.b(priorVMState, xVar, null, null, null, 14);
                        List list3 = e15.f82214c;
                        ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(list3, 10));
                        Iterator it2 = list3.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(new pu.u((mu.v) it2.next()));
                        }
                        return new l82.c0(e16, b14, arrayList2);
                    }
                    mu.k kVar = (mu.k) mVar;
                    l82.c0 e17 = ((l82.d) obj2).e(kVar, priorDisplayState.f101328a, priorVMState.f101373a);
                    mu.a baseDisplayState = (mu.a) e17.f82212a;
                    mu.x xVar2 = (mu.x) e17.f82213b;
                    List list4 = xVar2.f88254c;
                    int i14 = xVar2.f88255d;
                    mu.y yVar3 = (mu.y) CollectionsKt.U(i14, list4);
                    l82.c0 e18 = ((l82.d) obj).e(new tu.s(new tu.u(kVar.f88209a), yVar3 != null ? yVar3.f88265f : null), priorDisplayState.f101329b, priorVMState.f101374b);
                    tu.g adsWebBrowserDisplayState = (tu.g) e18.f82212a;
                    tu.c0 c0Var3 = (tu.c0) e18.f82213b;
                    List scrollingModuleActions = kotlin.collections.f0.j(m0.f101364a, new l0(i14));
                    Intrinsics.checkNotNullParameter(baseDisplayState, "baseDisplayState");
                    Intrinsics.checkNotNullParameter(adsWebBrowserDisplayState, "adsWebBrowserDisplayState");
                    Intrinsics.checkNotNullParameter(scrollingModuleActions, "scrollingModuleActions");
                    pu.a aVar2 = new pu.a(baseDisplayState, adsWebBrowserDisplayState, scrollingModuleActions);
                    pu.x b15 = pu.x.b(priorVMState, xVar2, c0Var3, null, null, 12);
                    List list5 = e17.f82214c;
                    ArrayList arrayList3 = new ArrayList(kotlin.collections.g0.q(list5, 10));
                    Iterator it3 = list5.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new pu.u((mu.v) it3.next()));
                    }
                    List list6 = e18.f82214c;
                    ArrayList arrayList4 = new ArrayList(kotlin.collections.g0.q(list6, 10));
                    Iterator it4 = list6.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(new pu.v((tu.b0) it4.next()));
                    }
                    return new l82.c0(aVar2, b15, CollectionsKt.l0(arrayList4, arrayList3));
                }
                if (event instanceof pu.e) {
                    if (Intrinsics.d(priorVMState.f101375c, pu.y.f101378b)) {
                        return ((pu.e) event).f101340a ? new l82.c0(pu.a.e(priorDisplayState, null, tu.g.e(priorDisplayState.f101329b, null, kotlin.collections.e0.b(tu.b.f119267a), 1), null, 5), priorVMState, q0.f80391a) : new l82.c0(priorDisplayState, priorVMState);
                    }
                    l82.c0 e19 = ((l82.d) obj2).e(mu.f.f88200a, priorDisplayState.f101328a, priorVMState.f101373a);
                    mu.a aVar3 = (mu.a) e19.f82212a;
                    mu.x xVar3 = (mu.x) e19.f82213b;
                    pu.a e23 = pu.a.e(priorDisplayState, aVar3, null, null, 6);
                    pu.x b16 = pu.x.b(priorVMState, xVar3, null, null, null, 14);
                    List list7 = e19.f82214c;
                    ArrayList arrayList5 = new ArrayList(kotlin.collections.g0.q(list7, 10));
                    Iterator it5 = list7.iterator();
                    while (it5.hasNext()) {
                        arrayList5.add(new pu.u((mu.v) it5.next()));
                    }
                    return new l82.c0(e23, b16, arrayList5);
                }
                if (event instanceof pu.l) {
                    return new l82.c0(priorDisplayState, priorVMState, kotlin.collections.e0.b(new pu.s(priorVMState.f101373a.f88252a.getPinId())));
                }
                if (event instanceof pu.j) {
                    l82.c0 e24 = ((l82.d) obj2).e(new mu.g(((pu.j) event).f101355a), priorDisplayState.f101328a, priorVMState.f101373a);
                    mu.a aVar4 = (mu.a) e24.f82212a;
                    mu.x xVar4 = (mu.x) e24.f82213b;
                    pu.a e25 = pu.a.e(priorDisplayState, aVar4, null, null, 6);
                    pu.x b17 = pu.x.b(priorVMState, xVar4, null, null, null, 14);
                    List list8 = e24.f82214c;
                    ArrayList arrayList6 = new ArrayList(kotlin.collections.g0.q(list8, 10));
                    Iterator it6 = list8.iterator();
                    while (it6.hasNext()) {
                        arrayList6.add(new pu.u((mu.v) it6.next()));
                    }
                    return new l82.c0(e25, b17, CollectionsKt.m0(pu.t.f101370a, arrayList6));
                }
                boolean z14 = event instanceof pu.f;
                pu.y yVar4 = pu.y.f101377a;
                if (z14) {
                    l82.c0 e26 = ((l82.d) obj).e(new tu.m(((pu.f) event).f101343a, priorVMState.f101373a.f88256e.f143086a), priorDisplayState.f101329b, priorVMState.f101374b);
                    tu.g gVar2 = (tu.g) e26.f82212a;
                    tu.c0 c0Var4 = (tu.c0) e26.f82213b;
                    pu.a e27 = pu.a.e(priorDisplayState, null, gVar2, null, 5);
                    pu.x b18 = pu.x.b(priorVMState, null, c0Var4, yVar4, null, 9);
                    List list9 = e26.f82214c;
                    ArrayList arrayList7 = new ArrayList(kotlin.collections.g0.q(list9, 10));
                    Iterator it7 = list9.iterator();
                    while (it7.hasNext()) {
                        arrayList7.add(new pu.v((tu.b0) it7.next()));
                    }
                    return new l82.c0(e27, b18, arrayList7);
                }
                if (event instanceof pu.g) {
                    return i(priorDisplayState, priorVMState, pu.a0.IAB);
                }
                boolean z15 = event instanceof pu.b;
                pu.y yVar5 = pu.y.f101379c;
                if (z15 || (event instanceof pu.o)) {
                    if (priorVMState.f101373a.f88258g && Intrinsics.d(priorVMState.f101376d, yVar)) {
                        return j(priorDisplayState, priorVMState, pu.a0.CCT, null, false);
                    }
                    if (Intrinsics.d(priorVMState.f101375c, yVar4)) {
                        return j(priorDisplayState, priorVMState, pu.a0.IAB, null, false);
                    }
                    l82.d.a("user attempting to interact with UI when web browser is already open");
                    return new l82.c0(priorDisplayState, pu.x.b(priorVMState, null, null, yVar5, null, 11));
                }
                if (event instanceof pu.i) {
                    return i(priorDisplayState, priorVMState, pu.a0.CCT);
                }
                if (event instanceof pu.h) {
                    return new l82.c0(priorDisplayState, pu.x.b(priorVMState, null, null, null, yVar, 7));
                }
                if (event instanceof pu.c) {
                    return k(new tu.j(((pu.c) event).f101332a, priorVMState.f101373a.f88256e.f143086a), priorDisplayState, priorVMState);
                }
                if (event instanceof pu.d) {
                    return k(new tu.k(priorVMState.f101373a.f88256e.f143086a), priorDisplayState, priorVMState);
                }
                if (event instanceof pu.n) {
                    return k(new tu.r(((pu.n) event).f101365a, priorVMState.f101373a.f88256e.f143086a), priorDisplayState, priorVMState);
                }
                if (!(event instanceof pu.m)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (priorVMState.f101373a.f88258g && Intrinsics.d(priorVMState.f101376d, yVar)) {
                    return j(priorDisplayState, priorVMState, pu.a0.CCT, ((pu.m) event).f101363a, true);
                }
                if (Intrinsics.d(priorVMState.f101375c, yVar4)) {
                    return j(priorDisplayState, priorVMState, pu.a0.IAB, ((pu.m) event).f101363a, true);
                }
                l82.d.a("user attempting to interact with UI when web browser is already open");
                return new l82.c0(priorDisplayState, pu.x.b(priorVMState, null, null, yVar5, null, 11));
            case 2:
                tu.t event2 = (tu.t) sVar;
                tu.g priorDisplayState2 = (tu.g) oVar;
                tu.c0 priorVMState2 = (tu.c0) i0Var;
                Intrinsics.checkNotNullParameter(event2, "event");
                Intrinsics.checkNotNullParameter(priorDisplayState2, "priorDisplayState");
                Intrinsics.checkNotNullParameter(priorVMState2, "priorVMState");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                if (event2 instanceof tu.l) {
                    if (((tu.l) event2).f119294a) {
                        tu.w wVar = priorVMState2.f119270a;
                        Intrinsics.g(wVar, "null cannot be cast to non-null type com.pinterest.ads.feature.owc.view.sba.core.webbrowser.AdsWebBrowserPinData.LoadedPin");
                        list = kotlin.collections.e0.b(new tu.y(((tu.u) wVar).f119310a));
                    } else {
                        list = q0.f80391a;
                    }
                    return new l82.c0(priorDisplayState2, priorVMState2, list);
                }
                if (event2 instanceof tu.o) {
                    return new l82.c0(priorDisplayState2, priorVMState2, kotlin.collections.e0.b(tu.x.f119311a));
                }
                if (event2 instanceof tu.h) {
                    q0 q0Var2 = q0.f80391a;
                    return new l82.c0(tu.g.e(priorDisplayState2, null, q0Var2, 1), priorVMState2, q0Var2);
                }
                if (event2 instanceof tu.i) {
                    return new l82.c0(tu.g.e(priorDisplayState2, null, kotlin.collections.e0.b(new tu.e(((tu.i) event2).f119290a)), 1), priorVMState2, q0.f80391a);
                }
                if (event2 instanceof tu.r) {
                    return new l82.c0(priorDisplayState2, tu.c0.b(priorVMState2, null, null, false, ((tu.r) event2).f119306a, false, RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL));
                }
                if (event2 instanceof tu.j) {
                    tu.j jVar = (tu.j) event2;
                    h32.i0 i0Var2 = jVar.f119292b;
                    tu.w wVar2 = priorVMState2.f119270a;
                    Intrinsics.g(wVar2, "null cannot be cast to non-null type com.pinterest.ads.feature.owc.view.sba.core.webbrowser.AdsWebBrowserPinData.LoadedPin");
                    return new l82.c0(priorDisplayState2, tu.c0.b(priorVMState2, null, null, false, 0L, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL), kotlin.collections.e0.b(g(i0Var2, ((tu.u) wVar2).f119310a, jVar.f119291a - priorVMState2.f119273d)));
                }
                if (event2 instanceof tu.k) {
                    return new l82.c0(priorDisplayState2, tu.c0.b(priorVMState2, null, null, false, 0L, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL));
                }
                if (event2 instanceof tu.s) {
                    tu.s sVar2 = (tu.s) event2;
                    tu.w wVar3 = sVar2.f119308a;
                    Intrinsics.g(wVar3, "null cannot be cast to non-null type com.pinterest.ads.feature.owc.view.sba.core.webbrowser.AdsWebBrowserPinData.LoadedPin");
                    return new l82.c0(tu.g.e(priorDisplayState2, null, kotlin.collections.f0.j(new tu.c(((tu.u) wVar3).f119310a), new tu.a()), 1), tu.c0.b(priorVMState2, sVar2.f119308a, sVar2.f119309b, false, 0L, false, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER), q0.f80391a);
                }
                if (event2 instanceof tu.p) {
                    try {
                        str = new URL(((tu.p) event2).f119302a).getHost();
                        Intrinsics.f(str);
                    } catch (MalformedURLException unused) {
                        str = ((tu.p) event2).f119302a;
                    }
                    return new l82.c0(tu.g.e(priorDisplayState2, str, null, 2), priorVMState2, q0.f80391a);
                }
                if (event2 instanceof tu.n) {
                    if (priorVMState2.f119272c) {
                        return new l82.c0(priorDisplayState2, priorVMState2);
                    }
                    tu.n nVar = (tu.n) event2;
                    int i15 = nVar.f119299c;
                    es.a adFormats = (es.a) obj2;
                    ur.a adsDependencies = (ur.a) obj;
                    tu.w wVar4 = priorVMState2.f119270a;
                    Intrinsics.g(wVar4, "null cannot be cast to non-null type com.pinterest.ads.feature.owc.view.sba.core.webbrowser.AdsWebBrowserPinData.LoadedPin");
                    f30 pin = ((tu.u) wVar4).f119310a;
                    HashMap H = el.a.H(pin, adFormats, adsDependencies);
                    c1 M = el.a.M(i15, i15, pin);
                    ArrayList arrayList8 = new ArrayList();
                    h32.i0 loggingContext = nVar.f119297a;
                    Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
                    Intrinsics.checkNotNullParameter(pin, "pin");
                    Intrinsics.checkNotNullParameter(adFormats, "adFormats");
                    Intrinsics.checkNotNullParameter(adsDependencies, "adsDependencies");
                    Pair pair = new Pair("click_type", "clickthrough");
                    nq.b bVar = nq.b.CLICK;
                    HashMap f13 = z0.f(pair, new Pair("closeup_navigation_type", bVar.getType()), new Pair("is_cct_enabled", String.valueOf(nVar.f119298b)));
                    if (((es.c) adFormats).K(pin)) {
                        String f03 = com.bumptech.glide.d.f0(pin);
                        if (f03 == null) {
                            f03 = "";
                        }
                        f13.put(SbaPinRep.AUXDATA_LEADAD_FORM_ID, f03);
                        f13.put(SbaPinRep.AUXDATA_IS_LEAD_AD, SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE);
                    }
                    ((vr.b) ((ur.b) adsDependencies).f123059b).c(pin, f13);
                    f13.put("is_third_party_ad", String.valueOf(pin.i5().booleanValue()));
                    arrayList8.add(new zy.a(loggingContext, f1.PIN_CLICK, pin.getUid(), f13, null, null, false, true, RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER));
                    arrayList8.add(new zy.a(loggingContext, f1.TAP, pin.getUid(), H, el.a.M(i15, i15, pin), null, false, false, RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL));
                    if (priorVMState2.f119276g) {
                        f1 f1Var = f1.VIEW_WEBSITE_100;
                        String uid = pin.getUid();
                        H.put("closeup_navigation_type", bVar.getType());
                        H.put("pin_is_promoted", "true");
                        arrayList8.add(new zy.a(loggingContext, f1Var, uid, H, M, null, false, false, RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL));
                        f1 f1Var2 = f1.DESTINATION_VIEW;
                        String uid2 = pin.getUid();
                        H.put("click_type", "clickthrough");
                        arrayList8.add(new zy.a(loggingContext, f1Var2, uid2, H, M, null, false, false, RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL));
                        arrayList8.add(new zy.a(loggingContext, f1.VIEW_WEBSITE_ONE_PIXEL, pin.getUid(), H, M, null, false, false, RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL));
                    }
                    ArrayList arrayList9 = new ArrayList(kotlin.collections.g0.q(arrayList8, 10));
                    Iterator it8 = arrayList8.iterator();
                    while (it8.hasNext()) {
                        arrayList9.add(new tu.a0(new zy.e0((zy.a) it8.next())));
                    }
                    c0Var = new l82.c0(priorDisplayState2, tu.c0.b(priorVMState2, null, null, false, 0L, false, 63), CollectionsKt.l0(arrayList9, kotlin.collections.e0.b(new tu.z(pin))));
                } else {
                    if (!(event2 instanceof tu.m)) {
                        if (!(event2 instanceof tu.q)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        tu.q qVar2 = (tu.q) event2;
                        String str2 = qVar2.f119304b;
                        if (str2 == null && (str2 = priorVMState2.f119271b) == null) {
                            str2 = "";
                        }
                        return new l82.c0(tu.g.e(priorDisplayState2, null, kotlin.collections.e0.b(qVar2.f119303a == pu.a0.CCT ? new tu.d(str2, priorVMState2.f119270a.getPinId()) : new tu.e(str2)), 1), tu.c0.b(priorVMState2, null, null, qVar2.f119305c, 0L, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL), q0.f80391a);
                    }
                    tu.m mVar2 = (tu.m) event2;
                    long j13 = mVar2.f119295a - priorVMState2.f119273d;
                    tu.w wVar5 = priorVMState2.f119270a;
                    Intrinsics.g(wVar5, "null cannot be cast to non-null type com.pinterest.ads.feature.owc.view.sba.core.webbrowser.AdsWebBrowserPinData.LoadedPin");
                    c0Var = new l82.c0(priorDisplayState2, priorVMState2, kotlin.collections.e0.b(g(mVar2.f119296b, ((tu.u) wVar5).f119310a, j13)));
                }
                return c0Var;
            default:
                ga1.h event3 = (ga1.h) sVar;
                ga1.a priorDisplayState3 = (ga1.a) oVar;
                ga1.w priorVMState3 = (ga1.w) i0Var;
                Intrinsics.checkNotNullParameter(event3, "event");
                Intrinsics.checkNotNullParameter(priorDisplayState3, "priorDisplayState");
                Intrinsics.checkNotNullParameter(priorVMState3, "priorVMState");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                if (event3 instanceof ga1.f) {
                    l82.c0 e28 = ((l82.d) obj2).e(((ga1.f) event3).f64621a, priorDisplayState3.f64612a, priorVMState3.f64657a);
                    ga1.a e29 = ga1.a.e(priorDisplayState3, (zy.a0) e28.f82212a, false, null, 14);
                    ga1.w b19 = ga1.w.b(priorVMState3, (zy.l0) e28.f82213b, null, 2);
                    List list10 = e28.f82214c;
                    ArrayList arrayList10 = new ArrayList(kotlin.collections.g0.q(list10, 10));
                    Iterator it9 = list10.iterator();
                    while (it9.hasNext()) {
                        arrayList10.add(new ga1.s((zy.k0) it9.next()));
                    }
                    return new l82.c0(e29, b19, arrayList10);
                }
                if (event3 instanceof ga1.g) {
                    return new l82.c0(ga1.a.e(priorDisplayState3, null, false, ((ga1.g) event3).f64622a, 9), priorVMState3, q0.f80391a);
                }
                if (!(event3 instanceof ga1.b)) {
                    if (event3 instanceof ga1.d) {
                        return new l82.c0(ga1.a.e(priorDisplayState3, null, false, null, 13), priorVMState3, q0.f80391a);
                    }
                    if (event3 instanceof ga1.e) {
                        return new l82.c0(ga1.a.e(priorDisplayState3, null, false, null, 13), priorVMState3, kotlin.collections.e0.b(new ga1.t(new k92.n(new k92.c(new k0(x0.generic_error), null, null, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL), null))));
                    }
                    if (event3 instanceof ga1.c) {
                        return new l82.c0(priorDisplayState3, ga1.w.b(priorVMState3, null, ((ga1.c) event3).f64618a, 1));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                ga1.b bVar2 = (ga1.b) event3;
                ga1.a e33 = ga1.a.e(priorDisplayState3, null, true, null, 13);
                ga1.v[] vVarArr = new ga1.v[2];
                h32.i0 i0Var3 = priorVMState3.f64657a.f143086a;
                f1 f1Var3 = f1.TAP;
                HashMap o13 = ep.b.o("action", "done");
                Boolean bool = bVar2.f64617b;
                if (bool != null) {
                }
                e82.u uVar = priorVMState3.f64658b;
                if (uVar != null) {
                    o13.put("backfill_option", uVar.getApiParam());
                }
                Unit unit = Unit.f80348a;
                vVarArr[0] = new ga1.s(new zy.e0(new zy.a(i0Var3, f1Var3, null, o13, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION)));
                vVarArr[1] = new ga1.u(bVar2.f64616a, bVar2.f64617b, uVar);
                return new l82.c0(e33, priorVMState3, kotlin.collections.f0.j(vVarArr));
        }
    }

    public final tu.a0 g(h32.i0 i0Var, f30 f30Var, long j13) {
        f1 f1Var = f1.PIN_IAB_DURATION;
        String uid = f30Var.getUid();
        HashMap H = el.a.H(f30Var, (es.a) this.f135716c, (ur.a) this.f135717d);
        c1 M = el.a.M(0, 0, f30Var);
        z0.d();
        return new tu.a0(new zy.e0(new zy.a(i0Var, f1Var, uid, H, M, new w0(null, null, null, null, z0.d(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.FALSE, null, null, Long.valueOf(j13), null, null, null, null, null, null, null, null), false, false, RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY)));
    }

    public final l82.c0 h(pu.x vmState) {
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        l82.c0 c13 = ((l82.d) this.f135716c).c(vmState.f101373a);
        pu.a aVar = new pu.a();
        List list = c13.f82214c;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new pu.u((mu.v) it.next()));
        }
        return new l82.c0(aVar, vmState, arrayList);
    }

    public final l82.c0 i(pu.a aVar, pu.x xVar, pu.a0 a0Var) {
        l82.d dVar = (l82.d) this.f135717d;
        mu.x xVar2 = xVar.f101373a;
        l82.c0 e13 = dVar.e(new tu.n(xVar2.f88256e.f143086a, xVar2.f88258g, xVar2.f88255d, a0Var), aVar.f101329b, xVar.f101374b);
        tu.g gVar = (tu.g) e13.f82212a;
        tu.c0 c0Var = (tu.c0) e13.f82213b;
        pu.b0 b0Var = a0Var == pu.a0.CCT ? pu.y.f101382f : xVar.f101376d;
        pu.z zVar = a0Var == pu.a0.IAB ? pu.y.f101378b : xVar.f101375c;
        pu.a e14 = pu.a.e(aVar, null, gVar, null, 5);
        pu.x b13 = pu.x.b(xVar, null, c0Var, zVar, b0Var, 1);
        List list = e13.f82214c;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new pu.v((tu.b0) it.next()));
        }
        return new l82.c0(e14, b13, arrayList);
    }

    public final l82.c0 j(pu.a aVar, pu.x xVar, pu.a0 a0Var, String str, boolean z13) {
        l82.c0 e13 = ((l82.d) this.f135717d).e(new tu.q(a0Var, str, z13), aVar.f101329b, xVar.f101374b);
        tu.g gVar = (tu.g) e13.f82212a;
        tu.c0 c0Var = (tu.c0) e13.f82213b;
        pu.b0 b0Var = a0Var == pu.a0.CCT ? pu.y.f101381e : xVar.f101376d;
        pu.a e14 = pu.a.e(aVar, null, gVar, null, 5);
        pu.x b13 = pu.x.b(xVar, null, c0Var, null, b0Var, 5);
        List list = e13.f82214c;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new pu.v((tu.b0) it.next()));
        }
        return new l82.c0(e14, b13, arrayList);
    }

    public final l82.c0 k(tu.t tVar, pu.a aVar, pu.x xVar) {
        l82.c0 e13 = ((l82.d) this.f135717d).e(tVar, aVar.f101329b, xVar.f101374b);
        tu.g gVar = (tu.g) e13.f82212a;
        tu.c0 c0Var = (tu.c0) e13.f82213b;
        pu.a e14 = pu.a.e(aVar, null, gVar, null, 5);
        pu.x b13 = pu.x.b(xVar, null, c0Var, null, null, 13);
        List list = e13.f82214c;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new pu.v((tu.b0) it.next()));
        }
        return new l82.c0(e14, b13, arrayList);
    }

    public f0(lt.j pinalyticsStateTransformer, m3 experiments) {
        Intrinsics.checkNotNullParameter(pinalyticsStateTransformer, "pinalyticsStateTransformer");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f135716c = pinalyticsStateTransformer;
        this.f135717d = experiments;
    }

    public f0(mu.w baseEventHandler, f0 webBrowserEventHandler) {
        Intrinsics.checkNotNullParameter(baseEventHandler, "baseEventHandler");
        Intrinsics.checkNotNullParameter(webBrowserEventHandler, "webBrowserEventHandler");
        this.f135716c = baseEventHandler;
        this.f135717d = webBrowserEventHandler;
    }

    public f0(a0 cartingBottomSheetLogger, pb0.a clock) {
        Intrinsics.checkNotNullParameter(cartingBottomSheetLogger, "cartingBottomSheetLogger");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f135716c = cartingBottomSheetLogger;
        this.f135717d = clock;
    }
}
