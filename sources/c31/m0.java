package c31;

import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import o82.u0;
import o82.y0;

/* loaded from: classes5.dex */
public final class m0 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final l82.d f25595b;

    /* renamed from: c, reason: collision with root package name */
    public final l82.d f25596c;

    /* renamed from: d, reason: collision with root package name */
    public final l82.d f25597d;

    /* renamed from: e, reason: collision with root package name */
    public final l82.h0 f25598e;

    public m0(f31.l0 searchBarTransformer, o82.i0 listTransformer, lt.j pinalyticsTransformer, lt.j impressionStateTransformer) {
        Intrinsics.checkNotNullParameter(searchBarTransformer, "searchBarTransformer");
        Intrinsics.checkNotNullParameter(listTransformer, "listTransformer");
        Intrinsics.checkNotNullParameter(pinalyticsTransformer, "pinalyticsTransformer");
        Intrinsics.checkNotNullParameter(impressionStateTransformer, "impressionStateTransformer");
        this.f25595b = searchBarTransformer;
        this.f25596c = listTransformer;
        this.f25597d = pinalyticsTransformer;
        this.f25598e = b(impressionStateTransformer, new kotlin.jvm.internal.d0() { // from class: c31.j0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((a) obj).f25568g;
            }
        }, new kotlin.jvm.internal.d0() { // from class: c31.k0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((n0) obj).f25607f;
            }
        }, l0.f25592i);
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        n0 vmState = (n0) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        l82.c0 c13 = this.f25597d.c(vmState.f25607f);
        l82.c0 c14 = this.f25595b.c(new f31.m0(vmState.f25603b, false, null, (zy.l0) c13.f82213b, 6));
        l82.c0 c15 = this.f25596c.c(vmState.f25606e);
        ArrayList l13 = kotlin.collections.f0.l(new c0(vmState.f25603b), new f0());
        List list = c15.f82214c;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b0((o82.h0) it.next()));
        }
        l13.addAll(arrayList);
        List list2 = c14.f82214c;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new h0((f31.k0) it2.next()));
        }
        l13.addAll(arrayList2);
        List list3 = c13.f82214c;
        ArrayList arrayList3 = new ArrayList(kotlin.collections.g0.q(list3, 10));
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(new a0((zy.k0) it3.next()));
        }
        l13.addAll(arrayList3);
        return new l82.c0(new a((f31.j) c14.f82212a, (o82.a0) c15.f82212a, (zy.a0) c13.f82212a, 83), n0.b(vmState, (f31.m0) c14.f82213b, (o82.j0) c15.f82213b, (zy.l0) c13.f82213b, 7), l13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v11, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r14v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v13, types: [java.util.ArrayList] */
    @Override // l82.d
    public final l82.c0 f(u50.s sVar, u50.o oVar, l82.i0 i0Var, l82.e resultBuilder) {
        ?? r14;
        List list;
        a e13;
        m60.y yVar;
        j event = (j) sVar;
        a priorDisplayState = (a) oVar;
        n0 priorVMState = (n0) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (event instanceof b) {
            return new l82.c0(priorDisplayState, priorVMState, kotlin.collections.e0.b(new g0()));
        }
        if (event instanceof i) {
            l82.c0 e14 = this.f25595b.e(((i) event).f25584a, priorDisplayState.f25564c, priorVMState.f25605d);
            f31.j jVar = (f31.j) e14.f82212a;
            f31.m0 m0Var = (f31.m0) e14.f82213b;
            b22.l lVar = m0Var.f61022c.f78339b;
            if (lVar != priorVMState.f25605d.f61022c.f78339b) {
                Intrinsics.checkNotNullParameter(lVar, "<this>");
                int i13 = k51.f.f78320a[lVar.ordinal()];
                if (i13 == 1) {
                    yVar = m60.y.WIDE;
                } else if (i13 == 2) {
                    yVar = m60.y.REGULAR;
                } else {
                    if (i13 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    yVar = m60.y.COMPACT;
                }
                e13 = a.e(priorDisplayState, priorVMState.f25604c.a(yVar), m0Var.f61022c.f78339b, jVar, null, null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL);
            } else {
                e13 = a.e(priorDisplayState, 0, null, jVar, null, null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL);
            }
            n0 b13 = n0.b(priorVMState, m0Var, null, null, 55);
            List list2 = e14.f82214c;
            ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new h0((f31.k0) it.next()));
            }
            return new l82.c0(e13, b13, arrayList);
        }
        if (event instanceof d) {
            List list3 = priorDisplayState.f25565d.f93524a;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list3) {
                if (obj instanceof y0) {
                    arrayList2.add(obj);
                }
            }
            y0 y0Var = (y0) CollectionsKt.firstOrNull(arrayList2);
            if (y0Var == null || (list = y0Var.f93756a) == null) {
                r14 = q0.f80391a;
            } else {
                List list4 = list;
                r14 = new ArrayList(kotlin.collections.g0.q(list4, 10));
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    r14.add(((h31.f) ((u0) it2.next()).f93721a).f66811a);
                }
            }
            f30 f30Var = ((d) event).f25574a;
            zy.l0 l0Var = priorVMState.f25607f;
            return new l82.c0(priorDisplayState, priorVMState, kotlin.collections.e0.b(new d0(f30Var, r14, l0Var.f143086a, l0Var.f143087b)));
        }
        if (event instanceof c) {
            l82.c0 e15 = this.f25596c.e(((c) event).f25572a, priorDisplayState.f25565d, priorVMState.f25606e);
            a e16 = a.e(priorDisplayState, 0, null, null, (o82.a0) e15.f82212a, null, null, RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL);
            n0 b14 = n0.b(priorVMState, null, (o82.j0) e15.f82213b, null, 47);
            List list5 = e15.f82214c;
            ArrayList arrayList3 = new ArrayList(kotlin.collections.g0.q(list5, 10));
            Iterator it3 = list5.iterator();
            while (it3.hasNext()) {
                arrayList3.add(new b0((o82.h0) it3.next()));
            }
            return new l82.c0(e16, b14, arrayList3);
        }
        if (event instanceof e) {
            return new l82.c0(a.e(priorDisplayState, 0, null, null, null, w.f25626c, null, RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE), priorVMState, q0.f80391a);
        }
        if (!(event instanceof h)) {
            if (!(event instanceof g)) {
                throw new NoWhenBranchMatchedException();
            }
            l82.f0 transformation = this.f25598e.c(((g) event).f25581a);
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            Intrinsics.checkNotNullParameter(transformation, "transformation");
            transformation.i(resultBuilder);
            return resultBuilder.e();
        }
        l82.c0 e17 = this.f25597d.e(((h) event).f25582a, priorDisplayState.f25567f, priorVMState.f25607f);
        a e18 = a.e(priorDisplayState, 0, null, null, null, null, (zy.a0) e17.f82212a, 95);
        n0 b15 = n0.b(priorVMState, null, null, (zy.l0) e17.f82213b, 31);
        List list6 = e17.f82214c;
        ArrayList arrayList4 = new ArrayList(kotlin.collections.g0.q(list6, 10));
        Iterator it4 = list6.iterator();
        while (it4.hasNext()) {
            arrayList4.add(new a0((zy.k0) it4.next()));
        }
        return new l82.c0(e18, b15, arrayList4);
    }
}
