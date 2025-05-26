package u21;

import com.pinterest.feature.pinorspin.PinOrSpinFeatureLocation;
import h32.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import zy.k0;
import zy.l0;

/* loaded from: classes5.dex */
public final class b0 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final l82.d f120074b;

    public b0(lt.j pinalyticsTransformer) {
        Intrinsics.checkNotNullParameter(pinalyticsTransformer, "pinalyticsTransformer");
        this.f120074b = pinalyticsTransformer;
    }

    public static i0 g(b0 b0Var, l82.e eVar) {
        b0Var.getClass();
        return ((c0) eVar.f82219b).f120079d.f143086a;
    }

    public static HashMap h(b0 b0Var, l82.e eVar) {
        b0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("pin_or_spin_id", ((c0) eVar.f82219b).f120076a);
        return hashMap;
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        c0 vmState = (c0) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        l82.c0 c13 = this.f120074b.c(vmState.f120079d);
        List list = c13.f82214c;
        ArrayList arrayList = new ArrayList(g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new z((k0) it.next()));
        }
        zy.a0 a0Var = (zy.a0) c13.f82212a;
        String title = vmState.f120077b;
        List imageUrls = vmState.f120078c;
        b bVar = new b(title, imageUrls, a0Var);
        l0 pinalyticsVMState = (l0) c13.f82213b;
        String experienceId = vmState.f120076a;
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        c0 c0Var = new c0(experienceId, title, imageUrls, pinalyticsVMState);
        i0 i0Var2 = pinalyticsVMState.f143086a;
        HashMap hashMap = new HashMap();
        hashMap.put("pin_or_spin_id", experienceId);
        Unit unit = Unit.f80348a;
        return new l82.c0(bVar, c0Var, CollectionsKt.l0(arrayList, e0.b(new v(i0Var2, hashMap))));
    }

    @Override // l82.d
    public final l82.c0 f(u50.s sVar, u50.o oVar, l82.i0 i0Var, l82.e resultBuilder) {
        f event = (f) sVar;
        b priorDisplayState = (b) oVar;
        c0 priorVMState = (c0) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (event instanceof c) {
            return new l82.c0(priorDisplayState, priorVMState, e0.b(new s(new al1.f(f0.j(PinOrSpinFeatureLocation.PIN_OR_SPIN_REWARD, PinOrSpinFeatureLocation.PIN_OR_SPIN_REWARD_PREVIEW, PinOrSpinFeatureLocation.PIN_OR_SPIN_SELECTION)))));
        }
        if (event instanceof d) {
            resultBuilder.d(new t(g(this, resultBuilder), h(this, resultBuilder)));
            resultBuilder.d(new x(((d) event).f120080a));
            return resultBuilder.e();
        }
        if (!(event instanceof e)) {
            throw new NoWhenBranchMatchedException();
        }
        resultBuilder.d(new u(g(this, resultBuilder), h(this, resultBuilder)));
        e eVar = (e) event;
        resultBuilder.d(new y(eVar.f120086a, eVar.f120087b));
        return resultBuilder.e();
    }
}
