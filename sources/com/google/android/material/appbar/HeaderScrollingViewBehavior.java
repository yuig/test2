package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.search.SearchBar;
import java.util.List;
import java.util.WeakHashMap;
import q5.a2;
import q5.v0;

/* loaded from: classes.dex */
abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {

    /* renamed from: c, reason: collision with root package name */
    public final Rect f32172c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f32173d;

    /* renamed from: e, reason: collision with root package name */
    public int f32174e;

    /* renamed from: f, reason: collision with root package name */
    public int f32175f;

    public HeaderScrollingViewBehavior() {
        this.f32172c = new Rect();
        this.f32173d = new Rect();
        this.f32174e = 0;
    }

    public static int K(int i13) {
        if (i13 == 0) {
            return 8388659;
        }
        return i13;
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    public final void E(CoordinatorLayout coordinatorLayout, View view, int i13) {
        AppBarLayout G = G(coordinatorLayout.p(view));
        if (G == null) {
            coordinatorLayout.F(view, i13);
            this.f32174e = 0;
            return;
        }
        androidx.coordinatorlayout.widget.c cVar = (androidx.coordinatorlayout.widget.c) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        int bottom = G.getBottom() + ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
        int bottom2 = ((G.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) cVar).bottomMargin;
        Rect rect = this.f32172c;
        rect.set(paddingLeft, bottom, width, bottom2);
        a2 w13 = coordinatorLayout.w();
        if (w13 != null) {
            WeakHashMap weakHashMap = v0.f102521a;
            if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rect.left = w13.c() + rect.left;
                rect.right -= w13.d();
            }
        }
        int K = K(cVar.f17902c);
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Rect rect2 = this.f32173d;
        Gravity.apply(K, measuredWidth, measuredHeight, rect, rect2, i13);
        int H = H(G);
        view.layout(rect2.left, rect2.top - H, rect2.right, rect2.bottom - H);
        this.f32174e = rect2.top - G.getBottom();
    }

    public abstract AppBarLayout G(List list);

    public final int H(View view) {
        if (this.f32175f == 0) {
            return 0;
        }
        float I = I(view);
        int i13 = this.f32175f;
        return com.bumptech.glide.c.q((int) (I * i13), 0, i13);
    }

    public float I(View view) {
        return 1.0f;
    }

    public int J(View view) {
        return view.getMeasuredHeight();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i13, int i14, int i15) {
        AppBarLayout G;
        a2 a2Var;
        int i16 = view.getLayoutParams().height;
        if ((i16 != -1 && i16 != -2) || (G = G(coordinatorLayout.p(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i15);
        if (size > 0) {
            WeakHashMap weakHashMap = v0.f102521a;
            if (G.getFitsSystemWindows() && (a2Var = coordinatorLayout.f17893m) != null) {
                size += a2Var.b() + a2Var.e();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        int J2 = size + J(G);
        int measuredHeight = G.getMeasuredHeight();
        if (this instanceof SearchBar.ScrollingViewBehavior) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            J2 -= measuredHeight;
        }
        coordinatorLayout.G(view, i13, i14, View.MeasureSpec.makeMeasureSpec(J2, i16 == -1 ? 1073741824 : Integer.MIN_VALUE));
        return true;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32172c = new Rect();
        this.f32173d = new Rect();
        this.f32174e = 0;
    }
}
