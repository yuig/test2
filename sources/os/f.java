package os;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.l2;
import androidx.recyclerview.widget.y2;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f extends p implements qe0.a {

    /* renamed from: e, reason: collision with root package name */
    public boolean f97479e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f97480f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f97481g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f97482h;

    /* renamed from: i, reason: collision with root package name */
    public final b2 f97483i;

    public f(b2 b2Var) {
        super(b2Var);
        this.f97479e = false;
        this.f97483i = b2Var;
    }

    public static void D(View view, RecyclerView recyclerView) {
        l2 l2Var;
        if ((recyclerView instanceof RecyclerView) && (l2Var = recyclerView.f19242n) != null) {
            if ((l2Var instanceof PinterestStaggeredGridLayoutManager) || (l2Var instanceof StaggeredGridLayoutManager) || (l2Var instanceof GridLayoutManager)) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (!(layoutParams instanceof RecyclerView.LayoutParams) || !l2Var.m((RecyclerView.LayoutParams) layoutParams)) {
                    layoutParams = l2Var.A();
                }
                if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
                    ((StaggeredGridLayoutManager.LayoutParams) layoutParams).f19298f = true;
                } else if (layoutParams instanceof PinterestStaggeredGridLayoutManager.LayoutParams) {
                    ((PinterestStaggeredGridLayoutManager.LayoutParams) layoutParams).k();
                }
                view.setLayoutParams(layoutParams);
            }
        }
    }

    @Override // os.p
    public final boolean C(int i13) {
        return i13 <= -1000 && i13 >= -3000;
    }

    public final View E(int i13) {
        int i14 = i13 + 3000;
        ArrayList arrayList = this.f97482h;
        if (arrayList == null || i14 < 0 || i14 >= arrayList.size()) {
            return null;
        }
        return ((b) this.f97482h.get(i14)).create();
    }

    public final View F(int i13) {
        int i14 = i13 + 2000;
        ArrayList arrayList = this.f97481g;
        if (arrayList == null || i14 < 0 || i14 >= arrayList.size()) {
            return null;
        }
        return ((b) this.f97481g.get(i14)).create();
    }

    public final b G(int i13) {
        int i14 = i13 + 3000;
        ArrayList arrayList = this.f97482h;
        if (arrayList == null || i14 < 0 || i14 >= arrayList.size()) {
            return null;
        }
        return (b) this.f97482h.get(i14);
    }

    public final b H(int i13) {
        int i14 = i13 + 2000;
        ArrayList arrayList = this.f97481g;
        if (arrayList == null || i14 < 0 || i14 >= arrayList.size()) {
            return null;
        }
        return (b) this.f97481g.get(i14);
    }

    public final int I(b bVar) {
        return this.f97481g.indexOf(bVar) - 2000;
    }

    public final int J() {
        ArrayList arrayList = this.f97482h;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public final int K() {
        ArrayList arrayList = this.f97480f;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public final boolean L(int i13) {
        int e13 = e();
        return (this.f97479e && i13 == e13 + (-1)) || i13 < K() || i13 - ((e13 - J()) - (this.f97479e ? 1 : 0)) >= 0;
    }

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        boolean z13 = this.f97479e;
        return J() + this.f97483i.e() + K() + (z13 ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.b2
    public final long f(int i13) {
        int K = K();
        if (i13 >= K) {
            b2 b2Var = this.f97483i;
            if (i13 < b2Var.e() + K) {
                return b2Var.f(i13 - K);
            }
        }
        return this.f97495d.f(i13);
    }

    @Override // androidx.recyclerview.widget.b2
    public final int g(int i13) {
        int e13 = e();
        if (this.f97479e && i13 == e13 - 1) {
            return -1000;
        }
        int K = K();
        if (i13 < K) {
            return I((b) this.f97480f.get(i13));
        }
        int J2 = e13 - J();
        if (this.f97479e) {
            J2--;
        }
        int i14 = i13 - J2;
        return i14 >= 0 ? i14 - 3000 : this.f97483i.g(i13 - K);
    }

    @Override // qe0.a
    public final boolean isEmpty() {
        Object obj = this.f97483i;
        if (obj instanceof qe0.a) {
            return ((qe0.a) obj).isEmpty() && K() == 0 && J() == 0;
        }
        if (this.f97479e) {
            if (e() != 1) {
                return false;
            }
        } else if (e() != 0) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 y2Var, int i13) {
        int g13 = g(i13);
        if (g13 < -1000 && g13 >= -2000) {
            H(g13).getClass();
        } else if (g13 < -2000 && g13 >= -3000) {
            G(g13).getClass();
        }
        if (C(y2Var.f19722f)) {
            return;
        }
        this.f97483i.r(y2Var, i13 - K());
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView recyclerView, int i13) {
        return i13 == -1000 ? new e(LayoutInflater.from(recyclerView.getContext()).inflate(nl1.f.load_more_indicator, (ViewGroup) recyclerView, false), recyclerView) : (i13 >= -1000 || i13 < -2000) ? (i13 >= -2000 || i13 < -3000) ? this.f97483i.t(recyclerView, i13) : new c(E(i13), recyclerView) : new c(F(i13), recyclerView);
    }
}
