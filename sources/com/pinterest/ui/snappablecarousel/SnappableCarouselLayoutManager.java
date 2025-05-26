package com.pinterest.ui.snappablecarousel;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.PinterestLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d1;
import androidx.recyclerview.widget.l2;
import androidx.recyclerview.widget.m1;
import androidx.recyclerview.widget.q2;
import androidx.recyclerview.widget.r0;
import androidx.recyclerview.widget.w2;
import fb2.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/ui/snappablecarousel/SnappableCarouselLayoutManager;", "Landroidx/recyclerview/widget/PinterestLinearLayoutManager;", "gi2/b", "searchLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public class SnappableCarouselLayoutManager extends PinterestLinearLayoutManager {
    public final c F;
    public final int G;
    public final float H;
    public final boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f52642J;
    public float K;
    public float L;
    public Integer M;
    public RecyclerView N;
    public final d1 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnappableCarouselLayoutManager(r0 debugTag, Context context, c itemScrolledToListener, int i13, int i14) {
        super(debugTag);
        i13 = (i14 & 8) != 0 ? 0 : i13;
        boolean z13 = (i14 & 32) != 0;
        Intrinsics.checkNotNullParameter(debugTag, "debugTag");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(itemScrolledToListener, "itemScrolledToListener");
        this.F = itemScrolledToListener;
        this.G = i13;
        this.H = 100.0f;
        this.I = z13;
        this.K = 1.0f;
        this.L = 1.0f;
        C1(0);
        this.O = new d1();
    }

    @Override // androidx.recyclerview.widget.l2
    public final void B0(int i13) {
        if (i13 == 0) {
            RecyclerView recyclerView = this.N;
            if (recyclerView == null) {
                Intrinsics.r("recyclerView");
                throw null;
            }
            int right = recyclerView.getRight();
            RecyclerView recyclerView2 = this.N;
            if (recyclerView2 == null) {
                Intrinsics.r("recyclerView");
                throw null;
            }
            int left = (right - recyclerView2.getLeft()) / 2;
            RecyclerView recyclerView3 = this.N;
            if (recyclerView3 == null) {
                Intrinsics.r("recyclerView");
                throw null;
            }
            int left2 = recyclerView3.getLeft() + left;
            RecyclerView recyclerView4 = this.N;
            if (recyclerView4 == null) {
                Intrinsics.r("recyclerView");
                throw null;
            }
            int width = recyclerView4.getWidth();
            RecyclerView recyclerView5 = this.N;
            if (recyclerView5 == null) {
                Intrinsics.r("recyclerView");
                throw null;
            }
            int childCount = recyclerView5.getChildCount();
            int i14 = -1;
            for (int i15 = 0; i15 < childCount; i15++) {
                RecyclerView recyclerView6 = this.N;
                if (recyclerView6 == null) {
                    Intrinsics.r("recyclerView");
                    throw null;
                }
                View childAt = recyclerView6.getChildAt(i15);
                int abs = Math.abs((((l2.N(childAt) - l2.K(childAt)) / 2) + l2.K(childAt)) - left2);
                if (abs < width) {
                    if (this.N == null) {
                        Intrinsics.r("recyclerView");
                        throw null;
                    }
                    i14 = RecyclerView.s1(childAt);
                    width = abs;
                }
            }
            Integer num = this.M;
            if (num == null || i14 != num.intValue()) {
                this.F.A(i14);
            }
            this.M = Integer.valueOf(i14);
        }
    }

    public void I1() {
        float f13 = this.f19506n / 2.0f;
        int E = E();
        for (int i13 = 0; i13 < E; i13++) {
            View D = D(i13);
            if (D == null) {
                return;
            }
            int K = l2.K(D);
            int i14 = this.G;
            float sqrt = 1 - (((float) Math.sqrt(Math.abs(f13 - (((l2.N(D) + (K + i14)) - i14) / 2.0f)) / this.f19506n)) * this.K);
            if (!this.f52642J) {
                float f14 = this.L;
                if (sqrt <= f14) {
                    sqrt = f14;
                }
            }
            D.setScaleX(sqrt);
            D.setScaleY(sqrt);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.l2
    public final int L0(int i13, q2 q2Var, w2 w2Var) {
        if (this.f19157p != 0) {
            return 0;
        }
        int L0 = super.L0(i13, q2Var, w2Var);
        if (this.I) {
            I1();
        }
        return L0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.l2
    public final void W0(RecyclerView recyclerView, w2 w2Var, int i13) {
        m1 m1Var = new m1(10, recyclerView != null ? recyclerView.getContext() : null, this);
        m1Var.f19651a = i13;
        X0(m1Var);
    }

    @Override // androidx.recyclerview.widget.l2
    public final void l0(RecyclerView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.N = view;
        if (view != null) {
            this.O.b(view);
        } else {
            Intrinsics.r("recyclerView");
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.l2
    public final void m0(RecyclerView recyclerView, q2 q2Var) {
        this.O.b(null);
    }

    @Override // androidx.recyclerview.widget.PinterestLinearLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.l2
    public final void x0(q2 q2Var, w2 w2Var) {
        super.x0(q2Var, w2Var);
        if (this.I) {
            I1();
        }
    }
}
