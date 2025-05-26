package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ListView;
import androidx.annotation.NonNull;
import e3.a;
import java.util.WeakHashMap;
import q5.m0;
import q5.r;
import q5.u;
import q5.v0;
import sa.d;
import sa.e;
import sa.f;
import sa.g;
import sa.h;

/* loaded from: classes3.dex */
public class SwipeRefreshLayout extends ViewGroup implements r {
    public static final int[] D = {R.attr.enabled};
    public final f A;
    public final g B;
    public final g C;

    /* renamed from: a, reason: collision with root package name */
    public View f19796a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f19797b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19798c;

    /* renamed from: d, reason: collision with root package name */
    public final float f19799d;

    /* renamed from: e, reason: collision with root package name */
    public float f19800e;

    /* renamed from: f, reason: collision with root package name */
    public final u f19801f;

    /* renamed from: g, reason: collision with root package name */
    public final a f19802g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f19803h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f19804i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f19805j;

    /* renamed from: k, reason: collision with root package name */
    public int f19806k;

    /* renamed from: l, reason: collision with root package name */
    public float f19807l;

    /* renamed from: m, reason: collision with root package name */
    public float f19808m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f19809n;

    /* renamed from: o, reason: collision with root package name */
    public int f19810o;

    /* renamed from: p, reason: collision with root package name */
    public final DecelerateInterpolator f19811p;

    /* renamed from: q, reason: collision with root package name */
    public final sa.a f19812q;

    /* renamed from: r, reason: collision with root package name */
    public int f19813r;

    /* renamed from: s, reason: collision with root package name */
    public int f19814s;

    /* renamed from: t, reason: collision with root package name */
    public final int f19815t;

    /* renamed from: u, reason: collision with root package name */
    public final int f19816u;

    /* renamed from: v, reason: collision with root package name */
    public final e f19817v;

    /* renamed from: w, reason: collision with root package name */
    public g f19818w;

    /* renamed from: x, reason: collision with root package name */
    public h f19819x;

    /* renamed from: y, reason: collision with root package name */
    public h f19820y;

    /* renamed from: z, reason: collision with root package name */
    public final int f19821z;

    public SwipeRefreshLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19797b = false;
        this.f19799d = -1.0f;
        this.f19803h = new int[2];
        this.f19804i = new int[2];
        this.f19810o = -1;
        this.f19813r = -1;
        this.A = new f(this, 0);
        this.B = new g(this, 1);
        this.C = new g(this, 2);
        this.f19798c = ViewConfiguration.get(context).getScaledTouchSlop();
        getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f19811p = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i13 = (int) (displayMetrics.density * 40.0f);
        this.f19821z = i13;
        sa.a aVar = new sa.a(getContext());
        float f13 = aVar.getContext().getResources().getDisplayMetrics().density;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap weakHashMap = v0.f102521a;
        m0.l(aVar, f13 * 4.0f);
        shapeDrawable.getPaint().setColor(-328966);
        aVar.setBackground(shapeDrawable);
        this.f19812q = aVar;
        e eVar = new e(getContext());
        this.f19817v = eVar;
        float f14 = eVar.f112146c.getDisplayMetrics().density;
        float f15 = 2.5f * f14;
        d dVar = eVar.f112144a;
        dVar.f112127h = f15;
        dVar.f112121b.setStrokeWidth(f15);
        dVar.f112136q = 7.5f * f14;
        dVar.f112129j = 0;
        dVar.f112140u = dVar.f112128i[0];
        dVar.f112137r = (int) (10.0f * f14);
        dVar.f112138s = (int) (5.0f * f14);
        eVar.invalidateSelf();
        this.f19812q.setImageDrawable(this.f19817v);
        this.f19812q.setVisibility(8);
        addView(this.f19812q);
        setChildrenDrawingOrderEnabled(true);
        int i14 = (int) (displayMetrics.density * 64.0f);
        this.f19816u = i14;
        this.f19799d = i14;
        this.f19801f = new u();
        this.f19802g = new a(this);
        setNestedScrollingEnabled(true);
        int i15 = -i13;
        this.f19806k = i15;
        this.f19815t = i15;
        e(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, D);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    public final boolean a() {
        View view = this.f19796a;
        return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    public final void b() {
        if (this.f19796a == null) {
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                View childAt = getChildAt(i13);
                if (!childAt.equals(this.f19812q)) {
                    this.f19796a = childAt;
                    return;
                }
            }
        }
    }

    public final void c(float f13) {
        float f14 = this.f19799d;
        DecelerateInterpolator decelerateInterpolator = this.f19811p;
        if (f13 > f14) {
            if (!this.f19797b) {
                b();
                this.f19797b = true;
                this.f19814s = this.f19806k;
                g gVar = this.B;
                gVar.reset();
                gVar.setDuration(200L);
                gVar.setInterpolator(decelerateInterpolator);
                f fVar = this.A;
                if (fVar != null) {
                    this.f19812q.f112113a = fVar;
                }
                this.f19812q.clearAnimation();
                this.f19812q.startAnimation(gVar);
                return;
            }
            return;
        }
        this.f19797b = false;
        e eVar = this.f19817v;
        d dVar = eVar.f112144a;
        dVar.f112124e = 0.0f;
        dVar.f112125f = 0.0f;
        eVar.invalidateSelf();
        f fVar2 = new f(this, 1);
        this.f19814s = this.f19806k;
        g gVar2 = this.C;
        gVar2.reset();
        gVar2.setDuration(200L);
        gVar2.setInterpolator(decelerateInterpolator);
        sa.a aVar = this.f19812q;
        aVar.f112113a = fVar2;
        aVar.clearAnimation();
        this.f19812q.startAnimation(gVar2);
        e eVar2 = this.f19817v;
        d dVar2 = eVar2.f112144a;
        if (dVar2.f112133n) {
            dVar2.f112133n = false;
        }
        eVar2.invalidateSelf();
    }

    public final void d(float f13) {
        h hVar;
        h hVar2;
        e eVar = this.f19817v;
        d dVar = eVar.f112144a;
        if (!dVar.f112133n) {
            dVar.f112133n = true;
        }
        eVar.invalidateSelf();
        float f14 = this.f19799d;
        float min = Math.min(1.0f, Math.abs(f13 / f14));
        float max = (((float) Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f13) - f14;
        float f15 = this.f19816u;
        double max2 = Math.max(0.0f, Math.min(abs, f15 * 2.0f) / f15) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i13 = this.f19815t + ((int) ((f15 * min) + (f15 * pow * 2.0f)));
        if (this.f19812q.getVisibility() != 0) {
            this.f19812q.setVisibility(0);
        }
        this.f19812q.setScaleX(1.0f);
        this.f19812q.setScaleY(1.0f);
        if (f13 < f14) {
            if (this.f19817v.f112144a.f112139t > 76 && ((hVar2 = this.f19819x) == null || !hVar2.hasStarted() || hVar2.hasEnded())) {
                h hVar3 = new h(this, this.f19817v.f112144a.f112139t, 76);
                hVar3.setDuration(300L);
                sa.a aVar = this.f19812q;
                aVar.f112113a = null;
                aVar.clearAnimation();
                this.f19812q.startAnimation(hVar3);
                this.f19819x = hVar3;
            }
        } else if (this.f19817v.f112144a.f112139t < 255 && ((hVar = this.f19820y) == null || !hVar.hasStarted() || hVar.hasEnded())) {
            h hVar4 = new h(this, this.f19817v.f112144a.f112139t, 255);
            hVar4.setDuration(300L);
            sa.a aVar2 = this.f19812q;
            aVar2.f112113a = null;
            aVar2.clearAnimation();
            this.f19812q.startAnimation(hVar4);
            this.f19820y = hVar4;
        }
        e eVar2 = this.f19817v;
        float min2 = Math.min(0.8f, max * 0.8f);
        d dVar2 = eVar2.f112144a;
        dVar2.f112124e = 0.0f;
        dVar2.f112125f = min2;
        eVar2.invalidateSelf();
        e eVar3 = this.f19817v;
        float min3 = Math.min(1.0f, max);
        d dVar3 = eVar3.f112144a;
        if (min3 != dVar3.f112135p) {
            dVar3.f112135p = min3;
        }
        eVar3.invalidateSelf();
        e eVar4 = this.f19817v;
        eVar4.f112144a.f112126g = ((pow * 2.0f) + ((max * 0.4f) - 0.25f)) * 0.5f;
        eVar4.invalidateSelf();
        g(i13 - this.f19806k);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f13, float f14, boolean z13) {
        return this.f19802g.b(f13, f14, z13);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f13, float f14) {
        return this.f19802g.c(f13, f14);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i13, int i14, int[] iArr, int[] iArr2) {
        return this.f19802g.d(i13, i14, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i13, int i14, int i15, int i16, int[] iArr) {
        return this.f19802g.e(i13, i14, i15, i16, 0, iArr, null);
    }

    public final void e(float f13) {
        g((this.f19814s + ((int) ((this.f19815t - r0) * f13))) - this.f19812q.getTop());
    }

    public final void f() {
        this.f19812q.clearAnimation();
        this.f19817v.stop();
        this.f19812q.setVisibility(8);
        this.f19812q.getBackground().setAlpha(255);
        this.f19817v.setAlpha(255);
        g(this.f19815t - this.f19806k);
        this.f19806k = this.f19812q.getTop();
    }

    public final void g(int i13) {
        this.f19812q.bringToFront();
        sa.a aVar = this.f19812q;
        WeakHashMap weakHashMap = v0.f102521a;
        aVar.offsetTopAndBottom(i13);
        this.f19806k = this.f19812q.getTop();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i13, int i14) {
        int i15 = this.f19813r;
        return i15 < 0 ? i14 : i14 == i13 + (-1) ? i15 : i14 >= i15 ? i14 + 1 : i14;
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.f19801f.b();
    }

    public final void h(float f13) {
        float f14 = this.f19808m;
        float f15 = f13 - f14;
        int i13 = this.f19798c;
        if (f15 <= i13 || this.f19809n) {
            return;
        }
        this.f19807l = f14 + i13;
        this.f19809n = true;
        this.f19817v.setAlpha(76);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f19802g.h(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f19802g.f56995a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        b();
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || a() || this.f19797b || this.f19805j) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i13 = this.f19810o;
                    if (i13 == -1) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i13);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    h(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.f19810o) {
                            this.f19810o = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        }
                    }
                }
            }
            this.f19809n = false;
            this.f19810o = -1;
        } else {
            g(this.f19815t - this.f19812q.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f19810o = pointerId;
            this.f19809n = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f19808m = motionEvent.getY(findPointerIndex2);
        }
        return this.f19809n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f19796a == null) {
            b();
        }
        View view = this.f19796a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f19812q.getMeasuredWidth();
        int measuredHeight2 = this.f19812q.getMeasuredHeight();
        int i17 = measuredWidth / 2;
        int i18 = measuredWidth2 / 2;
        int i19 = this.f19806k;
        this.f19812q.layout(i17 - i18, i19, i17 + i18, measuredHeight2 + i19);
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        if (this.f19796a == null) {
            b();
        }
        View view = this.f19796a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        sa.a aVar = this.f19812q;
        int i15 = this.f19821z;
        aVar.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(i15, 1073741824));
        this.f19813r = -1;
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            if (getChildAt(i16) == this.f19812q) {
                this.f19813r = i16;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f13, float f14, boolean z13) {
        return this.f19802g.b(f13, f14, z13);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f13, float f14) {
        return this.f19802g.c(f13, f14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i13, int i14, int[] iArr) {
        if (i14 > 0) {
            float f13 = this.f19800e;
            if (f13 > 0.0f) {
                float f14 = i14;
                if (f14 > f13) {
                    iArr[1] = i14 - ((int) f13);
                    this.f19800e = 0.0f;
                } else {
                    this.f19800e = f13 - f14;
                    iArr[1] = i14;
                }
                d(this.f19800e);
            }
        }
        int i15 = i13 - iArr[0];
        int i16 = i14 - iArr[1];
        int[] iArr2 = this.f19803h;
        if (dispatchNestedPreScroll(i15, i16, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i13, int i14, int i15, int i16) {
        dispatchNestedScroll(i13, i14, i15, i16, this.f19804i);
        if (i16 + this.f19804i[1] >= 0 || a()) {
            return;
        }
        float abs = this.f19800e + Math.abs(r11);
        this.f19800e = abs;
        d(abs);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i13) {
        this.f19801f.c(i13, 0);
        startNestedScroll(i13 & 2);
        this.f19800e = 0.0f;
        this.f19805j = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i13) {
        return (!isEnabled() || this.f19797b || (i13 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.f19801f.d(0);
        this.f19805j = false;
        float f13 = this.f19800e;
        if (f13 > 0.0f) {
            c(f13);
            this.f19800e = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || a() || this.f19797b || this.f19805j) {
            return false;
        }
        if (actionMasked == 0) {
            this.f19810o = motionEvent.getPointerId(0);
            this.f19809n = false;
        } else {
            if (actionMasked == 1) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f19810o);
                if (findPointerIndex < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f19809n) {
                    float y13 = (motionEvent.getY(findPointerIndex) - this.f19807l) * 0.5f;
                    this.f19809n = false;
                    c(y13);
                }
                this.f19810o = -1;
                return false;
            }
            if (actionMasked == 2) {
                int findPointerIndex2 = motionEvent.findPointerIndex(this.f19810o);
                if (findPointerIndex2 < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y14 = motionEvent.getY(findPointerIndex2);
                h(y14);
                if (this.f19809n) {
                    float f13 = (y14 - this.f19807l) * 0.5f;
                    if (f13 <= 0.0f) {
                        return false;
                    }
                    d(f13);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.f19810o = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    int actionIndex2 = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex2) == this.f19810o) {
                        this.f19810o = motionEvent.getPointerId(actionIndex2 == 0 ? 1 : 0);
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z13) {
        View view = this.f19796a;
        if (view != null) {
            WeakHashMap weakHashMap = v0.f102521a;
            if (!m0.i(view)) {
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z13);
    }

    @Override // android.view.View
    public final void setEnabled(boolean z13) {
        super.setEnabled(z13);
        if (z13) {
            return;
        }
        f();
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z13) {
        this.f19802g.o(z13);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i13) {
        return this.f19802g.q(i13, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.f19802g.s(0);
    }
}
