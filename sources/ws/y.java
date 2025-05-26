package ws;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import l82.c0;
import l82.i0;
import xs.f0;
import xs.g0;

/* loaded from: classes3.dex */
public final class y extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final f0 f131074b;

    /* renamed from: c, reason: collision with root package name */
    public final l82.d f131075c;

    public y(f0 coreStateTransformer, f0 bottomSheetStateTransformer) {
        Intrinsics.checkNotNullParameter(coreStateTransformer, "coreStateTransformer");
        Intrinsics.checkNotNullParameter(bottomSheetStateTransformer, "bottomSheetStateTransformer");
        this.f131074b = coreStateTransformer;
        this.f131075c = bottomSheetStateTransformer;
    }

    @Override // l82.d
    public final c0 c(i0 i0Var) {
        z vmState = (z) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        c0 h10 = this.f131074b.h(vmState.f131076a);
        c0 c13 = this.f131075c.c(vmState.f131077b);
        c cVar = new c((xs.m) c13.f82212a, (pu.a) h10.f82212a, q0.f80391a);
        pu.x coreVMState = (pu.x) h10.f82213b;
        g0 bottomSheetVMState = (g0) c13.f82213b;
        Intrinsics.checkNotNullParameter(coreVMState, "coreVMState");
        Intrinsics.checkNotNullParameter(bottomSheetVMState, "bottomSheetVMState");
        z zVar = new z(coreVMState, bottomSheetVMState);
        ArrayList arrayList = new ArrayList();
        List list = h10.f82214c;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(new u((pu.w) it.next()));
        }
        arrayList.addAll(arrayList2);
        List list2 = c13.f82214c;
        ArrayList arrayList3 = new ArrayList(kotlin.collections.g0.q(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new t((xs.d) it2.next()));
        }
        arrayList.addAll(arrayList3);
        arrayList.addAll(e0.b(new v()));
        Unit unit = Unit.f80348a;
        return new c0(cVar, zVar, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0194 A[LOOP:0: B:12:0x018e->B:14:0x0194, LOOP_END] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    @Override // l82.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final l82.c0 f(u50.s r22, u50.o r23, l82.i0 r24, l82.e r25) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ws.y.f(u50.s, u50.o, l82.i0, l82.e):l82.c0");
    }
}
