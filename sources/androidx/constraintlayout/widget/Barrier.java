package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.widget.Constraints;

/* loaded from: classes3.dex */
public class Barrier extends ConstraintHelper {

    /* renamed from: i, reason: collision with root package name */
    public int f17643i;

    /* renamed from: j, reason: collision with root package name */
    public int f17644j;

    /* renamed from: k, reason: collision with root package name */
    public u4.a f17645k;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public final int A() {
        return this.f17643i;
    }

    public final void B(u4.h hVar, int i13, boolean z13) {
        this.f17644j = i13;
        if (z13) {
            int i14 = this.f17643i;
            if (i14 == 5) {
                this.f17644j = 1;
            } else if (i14 == 6) {
                this.f17644j = 0;
            }
        } else {
            int i15 = this.f17643i;
            if (i15 == 5) {
                this.f17644j = 0;
            } else if (i15 == 6) {
                this.f17644j = 1;
            }
        }
        if (hVar instanceof u4.a) {
            ((u4.a) hVar).f120163x0 = this.f17644j;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        this.f17645k = new u4.a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = obtainStyledAttributes.getIndex(i13);
                if (index == s.ConstraintLayout_Layout_barrierDirection) {
                    this.f17643i = obtainStyledAttributes.getInt(index, 0);
                } else if (index == s.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f17645k.f120164y0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == s.ConstraintLayout_Layout_barrierMargin) {
                    this.f17645k.f120165z0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f17649d = this.f17645k;
        x();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void n(k kVar, u4.o oVar, Constraints.LayoutParams layoutParams, SparseArray sparseArray) {
        super.n(kVar, oVar, layoutParams, sparseArray);
        if (oVar instanceof u4.a) {
            u4.a aVar = (u4.a) oVar;
            boolean z13 = ((u4.i) oVar.V).A0;
            l lVar = kVar.f17767e;
            B(aVar, lVar.f17786g0, z13);
            aVar.f120164y0 = lVar.f17802o0;
            aVar.f120165z0 = lVar.f17788h0;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void p(u4.h hVar, boolean z13) {
        B(hVar, this.f17643i, z13);
    }

    public final boolean y() {
        return this.f17645k.f120164y0;
    }

    public final int z() {
        return this.f17645k.f120165z0;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        super.setVisibility(8);
    }
}
