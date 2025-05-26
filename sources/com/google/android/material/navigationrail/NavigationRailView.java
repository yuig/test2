package com.google.android.material.navigationrail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.navigation.h;
import com.google.android.material.navigation.l;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import fj.c;
import wj.a;

/* loaded from: classes3.dex */
public class NavigationRailView extends l {

    /* renamed from: f, reason: collision with root package name */
    public final int f32913f;

    /* renamed from: g, reason: collision with root package name */
    public final View f32914g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f32915h;

    /* renamed from: i, reason: collision with root package name */
    public final Boolean f32916i;

    /* renamed from: j, reason: collision with root package name */
    public final Boolean f32917j;

    public NavigationRailView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.navigationRailStyle);
    }

    @Override // com.google.android.material.navigation.l
    public final h a(Context context) {
        return new a(context);
    }

    @Override // com.google.android.material.navigation.l
    public final int b() {
        return 7;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        a aVar = (a) this.f32909b;
        View view = this.f32914g;
        int i17 = 0;
        boolean z14 = (view == null || view.getVisibility() == 8) ? false : true;
        int i18 = this.f32913f;
        if (z14) {
            int bottom = this.f32914g.getBottom() + i18;
            int top = aVar.getTop();
            if (top < bottom) {
                i17 = bottom - top;
            }
        } else if ((aVar.H.gravity & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) == 48) {
            i17 = i18;
        }
        if (i17 > 0) {
            aVar.layout(aVar.getLeft(), aVar.getTop() + i17, aVar.getRight(), aVar.getBottom() + i17);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i13) != 1073741824 && suggestedMinimumWidth > 0) {
            i13 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i13), getPaddingRight() + getPaddingLeft() + suggestedMinimumWidth), 1073741824);
        }
        super.onMeasure(i13, i14);
        View view = this.f32914g;
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        measureChild((a) this.f32909b, i13, View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - this.f32914g.getMeasuredHeight()) - this.f32913f, Integer.MIN_VALUE));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public NavigationRailView(@androidx.annotation.NonNull android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigationrail.NavigationRailView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
