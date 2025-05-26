package x31;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import zy.l0;

/* loaded from: classes5.dex */
public final class p implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final t f131635a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f131636b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f131637c;

    /* renamed from: d, reason: collision with root package name */
    public final List f131638d;

    /* renamed from: e, reason: collision with root package name */
    public final Set f131639e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f131640f;

    /* renamed from: g, reason: collision with root package name */
    public final l0 f131641g;

    /* renamed from: h, reason: collision with root package name */
    public final s f131642h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f131643i;

    public p(t selectionBehavior, boolean z13, Integer num, List availableFilters, Set disabledFilters, Map selectedStates, l0 pinalyticsVMState, s loggingState, boolean z14) {
        Intrinsics.checkNotNullParameter(selectionBehavior, "selectionBehavior");
        Intrinsics.checkNotNullParameter(availableFilters, "availableFilters");
        Intrinsics.checkNotNullParameter(disabledFilters, "disabledFilters");
        Intrinsics.checkNotNullParameter(selectedStates, "selectedStates");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(loggingState, "loggingState");
        this.f131635a = selectionBehavior;
        this.f131636b = z13;
        this.f131637c = num;
        this.f131638d = availableFilters;
        this.f131639e = disabledFilters;
        this.f131640f = selectedStates;
        this.f131641g = pinalyticsVMState;
        this.f131642h = loggingState;
        this.f131643i = z14;
    }

    public static p b(p pVar, List list, LinkedHashSet linkedHashSet, LinkedHashMap linkedHashMap, l0 l0Var, s sVar, int i13) {
        t selectionBehavior = pVar.f131635a;
        boolean z13 = pVar.f131636b;
        Integer num = pVar.f131637c;
        List availableFilters = (i13 & 8) != 0 ? pVar.f131638d : list;
        Set disabledFilters = (i13 & 16) != 0 ? pVar.f131639e : linkedHashSet;
        Map selectedStates = (i13 & 32) != 0 ? pVar.f131640f : linkedHashMap;
        l0 pinalyticsVMState = (i13 & 64) != 0 ? pVar.f131641g : l0Var;
        s loggingState = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? pVar.f131642h : sVar;
        boolean z14 = pVar.f131643i;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(selectionBehavior, "selectionBehavior");
        Intrinsics.checkNotNullParameter(availableFilters, "availableFilters");
        Intrinsics.checkNotNullParameter(disabledFilters, "disabledFilters");
        Intrinsics.checkNotNullParameter(selectedStates, "selectedStates");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(loggingState, "loggingState");
        return new p(selectionBehavior, z13, num, availableFilters, disabledFilters, selectedStates, pinalyticsVMState, loggingState, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f131635a == pVar.f131635a && this.f131636b == pVar.f131636b && Intrinsics.d(this.f131637c, pVar.f131637c) && Intrinsics.d(this.f131638d, pVar.f131638d) && Intrinsics.d(this.f131639e, pVar.f131639e) && Intrinsics.d(this.f131640f, pVar.f131640f) && Intrinsics.d(this.f131641g, pVar.f131641g) && Intrinsics.d(this.f131642h, pVar.f131642h) && this.f131643i == pVar.f131643i;
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f131636b, this.f131635a.hashCode() * 31, 31);
        Integer num = this.f131637c;
        return Boolean.hashCode(this.f131643i) + ((this.f131642h.hashCode() + jq.b.a(this.f131641g, a.c.e(this.f131640f, (this.f131639e.hashCode() + ep.b.c(this.f131638d, (e13 + (num == null ? 0 : num.hashCode())) * 31, 31)) * 31, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FilterBarVMState(selectionBehavior=");
        sb3.append(this.f131635a);
        sb3.append(", showXIcon=");
        sb3.append(this.f131636b);
        sb3.append(", singleFilterLabelResId=");
        sb3.append(this.f131637c);
        sb3.append(", availableFilters=");
        sb3.append(this.f131638d);
        sb3.append(", disabledFilters=");
        sb3.append(this.f131639e);
        sb3.append(", selectedStates=");
        sb3.append(this.f131640f);
        sb3.append(", pinalyticsVMState=");
        sb3.append(this.f131641g);
        sb3.append(", loggingState=");
        sb3.append(this.f131642h);
        sb3.append(", isCalicoTheme=");
        return a.a.r(sb3, this.f131643i, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p(x31.t r13, boolean r14, java.lang.Integer r15, java.util.List r16, zy.l0 r17, boolean r18, int r19) {
        /*
            r12 = this;
            r0 = r19
            r1 = r0 & 1
            if (r1 == 0) goto La
            x31.t r1 = x31.t.Single
            r3 = r1
            goto Lb
        La:
            r3 = r13
        Lb:
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L12
            r4 = r2
            goto L13
        L12:
            r4 = r14
        L13:
            r1 = r0 & 4
            r5 = 0
            if (r1 == 0) goto L1a
            r1 = r5
            goto L1b
        L1a:
            r1 = r15
        L1b:
            r6 = r0 & 8
            if (r6 == 0) goto L22
            kotlin.collections.q0 r6 = kotlin.collections.q0.f80391a
            goto L24
        L22:
            r6 = r16
        L24:
            kotlin.collections.s0 r7 = kotlin.collections.s0.f80394a
            r8 = r6
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            r9 = 10
            int r9 = kotlin.collections.g0.q(r8, r9)
            int r9 = kotlin.collections.y0.a(r9)
            r10 = 16
            if (r9 >= r10) goto L38
            r9 = r10
        L38:
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>(r9)
            java.util.Iterator r8 = r8.iterator()
        L41:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L57
            java.lang.Object r9 = r8.next()
            x31.a r9 = (x31.a) r9
            x31.r r9 = r9.a()
            bm1.n r11 = bm1.n.UNSELECTED
            r10.put(r9, r11)
            goto L41
        L57:
            r8 = r0 & 64
            if (r8 == 0) goto L63
            zy.l0 r8 = new zy.l0
            r9 = 3
            r8.<init>(r5, r9)
            r9 = r8
            goto L65
        L63:
            r9 = r17
        L65:
            x31.s r11 = new x31.s
            r8 = 7
            r11.<init>(r5, r8)
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L71
            r0 = r2
            goto L73
        L71:
            r0 = r18
        L73:
            r2 = r12
            r5 = r1
            r8 = r10
            r10 = r11
            r11 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x31.p.<init>(x31.t, boolean, java.lang.Integer, java.util.List, zy.l0, boolean, int):void");
    }
}
