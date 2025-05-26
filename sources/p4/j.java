package p4;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.z;
import ao2.m0;
import i1.a1;
import i2.w;
import java.util.LinkedHashMap;
import k1.s2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import n3.a0;
import n3.b0;
import n3.e0;
import q5.u;
import s3.a2;
import s3.b2;
import s3.k0;
import t3.z4;

/* loaded from: classes.dex */
public abstract class j extends ViewGroup implements q5.t, i2.m, b2 {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f98793w = 0;

    /* renamed from: a, reason: collision with root package name */
    public final m3.d f98794a;

    /* renamed from: b, reason: collision with root package name */
    public final View f98795b;

    /* renamed from: c, reason: collision with root package name */
    public final a2 f98796c;

    /* renamed from: d, reason: collision with root package name */
    public Function0 f98797d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f98798e;

    /* renamed from: f, reason: collision with root package name */
    public Function0 f98799f;

    /* renamed from: g, reason: collision with root package name */
    public Function0 f98800g;

    /* renamed from: h, reason: collision with root package name */
    public u2.q f98801h;

    /* renamed from: i, reason: collision with root package name */
    public final i2.i f98802i;

    /* renamed from: j, reason: collision with root package name */
    public n4.b f98803j;

    /* renamed from: k, reason: collision with root package name */
    public final s2 f98804k;

    /* renamed from: l, reason: collision with root package name */
    public z f98805l;

    /* renamed from: m, reason: collision with root package name */
    public ma.i f98806m;

    /* renamed from: n, reason: collision with root package name */
    public final i f98807n;

    /* renamed from: o, reason: collision with root package name */
    public final i f98808o;

    /* renamed from: p, reason: collision with root package name */
    public final Function1 f98809p;

    /* renamed from: q, reason: collision with root package name */
    public final int[] f98810q;

    /* renamed from: r, reason: collision with root package name */
    public int f98811r;

    /* renamed from: s, reason: collision with root package name */
    public int f98812s;

    /* renamed from: t, reason: collision with root package name */
    public final u f98813t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f98814u;

    /* renamed from: v, reason: collision with root package name */
    public final k0 f98815v;

    public j(Context context, w wVar, int i13, m3.d dVar, View view, a2 a2Var) {
        super(context);
        this.f98794a = dVar;
        this.f98795b = view;
        this.f98796c = a2Var;
        if (wVar != null) {
            LinkedHashMap linkedHashMap = z4.f116292a;
            setTag(u2.s.androidx_compose_ui_view_composition_context, wVar);
        }
        int i14 = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        this.f98797d = h.f98789l;
        this.f98799f = h.f98788k;
        this.f98800g = h.f98787j;
        u2.n nVar = u2.n.f120041b;
        this.f98801h = nVar;
        this.f98803j = m0.a();
        int i15 = 1;
        this.f98807n = new i(this, i15);
        this.f98808o = new i(this, i14);
        int i16 = 2;
        this.f98810q = new int[2];
        this.f98811r = Integer.MIN_VALUE;
        this.f98812s = Integer.MIN_VALUE;
        this.f98813t = new u();
        k0 k0Var = new k0(false, 3, 0);
        k0Var.f110822j = this;
        u2.q a13 = z3.l.a(androidx.compose.ui.input.nestedscroll.a.a(nVar, k.f98816a, dVar), true, b.f98771k);
        a0 a0Var = new a0();
        a0Var.f89029b = new b0(this, i14);
        e0 e0Var = new e0();
        e0 e0Var2 = a0Var.f89030c;
        if (e0Var2 != null) {
            e0Var2.f89047a = null;
        }
        a0Var.f89030c = e0Var;
        e0Var.f89047a = a0Var;
        this.f98809p = e0Var;
        u2.q g13 = androidx.compose.ui.layout.b.g(androidx.compose.ui.draw.a.d(a13.j(a0Var), new a1(this, k0Var, this, 4)), new c(this, k0Var, i16));
        k0Var.f0(this.f98801h.j(g13));
        this.f98802i = new i2.i(9, k0Var, g13);
        k0Var.b0(this.f98803j);
        this.f98804k = new s2(k0Var, 19);
        k0Var.F = new c(this, k0Var, i14);
        k0Var.G = new b0(this, i15);
        k0Var.e0(new e(this, k0Var));
        this.f98815v = k0Var;
    }

    public static final int d(j jVar, int i13, int i14, int i15) {
        jVar.getClass();
        return (i15 >= 0 || i13 == i14) ? View.MeasureSpec.makeMeasureSpec(ql2.s.g(i15, i13, i14), 1073741824) : (i15 != -2 || i14 == Integer.MAX_VALUE) ? (i15 != -1 || i14 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i14, 1073741824) : View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE);
    }

    @Override // s3.b2
    public final boolean X() {
        return isAttachedToWindow();
    }

    @Override // i2.m
    public final void a() {
        this.f98799f.invoke();
        removeAllViewsInLayout();
    }

    @Override // i2.m
    public final void b() {
        View view = this.f98795b;
        if (view.getParent() != this) {
            addView(view);
        } else {
            this.f98799f.invoke();
        }
    }

    @Override // i2.m
    public final void c() {
        this.f98800g.invoke();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.f98810q;
        getLocationInWindow(iArr);
        int i13 = iArr[0];
        region.op(i13, iArr[1], getWidth() + i13, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    @Override // android.view.View
    public final ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f98795b.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.f98813t.b();
    }

    @Override // q5.s
    public final void i(View view, View view2, int i13, int i14) {
        this.f98813t.c(i13, i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.f98814u) {
            this.f98815v.B();
            return null;
        }
        this.f98795b.postOnAnimation(new t3.a0(1, this.f98808o));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f98795b.isNestedScrollingEnabled();
    }

    @Override // q5.s
    public final void k(View view, int i13) {
        this.f98813t.d(i13);
    }

    @Override // q5.s
    public final void l(View view, int i13, int i14, int[] iArr, int i15) {
        if (this.f98795b.isNestedScrollingEnabled()) {
            float f13 = i13;
            float f14 = -1;
            long d2 = com.bumptech.glide.c.d(f13 * f14, i14 * f14);
            int i16 = i15 == 0 ? 1 : 2;
            m3.g gVar = this.f98794a.f85726a;
            m3.g gVar2 = null;
            if (gVar != null && gVar.f120054m) {
                gVar2 = (m3.g) kh2.b0.g0(gVar);
            }
            long B = gVar2 != null ? gVar2.B(i16, d2) : 0L;
            iArr[0] = androidx.compose.ui.platform.a.b(a3.c.d(B));
            iArr[1] = androidx.compose.ui.platform.a.b(a3.c.e(B));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f98807n.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.f98814u) {
            this.f98815v.B();
        } else {
            this.f98795b.postOnAnimation(new t3.a0(1, this.f98808o));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0079, code lost:
    
        if (r2 == r3) goto L25;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDetachedFromWindow() {
        /*
            Method dump skipped, instructions count: 194
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.j.onDetachedFromWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        this.f98795b.layout(0, 0, i15 - i13, i16 - i14);
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        View view = this.f98795b;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i13), View.MeasureSpec.getSize(i14));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i13, i14);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.f98811r = i13;
        this.f98812s = i14;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f13, float f14, boolean z13) {
        if (!this.f98795b.isNestedScrollingEnabled()) {
            return false;
        }
        kotlin.jvm.internal.j.z(this.f98794a.c(), null, null, new f(z13, this, kh2.b0.z(f13 * (-1.0f), f14 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f13, float f14) {
        if (!this.f98795b.isNestedScrollingEnabled()) {
            return false;
        }
        kotlin.jvm.internal.j.z(this.f98794a.c(), null, null, new g(this, kh2.b0.z(f13 * (-1.0f), f14 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i13) {
        super.onWindowVisibilityChanged(i13);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z13) {
        Function1 function1 = this.f98809p;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z13));
        }
        super.requestDisallowInterceptTouchEvent(z13);
    }

    @Override // q5.t
    public final void s(View view, int i13, int i14, int i15, int i16, int i17, int[] iArr) {
        if (this.f98795b.isNestedScrollingEnabled()) {
            float f13 = i13;
            float f14 = -1;
            long d2 = com.bumptech.glide.c.d(f13 * f14, i14 * f14);
            long d13 = com.bumptech.glide.c.d(i15 * f14, i16 * f14);
            int i18 = i17 == 0 ? 1 : 2;
            m3.g gVar = this.f98794a.f85726a;
            m3.g gVar2 = null;
            if (gVar != null && gVar.f120054m) {
                gVar2 = (m3.g) kh2.b0.g0(gVar);
            }
            m3.g gVar3 = gVar2;
            long Q = gVar3 != null ? gVar3.Q(i18, d2, d13) : 0L;
            iArr[0] = androidx.compose.ui.platform.a.b(a3.c.d(Q));
            iArr[1] = androidx.compose.ui.platform.a.b(a3.c.e(Q));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // q5.s
    public final void t(View view, int i13, int i14, int i15, int i16, int i17) {
        if (this.f98795b.isNestedScrollingEnabled()) {
            float f13 = i13;
            float f14 = -1;
            long d2 = com.bumptech.glide.c.d(f13 * f14, i14 * f14);
            long d13 = com.bumptech.glide.c.d(i15 * f14, i16 * f14);
            int i18 = i17 == 0 ? 1 : 2;
            m3.g gVar = this.f98794a.f85726a;
            m3.g gVar2 = null;
            if (gVar != null && gVar.f120054m) {
                gVar2 = (m3.g) kh2.b0.g0(gVar);
            }
            m3.g gVar3 = gVar2;
            if (gVar3 != null) {
                gVar3.Q(i18, d2, d13);
            }
        }
    }

    @Override // q5.s
    public final boolean x(View view, View view2, int i13, int i14) {
        return ((i13 & 2) == 0 && (i13 & 1) == 0) ? false : true;
    }
}
