package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.navigation.h;
import com.google.android.material.navigation.l;
import fj.c;
import jj.b;

/* loaded from: classes3.dex */
public class BottomNavigationView extends l {
    public BottomNavigationView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.bottomNavigationStyle);
    }

    @Override // com.google.android.material.navigation.l
    public final h a(Context context) {
        return new b(context);
    }

    @Override // com.google.android.material.navigation.l
    public final int b() {
        return 5;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i14) != 1073741824 && suggestedMinimumHeight > 0) {
            i14 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i14), getPaddingBottom() + getPaddingTop() + suggestedMinimumHeight), 1073741824);
        }
        super.onMeasure(i13, i14);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BottomNavigationView(@androidx.annotation.NonNull android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = fj.l.Widget_Design_BottomNavigationView
            r6.<init>(r7, r8, r9, r4)
            android.content.Context r0 = r6.getContext()
            int[] r2 = fj.m.BottomNavigationView
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            x92.b r8 = com.google.android.material.internal.d0.g(r0, r1, r2, r3, r4, r5)
            int r9 = fj.m.BottomNavigationView_itemHorizontalTranslationEnabled
            r0 = 1
            boolean r9 = r8.t(r9, r0)
            com.google.android.material.navigation.h r1 = r6.f32909b
            jj.b r1 = (jj.b) r1
            boolean r2 = r1.K
            if (r2 == r9) goto L2a
            r1.K = r9
            com.google.android.material.navigation.j r9 = r6.f32910c
            r9.h(r7)
        L2a:
            int r9 = fj.m.BottomNavigationView_android_minHeight
            boolean r9 = r8.G(r9)
            if (r9 == 0) goto L3b
            int r9 = fj.m.BottomNavigationView_android_minHeight
            int r7 = r8.w(r9, r7)
            r6.setMinimumHeight(r7)
        L3b:
            int r7 = fj.m.BottomNavigationView_compatShadowEnabled
            r8.t(r7, r0)
            r8.O()
            oi.u6 r7 = new oi.u6
            r8 = 5
            r7.<init>(r6, r8)
            lb.l0.W(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomnavigation.BottomNavigationView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
