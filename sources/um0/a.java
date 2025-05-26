package um0;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements s42.c {

    /* renamed from: a, reason: collision with root package name */
    public final y92.e f122680a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f122681b;

    /* renamed from: c, reason: collision with root package name */
    public final xk2.k f122682c;

    public a(y92.f moveListener, jm0.i viewHolderProvider) {
        Intrinsics.checkNotNullParameter(moveListener, "moveListener");
        Intrinsics.checkNotNullParameter(viewHolderProvider, "viewHolderProvider");
        this.f122680a = moveListener;
        this.f122681b = viewHolderProvider;
        this.f122682c = xk2.m.a(xk2.n.NONE, new jh0.d(this, 18));
    }

    @Override // s42.c
    public final void a(int i13) {
        y2 y2Var = (y2) this.f122681b.invoke(Integer.valueOf(i13));
        if (y2Var != null) {
            ((androidx.recyclerview.widget.q0) this.f122682c.getValue()).s(y2Var);
        }
    }

    public final void b(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        c();
        ((androidx.recyclerview.widget.q0) this.f122682c.getValue()).i(recyclerView);
    }

    public final void c() {
        ((androidx.recyclerview.widget.q0) this.f122682c.getValue()).i(null);
    }
}
