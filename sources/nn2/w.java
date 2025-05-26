package nn2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import lb.p0;
import ln2.l0;
import pn2.b0;
import tm2.s0;
import tm2.x0;

/* loaded from: classes2.dex */
public final class w extends dm2.c {

    /* renamed from: k, reason: collision with root package name */
    public final p0 f91648k;

    /* renamed from: l, reason: collision with root package name */
    public final x0 f91649l;

    /* renamed from: m, reason: collision with root package name */
    public final a f91650m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public w(lb.p0 r11, tm2.x0 r12, int r13) {
        /*
            r10 = this;
            java.lang.String r0 = "c"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            on2.u r2 = r11.d()
            java.lang.Object r0 = r11.f82655d
            r3 = r0
            am2.m r3 = (am2.m) r3
            bm2.g r4 = bm2.h.f23540a
            java.lang.Object r0 = r11.f82654c
            vm2.f r0 = (vm2.f) r0
            int r1 = r12.f118534e
            ym2.g r5 = bs1.c.L0(r0, r1)
            tm2.w0 r0 = r12.f118536g
            java.lang.String r1 = "getVariance(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "variance"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            int[] r1 = ln2.f0.f84080c
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L4a
            r1 = 2
            if (r0 == r1) goto L47
            r1 = 3
            if (r0 != r1) goto L41
            pn2.w1 r0 = pn2.w1.INVARIANT
        L3f:
            r6 = r0
            goto L4d
        L41:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        L47:
            pn2.w1 r0 = pn2.w1.OUT_VARIANCE
            goto L3f
        L4a:
            pn2.w1 r0 = pn2.w1.IN_VARIANCE
            goto L3f
        L4d:
            boolean r7 = r12.f118535f
            am2.z0 r9 = am2.z0.f15606a
            r1 = r10
            r8 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r10.f91648k = r11
            r10.f91649l = r12
            nn2.a r12 = new nn2.a
            on2.u r11 = r11.d()
            nn2.v r13 = new nn2.v
            r0 = 0
            r13.<init>(r10, r0)
            r12.<init>(r11, r13)
            r10.f91650m = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nn2.w.<init>(lb.p0, tm2.x0, int):void");
    }

    @Override // bm2.b, bm2.a
    public final bm2.i getAnnotations() {
        return this.f91650m;
    }

    @Override // dm2.j
    public final void u0(b0 type) {
        Intrinsics.checkNotNullParameter(type, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }

    @Override // dm2.j
    public final List v0() {
        p0 p0Var = this.f91648k;
        vm2.i typeTable = (vm2.i) p0Var.f82656e;
        x0 x0Var = this.f91649l;
        Intrinsics.checkNotNullParameter(x0Var, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List list = x0Var.f118537h;
        if (!(!list.isEmpty())) {
            list = null;
        }
        if (list == null) {
            List list2 = x0Var.f118538i;
            Intrinsics.checkNotNullExpressionValue(list2, "getUpperBoundIdList(...)");
            List<Integer> list3 = list2;
            ArrayList arrayList = new ArrayList(g0.q(list3, 10));
            for (Integer num : list3) {
                Intrinsics.f(num);
                arrayList.add(typeTable.a(num.intValue()));
            }
            list = arrayList;
        }
        if (list.isEmpty()) {
            return e0.b(fn2.d.e(this).m());
        }
        List list4 = list;
        l0 l0Var = (l0) p0Var.f82659h;
        ArrayList arrayList2 = new ArrayList(g0.q(list4, 10));
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            arrayList2.add(l0Var.g((s0) it.next()));
        }
        return arrayList2;
    }
}
