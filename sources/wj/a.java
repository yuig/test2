package wj;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.navigation.f;
import com.google.android.material.navigation.h;

/* loaded from: classes3.dex */
public final class a extends h {
    public int G;
    public final FrameLayout.LayoutParams H;

    public a(Context context) {
        super(context);
        this.G = -1;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.H = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        this.A = true;
        f[] fVarArr = this.f32883f;
        if (fVarArr != null) {
            for (f fVar : fVarArr) {
                fVar.C = true;
            }
        }
    }

    @Override // com.google.android.material.navigation.h
    public final jj.a e(Context context) {
        return new jj.a(context, 1);
    }

    public final int g(View view, int i13, int i14, int i15) {
        int makeMeasureSpec;
        int i16;
        if (view == null) {
            int max = i14 / Math.max(1, i15);
            int i17 = this.G;
            if (i17 == -1) {
                i17 = View.MeasureSpec.getSize(i13);
            }
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i17, max), 0);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        }
        int childCount = getChildCount();
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt != view) {
                if (childAt.getVisibility() != 8) {
                    childAt.measure(i13, makeMeasureSpec);
                    i16 = childAt.getMeasuredHeight();
                } else {
                    i16 = 0;
                }
                i18 += i16;
            }
        }
        return i18;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        int childCount = getChildCount();
        int i17 = i15 - i13;
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                int measuredHeight = childAt.getMeasuredHeight() + i18;
                childAt.layout(0, i18, i17, measuredHeight);
                i18 = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        int g13;
        int i15;
        int size = View.MeasureSpec.getSize(i14);
        int size2 = this.D.m().size();
        if (size2 <= 1 || !h.f(this.f32882e, size2)) {
            g13 = g(null, i13, size, size2);
        } else {
            View childAt = getChildAt(this.f32885h);
            if (childAt != null) {
                int max = size / Math.max(1, size2);
                int i16 = this.G;
                if (i16 == -1) {
                    i16 = View.MeasureSpec.getSize(i13);
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i16, max), 0);
                if (childAt.getVisibility() != 8) {
                    childAt.measure(i13, makeMeasureSpec);
                    i15 = childAt.getMeasuredHeight();
                } else {
                    i15 = 0;
                }
                size -= i15;
                size2--;
            } else {
                i15 = 0;
            }
            g13 = g(childAt, i13, size, size2) + i15;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i13), View.resolveSizeAndState(g13, i14, 0));
    }
}
