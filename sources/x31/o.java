package x31;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.collections.i1;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import l82.c0;
import l82.h0;
import l82.i0;
import zy.f0;

/* loaded from: classes5.dex */
public final class o extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final h0 f131634b;

    public o(lt.j pinalyticsStateTransformer) {
        Intrinsics.checkNotNullParameter(pinalyticsStateTransformer, "pinalyticsStateTransformer");
        this.f131634b = b(pinalyticsStateTransformer, new d0() { // from class: x31.l
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((c) obj).f131618b;
            }
        }, new d0() { // from class: x31.m
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((p) obj).f131641g;
            }
        }, n.f131633i);
    }

    public static c g(c cVar, p pVar) {
        b bVar = cVar.f131617a;
        u41.a aVar = bVar.f131615a;
        List list = pVar.f131638d;
        ArrayList pills = new ArrayList(g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pills.add(pp2.a.n((a) it.next(), pVar));
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(pills, "pills");
        u41.a filters = new u41.a(pills);
        Intrinsics.checkNotNullParameter(filters, "filters");
        return c.e(cVar, new b(filters, bVar.f131616b), null, 2);
    }

    @Override // l82.d
    public final c0 c(i0 i0Var) {
        p vmState = (p) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        List list = vmState.f131638d;
        ArrayList arrayList = new ArrayList(g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(pp2.a.n((a) it.next(), vmState));
        }
        l82.e resultBuilder = l82.d.d(g(new c(new b(new u41.a(arrayList), 0)), vmState), vmState);
        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
        h0 lens = this.f131634b;
        Intrinsics.checkNotNullParameter(lens, "lens");
        Intrinsics.checkNotNullParameter(lens, "$lens");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        lens.b(resultBuilder);
        return resultBuilder.e();
    }

    @Override // l82.d
    public final c0 f(u50.s sVar, u50.o oVar, i0 i0Var, l82.e resultBuilder) {
        bm1.n nVar;
        g event = (g) sVar;
        c priorDisplayState = (c) oVar;
        p priorVMState = (p) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (event instanceof f) {
            p pVar = (p) resultBuilder.f82219b;
            a k13 = bp1.h.k(pVar, ((f) event).f131622a);
            r a13 = k13.a();
            Map map = pVar.f131640f;
            bm1.n nVar2 = (bm1.n) map.get(a13);
            if (nVar2 == null) {
                nVar2 = bm1.n.UNSELECTED;
            }
            int i13 = i.f131625a[nVar2.ordinal()];
            if (i13 == 1) {
                nVar = bm1.n.SELECTED;
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                nVar = bm1.n.UNSELECTED;
            }
            LinkedHashMap r13 = z0.r(map);
            r13.put(k13.a(), nVar);
            if (pVar.f131635a == t.Single) {
                Iterator it = ph.a.F0(pVar).iterator();
                while (it.hasNext()) {
                    r13.put(((a) it.next()).a(), bm1.n.UNSELECTED);
                }
            }
            p vmState = p.b(pVar, null, null, r13, null, null, 479);
            resultBuilder.h(new j(vmState, 2));
            resultBuilder.f(new k(this, vmState, 1));
            Intrinsics.checkNotNullParameter(k13, "<this>");
            Intrinsics.checkNotNullParameter(vmState, "vmState");
            if (true ^ vmState.f131639e.contains(k13.a())) {
                h32.i0 z03 = com.bumptech.glide.d.z0(vmState.f131641g.f143086a, new j(vmState, 0));
                f1 f1Var = f1.TAP;
                HashMap hashMap = new HashMap();
                s sVar2 = vmState.f131642h;
                hashMap.put(sVar2.f131645b, k13.a().nameForLogging());
                Set F0 = ph.a.F0(vmState);
                ArrayList arrayList = new ArrayList(g0.q(F0, 10));
                Iterator it2 = F0.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((a) it2.next()).a().nameForLogging());
                }
                hashMap.put(sVar2.f131646c, CollectionsKt.Z(CollectionsKt.w0(arrayList), ",", null, null, 0, null, null, 62));
                Unit unit = Unit.f80348a;
                resultBuilder.a(new f0(new zy.a(z03, f1Var, null, hashMap, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION)));
            }
        } else {
            if (!(event instanceof e)) {
                throw new NoWhenBranchMatchedException();
            }
            e eVar = (e) event;
            p pVar2 = (p) resultBuilder.f82219b;
            a k14 = bp1.h.k(pVar2, eVar.f131620a);
            boolean z13 = eVar.f131621b;
            Set set = pVar2.f131639e;
            p b13 = p.b(pVar2, null, z13 ? i1.g(set, k14.a()) : i1.j(set, k14.a()), null, null, null, 495);
            resultBuilder.h(new j(b13, 1));
            resultBuilder.f(new k(this, b13, 0));
        }
        return resultBuilder.e();
    }
}
