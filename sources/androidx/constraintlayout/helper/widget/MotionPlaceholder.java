package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.VirtualLayout;
import u4.n;
import u4.q;
import u4.r;

/* loaded from: classes3.dex */
public class MotionPlaceholder extends VirtualLayout {
    public MotionPlaceholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public final void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        this.f17649d = new q();
        x();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onMeasure(int i13, int i14) {
        y(null, i13, i14);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void w(n nVar, SparseArray sparseArray) {
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

    public MotionPlaceholder(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
    }
}
