package f31;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l0 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final k51.e f61018b;

    public l0() {
        k51.e viewOptionsStateTransformer = new k51.e();
        Intrinsics.checkNotNullParameter(viewOptionsStateTransformer, "viewOptionsStateTransformer");
        this.f61018b = viewOptionsStateTransformer;
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        m0 vmState = (m0) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        if (!vmState.f61020a) {
            return new l82.c0(f.f61000a, vmState, q0.f80391a);
        }
        return new l82.c0(new i(e0.t.J0(vmState, true, true), new k51.o((k51.n) null, vmState.f61022c.f78339b, 5), 2), vmState, q0.f80391a);
    }

    @Override // l82.d
    public final l82.c0 f(u50.s sVar, u50.o oVar, l82.i0 i0Var, l82.e resultBuilder) {
        l82.c0 c0Var;
        y event = (y) sVar;
        u50.o priorDisplayState = (j) oVar;
        m0 priorVMState = (m0) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        boolean z13 = event instanceof w;
        f fVar = f.f61000a;
        if (z13) {
            w wVar = (w) event;
            m0 b13 = m0.b(priorVMState, false, k51.v.b(priorVMState.f61022c, null, wVar.f61032a, null, 5), null, 11);
            if (!Intrinsics.d(priorDisplayState, fVar)) {
                if (!(priorDisplayState instanceof i)) {
                    throw new NoWhenBranchMatchedException();
                }
                i iVar = (i) priorDisplayState;
                priorDisplayState = i.e(iVar, e0.t.J0(b13, true, true), null, k51.o.e(iVar.f61014c, wVar.f61032a, null, 5), 2);
            }
            return new l82.c0(priorDisplayState, b13, q0.f80391a);
        }
        if (event instanceof t) {
            return new l82.c0(priorDisplayState, priorVMState, kotlin.collections.f0.j(new g0(priorVMState.f61023d.f143086a), d0.f60997a));
        }
        if (event instanceof u) {
            return new l82.c0(priorDisplayState, priorVMState, kotlin.collections.f0.j(new h0(priorVMState.f61023d.f143086a), e0.f60999a));
        }
        if (event instanceof v) {
            return new l82.c0(priorDisplayState, priorVMState, kotlin.collections.e0.b(new i0(priorVMState.f61023d.f143086a)));
        }
        if (event instanceof x) {
            k51.s sVar2 = ((x) event).f61033a;
            if (priorDisplayState instanceof f) {
                l82.d.a("It should be impossible to select an item from a hidden search bar");
                return new l82.c0(priorDisplayState, priorVMState);
            }
            if (!(priorDisplayState instanceof i)) {
                throw new NoWhenBranchMatchedException();
            }
            i iVar2 = (i) priorDisplayState;
            l82.c0 e13 = this.f61018b.e(sVar2, iVar2.f61014c, priorVMState.f61022c);
            m0 b14 = m0.b(priorVMState, false, (k51.v) e13.f82213b, null, 11);
            i e14 = i.e(iVar2, e0.t.J0(b14, true, true), null, (k51.o) e13.f82212a, 2);
            List list = e13.f82214c;
            ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new j0((k51.m) it.next()));
            }
            return new l82.c0(e14, b14, arrayList);
        }
        if (event instanceof o) {
            return new l82.c0(priorDisplayState, priorVMState, kotlin.collections.f0.j(new f0(priorVMState.f61023d.f143086a), new c0(priorVMState.f61021b)));
        }
        boolean z14 = event instanceof r;
        b0 b0Var = b0.f60993a;
        if (z14) {
            if (Intrinsics.d(priorDisplayState, fVar)) {
                l82.d.a("Cannot launch creation when search bar is hidden");
                return new l82.c0(priorDisplayState, priorVMState);
            }
            if (priorDisplayState instanceof i) {
                return new l82.c0(i.e((i) priorDisplayState, null, e.f60998b, null, 5), priorVMState, kotlin.collections.e0.b(b0Var));
            }
            throw new NoWhenBranchMatchedException();
        }
        if (event instanceof n) {
            if (Intrinsics.d(priorDisplayState, fVar)) {
                l82.d.a("Cannot launch collage creation when search bar is hidden");
                return new l82.c0(priorDisplayState, priorVMState);
            }
            if (priorDisplayState instanceof i) {
                return new l82.c0(i.e((i) priorDisplayState, null, b.f60992b, null, 5), priorVMState, kotlin.collections.e0.b(b0Var));
            }
            throw new NoWhenBranchMatchedException();
        }
        if (event instanceof m) {
            if (Intrinsics.d(priorDisplayState, fVar)) {
                l82.d.a("Cannot launch board creation when search bar is hidden");
                return new l82.c0(priorDisplayState, priorVMState);
            }
            if (priorDisplayState instanceof i) {
                return new l82.c0(i.e((i) priorDisplayState, null, a.f60988b, null, 5), priorVMState, kotlin.collections.e0.b(b0Var));
            }
            throw new NoWhenBranchMatchedException();
        }
        if (event instanceof q) {
            if (Intrinsics.d(priorDisplayState, fVar)) {
                l82.d.a("Cannot launch Creation Menu Action Modal when search bar is hidden");
                return new l82.c0(priorDisplayState, priorVMState);
            }
            if (!(priorDisplayState instanceof i)) {
                throw new NoWhenBranchMatchedException();
            }
            c0Var = new l82.c0(i.e((i) priorDisplayState, null, ((q) event).f61027a, null, 5), priorVMState, q0.f80391a);
        } else {
            if (event instanceof p) {
                if (Intrinsics.d(priorDisplayState, fVar)) {
                    l82.d.a("Cannot close creation menu if it's hidden");
                    return new l82.c0(priorDisplayState, priorVMState);
                }
                if (priorDisplayState instanceof i) {
                    return new l82.c0(i.e((i) priorDisplayState, null, d.f60996b, null, 5), priorVMState, q0.f80391a);
                }
                throw new NoWhenBranchMatchedException();
            }
            if (!(event instanceof l)) {
                throw new NoWhenBranchMatchedException();
            }
            k kVar = event instanceof k ? (k) event : null;
            boolean z15 = kVar != null ? kVar.f61017a : true;
            if (priorDisplayState instanceof f) {
                return new l82.c0(priorDisplayState, priorVMState);
            }
            if (!(priorDisplayState instanceof i)) {
                throw new NoWhenBranchMatchedException();
            }
            c0Var = new l82.c0(i.e((i) priorDisplayState, e0.t.J0(priorVMState, z15, true), null, null, 6), priorVMState, q0.f80391a);
        }
        return c0Var;
    }
}
