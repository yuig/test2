package tq0;

import h32.e3;
import h32.f1;
import h32.g0;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes.dex */
public final class m extends b {

    /* renamed from: c, reason: collision with root package name */
    public final g0 f119024c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f119025d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(pb0.a clock, d0 pinalytics) {
        super(clock, pinalytics);
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f119024c = null;
        this.f119025d = new ArrayList();
    }

    @Override // tq0.b
    public final void i() {
        this.f119025d.clear();
    }

    @Override // tq0.b
    public final void l(Object impression) {
        Intrinsics.checkNotNullParameter(impression, "impression");
        if (impression instanceof e3) {
            this.f119025d.add(impression);
        }
    }

    @Override // tq0.b
    public final void p() {
        ArrayList arrayList = this.f119025d;
        if (qb0.b.p(arrayList)) {
            this.f118989b.E(f1.USER_IMPRESSION_ONE_PIXEL, CollectionsKt.H0(arrayList), this.f119024c);
        }
    }
}
