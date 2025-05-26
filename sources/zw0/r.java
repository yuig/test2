package zw0;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.kh;
import com.pinterest.api.model.vh;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import l82.c0;
import l82.h0;
import o82.a0;
import o82.i0;
import o82.j0;
import o82.u0;
import zy.e0;

/* loaded from: classes5.dex */
public final class r extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final l82.d f142919b;

    /* renamed from: c, reason: collision with root package name */
    public final h0 f142920c;

    /* renamed from: d, reason: collision with root package name */
    public final h0 f142921d;

    public r(i0 i0Var, lt.j jVar) {
        this.f142919b = i0Var;
        this.f142920c = i0Var != null ? b(i0Var, new d0() { // from class: zw0.p
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((b) obj).f142897b;
            }
        }, new d0() { // from class: zw0.q
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((s) obj).f142924c;
            }
        }, o.f142915k) : null;
        this.f142921d = b(jVar, new d0() { // from class: zw0.m
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((b) obj).f142900e;
            }
        }, new d0() { // from class: zw0.n
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((s) obj).f142926e;
            }
        }, o.f142914j);
    }

    @Override // l82.d
    public final c0 c(l82.i0 i0Var) {
        h0 h0Var;
        a0 a0Var;
        s vmState = (s) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        if (vmState.f142923b) {
            l82.d dVar = this.f142919b;
            c0 c13 = dVar != null ? dVar.c(vmState.f142928g) : null;
            if (c13 == null || (a0Var = (a0) c13.f82212a) == null) {
                a0Var = new a0();
            }
            b bVar = new b(null, null, a0Var, true, 23);
            Intrinsics.f(c13);
            s b13 = s.b(vmState, (j0) c13.f82213b);
            ArrayList arrayList = new ArrayList();
            List list = c13.f82214c;
            ArrayList arrayList2 = new ArrayList(g0.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(new h((o82.h0) it.next()));
            }
            arrayList.addAll(arrayList2);
            Unit unit = Unit.f80348a;
            return new c0(bVar, b13, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        vh vhVar = vmState.f142922a;
        List list2 = vhVar.f42865w;
        Intrinsics.checkNotNullExpressionValue(list2, "getObjects(...)");
        List list3 = list2;
        ArrayList arrayList4 = new ArrayList(g0.q(list3, 10));
        int i13 = 0;
        for (Object obj : list3) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            dl1.s sVar = (dl1.s) obj;
            Intrinsics.g(sVar, "null cannot be cast to non-null type com.pinterest.api.model.Pin");
            f30 f30Var = (f30) sVar;
            kh khVar = vhVar.f42858p;
            arrayList4.add(Boolean.valueOf(arrayList3.add(new t(f30Var, i13, null, khVar != null ? khVar.n() : null, 12))));
            i13 = i14;
        }
        ArrayList arrayList5 = new ArrayList(g0.q(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            t tVar = (t) it2.next();
            String uid = tVar.f142929a.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            arrayList5.add(new u0(tVar, 2024, uid));
        }
        String q13 = vhVar.q();
        Intrinsics.checkNotNullExpressionValue(q13, "getStoryType(...)");
        b bVar2 = new b(arrayList5, q13, null, false, RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER);
        l82.e d2 = l82.d.d(bVar2, vmState);
        if (vmState.f142925d != yw0.n.DROPDOWN || (h0Var = this.f142920c) == null) {
            return new c0(bVar2, vmState, q0.f80391a);
        }
        d2.h(new l(vhVar, 0));
        com.google.firebase.messaging.a0 transformation = h0Var.e();
        Intrinsics.checkNotNullParameter(d2, "<this>");
        Intrinsics.checkNotNullParameter(transformation, "transformation");
        transformation.i(d2);
        return d2.e();
    }

    @Override // l82.d
    public final c0 f(u50.s sVar, u50.o oVar, l82.i0 i0Var, l82.e resultBuilder) {
        h0 h0Var;
        f event = (f) sVar;
        b priorDisplayState = (b) oVar;
        s priorVMState = (s) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (event instanceof d) {
            h0 h0Var2 = this.f142920c;
            if (h0Var2 != null) {
                l82.f0 transformation = h0Var2.c(((d) event).f142905a);
                Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                Intrinsics.checkNotNullParameter(transformation, "transformation");
                transformation.i(resultBuilder);
            }
            resultBuilder.f(new dv0.n(false, 8));
            return resultBuilder.e();
        }
        if (event instanceof c) {
            c cVar = (c) event;
            resultBuilder.d(new g(new e0(f0.h.O(cVar.f142903a, priorVMState.f142922a, priorVMState.f142927f, cVar.f142904b, null))), new g(new e0(new zy.a(cVar.f142903a, f1.DISMISS, null, kh2.d.E(priorVMState.f142922a), null, null, false, false, RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION))), new i());
            return resultBuilder.e();
        }
        if ((event instanceof e) && (h0Var = this.f142921d) != null) {
            l82.f0 transformation2 = h0Var.c(((e) event).f142906a);
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            Intrinsics.checkNotNullParameter(transformation2, "transformation");
            transformation2.i(resultBuilder);
            return resultBuilder.e();
        }
        return resultBuilder.e();
    }
}
