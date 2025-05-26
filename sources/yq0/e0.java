package yq0;

import androidx.recyclerview.widget.RecyclerView;
import h32.f1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e0 extends ar0.o {

    /* renamed from: c, reason: collision with root package name */
    public final nx.d0 f139689c;

    /* renamed from: d, reason: collision with root package name */
    public int f139690d;

    /* renamed from: e, reason: collision with root package name */
    public int f139691e;

    /* renamed from: f, reason: collision with root package name */
    public int f139692f;

    public e0(nx.d0 pinalytics) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f139689c = pinalytics;
        this.f139691e = -1;
        this.f139692f = -1;
    }

    @Override // androidx.recyclerview.widget.o2
    public final void j(RecyclerView recyclerView, int i13, int i14) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f139690d = i14;
    }

    @Override // ar0.o
    public final void k(RecyclerView recyclerView, int i13, int i14) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        int i15 = this.f139690d;
        nx.d0.v(this.f139689c, (i15 == 0 ? this.f139691e > i13 || this.f139692f > i14 : i15 < 0) ? f1.SWIPE_UP : f1.SWIPE_DOWN, null, false, 12);
        this.f139690d = 0;
        this.f139691e = -1;
        this.f139692f = -1;
    }

    @Override // ar0.o
    public final void l(RecyclerView recyclerView, int i13, int i14) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f139691e = i13;
        this.f139692f = i14;
    }
}
