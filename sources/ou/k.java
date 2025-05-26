package ou;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import l82.c0;
import l82.i0;
import pu.w;
import pu.x;
import u50.o;
import u50.s;
import xs.f0;

/* loaded from: classes3.dex */
public final class k extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f97695b;

    /* renamed from: c, reason: collision with root package name */
    public final f0 f97696c;

    public k(f0 coreStateTransformer, int i13) {
        this.f97695b = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(coreStateTransformer, "coreStateTransformer");
            this.f97696c = coreStateTransformer;
        } else {
            Intrinsics.checkNotNullParameter(coreStateTransformer, "coreStateTransformer");
            this.f97696c = coreStateTransformer;
        }
    }

    @Override // l82.d
    public final c0 c(i0 i0Var) {
        int i13 = this.f97695b;
        f0 f0Var = this.f97696c;
        switch (i13) {
            case 0:
                m vmState = (m) i0Var;
                Intrinsics.checkNotNullParameter(vmState, "vmState");
                c0 h10 = f0Var.h(vmState.f97699a);
                b bVar = new b(new pu.a());
                List list = h10.f82214c;
                ArrayList arrayList = new ArrayList(g0.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new j((w) it.next()));
                }
                return new c0(bVar, vmState, arrayList);
            default:
                uu.l vmState2 = (uu.l) i0Var;
                Intrinsics.checkNotNullParameter(vmState2, "vmState");
                c0 h13 = f0Var.h(vmState2.f123128a);
                uu.b bVar2 = new uu.b(new pu.a());
                List list2 = h13.f82214c;
                ArrayList arrayList2 = new ArrayList(g0.q(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new uu.j((w) it2.next()));
                }
                return new c0(bVar2, vmState2, arrayList2);
        }
    }

    @Override // l82.d
    public final c0 f(s sVar, o oVar, i0 i0Var, l82.e resultBuilder) {
        int i13 = this.f97695b;
        f0 f0Var = this.f97696c;
        switch (i13) {
            case 0:
                c event = (c) sVar;
                b priorDisplayState = (b) oVar;
                m priorVMState = (m) i0Var;
                Intrinsics.checkNotNullParameter(event, "event");
                Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
                Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                if (!(event instanceof c)) {
                    throw new NoWhenBranchMatchedException();
                }
                c0 e13 = f0Var.e(event.f97684a, priorDisplayState.f97683a, priorVMState.f97699a);
                pu.a adsCoreDisplayState = (pu.a) e13.f82212a;
                Intrinsics.checkNotNullParameter(adsCoreDisplayState, "adsCoreDisplayState");
                b bVar = new b(adsCoreDisplayState);
                x adsCoreVmState = (x) e13.f82213b;
                Intrinsics.checkNotNullParameter(adsCoreVmState, "adsCoreVmState");
                m mVar = new m(adsCoreVmState);
                List list = e13.f82214c;
                ArrayList arrayList = new ArrayList(g0.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new j((w) it.next()));
                }
                return new c0(bVar, mVar, arrayList);
            default:
                uu.c event2 = (uu.c) sVar;
                uu.b priorDisplayState2 = (uu.b) oVar;
                uu.l priorVMState2 = (uu.l) i0Var;
                Intrinsics.checkNotNullParameter(event2, "event");
                Intrinsics.checkNotNullParameter(priorDisplayState2, "priorDisplayState");
                Intrinsics.checkNotNullParameter(priorVMState2, "priorVMState");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                if (!(event2 instanceof uu.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                c0 e14 = f0Var.e(event2.f123115a, priorDisplayState2.f123114a, priorVMState2.f123128a);
                pu.a adsCoreDisplayState2 = (pu.a) e14.f82212a;
                Intrinsics.checkNotNullParameter(adsCoreDisplayState2, "adsCoreDisplayState");
                uu.b bVar2 = new uu.b(adsCoreDisplayState2);
                x adsCoreVmState2 = (x) e14.f82213b;
                Intrinsics.checkNotNullParameter(adsCoreVmState2, "adsCoreVmState");
                uu.l lVar = new uu.l(adsCoreVmState2);
                List list2 = e14.f82214c;
                ArrayList arrayList2 = new ArrayList(g0.q(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new uu.j((w) it2.next()));
                }
                return new c0(bVar2, lVar, arrayList2);
        }
    }
}
