package tq0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes.dex */
public abstract class b implements zy.m {

    /* renamed from: a, reason: collision with root package name */
    public final pb0.a f118988a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f118989b;

    public b(pb0.a clock, d0 pinalytics) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f118988a = clock;
        this.f118989b = pinalytics;
    }

    @Override // zy.m
    public final void a(RecyclerView recyclerView, boolean z13) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Iterator it = d7.b.O(recyclerView).iterator();
        while (it.hasNext()) {
            k(recyclerView, (View) it.next(), z13);
        }
    }

    @Override // zy.m
    public final void b(ArrayList impressions) {
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        o(impressions);
    }

    @Override // zy.m
    public final void c(Object impression) {
        Intrinsics.checkNotNullParameter(impression, "impression");
        l(impression);
    }

    @Override // zy.m
    public final void d() {
        p();
        i();
    }

    @Override // zy.m
    public final void e(Object impression) {
        Intrinsics.checkNotNullParameter(impression, "impression");
        m(impression);
    }

    @Override // zy.m
    public final void f(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Iterator it = d7.b.O(recyclerView).iterator();
        while (it.hasNext()) {
            q(recyclerView, (View) it.next());
        }
    }

    @Override // zy.m
    public final void g(ArrayList impressions) {
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        n(impressions);
    }

    @Override // zy.m
    public final void h(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Iterator it = d7.b.O(recyclerView).iterator();
        while (it.hasNext()) {
            j(recyclerView, (View) it.next());
        }
    }

    public void i() {
    }

    public void j(RecyclerView recyclerView, View view) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public void k(RecyclerView recyclerView, View view, boolean z13) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public abstract void l(Object obj);

    public void m(Object impression) {
        Intrinsics.checkNotNullParameter(impression, "impression");
    }

    public void n(ArrayList impressions) {
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        Iterator it = impressions.iterator();
        while (it.hasNext()) {
            l(it.next());
        }
    }

    public void o(ArrayList impressions) {
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        Iterator it = impressions.iterator();
        while (it.hasNext()) {
            m(it.next());
        }
    }

    public void p() {
    }

    public void q(RecyclerView recyclerView, View view) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(view, "view");
    }
}
