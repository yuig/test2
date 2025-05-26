package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16346a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f16347b;

    /* renamed from: c, reason: collision with root package name */
    public int f16348c;

    public ButtonBarLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16348c = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.j.ButtonBarLayout);
        q5.v0.n(this, context, i.j.ButtonBarLayout, attributeSet, obtainStyledAttributes, 0, 0);
        boolean z13 = obtainStyledAttributes.getBoolean(i.j.ButtonBarLayout_allowStacking, true);
        this.f16346a = z13;
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            a(z13);
        }
    }

    public final void a(boolean z13) {
        if (this.f16347b != z13) {
            if (!z13 || this.f16346a) {
                this.f16347b = z13;
                setOrientation(z13 ? 1 : 0);
                setGravity(z13 ? 8388613 : 80);
                View findViewById = findViewById(i.f.spacer);
                if (findViewById != null) {
                    findViewById.setVisibility(z13 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0045, code lost:
    
        if (r3 != false) goto L24;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            boolean r1 = r6.f16346a
            r2 = 0
            if (r1 == 0) goto L16
            int r3 = r6.f16348c
            if (r0 <= r3) goto L14
            boolean r3 = r6.f16347b
            if (r3 == 0) goto L14
            r6.a(r2)
        L14:
            r6.f16348c = r0
        L16:
            boolean r3 = r6.f16347b
            r4 = 1
            if (r3 != 0) goto L2b
            int r3 = android.view.View.MeasureSpec.getMode(r7)
            r5 = 1073741824(0x40000000, float:2.0)
            if (r3 != r5) goto L2b
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r3 = r4
            goto L2d
        L2b:
            r0 = r7
            r3 = r2
        L2d:
            super.onMeasure(r0, r8)
            if (r1 == 0) goto L45
            boolean r0 = r6.f16347b
            if (r0 != 0) goto L45
            int r0 = r6.getMeasuredWidthAndState()
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r1
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            if (r0 != r1) goto L45
            r6.a(r4)
            goto L47
        L45:
            if (r3 == 0) goto L4a
        L47:
            super.onMeasure(r7, r8)
        L4a:
            int r0 = r6.getChildCount()
            r1 = r2
        L4f:
            r3 = -1
            if (r1 >= r0) goto L60
            android.view.View r5 = r6.getChildAt(r1)
            int r5 = r5.getVisibility()
            if (r5 != 0) goto L5d
            goto L61
        L5d:
            int r1 = r1 + 1
            goto L4f
        L60:
            r1 = r3
        L61:
            if (r1 < 0) goto Lba
            android.view.View r0 = r6.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            int r5 = r6.getPaddingTop()
            int r0 = r0.getMeasuredHeight()
            int r0 = r0 + r5
            int r5 = r2.topMargin
            int r0 = r0 + r5
            int r2 = r2.bottomMargin
            int r0 = r0 + r2
            boolean r2 = r6.f16347b
            if (r2 == 0) goto Lb4
            int r1 = r1 + r4
            int r2 = r6.getChildCount()
        L85:
            if (r1 >= r2) goto L96
            android.view.View r4 = r6.getChildAt(r1)
            int r4 = r4.getVisibility()
            if (r4 != 0) goto L93
            r3 = r1
            goto L96
        L93:
            int r1 = r1 + 1
            goto L85
        L96:
            if (r3 < 0) goto Lb2
            android.view.View r1 = r6.getChildAt(r3)
            int r1 = r1.getPaddingTop()
            android.content.res.Resources r2 = r6.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r3 = 1098907648(0x41800000, float:16.0)
            float r2 = r2 * r3
            int r2 = (int) r2
            int r1 = r1 + r2
            int r1 = r1 + r0
            r2 = r1
            goto Lba
        Lb2:
            r2 = r0
            goto Lba
        Lb4:
            int r1 = r6.getPaddingBottom()
            int r2 = r1 + r0
        Lba:
            java.util.WeakHashMap r0 = q5.v0.f102521a
            int r0 = r6.getMinimumHeight()
            if (r0 == r2) goto Lca
            r6.setMinimumHeight(r2)
            if (r8 != 0) goto Lca
            super.onMeasure(r7, r8)
        Lca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ButtonBarLayout.onMeasure(int, int):void");
    }
}
