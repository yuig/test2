package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.e0;
import fj.m;
import java.util.WeakHashMap;
import q5.a2;
import q5.k0;
import q5.v0;

/* loaded from: classes3.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    public static final int E = fj.l.Widget_Design_CollapsingToolbar;
    public int A;
    public final boolean B;
    public int C;
    public final boolean D;

    /* renamed from: a, reason: collision with root package name */
    public boolean f32137a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32138b;

    /* renamed from: c, reason: collision with root package name */
    public ViewGroup f32139c;

    /* renamed from: d, reason: collision with root package name */
    public View f32140d;

    /* renamed from: e, reason: collision with root package name */
    public View f32141e;

    /* renamed from: f, reason: collision with root package name */
    public final int f32142f;

    /* renamed from: g, reason: collision with root package name */
    public final int f32143g;

    /* renamed from: h, reason: collision with root package name */
    public final int f32144h;

    /* renamed from: i, reason: collision with root package name */
    public final int f32145i;

    /* renamed from: j, reason: collision with root package name */
    public final Rect f32146j;

    /* renamed from: k, reason: collision with root package name */
    public final com.google.android.material.internal.c f32147k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f32148l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f32149m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f32150n;

    /* renamed from: o, reason: collision with root package name */
    public final Drawable f32151o;

    /* renamed from: p, reason: collision with root package name */
    public int f32152p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f32153q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f32154r;

    /* renamed from: s, reason: collision with root package name */
    public final long f32155s;

    /* renamed from: t, reason: collision with root package name */
    public final TimeInterpolator f32156t;

    /* renamed from: u, reason: collision with root package name */
    public final TimeInterpolator f32157u;

    /* renamed from: v, reason: collision with root package name */
    public final int f32158v;

    /* renamed from: w, reason: collision with root package name */
    public i f32159w;

    /* renamed from: x, reason: collision with root package name */
    public int f32160x;

    /* renamed from: y, reason: collision with root package name */
    public final int f32161y;

    /* renamed from: z, reason: collision with root package name */
    public a2 f32162z;

    public static class LayoutParams extends FrameLayout.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f32163a;

        /* renamed from: b, reason: collision with root package name */
        public float f32164b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f32163a = 0;
            this.f32164b = 0.5f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.CollapsingToolbarLayout_Layout);
            this.f32163a = obtainStyledAttributes.getInt(m.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            this.f32164b = obtainStyledAttributes.getFloat(m.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f);
            obtainStyledAttributes.recycle();
        }
    }

    public CollapsingToolbarLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fj.c.collapsingToolbarLayoutStyle);
    }

    public static k c(View view) {
        k kVar = (k) view.getTag(fj.g.view_offset_helper);
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(view);
        view.setTag(fj.g.view_offset_helper, kVar2);
        return kVar2;
    }

    public final void a() {
        View view;
        if (this.f32137a) {
            ViewGroup viewGroup = null;
            this.f32139c = null;
            this.f32140d = null;
            int i13 = this.f32138b;
            if (i13 != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i13);
                this.f32139c = viewGroup2;
                if (viewGroup2 != null) {
                    ViewParent parent = viewGroup2.getParent();
                    View view2 = viewGroup2;
                    while (parent != this && parent != null) {
                        if (parent instanceof View) {
                            view2 = (View) parent;
                        }
                        parent = parent.getParent();
                        view2 = view2;
                    }
                    this.f32140d = view2;
                }
            }
            if (this.f32139c == null) {
                int childCount = getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = getChildAt(i14);
                    if ((childAt instanceof Toolbar) || (childAt instanceof android.widget.Toolbar)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.f32139c = viewGroup;
            }
            boolean z13 = this.f32148l;
            if (!z13 && (view = this.f32141e) != null) {
                ViewParent parent2 = view.getParent();
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(this.f32141e);
                }
            }
            if (z13 && this.f32139c != null) {
                if (this.f32141e == null) {
                    this.f32141e = new View(getContext());
                }
                if (this.f32141e.getParent() == null) {
                    this.f32139c.addView(this.f32141e, -1, -1);
                }
            }
            this.f32137a = false;
        }
    }

    public final int b() {
        int i13 = this.f32158v;
        if (i13 >= 0) {
            return i13 + this.A + this.C;
        }
        a2 a2Var = this.f32162z;
        int e13 = a2Var != null ? a2Var.e() : 0;
        WeakHashMap weakHashMap = v0.f102521a;
        int minimumHeight = getMinimumHeight();
        return minimumHeight > 0 ? Math.min((minimumHeight * 2) + e13, getHeight()) : getHeight() / 3;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final void d(Drawable drawable) {
        Drawable drawable2 = this.f32150n;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f32150n = mutate;
            if (mutate != null) {
                int width = getWidth();
                int height = getHeight();
                ViewGroup viewGroup = this.f32139c;
                if (this.f32161y == 1 && viewGroup != null && this.f32148l) {
                    height = viewGroup.getBottom();
                }
                mutate.setBounds(0, 0, width, height);
                this.f32150n.setCallback(this);
                this.f32150n.setAlpha(this.f32152p);
            }
            WeakHashMap weakHashMap = v0.f102521a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        a();
        if (this.f32139c == null && (drawable = this.f32150n) != null && this.f32152p > 0) {
            drawable.mutate().setAlpha(this.f32152p);
            this.f32150n.draw(canvas);
        }
        if (this.f32148l && this.f32149m) {
            ViewGroup viewGroup = this.f32139c;
            com.google.android.material.internal.c cVar = this.f32147k;
            if (viewGroup == null || this.f32150n == null || this.f32152p <= 0 || this.f32161y != 1 || cVar.f32709b >= cVar.f32715e) {
                cVar.f(canvas);
            } else {
                int save = canvas.save();
                canvas.clipRect(this.f32150n.getBounds(), Region.Op.DIFFERENCE);
                cVar.f(canvas);
                canvas.restoreToCount(save);
            }
        }
        if (this.f32151o == null || this.f32152p <= 0) {
            return;
        }
        a2 a2Var = this.f32162z;
        int e13 = a2Var != null ? a2Var.e() : 0;
        if (e13 > 0) {
            this.f32151o.setBounds(0, -this.f32160x, getWidth(), e13 - this.f32160x);
            this.f32151o.mutate().setAlpha(this.f32152p);
            this.f32151o.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j13) {
        boolean z13;
        View view2;
        Drawable drawable = this.f32150n;
        if (drawable == null || this.f32152p <= 0 || ((view2 = this.f32140d) == null || view2 == this ? view != this.f32139c : view != view2)) {
            z13 = false;
        } else {
            int width = getWidth();
            int height = getHeight();
            if (this.f32161y == 1 && view != null && this.f32148l) {
                height = view.getBottom();
            }
            drawable.setBounds(0, 0, width, height);
            this.f32150n.mutate().setAlpha(this.f32152p);
            this.f32150n.draw(canvas);
            z13 = true;
        }
        return super.drawChild(canvas, view, j13) || z13;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        ColorStateList colorStateList;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f32151o;
        boolean z13 = false;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f32150n;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        com.google.android.material.internal.c cVar = this.f32147k;
        if (cVar != null) {
            cVar.R = drawableState;
            ColorStateList colorStateList2 = cVar.f32735o;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = cVar.f32733n) != null && colorStateList.isStateful())) {
                cVar.n(false);
                z13 = true;
            }
            state |= z13;
        }
        if (state) {
            invalidate();
        }
    }

    public final void e() {
        int i13;
        ViewGroup viewGroup;
        if (this.f32150n == null && this.f32151o == null) {
            return;
        }
        boolean z13 = getHeight() + this.f32160x < b();
        WeakHashMap weakHashMap = v0.f102521a;
        boolean z14 = isLaidOut() && !isInEditMode();
        if (this.f32153q != z13) {
            if (z14) {
                i13 = z13 ? 255 : 0;
                a();
                ValueAnimator valueAnimator = this.f32154r;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.f32154r = valueAnimator2;
                    valueAnimator2.setInterpolator(i13 > this.f32152p ? this.f32156t : this.f32157u);
                    this.f32154r.addUpdateListener(new e0(this, 3));
                } else if (valueAnimator.isRunning()) {
                    this.f32154r.cancel();
                }
                this.f32154r.setDuration(this.f32155s);
                this.f32154r.setIntValues(this.f32152p, i13);
                this.f32154r.start();
            } else {
                i13 = z13 ? 255 : 0;
                if (i13 != this.f32152p) {
                    if (this.f32150n != null && (viewGroup = this.f32139c) != null) {
                        viewGroup.postInvalidateOnAnimation();
                    }
                    this.f32152p = i13;
                    postInvalidateOnAnimation();
                }
            }
            this.f32153q = z13;
        }
    }

    public final void f(boolean z13, int i13, int i14, int i15, int i16) {
        View view;
        int i17;
        int i18;
        int i19;
        if (!this.f32148l || (view = this.f32141e) == null) {
            return;
        }
        WeakHashMap weakHashMap = v0.f102521a;
        int i23 = 0;
        boolean z14 = view.isAttachedToWindow() && this.f32141e.getVisibility() == 0;
        this.f32149m = z14;
        if (z14 || z13) {
            boolean z15 = getLayoutDirection() == 1;
            View view2 = this.f32140d;
            if (view2 == null) {
                view2 = this.f32139c;
            }
            int height = ((getHeight() - c(view2).f32198b) - view2.getHeight()) - ((FrameLayout.LayoutParams) ((LayoutParams) view2.getLayoutParams())).bottomMargin;
            View view3 = this.f32141e;
            Rect rect = this.f32146j;
            com.google.android.material.internal.d.a(this, view3, rect);
            ViewGroup viewGroup = this.f32139c;
            if (viewGroup instanceof Toolbar) {
                Toolbar toolbar = (Toolbar) viewGroup;
                i23 = toolbar.f16484p;
                i18 = toolbar.f16485q;
                i19 = toolbar.f16486r;
                i17 = toolbar.f16487s;
            } else if (viewGroup instanceof android.widget.Toolbar) {
                android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
                i23 = toolbar2.getTitleMarginStart();
                i18 = toolbar2.getTitleMarginEnd();
                i19 = toolbar2.getTitleMarginTop();
                i17 = toolbar2.getTitleMarginBottom();
            } else {
                i17 = 0;
                i18 = 0;
                i19 = 0;
            }
            int i24 = rect.left + (z15 ? i18 : i23);
            int i25 = rect.top + height + i19;
            int i26 = rect.right;
            if (!z15) {
                i23 = i18;
            }
            int i27 = i26 - i23;
            int i28 = (rect.bottom + height) - i17;
            com.google.android.material.internal.c cVar = this.f32147k;
            Rect rect2 = cVar.f32721h;
            if (rect2.left != i24 || rect2.top != i25 || rect2.right != i27 || rect2.bottom != i28) {
                rect2.set(i24, i25, i27, i28);
                cVar.S = true;
            }
            int i29 = this.f32142f;
            int i33 = this.f32144h;
            int i34 = z15 ? i33 : i29;
            int i35 = rect.top + this.f32143g;
            int i36 = i15 - i13;
            if (!z15) {
                i29 = i33;
            }
            int i37 = i36 - i29;
            int i38 = (i16 - i14) - this.f32145i;
            Rect rect3 = cVar.f32719g;
            if (rect3.left != i34 || rect3.top != i35 || rect3.right != i37 || rect3.bottom != i38) {
                rect3.set(i34, i35, i37, i38);
                cVar.S = true;
            }
            cVar.n(z13);
        }
    }

    public final void g() {
        if (this.f32139c == null || !this.f32148l) {
            return;
        }
        com.google.android.material.internal.c cVar = this.f32147k;
        if (TextUtils.isEmpty(cVar.G)) {
            ViewGroup viewGroup = this.f32139c;
            CharSequence title = viewGroup instanceof Toolbar ? ((Toolbar) viewGroup).f16492x : viewGroup instanceof android.widget.Toolbar ? ((android.widget.Toolbar) viewGroup).getTitle() : null;
            if (title == null || !TextUtils.equals(cVar.G, title)) {
                cVar.G = title;
                cVar.H = null;
                Bitmap bitmap = cVar.K;
                if (bitmap != null) {
                    bitmap.recycle();
                    cVar.K = null;
                }
                cVar.n(false);
            }
            setContentDescription(this.f32148l ? cVar.G : null);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.f32163a = 0;
        layoutParams.f32164b = 0.5f;
        return layoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.f32161y == 1) {
                appBarLayout.f32109k = false;
            }
            WeakHashMap weakHashMap = v0.f102521a;
            setFitsSystemWindows(appBarLayout.getFitsSystemWindows());
            if (this.f32159w == null) {
                this.f32159w = new i(this);
            }
            appBarLayout.b(this.f32159w);
            k0.c(this);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f32147k.m(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ViewParent parent = getParent();
        i iVar = this.f32159w;
        if (iVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).l(iVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        a2 a2Var = this.f32162z;
        if (a2Var != null) {
            int e13 = a2Var.e();
            int childCount = getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt = getChildAt(i17);
                WeakHashMap weakHashMap = v0.f102521a;
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < e13) {
                    childAt.offsetTopAndBottom(e13);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i18 = 0; i18 < childCount2; i18++) {
            k c13 = c(getChildAt(i18));
            View view = c13.f32197a;
            c13.f32198b = view.getTop();
            c13.f32199c = view.getLeft();
        }
        f(false, i13, i14, i15, i16);
        g();
        e();
        int childCount3 = getChildCount();
        for (int i19 = 0; i19 < childCount3; i19++) {
            c(getChildAt(i19)).a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        int measuredHeight;
        int measuredHeight2;
        a();
        super.onMeasure(i13, i14);
        int mode = View.MeasureSpec.getMode(i14);
        a2 a2Var = this.f32162z;
        int e13 = a2Var != null ? a2Var.e() : 0;
        if ((mode == 0 || this.B) && e13 > 0) {
            this.A = e13;
            super.onMeasure(i13, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + e13, 1073741824));
        }
        if (this.D) {
            com.google.android.material.internal.c cVar = this.f32147k;
            if (cVar.f32734n0 > 1) {
                g();
                f(true, 0, 0, getMeasuredWidth(), getMeasuredHeight());
                int i15 = cVar.f32737p;
                if (i15 > 1) {
                    TextPaint textPaint = cVar.U;
                    textPaint.setTextSize(cVar.f32729l);
                    textPaint.setTypeface(cVar.f32748z);
                    textPaint.setLetterSpacing(cVar.f32720g0);
                    this.C = (i15 - 1) * Math.round(textPaint.descent() + (-textPaint.ascent()));
                    super.onMeasure(i13, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.C, 1073741824));
                }
            }
        }
        ViewGroup viewGroup = this.f32139c;
        if (viewGroup != null) {
            View view = this.f32140d;
            if (view == null || view == this) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    measuredHeight = viewGroup.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                } else {
                    measuredHeight = viewGroup.getMeasuredHeight();
                }
                setMinimumHeight(measuredHeight);
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                measuredHeight2 = view.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
            } else {
                measuredHeight2 = view.getMeasuredHeight();
            }
            setMinimumHeight(measuredHeight2);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        Drawable drawable = this.f32150n;
        if (drawable != null) {
            ViewGroup viewGroup = this.f32139c;
            if (this.f32161y == 1 && viewGroup != null && this.f32148l) {
                i14 = viewGroup.getBottom();
            }
            drawable.setBounds(0, 0, i13, i14);
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i13) {
        super.setVisibility(i13);
        boolean z13 = i13 == 0;
        Drawable drawable = this.f32151o;
        if (drawable != null && drawable.isVisible() != z13) {
            this.f32151o.setVisible(z13, false);
        }
        Drawable drawable2 = this.f32150n;
        if (drawable2 == null || drawable2.isVisible() == z13) {
            return;
        }
        this.f32150n.setVisible(z13, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f32150n || drawable == this.f32151o;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CollapsingToolbarLayout(@androidx.annotation.NonNull android.content.Context r18, android.util.AttributeSet r19, int r20) {
        /*
            Method dump skipped, instructions count: 704
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutParams layoutParams2 = new LayoutParams(layoutParams);
        layoutParams2.f32163a = 0;
        layoutParams2.f32164b = 0.5f;
        return layoutParams2;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.f32163a = 0;
        layoutParams.f32164b = 0.5f;
        return layoutParams;
    }
}
