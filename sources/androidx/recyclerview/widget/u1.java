package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManagerImpl;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f19641a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f19642b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public int f19643c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f19644d = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f19645e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ PinterestStaggeredGridLayoutManagerImpl f19646f;

    public u1(PinterestStaggeredGridLayoutManagerImpl pinterestStaggeredGridLayoutManagerImpl, int i13) {
        this.f19646f = pinterestStaggeredGridLayoutManagerImpl;
        this.f19641a = i13;
    }

    public static PinterestStaggeredGridLayoutManagerImpl.LayoutParams j(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.PinterestStaggeredGridLayoutManagerImpl.LayoutParams");
        return (PinterestStaggeredGridLayoutManagerImpl.LayoutParams) layoutParams;
    }

    public final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        PinterestStaggeredGridLayoutManagerImpl.LayoutParams j13 = j(view);
        j13.f19191e = this;
        ArrayList arrayList = this.f19642b;
        arrayList.add(view);
        this.f19644d = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.f19643c = Integer.MIN_VALUE;
        }
        if (j13.f19268a.z() || j13.f19268a.T()) {
            this.f19645e = this.f19646f.t1().c(view) + this.f19645e;
        }
    }

    public final void b() {
        ArrayList arrayList = this.f19642b;
        Object obj = arrayList.get(arrayList.size() - 1);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        View view = (View) obj;
        PinterestStaggeredGridLayoutManagerImpl.LayoutParams j13 = j(view);
        PinterestStaggeredGridLayoutManagerImpl pinterestStaggeredGridLayoutManagerImpl = this.f19646f;
        this.f19644d = pinterestStaggeredGridLayoutManagerImpl.t1().b(view);
        if (j13.f19192f || j13.f19195i > 1) {
            s1 s1Var = pinterestStaggeredGridLayoutManagerImpl.G;
            Intrinsics.f(s1Var);
            PinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem e13 = s1Var.e(j13.f19268a.m());
            if (e13 == null || e13.f19201b != 1) {
                return;
            }
            this.f19644d = e13.a(this.f19641a) + this.f19644d;
        }
    }

    public final void c() {
        Object obj = this.f19642b.get(0);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        View view = (View) obj;
        PinterestStaggeredGridLayoutManagerImpl.LayoutParams j13 = j(view);
        PinterestStaggeredGridLayoutManagerImpl pinterestStaggeredGridLayoutManagerImpl = this.f19646f;
        this.f19643c = pinterestStaggeredGridLayoutManagerImpl.t1().e(view);
        if (j13.f19192f || j13.f19195i > 1) {
            s1 s1Var = pinterestStaggeredGridLayoutManagerImpl.G;
            Intrinsics.f(s1Var);
            PinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem e13 = s1Var.e(j13.f19268a.m());
            if (e13 == null || e13.f19201b != -1) {
                return;
            }
            this.f19643c -= e13.a(this.f19641a);
        }
    }

    public final void d() {
        this.f19642b.clear();
        this.f19643c = Integer.MIN_VALUE;
        this.f19644d = Integer.MIN_VALUE;
        this.f19645e = 0;
    }

    public final int e() {
        boolean z13 = this.f19646f.B;
        ArrayList arrayList = this.f19642b;
        return z13 ? g(arrayList.size() - 1, -1, false, true) : g(0, arrayList.size(), false, true);
    }

    public final int f() {
        boolean z13 = this.f19646f.B;
        ArrayList arrayList = this.f19642b;
        return z13 ? g(0, arrayList.size(), false, true) : g(arrayList.size() - 1, -1, false, true);
    }

    public final int g(int i13, int i14, boolean z13, boolean z14) {
        PinterestStaggeredGridLayoutManagerImpl pinterestStaggeredGridLayoutManagerImpl = this.f19646f;
        int k13 = pinterestStaggeredGridLayoutManagerImpl.t1().k();
        int g13 = pinterestStaggeredGridLayoutManagerImpl.t1().g();
        int i15 = i14 > i13 ? 1 : -1;
        while (i13 != i14) {
            Object obj = this.f19642b.get(i13);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            View view = (View) obj;
            int e13 = pinterestStaggeredGridLayoutManagerImpl.t1().e(view);
            int b13 = pinterestStaggeredGridLayoutManagerImpl.t1().b(view);
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

    public final int h(int i13) {
        int i14 = this.f19644d;
        if (i14 != Integer.MIN_VALUE) {
            return i14;
        }
        if (this.f19642b.size() == 0) {
            return i13;
        }
        b();
        return this.f19644d;
    }

    public final View i(int i13, int i14) {
        ArrayList arrayList = this.f19642b;
        PinterestStaggeredGridLayoutManagerImpl pinterestStaggeredGridLayoutManagerImpl = this.f19646f;
        View view = null;
        if (i14 == -1) {
            int size = arrayList.size();
            int i15 = 0;
            while (i15 < size) {
                Object obj = arrayList.get(i15);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                View view2 = (View) obj;
                if ((pinterestStaggeredGridLayoutManagerImpl.B && l2.Z(view2) <= i13) || ((!pinterestStaggeredGridLayoutManagerImpl.B && l2.Z(view2) >= i13) || !view2.hasFocusable())) {
                    break;
                }
                i15++;
                view = view2;
            }
        } else {
            int size2 = arrayList.size() - 1;
            if (size2 >= 0) {
                while (true) {
                    int i16 = size2 - 1;
                    Object obj2 = arrayList.get(size2);
                    Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                    View view3 = (View) obj2;
                    if ((pinterestStaggeredGridLayoutManagerImpl.B && l2.Z(view3) >= i13) || ((!pinterestStaggeredGridLayoutManagerImpl.B && l2.Z(view3) <= i13) || !view3.hasFocusable())) {
                        break;
                    }
                    view = view3;
                    if (i16 < 0) {
                        break;
                    }
                    size2 = i16;
                }
            }
        }
        return view;
    }

    public final int k(int i13) {
        int i14 = this.f19643c;
        if (i14 != Integer.MIN_VALUE) {
            return i14;
        }
        if (this.f19642b.size() == 0) {
            return i13;
        }
        c();
        return this.f19643c;
    }

    public final void l() {
        ArrayList arrayList = this.f19642b;
        int size = arrayList.size();
        Object remove = arrayList.remove(size - 1);
        Intrinsics.checkNotNullExpressionValue(remove, "removeAt(...)");
        View view = (View) remove;
        PinterestStaggeredGridLayoutManagerImpl.LayoutParams j13 = j(view);
        j13.f19191e = null;
        if (j13.f19268a.z() || j13.f19268a.T()) {
            this.f19645e -= this.f19646f.t1().c(view);
        }
        if (size == 1) {
            this.f19643c = Integer.MIN_VALUE;
        }
        this.f19644d = Integer.MIN_VALUE;
    }

    public final void m() {
        ArrayList arrayList = this.f19642b;
        Object remove = arrayList.remove(0);
        Intrinsics.checkNotNullExpressionValue(remove, "removeAt(...)");
        View view = (View) remove;
        PinterestStaggeredGridLayoutManagerImpl.LayoutParams j13 = j(view);
        j13.f19191e = null;
        if (arrayList.size() == 0) {
            this.f19644d = Integer.MIN_VALUE;
        }
        if (j13.f19268a.z() || j13.f19268a.T()) {
            this.f19645e -= this.f19646f.t1().c(view);
        }
        this.f19643c = Integer.MIN_VALUE;
    }

    public final void n(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        PinterestStaggeredGridLayoutManagerImpl.LayoutParams j13 = j(view);
        j13.f19191e = this;
        ArrayList arrayList = this.f19642b;
        arrayList.add(0, view);
        this.f19643c = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.f19644d = Integer.MIN_VALUE;
        }
        if (j13.f19268a.z() || j13.f19268a.T()) {
            this.f19645e = this.f19646f.t1().c(view) + this.f19645e;
        }
    }
}
