package v21;

import h32.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import zy.k0;
import zy.l0;

/* loaded from: classes5.dex */
public final class a0 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final l82.d f123854b;

    public a0(lt.j pinalyticsTransformer) {
        Intrinsics.checkNotNullParameter(pinalyticsTransformer, "pinalyticsTransformer");
        this.f123854b = pinalyticsTransformer;
    }

    public static i0 g(a0 a0Var, l82.e eVar) {
        a0Var.getClass();
        return ((b0) eVar.f82219b).f123861f.f143086a;
    }

    public static HashMap h(a0 a0Var, l82.e eVar) {
        a0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("pin_or_spin_id", ((b0) eVar.f82219b).f123856a);
        return hashMap;
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        b0 vmState = (b0) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        l82.c0 c13 = this.f123854b.c(vmState.f123861f);
        List list = c13.f82214c;
        ArrayList arrayList = new ArrayList(g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new y((k0) it.next()));
        }
        c cVar = new c((zy.a0) c13.f82212a, 31);
        l0 l0Var = (l0) c13.f82213b;
        b0 b13 = b0.b(vmState, null, null, null, null, null, l0Var, 31);
        i0 i0Var2 = l0Var.f143086a;
        HashMap hashMap = new HashMap();
        hashMap.put("pin_or_spin_id", vmState.f123856a);
        Unit unit = Unit.f80348a;
        return new l82.c0(cVar, b13, CollectionsKt.l0(arrayList, e0.b(new u(i0Var2, hashMap))));
    }

    @Override // l82.d
    public final l82.c0 f(u50.s sVar, u50.o oVar, l82.i0 i0Var, l82.e resultBuilder) {
        h event = (h) sVar;
        c priorDisplayState = (c) oVar;
        b0 priorVMState = (b0) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (event instanceof e) {
            e eVar = (e) event;
            String experienceId = eVar.f123873a;
            zy.a0 pinalyticsDisplayState = priorDisplayState.f123867f;
            Intrinsics.checkNotNullParameter(experienceId, "experienceId");
            String title = eVar.f123874b;
            Intrinsics.checkNotNullParameter(title, "title");
            String subtitle = eVar.f123875c;
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            List pinImageUrls = eVar.f123876d;
            Intrinsics.checkNotNullParameter(pinImageUrls, "pinImageUrls");
            List pinIds = eVar.f123877e;
            Intrinsics.checkNotNullParameter(pinIds, "pinIds");
            Intrinsics.checkNotNullParameter(pinalyticsDisplayState, "pinalyticsDisplayState");
            return new l82.c0(new c(experienceId, title, subtitle, pinImageUrls, pinIds, pinalyticsDisplayState), b0.b(priorVMState, eVar.f123873a, eVar.f123874b, eVar.f123875c, eVar.f123876d, eVar.f123877e, null, 32), q0.f80391a);
        }
        if (event instanceof d) {
            resultBuilder.d(new r(g(this, resultBuilder), h(this, resultBuilder)));
            resultBuilder.d(q.f123895a);
            return resultBuilder.e();
        }
        if (event instanceof g) {
            resultBuilder.d(new t(g(this, resultBuilder), h(this, resultBuilder)));
            g gVar = (g) event;
            resultBuilder.d(new x(gVar.f123879a, gVar.f123880b));
            return resultBuilder.e();
        }
        if (!(event instanceof f)) {
            throw new NoWhenBranchMatchedException();
        }
        resultBuilder.d(new s(g(this, resultBuilder), h(this, resultBuilder)));
        resultBuilder.d(new w(((f) event).f123878a));
        return resultBuilder.e();
    }
}
