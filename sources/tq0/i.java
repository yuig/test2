package tq0;

import h32.d3;
import h32.f1;
import h32.g0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes5.dex */
public final class i extends b {

    /* renamed from: c, reason: collision with root package name */
    public final g0 f119009c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f119010d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f119011e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i(nx.d0 r3) {
        /*
            r2 = this;
            pb0.g r0 = pb0.g.f99432a
            java.lang.String r1 = "clock"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "pinalytics"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
            r2.<init>(r0, r3)
            r3 = 0
            r2.f119009c = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f119010d = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f119011e = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tq0.i.<init>(nx.d0):void");
    }

    @Override // tq0.b
    public final void i() {
        this.f119010d.clear();
        this.f119011e.clear();
    }

    @Override // tq0.b
    public final void l(Object impression) {
        Intrinsics.checkNotNullParameter(impression, "impression");
        if (impression instanceof d3) {
            this.f119011e.add(impression);
        }
    }

    @Override // tq0.b
    public final void p() {
        ArrayList arrayList = this.f119010d;
        boolean z13 = !arrayList.isEmpty();
        d0 d0Var = this.f118989b;
        if (z13) {
            d0Var.G(this.f119009c, f1.TOPIC_IMPRESSION_ONE_PIXEL, new ArrayList(arrayList));
        }
        ArrayList arrayList2 = this.f119011e;
        if (!arrayList2.isEmpty()) {
            d0Var.A(f1.TOPIC_IMPRESSION_ONE_PIXEL, new ArrayList(arrayList2));
        }
    }
}
