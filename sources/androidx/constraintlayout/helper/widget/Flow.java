package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.VirtualLayout;
import androidx.constraintlayout.widget.s;
import u4.h;
import u4.k;
import u4.o;
import u4.r;

/* loaded from: classes3.dex */
public class Flow extends VirtualLayout {

    /* renamed from: k, reason: collision with root package name */
    public k f17494k;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void A() {
        this.f17494k.I0 = 2;
        requestLayout();
    }

    public final void B(int i13) {
        this.f17494k.Z0 = i13;
        requestLayout();
    }

    public final void C() {
        this.f17494k.f120265a1 = 0;
        requestLayout();
    }

    public final void D(int i13) {
        this.f17494k.V0 = i13;
        requestLayout();
    }

    public final void E(int i13) {
        this.f17494k.Y0 = i13;
        requestLayout();
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public final void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        this.f17494k = new k();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = obtainStyledAttributes.getIndex(i13);
                if (index == s.ConstraintLayout_Layout_android_orientation) {
                    this.f17494k.f120265a1 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == s.ConstraintLayout_Layout_android_padding) {
                    k kVar = this.f17494k;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    kVar.f120281x0 = dimensionPixelSize;
                    kVar.f120282y0 = dimensionPixelSize;
                    kVar.f120283z0 = dimensionPixelSize;
                    kVar.A0 = dimensionPixelSize;
                } else if (index == s.ConstraintLayout_Layout_android_paddingStart) {
                    k kVar2 = this.f17494k;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    kVar2.f120283z0 = dimensionPixelSize2;
                    kVar2.B0 = dimensionPixelSize2;
                    kVar2.C0 = dimensionPixelSize2;
                } else if (index == s.ConstraintLayout_Layout_android_paddingEnd) {
                    this.f17494k.A0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == s.ConstraintLayout_Layout_android_paddingLeft) {
                    this.f17494k.B0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == s.ConstraintLayout_Layout_android_paddingTop) {
                    this.f17494k.f120281x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == s.ConstraintLayout_Layout_android_paddingRight) {
                    this.f17494k.C0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == s.ConstraintLayout_Layout_android_paddingBottom) {
                    this.f17494k.f120282y0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == s.ConstraintLayout_Layout_flow_wrapMode) {
                    this.f17494k.Y0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == s.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.f17494k.I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == s.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.f17494k.J0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == s.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.f17494k.K0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == s.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.f17494k.M0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == s.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.f17494k.L0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == s.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.f17494k.N0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == s.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.f17494k.O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == s.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.f17494k.Q0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == s.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.f17494k.S0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == s.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.f17494k.R0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == s.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.f17494k.T0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == s.ConstraintLayout_Layout_flow_verticalBias) {
                    this.f17494k.P0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == s.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.f17494k.W0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == s.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.f17494k.X0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == s.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.f17494k.U0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == s.ConstraintLayout_Layout_flow_verticalGap) {
                    this.f17494k.V0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == s.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.f17494k.Z0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f17649d = this.f17494k;
        x();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void n(androidx.constraintlayout.widget.k kVar, o oVar, Constraints.LayoutParams layoutParams, SparseArray sparseArray) {
        super.n(kVar, oVar, layoutParams, sparseArray);
        if (oVar instanceof k) {
            k kVar2 = (k) oVar;
            int i13 = layoutParams.V;
            if (i13 != -1) {
                kVar2.f120265a1 = i13;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onMeasure(int i13, int i14) {
        y(this.f17494k, i13, i14);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void p(h hVar, boolean z13) {
        k kVar = this.f17494k;
        int i13 = kVar.f120283z0;
        if (i13 > 0 || kVar.A0 > 0) {
            if (z13) {
                kVar.B0 = kVar.A0;
                kVar.C0 = i13;
            } else {
                kVar.B0 = i13;
                kVar.C0 = kVar.A0;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    public final void y(r rVar, int i13, int i14) {
        int mode = View.MeasureSpec.getMode(i13);
        int size = View.MeasureSpec.getSize(i13);
        int mode2 = View.MeasureSpec.getMode(i14);
        int size2 = View.MeasureSpec.getSize(i14);
        if (rVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            rVar.i0(mode, size, mode2, size2);
            setMeasuredDimension(rVar.E0, rVar.F0);
        }
    }

    public final void z(int i13) {
        this.f17494k.U0 = i13;
        requestLayout();
    }

    public Flow(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
    }
}
