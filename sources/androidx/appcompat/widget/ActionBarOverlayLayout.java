package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.WeakHashMap;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes2.dex */
public class ActionBarOverlayLayout extends ViewGroup implements y0, q5.s, q5.t {
    public static final int[] C = {i.a.actionBarSize, R.attr.windowContentOverlay};
    public static final q5.a2 D;
    public static final Rect E;
    public final q5.u A;
    public final g B;

    /* renamed from: a, reason: collision with root package name */
    public int f16223a;

    /* renamed from: b, reason: collision with root package name */
    public int f16224b;

    /* renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f16225c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f16226d;

    /* renamed from: e, reason: collision with root package name */
    public z0 f16227e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f16228f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16229g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16230h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16231i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f16232j;

    /* renamed from: k, reason: collision with root package name */
    public int f16233k;

    /* renamed from: l, reason: collision with root package name */
    public int f16234l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f16235m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f16236n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f16237o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f16238p;

    /* renamed from: q, reason: collision with root package name */
    public q5.a2 f16239q;

    /* renamed from: r, reason: collision with root package name */
    public q5.a2 f16240r;

    /* renamed from: s, reason: collision with root package name */
    public q5.a2 f16241s;

    /* renamed from: t, reason: collision with root package name */
    public q5.a2 f16242t;

    /* renamed from: u, reason: collision with root package name */
    public f f16243u;

    /* renamed from: v, reason: collision with root package name */
    public OverScroller f16244v;

    /* renamed from: w, reason: collision with root package name */
    public ViewPropertyAnimator f16245w;

    /* renamed from: x, reason: collision with root package name */
    public final d f16246x;

    /* renamed from: y, reason: collision with root package name */
    public final e f16247y;

    /* renamed from: z, reason: collision with root package name */
    public final e f16248z;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    static {
        int i13 = Build.VERSION.SDK_INT;
        q5.s1 r1Var = i13 >= 30 ? new q5.r1() : i13 >= 29 ? new q5.q1() : new q5.p1();
        r1Var.g(f5.e.b(0, 1, 0, 1));
        D = r1Var.b();
        E = new Rect();
    }

    public ActionBarOverlayLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16224b = 0;
        this.f16235m = new Rect();
        this.f16236n = new Rect();
        this.f16237o = new Rect();
        this.f16238p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        q5.a2 a2Var = q5.a2.f102399b;
        this.f16239q = a2Var;
        this.f16240r = a2Var;
        this.f16241s = a2Var;
        this.f16242t = a2Var;
        this.f16246x = new d(this, 0);
        this.f16247y = new e(this, 0);
        this.f16248z = new e(this, 1);
        f(context);
        this.A = new q5.u();
        g gVar = new g(context, 0);
        this.B = gVar;
        addView(gVar);
    }

    public static boolean a(FrameLayout frameLayout, Rect rect, boolean z13) {
        boolean z14;
        LayoutParams layoutParams = (LayoutParams) frameLayout.getLayoutParams();
        int i13 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        int i14 = rect.left;
        if (i13 != i14) {
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i14;
            z14 = true;
        } else {
            z14 = false;
        }
        int i15 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        int i16 = rect.top;
        if (i15 != i16) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i16;
            z14 = true;
        }
        int i17 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int i18 = rect.right;
        if (i17 != i18) {
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i18;
            z14 = true;
        }
        if (z13) {
            int i19 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            int i23 = rect.bottom;
            if (i19 != i23) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i23;
                return true;
            }
        }
        return z14;
    }

    public final boolean b() {
        ActionMenuView actionMenuView;
        m();
        Toolbar toolbar = ((h3) this.f16227e).f16581a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f16469a) != null && actionMenuView.f16253s;
    }

    public final void c() {
        n nVar;
        m();
        ActionMenuView actionMenuView = ((h3) this.f16227e).f16581a.f16469a;
        if (actionMenuView == null || (nVar = actionMenuView.f16254t) == null) {
            return;
        }
        nVar.k();
        h hVar = nVar.f16659s;
        if (hVar == null || !hVar.b()) {
            return;
        }
        hVar.f88722j.dismiss();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final void d() {
        removeCallbacks(this.f16247y);
        removeCallbacks(this.f16248z);
        ViewPropertyAnimator viewPropertyAnimator = this.f16245w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i13;
        super.draw(canvas);
        if (this.f16228f != null) {
            if (this.f16226d.getVisibility() == 0) {
                i13 = (int) (this.f16226d.getTranslationY() + this.f16226d.getBottom() + 0.5f);
            } else {
                i13 = 0;
            }
            this.f16228f.setBounds(0, i13, getWidth(), this.f16228f.getIntrinsicHeight() + i13);
            this.f16228f.draw(canvas);
        }
    }

    public final boolean e() {
        n nVar;
        m();
        ActionMenuView actionMenuView = ((h3) this.f16227e).f16581a.f16469a;
        return (actionMenuView == null || (nVar = actionMenuView.f16254t) == null || !nVar.k()) ? false : true;
    }

    public final void f(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(C);
        this.f16223a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f16228f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f16244v = new OverScroller(context);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public final void g(int i13) {
        m();
        if (i13 == 2) {
            ((h3) this.f16227e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i13 == 5) {
            ((h3) this.f16227e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i13 != 109) {
                return;
            }
            this.f16229g = true;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.A.b();
    }

    public final boolean h() {
        n nVar;
        m();
        ActionMenuView actionMenuView = ((h3) this.f16227e).f16581a.f16469a;
        return (actionMenuView == null || (nVar = actionMenuView.f16254t) == null || (nVar.f16660t == null && !nVar.l())) ? false : true;
    }

    @Override // q5.s
    public final void i(View view, View view2, int i13, int i14) {
        if (i14 == 0) {
            onNestedScrollAccepted(view, view2, i13);
        }
    }

    public final boolean j() {
        m();
        return ((h3) this.f16227e).f16581a.s();
    }

    @Override // q5.s
    public final void k(View view, int i13) {
        if (i13 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // q5.s
    public final void l(View view, int i13, int i14, int[] iArr, int i15) {
    }

    public final void m() {
        z0 z0Var;
        if (this.f16225c == null) {
            this.f16225c = (ContentFrameLayout) findViewById(i.f.action_bar_activity_content);
            this.f16226d = (ActionBarContainer) findViewById(i.f.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(i.f.action_bar);
            if (findViewById instanceof z0) {
                z0Var = (z0) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                Toolbar toolbar = (Toolbar) findViewById;
                if (toolbar.K == null) {
                    toolbar.K = new h3(toolbar, true);
                }
                z0Var = toolbar.K;
            }
            this.f16227e = z0Var;
        }
    }

    public final void n(boolean z13) {
        if (z13 != this.f16231i) {
            this.f16231i = z13;
            if (z13) {
                return;
            }
            d();
            d();
            this.f16226d.setTranslationY(-Math.max(0, Math.min(0, this.f16226d.getHeight())));
        }
    }

    public final void o(n.o oVar, androidx.appcompat.app.x xVar) {
        m();
        h3 h3Var = (h3) this.f16227e;
        n nVar = h3Var.f16593m;
        Toolbar toolbar = h3Var.f16581a;
        if (nVar == null) {
            n nVar2 = new n(toolbar.getContext());
            h3Var.f16593m = nVar2;
            nVar2.f88569i = i.f.action_menu_presenter;
        }
        n nVar3 = h3Var.f16593m;
        nVar3.f88565e = xVar;
        if (oVar == null && toolbar.f16469a == null) {
            return;
        }
        toolbar.e();
        n.o oVar2 = toolbar.f16469a.f16250p;
        if (oVar2 == oVar) {
            return;
        }
        if (oVar2 != null) {
            oVar2.s(toolbar.L);
            oVar2.s(toolbar.M);
        }
        if (toolbar.M == null) {
            toolbar.M = new f3(toolbar);
        }
        nVar3.f16656p = true;
        if (oVar != null) {
            oVar.c(nVar3, toolbar.f16478j);
            oVar.c(toolbar.M, toolbar.f16478j);
        } else {
            nVar3.i(toolbar.f16478j, null);
            toolbar.M.i(toolbar.f16478j, null);
            nVar3.h(true);
            toolbar.M.h(true);
        }
        ActionMenuView actionMenuView = toolbar.f16469a;
        int i13 = toolbar.f16479k;
        if (actionMenuView.f16252r != i13) {
            actionMenuView.f16252r = i13;
            if (i13 == 0) {
                actionMenuView.f16251q = actionMenuView.getContext();
            } else {
                actionMenuView.f16251q = new ContextThemeWrapper(actionMenuView.getContext(), i13);
            }
        }
        ActionMenuView actionMenuView2 = toolbar.f16469a;
        actionMenuView2.f16254t = nVar3;
        nVar3.f88568h = actionMenuView2;
        actionMenuView2.f16250p = nVar3.f88563c;
        toolbar.L = nVar3;
        toolbar.G();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
    
        if (r0 != false) goto L9;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r7) {
        /*
            r6 = this;
            r6.m()
            q5.a2 r7 = q5.a2.i(r6, r7)
            android.graphics.Rect r0 = new android.graphics.Rect
            int r1 = r7.c()
            int r2 = r7.e()
            int r3 = r7.d()
            int r4 = r7.b()
            r0.<init>(r1, r2, r3, r4)
            androidx.appcompat.widget.ActionBarContainer r1 = r6.f16226d
            r2 = 0
            boolean r0 = a(r1, r0, r2)
            java.util.WeakHashMap r1 = q5.v0.f102521a
            android.graphics.Rect r1 = r6.f16235m
            q5.m0.b(r6, r7, r1)
            int r2 = r1.left
            int r3 = r1.top
            int r4 = r1.right
            int r5 = r1.bottom
            q5.y1 r7 = r7.f102400a
            q5.a2 r2 = r7.l(r2, r3, r4, r5)
            r6.f16239q = r2
            q5.a2 r3 = r6.f16240r
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L47
            q5.a2 r0 = r6.f16239q
            r6.f16240r = r0
            r0 = 1
        L47:
            android.graphics.Rect r2 = r6.f16236n
            boolean r3 = r2.equals(r1)
            if (r3 != 0) goto L53
            r2.set(r1)
            goto L55
        L53:
            if (r0 == 0) goto L58
        L55:
            r6.requestLayout()
        L58:
            q5.a2 r7 = r7.a()
            q5.y1 r7 = r7.f102400a
            q5.a2 r7 = r7.c()
            q5.y1 r7 = r7.f102400a
            q5.a2 r7 = r7.b()
            android.view.WindowInsets r7 = r7.h()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        f(getContext());
        WeakHashMap weakHashMap = q5.v0.f102521a;
        q5.k0.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i18 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + paddingLeft;
                int i19 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + paddingTop;
                childAt.layout(i18, i19, measuredWidth + i18, measuredHeight + i19);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00f7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r12, int r13) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f13, float f14, boolean z13) {
        if (!this.f16231i || !z13) {
            return false;
        }
        this.f16244v.fling(0, 0, 0, (int) f14, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f16244v.getFinalY() > this.f16226d.getHeight()) {
            d();
            this.f16248z.run();
        } else {
            d();
            this.f16247y.run();
        }
        this.f16232j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f13, float f14) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i13, int i14, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i13, int i14, int i15, int i16) {
        this.f16233k = this.f16233k + i14;
        d();
        this.f16226d.setTranslationY(-Math.max(0, Math.min(r1, this.f16226d.getHeight())));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i13) {
        androidx.appcompat.app.d1 d1Var;
        m.n nVar;
        this.A.c(i13, 0);
        ActionBarContainer actionBarContainer = this.f16226d;
        this.f16233k = actionBarContainer != null ? -((int) actionBarContainer.getTranslationY()) : 0;
        d();
        f fVar = this.f16243u;
        if (fVar == null || (nVar = (d1Var = (androidx.appcompat.app.d1) fVar).f15989s) == null) {
            return;
        }
        nVar.a();
        d1Var.f15989s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i13) {
        if ((i13 & 2) == 0 || this.f16226d.getVisibility() != 0) {
            return false;
        }
        return this.f16231i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f16231i || this.f16232j) {
            return;
        }
        if (this.f16233k <= this.f16226d.getHeight()) {
            d();
            postDelayed(this.f16247y, 600L);
        } else {
            d();
            postDelayed(this.f16248z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i13) {
        super.onWindowSystemUiVisibilityChanged(i13);
        m();
        int i14 = this.f16234l ^ i13;
        this.f16234l = i13;
        boolean z13 = (i13 & 4) == 0;
        boolean z14 = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0;
        f fVar = this.f16243u;
        if (fVar != null) {
            ((androidx.appcompat.app.d1) fVar).f15985o = !z14;
            if (z13 || !z14) {
                androidx.appcompat.app.d1 d1Var = (androidx.appcompat.app.d1) fVar;
                if (d1Var.f15986p) {
                    d1Var.f15986p = false;
                    d1Var.s(true);
                }
            } else {
                androidx.appcompat.app.d1 d1Var2 = (androidx.appcompat.app.d1) fVar;
                if (!d1Var2.f15986p) {
                    d1Var2.f15986p = true;
                    d1Var2.s(true);
                }
            }
        }
        if ((i14 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) == 0 || this.f16243u == null) {
            return;
        }
        WeakHashMap weakHashMap = q5.v0.f102521a;
        q5.k0.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i13) {
        super.onWindowVisibilityChanged(i13);
        this.f16224b = i13;
        f fVar = this.f16243u;
        if (fVar != null) {
            ((androidx.appcompat.app.d1) fVar).f15984n = i13;
        }
    }

    public final void p() {
        m();
        ((h3) this.f16227e).f16592l = true;
    }

    public final void q(Window.Callback callback) {
        m();
        ((h3) this.f16227e).f16591k = callback;
    }

    public final void r(CharSequence charSequence) {
        m();
        h3 h3Var = (h3) this.f16227e;
        if (h3Var.f16587g) {
            return;
        }
        h3Var.f16588h = charSequence;
        if ((h3Var.f16582b & 8) != 0) {
            Toolbar toolbar = h3Var.f16581a;
            toolbar.D(charSequence);
            if (h3Var.f16587g) {
                q5.v0.p(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // q5.t
    public final void s(View view, int i13, int i14, int i15, int i16, int i17, int[] iArr) {
        t(view, i13, i14, i15, i16, i17);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // q5.s
    public final void t(View view, int i13, int i14, int i15, int i16, int i17) {
        if (i17 == 0) {
            onNestedScroll(view, i13, i14, i15, i16);
        }
    }

    public final boolean u() {
        m();
        return ((h3) this.f16227e).f16581a.F();
    }

    @Override // q5.s
    public final boolean x(View view, View view2, int i13, int i14) {
        return i14 == 0 && onStartNestedScroll(view, view2, i13);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }
}
