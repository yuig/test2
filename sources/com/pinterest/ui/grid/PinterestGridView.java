package com.pinterest.ui.grid;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.q1;
import com.pinterest.api.model.Feed;
import com.pinterest.ui.scrollview.ObservableScrollView;
import cu.q;
import h32.a4;
import h32.d4;
import hf0.b;
import hy.c;
import hy.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kh2.k3;
import m60.u;
import m60.w;
import m60.y0;
import os.l;
import qa2.o1;
import qa2.p1;
import qp.k;
import wy1.d;
import wy1.e;

@Deprecated
/* loaded from: classes4.dex */
public class PinterestGridView extends ObservableScrollView {
    public final LinearLayout O;
    public final AdapterEmptyView P;
    public final PinterestAdapterView Q;
    public final AdapterFooterView R;
    public p1 S;
    public l T;
    public o1 U;
    public AdapterView.OnItemClickListener V;
    public AdapterView.OnItemLongClickListener W;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f52525a0;

    /* renamed from: b0, reason: collision with root package name */
    public final boolean f52526b0;

    /* renamed from: c0, reason: collision with root package name */
    public d4 f52527c0;

    /* renamed from: d0, reason: collision with root package name */
    public a4 f52528d0;

    /* renamed from: e0, reason: collision with root package name */
    public final q1 f52529e0;

    public PinterestGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void G0(Feed feed) {
        l lVar = this.T;
        if (lVar != null) {
            Feed feed2 = lVar.f97490a;
            if (feed2 == null) {
                lVar.g(feed);
            } else {
                feed2.j(feed);
                this.T.notifyDataSetChanged();
            }
        }
    }

    public final void H0() {
        AdapterFooterView adapterFooterView;
        l lVar = this.T;
        if (lVar != null) {
            lVar.unregisterDataSetObserver(this.f52529e0);
        }
        r1(null);
        PinterestAdapterView pinterestAdapterView = this.Q;
        pinterestAdapterView.getClass();
        pinterestAdapterView.f52508k = new WeakReference(null);
        p1(null);
        this.W = null;
        this.Q.f52511n = null;
        LinearLayout linearLayout = this.O;
        if (linearLayout == null || (adapterFooterView = this.R) == null) {
            return;
        }
        linearLayout.removeView(adapterFooterView);
    }

    public final void I0() {
        PinterestAdapterView pinterestAdapterView = this.Q;
        if (pinterestAdapterView != null) {
            pinterestAdapterView.h();
        }
    }

    public final PinterestAdapterView K0() {
        return this.Q;
    }

    public final void L0(p1 p1Var, int i13) {
        int i14;
        boolean z13 = false;
        if (p1Var.equals(p1.LOADING)) {
            new f(this.f52527c0, this.f52528d0, false).i();
            return;
        }
        if (p1Var.equals(p1.LOADED)) {
            d4 d4Var = this.f52527c0;
            AdapterFooterView adapterFooterView = this.R;
            if (k3.v1(adapterFooterView)) {
                int[] iArr = new int[2];
                adapterFooterView.getLocationOnScreen(iArr);
                if (adapterFooterView.getHeight() > 0 && (i14 = iArr[1]) > 0 && i14 + adapterFooterView.f52376d < b.f69003c) {
                    z13 = true;
                }
            }
            new hy.b(d4Var, z13, i13, null, null).i();
        }
    }

    public final void P0(op.b bVar) {
        this.T = bVar;
        this.f52525a0 = bVar.isEmpty();
        this.Q.setAdapter(this.T);
        this.T.registerDataSetObserver(this.f52529e0);
    }

    public final void S0(a4 a4Var) {
        this.f52528d0 = a4Var;
    }

    public final void T0(d4 d4Var) {
        this.f52527c0 = d4Var;
    }

    public final void Y0(int i13, int i14) {
        this.O.setPaddingRelative(0, i13, 0, i14);
    }

    public final void b1(Feed feed) {
        l lVar = this.T;
        if (lVar != null) {
            lVar.g(feed);
        }
        d();
    }

    public final void d() {
        this.Q.j();
    }

    public final void n1(String str) {
        AdapterEmptyView adapterEmptyView = this.P;
        if (adapterEmptyView != null) {
            adapterEmptyView.c(str);
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        l lVar = this.T;
        if (lVar != null) {
            lVar.getClass();
        }
    }

    public final void p1(AdapterView.OnItemClickListener onItemClickListener) {
        this.V = onItemClickListener;
        this.Q.f52510m = onItemClickListener;
    }

    public final void r1(o1 o1Var) {
        this.U = o1Var;
        if (o1Var != null) {
            ((k) o1Var).b8(this.S);
        }
    }

    public final void s1(p1 p1Var) {
        this.S = p1Var;
        t1();
        o1 o1Var = this.U;
        if (o1Var != null) {
            ((k) o1Var).b8(p1Var);
        }
    }

    public final void t1() {
        l lVar = this.T;
        boolean z13 = lVar == null || lVar.getCount() == 0;
        this.Q.setVisibility(z13 ? 8 : 0);
        this.R.setVisibility(z13 ? 8 : 0);
        int ordinal = this.S.ordinal();
        if (ordinal == 0) {
            this.P.setVisibility(z13 ? 0 : 8);
            this.R.setVisibility(z13 ? 8 : 0);
            this.P.d(z13 ? 1 : 2);
            AdapterFooterView adapterFooterView = this.R;
            adapterFooterView.f52373a = 1;
            adapterFooterView.a();
            L0(this.S, this.Q.getCount());
            return;
        }
        if (ordinal == 1) {
            if (z13 && !this.f52526b0) {
                this.P.setVisibility(8);
                this.P.d(2);
                return;
            }
            this.P.setVisibility(z13 ? 0 : 8);
            this.R.setVisibility(z13 ? 8 : 0);
            this.P.d(0);
            AdapterFooterView adapterFooterView2 = this.R;
            adapterFooterView2.f52373a = 0;
            adapterFooterView2.a();
            L0(this.S, 0);
            return;
        }
        if (ordinal != 2) {
            this.P.setVisibility(8);
            this.P.d(2);
            AdapterFooterView adapterFooterView3 = this.R;
            adapterFooterView3.f52373a = 2;
            adapterFooterView3.a();
            k3.R1(this.R, true);
            return;
        }
        this.P.setVisibility(z13 ? 0 : 8);
        this.R.setVisibility(z13 ? 8 : 0);
        this.P.d(1);
        AdapterFooterView adapterFooterView4 = this.R;
        adapterFooterView4.f52373a = 1;
        adapterFooterView4.a();
        new c().i();
    }

    public PinterestGridView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.S = p1.LOADING;
        this.f52526b0 = true;
        this.f52529e0 = new q1(this, 3);
        w wVar = u.f85943a;
        LayoutInflater.from(context).inflate(e.view_pinterest_grid, (ViewGroup) this, true);
        this.O = (LinearLayout) findViewById(d.grid_content_vw);
        this.P = (AdapterEmptyView) findViewById(d.empty_vw);
        this.Q = (PinterestAdapterView) findViewById(d.adapter_vw);
        this.R = (AdapterFooterView) findViewById(d.footer_vw);
        this.F.clear();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, y0.BasePinterestView);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(y0.BasePinterestView_additionalOuterBrickPadding, -1);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(y0.BasePinterestView_brickPadding, -1);
            int resourceId = obtainStyledAttributes.getResourceId(y0.BasePinterestView_numColumns, -1);
            obtainStyledAttributes.recycle();
            if (dimensionPixelSize != -1) {
                PinterestAdapterView pinterestAdapterView = this.Q;
                pinterestAdapterView.f52518u = dimensionPixelSize;
                pinterestAdapterView.j();
                pinterestAdapterView.requestLayout();
            }
            if (dimensionPixelSize2 != -1) {
                PinterestAdapterView pinterestAdapterView2 = this.Q;
                pinterestAdapterView2.f52517t = dimensionPixelSize2;
                pinterestAdapterView2.j();
                pinterestAdapterView2.requestLayout();
            }
            if (resourceId != -1) {
                PinterestAdapterView pinterestAdapterView3 = this.Q;
                pinterestAdapterView3.f52523z = resourceId;
                pinterestAdapterView3.f52522y = pinterestAdapterView3.getResources().getInteger(pinterestAdapterView3.f52523z);
                pinterestAdapterView3.f52521x = 0;
                pinterestAdapterView3.j();
                pinterestAdapterView3.requestLayout();
            }
        }
        this.Q.setAdapter(this.T);
        PinterestAdapterView pinterestAdapterView4 = this.Q;
        pinterestAdapterView4.f52503f = this;
        pinterestAdapterView4.f52508k = new WeakReference(null);
        PinterestAdapterView pinterestAdapterView5 = this.Q;
        pinterestAdapterView5.f52510m = this.V;
        pinterestAdapterView5.f52511n = this.W;
        pinterestAdapterView5.setAdapter(this.T);
        q qVar = new q(this, 3);
        ArrayList arrayList = this.F;
        if (!arrayList.contains(qVar)) {
            arrayList.add(qVar);
        }
        if (true != this.f17964m) {
            this.f17964m = true;
            requestLayout();
        }
        t1();
    }
}
