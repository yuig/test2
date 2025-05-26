package com.pinterest.ui.grid;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PinterestLinearLayoutManager;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.g2;
import androidx.recyclerview.widget.h2;
import androidx.recyclerview.widget.l2;
import androidx.recyclerview.widget.o2;
import androidx.recyclerview.widget.s;
import ar0.u;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import mj.m;
import nl1.e;
import nl1.g;
import os.b;
import os.f;
import qa2.q1;
import qa2.r1;
import qa2.s1;
import qn0.d;

/* loaded from: classes2.dex */
public class PinterestRecyclerView extends LinearLayout implements qe0.a {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f52530j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final RecyclerView f52531a;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f52532b;

    /* renamed from: c, reason: collision with root package name */
    public f f52533c;

    /* renamed from: d, reason: collision with root package name */
    public m f52534d;

    /* renamed from: e, reason: collision with root package name */
    public l2 f52535e;

    /* renamed from: f, reason: collision with root package name */
    public final int f52536f;

    /* renamed from: g, reason: collision with root package name */
    public final int f52537g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f52538h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f52539i;

    public PinterestRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(h2 h2Var) {
        this.f52531a.m(h2Var);
    }

    public final void b(o2 o2Var) {
        this.f52531a.o(o2Var);
    }

    public final void c(b bVar) {
        f fVar = this.f52533c;
        if (fVar != null) {
            if (fVar.f97482h == null) {
                fVar.f97482h = new ArrayList();
            }
            fVar.f97482h.add(bVar);
            fVar.j(fVar.e() - 1);
        }
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i13) {
        return this.f52531a.canScrollVertically(i13);
    }

    public final void d(int i13) {
        int size = this.f52531a.f19246p.size();
        if (i13 < 0 || i13 >= size) {
            return;
        }
        RecyclerView recyclerView = this.f52531a;
        ArrayList arrayList = recyclerView.f19246p;
        int size2 = arrayList.size();
        if (i13 < 0 || i13 >= size2) {
            throw new IndexOutOfBoundsException(i13 + " is an invalid index for size " + size2);
        }
        int size3 = arrayList.size();
        if (i13 >= 0 && i13 < size3) {
            recyclerView.t2((h2) arrayList.get(i13));
            return;
        }
        throw new IndexOutOfBoundsException(i13 + " is an invalid index for size " + size3);
    }

    public final void e(o2 o2Var) {
        this.f52531a.w2(o2Var);
    }

    public final void f(Bundle bundle) {
        Parcelable parcelable;
        if (this.f52535e == null || (parcelable = bundle.getParcelable("PinterestRecyclerView.LAYOUT_MANAGER_SAVED_STATE_KEY")) == null) {
            return;
        }
        this.f52535e.z0(parcelable);
    }

    public final void g(int i13) {
        h(i13, true);
    }

    public final void h(int i13, boolean z13) {
        if (z13) {
            this.f52531a.d3(i13);
        } else {
            this.f52531a.G2(i13);
        }
    }

    public final void i(int i13, int i14) {
        l2 l2Var = this.f52531a.f19242n;
        if (l2Var instanceof PinterestStaggeredGridLayoutManager) {
            PinterestStaggeredGridLayoutManager pinterestStaggeredGridLayoutManager = (PinterestStaggeredGridLayoutManager) l2Var;
            if (pinterestStaggeredGridLayoutManager != null) {
                pinterestStaggeredGridLayoutManager.e1(i13, i14);
                return;
            }
            return;
        }
        if (!(l2Var instanceof LinearLayoutManager)) {
            g(i13);
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) l2Var;
        if (linearLayoutManager != null) {
            linearLayoutManager.B1(i13, i14);
        }
    }

    @Override // qe0.a
    public final boolean isEmpty() {
        f fVar = this.f52533c;
        return fVar == null || fVar.isEmpty();
    }

    public final void j(s1 s1Var) {
        f fVar;
        f fVar2 = this.f52533c;
        if (fVar2 != null) {
            ((s1) fVar2.f97495d).D();
        }
        if (this.f52534d != null) {
            int i13 = d.f104450m1;
            fVar = new f(s1Var);
            fVar.A(true);
        } else {
            fVar = new f(s1Var);
        }
        this.f52533c = fVar;
        this.f52531a.H2(fVar);
        ((s1) this.f52533c.f97495d).C();
    }

    public final void k(g2 g2Var) {
        this.f52531a.O2(g2Var);
    }

    public final void l(l2 l2Var) {
        this.f52535e = l2Var;
        this.f52531a.R2(l2Var);
        RecyclerView recyclerView = this.f52531a;
        l2 l2Var2 = recyclerView.f19242n;
        if (l2Var2 instanceof GridLayoutManager) {
            b2 b2Var = recyclerView.f19240m;
            if (b2Var instanceof f) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) l2Var2;
                f fVar = (f) b2Var;
                if (fVar != null) {
                    gridLayoutManager.K = new r1(fVar, gridLayoutManager, gridLayoutManager.P1());
                }
            }
        }
    }

    public final void m(boolean z13) {
        this.f52539i = z13;
        f fVar = this.f52533c;
        if (fVar != null) {
            boolean z14 = this.f52538h && z13;
            if (fVar.f97479e == z14) {
                return;
            }
            fVar.f97479e = z14;
            if (z14) {
                fVar.j(fVar.e() - 1);
            } else {
                fVar.p(fVar.e());
            }
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z13) {
        super.onWindowFocusChanged(z13);
        Iterator it = this.f52532b.iterator();
        while (it.hasNext()) {
            ((u) it.next()).e(this.f52531a, z13);
        }
    }

    public PinterestRecyclerView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f52536f = nl1.f.view_pinterest_recycler_view;
        this.f52537g = e.recycler_adapter_view;
        this.f52538h = true;
        this.f52539i = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.PinterestRecyclerView, i13, 0);
        this.f52536f = obtainStyledAttributes.getResourceId(g.PinterestRecyclerView_layoutId, this.f52536f);
        this.f52537g = obtainStyledAttributes.getResourceId(g.PinterestRecyclerView_recyclerViewId, this.f52537g);
        obtainStyledAttributes.recycle();
        setOrientation(1);
        View.inflate(context, this.f52536f, this);
        this.f52531a = (RecyclerView) findViewById(this.f52537g);
        this.f52532b = new HashSet();
        this.f52531a.setClickable(true);
        RecyclerView recyclerView = this.f52531a;
        recyclerView.f19254t = true;
        recyclerView.setClipToPadding(false);
        this.f52531a.setClipChildren(false);
        q1 q1Var = new q1();
        getContext();
        PinterestLinearLayoutManager pinterestLinearLayoutManager = new PinterestLinearLayoutManager(q1Var);
        this.f52535e = pinterestLinearLayoutManager;
        this.f52531a.R2(pinterestLinearLayoutManager);
        this.f52531a.O2(new s());
    }
}
