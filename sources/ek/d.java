package ek;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;
import java.util.WeakHashMap;
import lb.l0;
import q5.v0;

/* loaded from: classes.dex */
public final class d extends LinearLayout {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f59121c = 0;

    /* renamed from: a, reason: collision with root package name */
    public ValueAnimator f59122a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TabLayout f59123b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, TabLayout tabLayout) {
        super(context);
        this.f59123b = tabLayout;
        setWillNotDraw(false);
    }

    public final void a(int i13) {
        TabLayout tabLayout = this.f59123b;
        if (tabLayout.S == 0 || (tabLayout.o().getBounds().left == -1 && tabLayout.o().getBounds().right == -1)) {
            View childAt = getChildAt(i13);
            com.google.android.gms.common.api.d dVar = tabLayout.H;
            Drawable drawable = tabLayout.f33139o;
            dVar.getClass();
            RectF c13 = com.google.android.gms.common.api.d.c(childAt, tabLayout);
            drawable.setBounds((int) c13.left, drawable.getBounds().top, (int) c13.right, drawable.getBounds().bottom);
            tabLayout.f33125a = i13;
        }
    }

    public final void b(View view, View view2, float f13) {
        TabLayout tabLayout = this.f59123b;
        if (view == null || view.getWidth() <= 0) {
            Drawable drawable = tabLayout.f33139o;
            drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.f33139o.getBounds().bottom);
        } else {
            tabLayout.H.e(tabLayout, view, view2, f13, tabLayout.f33139o);
        }
        WeakHashMap weakHashMap = v0.f102521a;
        postInvalidateOnAnimation();
    }

    public final void c(int i13, int i14, boolean z13) {
        TabLayout tabLayout = this.f59123b;
        if (tabLayout.f33125a == i13) {
            return;
        }
        View childAt = getChildAt(tabLayout.m());
        View childAt2 = getChildAt(i13);
        if (childAt2 == null) {
            a(tabLayout.m());
            return;
        }
        tabLayout.f33125a = i13;
        com.google.android.material.internal.f fVar = new com.google.android.material.internal.f(this, childAt, childAt2);
        if (!z13) {
            this.f59122a.removeAllUpdateListeners();
            this.f59122a.addUpdateListener(fVar);
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f59122a = valueAnimator;
        valueAnimator.setInterpolator(tabLayout.I);
        valueAnimator.setDuration(i14);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(fVar);
        valueAnimator.start();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int height;
        TabLayout tabLayout = this.f59123b;
        int height2 = tabLayout.f33139o.getBounds().height();
        if (height2 < 0) {
            height2 = tabLayout.f33139o.getIntrinsicHeight();
        }
        int i13 = tabLayout.B;
        if (i13 == 0) {
            height = getHeight() - height2;
            height2 = getHeight();
        } else if (i13 != 1) {
            height = 0;
            if (i13 != 2) {
                height2 = i13 != 3 ? 0 : getHeight();
            }
        } else {
            height = (getHeight() - height2) / 2;
            height2 = (getHeight() + height2) / 2;
        }
        if (tabLayout.f33139o.getBounds().width() > 0) {
            Rect bounds = tabLayout.f33139o.getBounds();
            tabLayout.f33139o.setBounds(bounds.left, height, bounds.right, height2);
            tabLayout.f33139o.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        ValueAnimator valueAnimator = this.f59122a;
        TabLayout tabLayout = this.f59123b;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            c(tabLayout.m(), -1, false);
            return;
        }
        if (tabLayout.f33125a == -1) {
            tabLayout.f33125a = tabLayout.m();
        }
        a(tabLayout.f33125a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        if (View.MeasureSpec.getMode(i13) != 1073741824) {
            return;
        }
        TabLayout tabLayout = this.f59123b;
        if (tabLayout.f33150z == 1 || tabLayout.C == 2) {
            int childCount = getChildCount();
            int i15 = 0;
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = getChildAt(i16);
                if (childAt.getVisibility() == 0) {
                    i15 = Math.max(i15, childAt.getMeasuredWidth());
                }
            }
            if (i15 <= 0) {
                return;
            }
            if (i15 * childCount <= getMeasuredWidth() - (((int) l0.X(getContext(), 16)) * 2)) {
                boolean z13 = false;
                for (int i17 = 0; i17 < childCount; i17++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i17).getLayoutParams();
                    if (layoutParams.width != i15 || layoutParams.weight != 0.0f) {
                        layoutParams.width = i15;
                        layoutParams.weight = 0.0f;
                        z13 = true;
                    }
                }
                if (!z13) {
                    return;
                }
            } else {
                tabLayout.f33150z = 0;
                tabLayout.A(false);
            }
            super.onMeasure(i13, i14);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i13) {
        super.onRtlPropertiesChanged(i13);
    }
}
