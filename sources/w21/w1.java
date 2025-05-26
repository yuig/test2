package w21;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w1 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final l82.d f127854b;

    public w1(lt.j pinalyticsTransformer) {
        Intrinsics.checkNotNullParameter(pinalyticsTransformer, "pinalyticsTransformer");
        this.f127854b = pinalyticsTransformer;
    }

    public static h32.i0 g(w1 w1Var, l82.e eVar) {
        w1Var.getClass();
        return ((x1) eVar.f82219b).f127869f.f143086a;
    }

    public static HashMap h(l82.e eVar, Map map) {
        HashMap hashMap = new HashMap();
        hashMap.put("pin_or_spin_id", ((x1) eVar.f82219b).f127864a);
        hashMap.put("pin_or_spin_current_round", String.valueOf(((x1) eVar.f82219b).f127866c + 1));
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        ArrayList l03;
        x1 vmState = (x1) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        l82.c0 c13 = this.f127854b.c(vmState.f127869f);
        List list = c13.f82214c;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new u1((zy.k0) it.next()));
        }
        m mVar = new m((zy.a0) c13.f82212a, vmState.f127872i, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
        zy.l0 l0Var = (zy.l0) c13.f82213b;
        x1 b13 = x1.b(vmState, 0, null, null, l0Var, 479);
        if (vmState.f127865b) {
            h32.i0 i0Var2 = l0Var.f143086a;
            HashMap hashMap = new HashMap();
            String str = vmState.f127864a;
            hashMap.put("pin_or_spin_id", str);
            Unit unit = Unit.f80348a;
            l03 = CollectionsKt.l0(arrayList, kotlin.collections.f0.j(new p1(i0Var2, hashMap), new s1(str, vmState.f127870g, vmState.f127871h)));
        } else {
            l03 = CollectionsKt.l0(arrayList, kotlin.collections.e0.b(j1.f127724a));
        }
        return new l82.c0(mVar, b13, l03);
    }

    @Override // l82.d
    public final l82.c0 f(u50.s sVar, u50.o oVar, l82.i0 i0Var, l82.e resultBuilder) {
        v event = (v) sVar;
        m priorDisplayState = (m) oVar;
        x1 priorVMState = (x1) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (event instanceof q) {
            q qVar = (q) event;
            return new l82.c0(m.e(priorDisplayState, qVar.f127772b, 0, null, null, false, RecyclerViewTypes.VIEW_TYPE_ICON_AND_TEXT_INLINE_BUBBLE), x1.b(priorVMState, 0, null, null, null, 255), qVar.f127778h ? kotlin.collections.f0.j(new i1(qVar.f127772b, qVar.f127771a, qVar.f127773c, qVar.f127774d, qVar.f127776f, qVar.f127777g, qVar.f127775e, false, priorVMState.f127870g), new f1(qVar.f127773c)) : kotlin.collections.e0.b(new i1(qVar.f127772b, qVar.f127771a, qVar.f127773c, qVar.f127774d, qVar.f127776f, qVar.f127777g, qVar.f127775e, true, priorVMState.f127870g)));
        }
        if (event instanceof r) {
            r rVar = (r) event;
            return new l82.c0(m.e(priorDisplayState, null, rVar.f127785a, rVar.f127786b, rVar.f127787c, true, 405), x1.b(priorVMState, rVar.f127785a, rVar.f127786b, rVar.f127787c, null, 483), kotlin.collections.q0.f80391a);
        }
        if (event instanceof t) {
            resultBuilder.d(new m1(g(this, resultBuilder), h(resultBuilder, null)));
            t tVar = (t) event;
            resultBuilder.d(new t1(tVar.f127810a, tVar.f127811b, priorVMState.f127870g));
            resultBuilder.f(h.f127695n);
            return resultBuilder.e();
        }
        if (event instanceof n) {
            resultBuilder.d(new o1(g(this, resultBuilder), h(resultBuilder, kotlin.collections.y0.b(new Pair("pin_or_spin_already_selected_round", String.valueOf(((n) event).f127753a))))));
            return resultBuilder.e();
        }
        if (event instanceof u) {
            resultBuilder.d(new n1(g(this, resultBuilder), h(resultBuilder, null)));
            resultBuilder.d(new r1(((u) event).f127824a));
            resultBuilder.f(h.f127696o);
            return resultBuilder.e();
        }
        if (event instanceof p) {
            resultBuilder.d(new l1(g(this, resultBuilder), h(resultBuilder, null)));
            resultBuilder.d(g1.f127690a);
            resultBuilder.f(h.f127697p);
            return resultBuilder.e();
        }
        if (event instanceof o) {
            return new l82.c0(priorDisplayState, priorVMState, kotlin.collections.e0.b(new h1(((o) event).f127758a)));
        }
        if (!(event instanceof s)) {
            throw new NoWhenBranchMatchedException();
        }
        s sVar2 = (s) event;
        return new l82.c0(m.e(priorDisplayState, null, 0, null, null, false, 447), priorVMState, kotlin.collections.e0.b(new k1(sVar2.f127795a, sVar2.f127796b, sVar2.f127797c, sVar2.f127798d)));
    }
}
