package tq0;

import h32.f1;
import h32.r;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f118987c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(pb0.g clock, d0 pinalytics) {
        super(clock, pinalytics);
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f118987c = new ArrayList();
    }

    @Override // tq0.b
    public final void i() {
        this.f118987c.clear();
    }

    @Override // tq0.b
    public final void l(Object impression) {
        Intrinsics.checkNotNullParameter(impression, "impression");
        if (impression instanceof r) {
            this.f118987c.add(impression);
        }
    }

    @Override // tq0.b
    public final void p() {
        ArrayList arrayList = this.f118987c;
        if (!arrayList.isEmpty()) {
            this.f118989b.q(null, f1.ARTICLE_IMPRESSION_ONE_PIXEL, null, new ArrayList(arrayList));
        }
    }
}
