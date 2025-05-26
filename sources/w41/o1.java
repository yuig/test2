package w41;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o1 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final l82.d f128049b;

    /* renamed from: c, reason: collision with root package name */
    public final l82.d f128050c;

    /* renamed from: d, reason: collision with root package name */
    public final l82.d f128051d;

    /* renamed from: e, reason: collision with root package name */
    public final l82.d f128052e;

    /* renamed from: f, reason: collision with root package name */
    public final l82.d f128053f;

    public o1(f31.l0 searchBarStateTransformer, x31.o filterBarStateTransformer, k51.e viewOptionsStateTransformer, o82.i0 multiSectionStateTransformer, lt.j pinalyticsStateTransformer) {
        Intrinsics.checkNotNullParameter(searchBarStateTransformer, "searchBarStateTransformer");
        Intrinsics.checkNotNullParameter(filterBarStateTransformer, "filterBarStateTransformer");
        Intrinsics.checkNotNullParameter(viewOptionsStateTransformer, "viewOptionsStateTransformer");
        Intrinsics.checkNotNullParameter(multiSectionStateTransformer, "multiSectionStateTransformer");
        Intrinsics.checkNotNullParameter(pinalyticsStateTransformer, "pinalyticsStateTransformer");
        this.f128049b = searchBarStateTransformer;
        this.f128050c = filterBarStateTransformer;
        this.f128051d = viewOptionsStateTransformer;
        this.f128052e = multiSectionStateTransformer;
        this.f128053f = pinalyticsStateTransformer;
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        p1 vmState = (p1) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        l82.c0 c13 = this.f128049b.c(vmState.f128064e);
        l82.c0 c14 = this.f128052e.c(vmState.f128063d);
        l82.c0 c15 = this.f128050c.c(vmState.f128065f);
        l82.c0 c16 = this.f128051d.c(vmState.f128066g);
        l82.c0 c17 = this.f128053f.c(vmState.f128067h);
        ArrayList l13 = kotlin.collections.f0.l(b1.f127987a, new a1());
        List list = c13.f82214c;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new l1((f31.k0) it.next()));
        }
        l13.addAll(arrayList);
        List list2 = c15.f82214c;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new k1((zy.k0) it2.next()));
        }
        l13.addAll(arrayList2);
        List list3 = c16.f82214c;
        ArrayList arrayList3 = new ArrayList(kotlin.collections.g0.q(list3, 10));
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(new m1((k51.m) it3.next()));
        }
        l13.addAll(arrayList3);
        List list4 = c14.f82214c;
        ArrayList arrayList4 = new ArrayList(kotlin.collections.g0.q(list4, 10));
        Iterator it4 = list4.iterator();
        while (it4.hasNext()) {
            arrayList4.add(new j1((o82.h0) it4.next()));
        }
        l13.addAll(arrayList4);
        List list5 = c17.f82214c;
        ArrayList arrayList5 = new ArrayList(kotlin.collections.g0.q(list5, 10));
        Iterator it5 = list5.iterator();
        while (it5.hasNext()) {
            arrayList5.add(new k1((zy.k0) it5.next()));
        }
        l13.addAll(arrayList5);
        return new l82.c0(new k((f31.j) c13.f82212a, new y((x31.c) c15.f82212a), (o82.a0) c14.f82212a, z0.f128102c, x0.f128095b, (k51.o) c16.f82212a, (zy.a0) c17.f82212a), p1.b(vmState, (o82.j0) c14.f82213b, (f31.m0) c13.f82213b, (x31.p) c15.f82213b, (k51.v) c16.f82213b, (zy.l0) c17.f82213b, RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_BOARDS), l13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01c3  */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v6, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.ArrayList] */
    @Override // l82.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final l82.c0 f(u50.s r21, u50.o r22, l82.i0 r23, l82.e r24) {
        /*
            Method dump skipped, instructions count: 2171
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w41.o1.f(u50.s, u50.o, l82.i0, l82.e):l82.c0");
    }
}
