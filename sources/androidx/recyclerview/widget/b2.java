package androidx.recyclerview.widget;

import android.os.Trace;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b2 {

    /* renamed from: a */
    public final c2 f19331a = new c2();

    /* renamed from: b */
    public boolean f19332b = false;

    /* renamed from: c */
    public a2 f19333c = a2.ALLOW;

    public final void A(boolean z13) {
        if (this.f19331a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f19332b = z13;
    }

    public final void B(d2 d2Var) {
        this.f19331a.unregisterObserver(d2Var);
    }

    public final void a(y2 y2Var, int i13) {
        boolean z13 = y2Var.f19735s == null;
        if (z13) {
            y2Var.f19719c = i13;
            if (this.f19332b) {
                y2Var.f19721e = f(i13);
            }
            y2Var.f19726j = (y2Var.f19726j & (-520)) | 1;
            int i14 = j5.k.f74682a;
            Trace.beginSection("RV OnBindView");
        }
        y2Var.f19735s = this;
        int[] iArr = RecyclerView.A0;
        s(y2Var, i13, y2Var.n());
        if (z13) {
            ArrayList arrayList = y2Var.f19727k;
            if (arrayList != null) {
                arrayList.clear();
            }
            y2Var.f19726j &= -1025;
            ViewGroup.LayoutParams layoutParams = y2Var.f19717a.getLayoutParams();
            if (layoutParams instanceof RecyclerView.LayoutParams) {
                ((RecyclerView.LayoutParams) layoutParams).f19270c = true;
            }
            int i15 = j5.k.f74682a;
            Trace.endSection();
        }
    }

    public final boolean b() {
        int i13 = z1.f19753a[this.f19333c.ordinal()];
        if (i13 != 1) {
            return i13 != 2 || e() > 0;
        }
        return false;
    }

    public final y2 c(RecyclerView recyclerView, int i13) {
        try {
            int i14 = j5.k.f74682a;
            Trace.beginSection("RV CreateView");
            y2 t13 = t(recyclerView, i13);
            if (t13.f19717a.getParent() != null) {
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            t13.f19722f = i13;
            Trace.endSection();
            return t13;
        } catch (Throwable th3) {
            int i15 = j5.k.f74682a;
            Trace.endSection();
            throw th3;
        }
    }

    public int d(b2 b2Var, y2 y2Var, int i13) {
        if (b2Var == this) {
            return i13;
        }
        return -1;
    }

    public abstract int e();

    public long f(int i13) {
        return -1L;
    }

    public int g(int i13) {
        return 0;
    }

    public final void h() {
        this.f19331a.b();
    }

    public final void i(int i13) {
        this.f19331a.d(i13, null, 1);
    }

    public final void j(int i13) {
        this.f19331a.e(i13, 1);
    }

    public final void k(int i13, int i14) {
        this.f19331a.c(i13, i14);
    }

    public final void l(int i13, int i14) {
        this.f19331a.d(i13, null, i14);
    }

    public final void m(int i13, Object obj, int i14) {
        this.f19331a.d(i13, obj, i14);
    }

    public final void n(int i13, int i14) {
        this.f19331a.e(i13, i14);
    }

    public final void o(int i13, int i14) {
        this.f19331a.f(i13, i14);
    }

    public final void p(int i13) {
        this.f19331a.f(i13, 1);
    }

    public void q(RecyclerView recyclerView) {
    }

    public abstract void r(y2 y2Var, int i13);

    public void s(y2 y2Var, int i13, List list) {
        r(y2Var, i13);
    }

    public abstract y2 t(RecyclerView recyclerView, int i13);

    public void u(RecyclerView recyclerView) {
    }

    public boolean v(y2 y2Var) {
        return false;
    }

    public void w(y2 y2Var) {
    }

    public void x(y2 y2Var) {
    }

    public void y(y2 y2Var) {
    }

    public final void z(d2 d2Var) {
        this.f19331a.registerObserver(d2Var);
    }
}
