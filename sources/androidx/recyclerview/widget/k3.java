package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class k3 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f19466a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f19467b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f19468c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f19469d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f19470e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f19471f;

    public k3(StaggeredGridLayoutManager staggeredGridLayoutManager, int i13) {
        this.f19471f = staggeredGridLayoutManager;
        this.f19470e = i13;
    }

    public static StaggeredGridLayoutManager.LayoutParams o(View view) {
        return (StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
    }

    public final void a(View view) {
        StaggeredGridLayoutManager.LayoutParams layoutParams = (StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
        layoutParams.f19297e = this;
        ArrayList arrayList = this.f19466a;
        arrayList.add(view);
        this.f19468c = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.f19467b = Integer.MIN_VALUE;
        }
        if (layoutParams.f19268a.z() || layoutParams.f19268a.T()) {
            this.f19469d = this.f19471f.f19288r.c(view) + this.f19469d;
        }
    }

    public final void b(int i13, boolean z13) {
        int m13 = z13 ? m(Integer.MIN_VALUE) : q(Integer.MIN_VALUE);
        e();
        if (m13 == Integer.MIN_VALUE) {
            return;
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f19471f;
        if (!z13 || m13 >= staggeredGridLayoutManager.f19288r.g()) {
            if (z13 || m13 <= staggeredGridLayoutManager.f19288r.k()) {
                if (i13 != Integer.MIN_VALUE) {
                    m13 += i13;
                }
                this.f19468c = m13;
                this.f19467b = m13;
            }
        }
    }

    public final void c() {
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem f13;
        View view = (View) ep.b.h(this.f19466a, 1);
        StaggeredGridLayoutManager.LayoutParams layoutParams = (StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f19471f;
        this.f19468c = staggeredGridLayoutManager.f19288r.b(view);
        if (layoutParams.f19298f && (f13 = staggeredGridLayoutManager.B.f(layoutParams.f19268a.m())) != null && f13.f19300b == 1) {
            int i13 = this.f19468c;
            int[] iArr = f13.f19301c;
            this.f19468c = i13 + (iArr == null ? 0 : iArr[this.f19470e]);
        }
    }

    public final void d() {
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem f13;
        View view = (View) this.f19466a.get(0);
        StaggeredGridLayoutManager.LayoutParams layoutParams = (StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f19471f;
        this.f19467b = staggeredGridLayoutManager.f19288r.e(view);
        if (layoutParams.f19298f && (f13 = staggeredGridLayoutManager.B.f(layoutParams.f19268a.m())) != null && f13.f19300b == -1) {
            int i13 = this.f19467b;
            int[] iArr = f13.f19301c;
            this.f19467b = i13 - (iArr != null ? iArr[this.f19470e] : 0);
        }
    }

    public final void e() {
        this.f19466a.clear();
        this.f19467b = Integer.MIN_VALUE;
        this.f19468c = Integer.MIN_VALUE;
        this.f19469d = 0;
    }

    public final int f() {
        boolean z13 = this.f19471f.f19293w;
        ArrayList arrayList = this.f19466a;
        return z13 ? j(arrayList.size() - 1, -1, false, true) : j(0, arrayList.size(), false, true);
    }

    public final int g() {
        boolean z13 = this.f19471f.f19293w;
        ArrayList arrayList = this.f19466a;
        return z13 ? j(arrayList.size() - 1, -1, true, false) : j(0, arrayList.size(), true, false);
    }

    public final int h() {
        boolean z13 = this.f19471f.f19293w;
        ArrayList arrayList = this.f19466a;
        return z13 ? j(0, arrayList.size(), false, true) : j(arrayList.size() - 1, -1, false, true);
    }

    public final int i() {
        boolean z13 = this.f19471f.f19293w;
        ArrayList arrayList = this.f19466a;
        return z13 ? j(0, arrayList.size(), true, false) : j(arrayList.size() - 1, -1, true, false);
    }

    public final int j(int i13, int i14, boolean z13, boolean z14) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f19471f;
        int k13 = staggeredGridLayoutManager.f19288r.k();
        int g13 = staggeredGridLayoutManager.f19288r.g();
        int i15 = i14 > i13 ? 1 : -1;
        while (i13 != i14) {
            View view = (View) this.f19466a.get(i13);
            int e13 = staggeredGridLayoutManager.f19288r.e(view);
            int b13 = staggeredGridLayoutManager.f19288r.b(view);
            boolean z15 = false;
            boolean z16 = !z14 ? e13 >= g13 : e13 > g13;
            if (!z14 ? b13 > k13 : b13 >= k13) {
                z15 = true;
            }
            if (z16 && z15) {
                if (z13) {
                    return l2.Z(view);
                }
                if (e13 < k13 || b13 > g13) {
                    return l2.Z(view);
                }
            }
            i13 += i15;
        }
        return -1;
    }

    public final int k() {
        return this.f19469d;
    }

    public final int l() {
        int i13 = this.f19468c;
        if (i13 != Integer.MIN_VALUE) {
            return i13;
        }
        c();
        return this.f19468c;
    }

    public final int m(int i13) {
        int i14 = this.f19468c;
        if (i14 != Integer.MIN_VALUE) {
            return i14;
        }
        if (this.f19466a.size() == 0) {
            return i13;
        }
        c();
        return this.f19468c;
    }

    public final View n(int i13, int i14) {
        ArrayList arrayList = this.f19466a;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f19471f;
        View view = null;
        if (i14 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f19293w && l2.Z(view2) >= i13) || ((!staggeredGridLayoutManager.f19293w && l2.Z(view2) <= i13) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
        } else {
            int size2 = arrayList.size();
            int i15 = 0;
            while (i15 < size2) {
                View view3 = (View) arrayList.get(i15);
                if ((staggeredGridLayoutManager.f19293w && l2.Z(view3) <= i13) || ((!staggeredGridLayoutManager.f19293w && l2.Z(view3) >= i13) || !view3.hasFocusable())) {
                    break;
                }
                i15++;
                view = view3;
            }
        }
        return view;
    }

    public final int p() {
        int i13 = this.f19467b;
        if (i13 != Integer.MIN_VALUE) {
            return i13;
        }
        d();
        return this.f19467b;
    }

    public final int q(int i13) {
        int i14 = this.f19467b;
        if (i14 != Integer.MIN_VALUE) {
            return i14;
        }
        if (this.f19466a.size() == 0) {
            return i13;
        }
        d();
        return this.f19467b;
    }

    public final void r(int i13) {
        int i14 = this.f19467b;
        if (i14 != Integer.MIN_VALUE) {
            this.f19467b = i14 + i13;
        }
        int i15 = this.f19468c;
        if (i15 != Integer.MIN_VALUE) {
            this.f19468c = i15 + i13;
        }
    }

    public final void s() {
        ArrayList arrayList = this.f19466a;
        int size = arrayList.size();
        View view = (View) arrayList.remove(size - 1);
        StaggeredGridLayoutManager.LayoutParams layoutParams = (StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
        layoutParams.f19297e = null;
        if (layoutParams.f19268a.z() || layoutParams.f19268a.T()) {
            this.f19469d -= this.f19471f.f19288r.c(view);
        }
        if (size == 1) {
            this.f19467b = Integer.MIN_VALUE;
        }
        this.f19468c = Integer.MIN_VALUE;
    }

    public final void t() {
        ArrayList arrayList = this.f19466a;
        View view = (View) arrayList.remove(0);
        StaggeredGridLayoutManager.LayoutParams layoutParams = (StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
        layoutParams.f19297e = null;
        if (arrayList.size() == 0) {
            this.f19468c = Integer.MIN_VALUE;
        }
        if (layoutParams.f19268a.z() || layoutParams.f19268a.T()) {
            this.f19469d -= this.f19471f.f19288r.c(view);
        }
        this.f19467b = Integer.MIN_VALUE;
    }

    public final void u(View view) {
        StaggeredGridLayoutManager.LayoutParams layoutParams = (StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
        layoutParams.f19297e = this;
        ArrayList arrayList = this.f19466a;
        arrayList.add(0, view);
        this.f19467b = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.f19468c = Integer.MIN_VALUE;
        }
        if (layoutParams.f19268a.z() || layoutParams.f19268a.T()) {
            this.f19469d = this.f19471f.f19288r.c(view) + this.f19469d;
        }
    }

    public final void v(int i13) {
        this.f19467b = i13;
        this.f19468c = i13;
    }
}
