package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManagerImpl;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.pinterest.recylerview.pinleveling.c f19548a;

    /* renamed from: b, reason: collision with root package name */
    public final PinterestStaggeredGridLayoutManagerImpl f19549b;

    /* renamed from: c, reason: collision with root package name */
    public final nx.d0 f19550c;

    /* renamed from: d, reason: collision with root package name */
    public RecyclerView f19551d;

    /* renamed from: e, reason: collision with root package name */
    public HashSet f19552e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f19553f;

    /* renamed from: g, reason: collision with root package name */
    public final SparseArray f19554g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayDeque f19555h;

    /* renamed from: i, reason: collision with root package name */
    public int f19556i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f19557j;

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f19558k;

    public p1(com.pinterest.recylerview.pinleveling.c configuration, PinterestStaggeredGridLayoutManagerImpl layoutManager, nx.d0 pinalytics) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f19548a = configuration;
        this.f19549b = layoutManager;
        this.f19550c = pinalytics;
        this.f19553f = new HashMap();
        this.f19554g = new SparseArray();
        this.f19555h = new ArrayDeque();
        this.f19556i = -1;
        this.f19557j = new HashMap();
        this.f19558k = new HashSet();
    }

    public static int b(int i13, int i14, int i15, ArrayList sizes) {
        Intrinsics.checkNotNullParameter(sizes, "sizes");
        if (sizes.isEmpty()) {
            return 0;
        }
        if (i13 == sizes.size()) {
            return i14 - i15;
        }
        PinterestStaggeredGridLayoutManagerImpl.ItemSizeSpec itemSizeSpec = (PinterestStaggeredGridLayoutManagerImpl.ItemSizeSpec) sizes.get(i13);
        int i16 = i13 + 1;
        Intrinsics.f(itemSizeSpec);
        int b13 = b(i16, itemSizeSpec.f19184b + i14, i15, sizes);
        int b14 = b(i16, i14, i15 + itemSizeSpec.f19184b, sizes);
        if (Math.abs(b13) < Math.abs(b14)) {
            itemSizeSpec.f19190h = 0;
            return b13;
        }
        itemSizeSpec.f19190h = 1;
        return b14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String c(View view) {
        if (view instanceof y92.g) {
            return ((y92.g) view).getUniqueId();
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.PinterestStaggeredGridLayoutManagerImpl.LayoutParams");
        return df.j1.U("%d", new Object[]{Integer.valueOf(((PinterestStaggeredGridLayoutManagerImpl.LayoutParams) layoutParams).f19268a.m())});
    }

    public static void j(View view, PinterestStaggeredGridLayoutManagerImpl.ItemSizeSpec itemSizeSpec, PinterestStaggeredGridLayoutManagerImpl.LayoutParams layoutParams) {
        int i13 = itemSizeSpec.f19185c;
        int i14 = itemSizeSpec.f19184b;
        layoutParams.f19193g = i13;
        layoutParams.f19194h = i14;
        int i15 = itemSizeSpec.f19187e;
        int i16 = itemSizeSpec.f19186d;
        layoutParams.f19198l = i15;
        layoutParams.f19199m = i16;
        layoutParams.f19196j = 0;
        layoutParams.f19197k = 0;
        view.setLayoutParams(layoutParams);
    }

    public final int a(int i13, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        int m13 = i13 - m(i13, arrayList, arrayList3, 0);
        return Math.abs(m13 - m(m13, arrayList2, arrayList4, 1));
    }

    public final boolean d(int i13) {
        b2 b2Var;
        RecyclerView recyclerView = this.f19551d;
        if (recyclerView == null || (b2Var = recyclerView.f19240m) == null || this.f19552e == null || i13 < 0 || i13 >= b2Var.e()) {
            return false;
        }
        HashSet hashSet = this.f19552e;
        Intrinsics.f(hashSet);
        b2 b2Var2 = recyclerView.f19240m;
        Intrinsics.f(b2Var2);
        return hashSet.contains(Integer.valueOf(b2Var2.g(i13)));
    }

    public final void e(u1 currentSpan, int i13, PinterestStaggeredGridLayoutManagerImpl.ItemSizeSpec size, int i14, int i15) {
        Intrinsics.checkNotNullParameter(currentSpan, "currentSpan");
        Intrinsics.checkNotNullParameter(size, "size");
        u1[] u1VarArr = this.f19549b.f19178v;
        u1 u1Var = u1VarArr[0];
        if (u1Var == currentSpan) {
            u1Var = u1VarArr[1];
        }
        int h10 = currentSpan.h(i13);
        Intrinsics.f(u1Var);
        int abs = Math.abs(u1Var.h(i13) - (h10 + size.f19186d));
        HashMap hashMap = new HashMap();
        hashMap.put("position_in_list", String.valueOf(i14));
        hashMap.put("column_height_difference_before_leveling", String.valueOf(kh2.d.W0(i15)));
        hashMap.put("column_height_difference_after_leveling", String.valueOf(kh2.d.W0(abs)));
        this.f19550c.g(h32.f1.GRID_PIN_LEVELING_GAP_FILLED, null, hashMap, false);
    }

    public final void f(int i13, int i14, int i15) {
        int W0 = kh2.d.W0(Math.abs(i13));
        HashMap hashMap = new HashMap();
        hashMap.put("position_in_list", String.valueOf(i14));
        hashMap.put("column_height_difference_after_leveling", String.valueOf(W0));
        hashMap.put("number_of_pins_leveled", String.valueOf(i15));
        this.f19550c.g(h32.f1.GRID_PIN_LEVELING_APPLIED, null, hashMap, false);
    }

    public final void g() {
        this.f19554g.clear();
        this.f19553f.clear();
        this.f19555h.clear();
        this.f19556i = -1;
        this.f19558k.clear();
        this.f19557j.clear();
    }

    public final void h(int i13, q2 q2Var, w2 w2Var) {
        if (w2Var.f19683g) {
            return;
        }
        int b13 = w2Var.b();
        int i14 = i13;
        while (i13 < b13) {
            if (d(i13) && i13 >= 2) {
                int max = Math.max(0, i13 - this.f19548a.f50383c);
                if (i14 < max) {
                    i14 = max;
                }
                int max2 = Math.max(0, i13 - 1);
                int max3 = Math.max(0, i14);
                if (max3 <= max2) {
                    while (true) {
                        i(max2, q2Var);
                        if (max2 != max3) {
                            max2--;
                        }
                    }
                }
            }
            i13++;
        }
    }

    public final void i(int i13, q2 q2Var) {
        SparseArray sparseArray = this.f19554g;
        if (sparseArray.get(i13) == null) {
            View f13 = q2Var.f(i13);
            Intrinsics.checkNotNullExpressionValue(f13, "getViewForPosition(...)");
            String c13 = c(f13);
            if (this.f19553f.get(c13) == null) {
                ViewGroup.LayoutParams layoutParams = f13.getLayoutParams();
                Intrinsics.g(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.PinterestStaggeredGridLayoutManagerImpl.LayoutParams");
                this.f19549b.C1(f13, (PinterestStaggeredGridLayoutManagerImpl.LayoutParams) layoutParams, true, c13);
            }
            sparseArray.put(i13, c13);
            if (f13.isAttachedToWindow()) {
                return;
            }
            q2Var.l(f13);
        }
    }

    public final boolean k(w0 w0Var, w2 w2Var, PinterestStaggeredGridLayoutManagerImpl.LayoutParams layoutParams) {
        int i13;
        int i14 = w0Var.f19669d;
        boolean z13 = false;
        boolean z14 = i14 == 1 && (i13 = w0Var.f19668c + i14) >= 0 && i13 < w2Var.b();
        if (!z14) {
            return z14;
        }
        PinterestStaggeredGridLayoutManagerImpl pinterestStaggeredGridLayoutManagerImpl = this.f19549b;
        s1 s1Var = pinterestStaggeredGridLayoutManagerImpl.G;
        Intrinsics.f(s1Var);
        if (s1Var.f(layoutParams.f19268a.m()) == -1) {
            s1 s1Var2 = pinterestStaggeredGridLayoutManagerImpl.G;
            Intrinsics.f(s1Var2);
            if (s1Var2.f(w0Var.f19668c) == -1 && !d(layoutParams.f19268a.m()) && !d(w0Var.f19668c) && d(w0Var.f19668c + w0Var.f19669d)) {
                z13 = true;
            }
        }
        return z13;
    }

    public final void l(int i13, PinterestStaggeredGridLayoutManagerImpl.ItemSizeSpec itemSizeSpec) {
        if (itemSizeSpec != null) {
            itemSizeSpec.f19187e = itemSizeSpec.f19185c;
            itemSizeSpec.f19186d = i13;
            this.f19553f.put(itemSizeSpec.f19183a, itemSizeSpec);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m(int r21, java.util.ArrayList r22, java.util.ArrayList r23, int r24) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.p1.m(int, java.util.ArrayList, java.util.ArrayList, int):int");
    }
}
