package mt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import l82.c0;
import l82.i0;
import nt.u0;
import nt.x0;
import xs.f0;

/* loaded from: classes3.dex */
public final class q extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final f0 f88120b;

    /* renamed from: c, reason: collision with root package name */
    public final l82.d f88121c;

    public q(f0 coreStateTransformer, l82.d bottomSheetStateTransformer) {
        Intrinsics.checkNotNullParameter(coreStateTransformer, "coreStateTransformer");
        Intrinsics.checkNotNullParameter(bottomSheetStateTransformer, "bottomSheetStateTransformer");
        this.f88120b = coreStateTransformer;
        this.f88121c = bottomSheetStateTransformer;
    }

    @Override // l82.d
    public final c0 c(i0 i0Var) {
        r vmState = (r) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        c0 h10 = this.f88120b.h(vmState.f88122a);
        c0 c13 = this.f88121c.c(vmState.f88123b);
        d dVar = new d((nt.v) c13.f82212a, (pu.a) h10.f82212a);
        pu.x coreVMState = (pu.x) h10.f82213b;
        x0 bottomSheetVMState = (x0) c13.f82213b;
        Intrinsics.checkNotNullParameter(coreVMState, "coreVMState");
        Intrinsics.checkNotNullParameter(bottomSheetVMState, "bottomSheetVMState");
        r rVar = new r(coreVMState, bottomSheetVMState);
        ArrayList arrayList = new ArrayList();
        List list = h10.f82214c;
        ArrayList arrayList2 = new ArrayList(g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(new m((pu.w) it.next()));
        }
        arrayList.addAll(arrayList2);
        List list2 = c13.f82214c;
        ArrayList arrayList3 = new ArrayList(g0.q(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new l((u0) it2.next()));
        }
        arrayList.addAll(arrayList3);
        arrayList.addAll(e0.b(new n(sy.e.f115640a)));
        Unit unit = Unit.f80348a;
        return new c0(dVar, rVar, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0314 A[LOOP:2: B:87:0x030e->B:89:0x0314, LOOP_END] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    @Override // l82.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final l82.c0 f(u50.s r27, u50.o r28, l82.i0 r29, l82.e r30) {
        /*
            Method dump skipped, instructions count: 1156
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mt.q.f(u50.s, u50.o, l82.i0, l82.e):l82.c0");
    }

    public final c0 g(r rVar, d dVar, long j13) {
        nt.v vVar;
        x0 x0Var;
        int i13 = p.f88117a[rVar.f88123b.f92225c.ordinal()];
        u50.s c0Var = i13 != 1 ? i13 != 2 ? null : new nt.c0(j13) : nt.z.f92244c;
        x0 x0Var2 = rVar.f88123b;
        c0 e13 = c0Var != null ? this.f88121c.e(c0Var, dVar.f88105a, x0Var2) : null;
        if (e13 == null || (vVar = (nt.v) e13.f82212a) == null) {
            vVar = dVar.f88105a;
        }
        d e14 = d.e(dVar, vVar, null, null, 6);
        if (e13 != null && (x0Var = (x0) e13.f82213b) != null) {
            x0Var2 = x0Var;
        }
        return new c0(e14, r.b(rVar, x0Var2), q0.f80391a);
    }
}
