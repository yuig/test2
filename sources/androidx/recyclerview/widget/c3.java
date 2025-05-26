package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class c3 {

    /* renamed from: a, reason: collision with root package name */
    public Object f19350a;

    /* renamed from: b, reason: collision with root package name */
    public Object f19351b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f19352c;

    public c3(ja.d0 database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.f19350a = database;
        this.f19351b = new AtomicBoolean(false);
        this.f19352c = xk2.m.b(new androidx.activity.a0(this, 23));
    }

    public final oa.i a() {
        ((ja.d0) this.f19350a).a();
        return ((AtomicBoolean) this.f19351b).compareAndSet(false, true) ? (oa.i) ((xk2.k) this.f19352c).getValue() : d();
    }

    public void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = (RecyclerView) this.f19350a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            g();
        }
        this.f19350a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.V != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            recyclerView.o((o2) this.f19352c);
            ((RecyclerView) this.f19350a).V = this;
            this.f19351b = new Scroller(((RecyclerView) this.f19350a).getContext(), new DecelerateInterpolator());
            k();
        }
    }

    public abstract int[] c(l2 l2Var, View view);

    public final oa.i d() {
        String sql = e();
        ja.d0 d0Var = (ja.d0) this.f19350a;
        d0Var.getClass();
        Intrinsics.checkNotNullParameter(sql, "sql");
        d0Var.a();
        d0Var.b();
        return d0Var.g().getWritableDatabase().i1(sql);
    }

    public abstract String e();

    public m1 f(l2 l2Var) {
        if (!(l2Var instanceof u2)) {
            return null;
        }
        return new m1(2, ((RecyclerView) this.f19350a).getContext(), this);
    }

    public final void g() {
        ((RecyclerView) this.f19350a).w2((o2) this.f19352c);
        ((RecyclerView) this.f19350a).V = null;
    }

    public abstract View h(l2 l2Var);

    public abstract int i(l2 l2Var, int i13, int i14);

    public final void j(oa.i statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        if (statement == ((oa.i) ((xk2.k) this.f19352c).getValue())) {
            ((AtomicBoolean) this.f19351b).set(false);
        }
    }

    public final void k() {
        l2 l2Var;
        View h10;
        RecyclerView recyclerView = (RecyclerView) this.f19350a;
        if (recyclerView == null || (l2Var = recyclerView.f19242n) == null || (h10 = h(l2Var)) == null) {
            return;
        }
        int[] c13 = c(l2Var, h10);
        int i13 = c13[0];
        if (i13 == 0 && c13[1] == 0) {
            return;
        }
        ((RecyclerView) this.f19350a).Z2(i13, c13[1]);
    }

    public c3() {
        this.f19352c = new b3(this);
    }
}
