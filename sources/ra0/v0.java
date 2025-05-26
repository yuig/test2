package ra0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import q3.c1;

/* loaded from: classes5.dex */
public final class v0 implements q3.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f107017a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f107018b;

    public v0(float f13, boolean z13) {
        this.f107017a = f13;
        this.f107018b = z13;
    }

    @Override // q3.p0
    public final q3.q0 a(q3.r0 Layout, List measurables, long j13) {
        q3.q0 s03;
        q3.q0 s04;
        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        if (measurables.isEmpty()) {
            s04 = Layout.s0(0, 0, kotlin.collections.z0.d(), r.f106984k);
            return s04;
        }
        List list = measurables;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((q3.o0) it.next()).Q(j13));
        }
        c1 c1Var = (c1) CollectionsKt.U(0, arrayList);
        int i13 = c1Var != null ? c1Var.f102178a : 0;
        Iterator it2 = arrayList.subList(1, arrayList.size()).iterator();
        int i14 = 0;
        while (it2.hasNext()) {
            i14 += ((c1) it2.next()).f102178a;
        }
        float f13 = this.f107017a;
        int min = Math.min((int) ((i14 * f13) + i13), n4.a.h(j13));
        Iterator it3 = arrayList.iterator();
        if (!it3.hasNext()) {
            throw new NoSuchElementException();
        }
        int i15 = ((c1) it3.next()).f102179b;
        while (it3.hasNext()) {
            int i16 = ((c1) it3.next()).f102179b;
            if (i15 < i16) {
                i15 = i16;
            }
        }
        int min2 = Math.min(i15, n4.a.g(j13));
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        boolean z13 = this.f107018b;
        h0Var.f80426a = z13 ? 0 : min - i13;
        s03 = Layout.s0(min, min2, kotlin.collections.z0.d(), new u0(arrayList, h0Var, f13, z13));
        return s03;
    }
}
