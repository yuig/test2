package os;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.y2;

/* loaded from: classes.dex */
public abstract class p extends b2 {

    /* renamed from: d, reason: collision with root package name */
    public final b2 f97495d;

    public p(b2 b2Var) {
        this.f97495d = b2Var;
        b2Var.z(new o(this));
    }

    public abstract boolean C(int i13);

    @Override // androidx.recyclerview.widget.b2
    public final void q(RecyclerView recyclerView) {
        this.f97495d.q(recyclerView);
    }

    @Override // androidx.recyclerview.widget.b2
    public final void u(RecyclerView recyclerView) {
        this.f97495d.u(recyclerView);
    }

    @Override // androidx.recyclerview.widget.b2
    public final boolean v(y2 y2Var) {
        if (C(y2Var.f19722f)) {
            return false;
        }
        return this.f97495d.v(y2Var);
    }

    @Override // androidx.recyclerview.widget.b2
    public final void w(y2 y2Var) {
        if (C(y2Var.f19722f)) {
            return;
        }
        this.f97495d.w(y2Var);
    }

    @Override // androidx.recyclerview.widget.b2
    public final void x(y2 y2Var) {
        if (C(y2Var.f19722f)) {
            return;
        }
        this.f97495d.x(y2Var);
    }

    @Override // androidx.recyclerview.widget.b2
    public final void y(y2 y2Var) {
        if (C(y2Var.f19722f)) {
            return;
        }
        this.f97495d.y(y2Var);
    }
}
