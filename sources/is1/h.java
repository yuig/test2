package is1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.h1;
import kotlin.jvm.internal.Intrinsics;
import lh0.z3;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: f, reason: collision with root package name */
    public static final List f73589f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f73590g;

    /* renamed from: a, reason: collision with root package name */
    public final ik1.g f73591a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f73592b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f73593c;

    /* renamed from: d, reason: collision with root package name */
    public int f73594d;

    /* renamed from: e, reason: collision with root package name */
    public final double f73595e;

    static {
        List j13 = kotlin.collections.f0.j(Double.valueOf(-0.007760482840240002d), Double.valueOf(0.22555556893348694d), Double.valueOf(-0.0787685364484787d), Double.valueOf(-0.06621740758419037d), Double.valueOf(0.04665100947022438d), Double.valueOf(-0.16174228489398956d), Double.valueOf(0.10927627980709076d), Double.valueOf(0.03096388280391693d), Double.valueOf(0.015170744620263577d), Double.valueOf(0.1018526628613472d), Double.valueOf(0.01784898154437542d), Double.valueOf(-0.06091868877410889d), Double.valueOf(0.014483392238616943d), Double.valueOf(-0.013638864271342754d), Double.valueOf(0.04703554883599281d), Double.valueOf(-0.023768169805407524d), Double.valueOf(0.13776925206184387d), Double.valueOf(-0.15467974543571472d), Double.valueOf(0.08671873062849045d), Double.valueOf(0.12792199850082397d), Double.valueOf(0.07527031004428864d), Double.valueOf(0.194239541888237d), Double.valueOf(-0.014445452950894833d), Double.valueOf(0.07469478249549866d), Double.valueOf(0.1388956606388092d), Double.valueOf(-0.009087992832064629d), Double.valueOf(0.34649011492729187d), Double.valueOf(0.19888325035572052d), Double.valueOf(1.0058482885360718d), Double.valueOf(2.4527747631073d));
        f73589f = j13;
        f73590g = j13.size();
    }

    public h(lh0.o experimentHelper, ik1.g userActionSequenceTracker, m60.f0 devUtils) {
        Intrinsics.checkNotNullParameter(experimentHelper, "experimentHelper");
        Intrinsics.checkNotNullParameter(userActionSequenceTracker, "userActionSequenceTracker");
        Intrinsics.checkNotNullParameter(devUtils, "devUtils");
        this.f73591a = userActionSequenceTracker;
        String e13 = experimentHelper.e("android_closeup_computation_reduction_model_based", z3.ACTIVATE_EXPERIMENT);
        boolean p13 = e13 != null ? kotlin.text.z.p(e13, "enabled", false) : false;
        this.f73592b = p13;
        this.f73593c = h1.f(ik1.c.SWIPE, ik1.c.CLOSEUP, ik1.c.NO_ACTION);
        this.f73594d = p13 ? 4 : 5;
        this.f73595e = experimentHelper.j("android_closeup_computation_reduction_model_based", "threshold", 15, z3.DO_NOT_ACTIVATE_EXPERIMENT) / 100.0d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    public final List a() {
        ArrayList arrayList;
        ik1.g gVar = this.f73591a;
        gVar.getClass();
        Set filters = this.f73593c;
        Intrinsics.checkNotNullParameter(filters, "filters");
        ArrayList arrayList2 = gVar.f72416f;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (filters.contains(((ik1.a) next).f72404a)) {
                arrayList3.add(next);
            }
        }
        int size = arrayList3.size();
        int i13 = f73590g;
        if (i13 > size) {
            int size2 = i13 - arrayList3.size();
            ArrayList arrayList4 = new ArrayList(size2);
            for (int i14 = 0; i14 < size2; i14++) {
                arrayList4.add(new ik1.a(ik1.c.NO_ACTION));
            }
            arrayList = CollectionsKt.l0(arrayList3, arrayList4);
        } else {
            int size3 = arrayList3.size();
            arrayList = arrayList3;
            if (i13 < size3) {
                arrayList = CollectionsKt.z0(i13, arrayList3);
            }
        }
        gVar.f72413c.R(arrayList.size() == i13, "actions size is not what was requested", tb0.p.USER_SEQUENCE, new Object[0]);
        return arrayList;
    }

    public final void b() {
        if (this.f73592b) {
            return;
        }
        this.f73594d++;
    }

    public final void c() {
        if (this.f73592b) {
            this.f73594d++;
            this.f73591a.b(new ik1.a(ik1.c.CLOSEUP));
        }
    }
}
