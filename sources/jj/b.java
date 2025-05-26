package jj;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.navigation.h;
import fj.e;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n.o;
import q5.v0;

/* loaded from: classes3.dex */
public final class b extends h {
    public final int G;
    public final int H;
    public final int I;

    /* renamed from: J, reason: collision with root package name */
    public final int f76304J;
    public boolean K;
    public final ArrayList L;

    public b(Context context) {
        super(context);
        this.L = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.G = resources.getDimensionPixelSize(e.design_bottom_navigation_item_max_width);
        this.H = resources.getDimensionPixelSize(e.design_bottom_navigation_item_min_width);
        this.I = resources.getDimensionPixelSize(e.design_bottom_navigation_active_item_max_width);
        this.f76304J = resources.getDimensionPixelSize(e.design_bottom_navigation_active_item_min_width);
    }

    @Override // com.google.android.material.navigation.h
    public final a e(Context context) {
        return new a(context, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        int childCount = getChildCount();
        int i17 = i15 - i13;
        int i18 = i16 - i14;
        int i19 = 0;
        for (int i23 = 0; i23 < childCount; i23++) {
            View childAt = getChildAt(i23);
            if (childAt.getVisibility() != 8) {
                WeakHashMap weakHashMap = v0.f102521a;
                if (getLayoutDirection() == 1) {
                    int i24 = i17 - i19;
                    childAt.layout(i24 - childAt.getMeasuredWidth(), 0, i24, i18);
                } else {
                    childAt.layout(i19, 0, childAt.getMeasuredWidth() + i19, i18);
                }
                i19 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        int i15;
        int i16;
        o oVar = this.D;
        int size = View.MeasureSpec.getSize(i13);
        int size2 = oVar.m().size();
        int childCount = getChildCount();
        ArrayList arrayList = this.L;
        arrayList.clear();
        int size3 = View.MeasureSpec.getSize(i14);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        boolean f13 = h.f(this.f32882e, size2);
        int i17 = this.I;
        if (f13 && this.K) {
            View childAt = getChildAt(this.f32885h);
            int visibility = childAt.getVisibility();
            int i18 = this.f76304J;
            if (visibility != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i17, Integer.MIN_VALUE), makeMeasureSpec);
                i18 = Math.max(i18, childAt.getMeasuredWidth());
            }
            int i19 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min = Math.min(size - (this.H * i19), Math.min(i18, i17));
            int i23 = size - min;
            int min2 = Math.min(i23 / (i19 != 0 ? i19 : 1), this.G);
            int i24 = i23 - (i19 * min2);
            int i25 = 0;
            while (i25 < childCount) {
                if (getChildAt(i25).getVisibility() != 8) {
                    i16 = i25 == this.f32885h ? min : min2;
                    if (i24 > 0) {
                        i16++;
                        i24--;
                    }
                } else {
                    i16 = 0;
                }
                arrayList.add(Integer.valueOf(i16));
                i25++;
            }
        } else {
            int min3 = Math.min(size / (size2 != 0 ? size2 : 1), i17);
            int i26 = size - (size2 * min3);
            for (int i27 = 0; i27 < childCount; i27++) {
                if (getChildAt(i27).getVisibility() == 8) {
                    i15 = 0;
                } else if (i26 > 0) {
                    i15 = min3 + 1;
                    i26--;
                } else {
                    i15 = min3;
                }
                arrayList.add(Integer.valueOf(i15));
            }
        }
        int i28 = 0;
        for (int i29 = 0; i29 < childCount; i29++) {
            View childAt2 = getChildAt(i29);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(((Integer) arrayList.get(i29)).intValue(), 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i28 = childAt2.getMeasuredWidth() + i28;
            }
        }
        setMeasuredDimension(i28, size3);
    }
}
