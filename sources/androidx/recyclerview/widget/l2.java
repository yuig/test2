package androidx.recyclerview.widget;

import a.cb;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class l2 {

    /* renamed from: a */
    public i f19493a;

    /* renamed from: b */
    public RecyclerView f19494b;

    /* renamed from: c */
    public final n3 f19495c;

    /* renamed from: d */
    public final n3 f19496d;

    /* renamed from: e */
    public v2 f19497e;

    /* renamed from: f */
    public boolean f19498f;

    /* renamed from: g */
    public boolean f19499g;

    /* renamed from: h */
    public final boolean f19500h;

    /* renamed from: i */
    public final boolean f19501i;

    /* renamed from: j */
    public int f19502j;

    /* renamed from: k */
    public boolean f19503k;

    /* renamed from: l */
    public int f19504l;

    /* renamed from: m */
    public int f19505m;

    /* renamed from: n */
    public int f19506n;

    /* renamed from: o */
    public int f19507o;

    public l2() {
        i2 i2Var = new i2(this);
        j2 j2Var = new j2(this);
        this.f19495c = new n3(i2Var);
        this.f19496d = new n3(j2Var);
        this.f19498f = false;
        this.f19499g = false;
        this.f19500h = true;
        this.f19501i = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r6 == 1073741824) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int F(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1d
            if (r8 < 0) goto L12
        L10:
            r6 = r3
            goto L30
        L12:
            if (r8 != r1) goto L1a
            if (r6 == r2) goto L22
            if (r6 == 0) goto L1a
            if (r6 == r3) goto L22
        L1a:
            r6 = r7
            r8 = r6
            goto L30
        L1d:
            if (r8 < 0) goto L20
            goto L10
        L20:
            if (r8 != r1) goto L24
        L22:
            r8 = r5
            goto L30
        L24:
            if (r8 != r0) goto L1a
            if (r6 == r2) goto L2e
            if (r6 != r3) goto L2b
            goto L2e
        L2b:
            r8 = r5
            r6 = r7
            goto L30
        L2e:
            r8 = r5
            r6 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.l2.F(boolean, int, int, int, int):int");
    }

    public static int I(View view) {
        return view.getBottom() + ((RecyclerView.LayoutParams) view.getLayoutParams()).f19269b.bottom;
    }

    public static int K(View view) {
        return view.getLeft() - ((RecyclerView.LayoutParams) view.getLayoutParams()).f19269b.left;
    }

    public static int L(View view) {
        Rect rect = ((RecyclerView.LayoutParams) view.getLayoutParams()).f19269b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static int M(View view) {
        Rect rect = ((RecyclerView.LayoutParams) view.getLayoutParams()).f19269b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int N(View view) {
        return view.getRight() + ((RecyclerView.LayoutParams) view.getLayoutParams()).f19269b.right;
    }

    public static int O(View view) {
        return view.getTop() - ((RecyclerView.LayoutParams) view.getLayoutParams()).f19269b.top;
    }

    public static int Z(View view) {
        return ((RecyclerView.LayoutParams) view.getLayoutParams()).f19268a.m();
    }

    public static k2 a0(Context context, AttributeSet attributeSet, int i13, int i14) {
        k2 k2Var = new k2();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ia.d.RecyclerView, i13, i14);
        k2Var.f19462a = obtainStyledAttributes.getInt(ia.d.RecyclerView_android_orientation, 1);
        k2Var.f19463b = obtainStyledAttributes.getInt(ia.d.RecyclerView_spanCount, 1);
        k2Var.f19464c = obtainStyledAttributes.getBoolean(ia.d.RecyclerView_reverseLayout, false);
        k2Var.f19465d = obtainStyledAttributes.getBoolean(ia.d.RecyclerView_stackFromEnd, false);
        obtainStyledAttributes.recycle();
        return k2Var;
    }

    public static boolean e0(int i13, int i14, int i15) {
        int mode = View.MeasureSpec.getMode(i14);
        int size = View.MeasureSpec.getSize(i14);
        if (i15 > 0 && i13 != i15) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i13;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i13;
        }
        return true;
    }

    public static void f0(View view, int i13, int i14, int i15, int i16) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.f19269b;
        view.layout(i13 + rect.left + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i14 + rect.top + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (i15 - rect.right) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, (i16 - rect.bottom) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
    }

    public static int n(int i13, int i14, int i15) {
        int mode = View.MeasureSpec.getMode(i13);
        int size = View.MeasureSpec.getSize(i13);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i14, i15) : size : Math.min(size, Math.max(i14, i15));
    }

    public abstract RecyclerView.LayoutParams A();

    public Parcelable A0() {
        return null;
    }

    public RecyclerView.LayoutParams B(Context context, AttributeSet attributeSet) {
        return new RecyclerView.LayoutParams(context, attributeSet);
    }

    public void B0(int i13) {
    }

    public RecyclerView.LayoutParams C(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof RecyclerView.LayoutParams ? new RecyclerView.LayoutParams((RecyclerView.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new RecyclerView.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new RecyclerView.LayoutParams(layoutParams);
    }

    public boolean C0(q2 q2Var, w2 w2Var, int i13, Bundle bundle) {
        int Y;
        int V;
        int i14;
        int i15;
        if (this.f19494b == null) {
            return false;
        }
        int i16 = this.f19507o;
        int i17 = this.f19506n;
        Rect rect = new Rect();
        if (this.f19494b.getMatrix().isIdentity() && this.f19494b.getGlobalVisibleRect(rect)) {
            i16 = rect.height();
            i17 = rect.width();
        }
        if (i13 == 4096) {
            Y = this.f19494b.canScrollVertically(1) ? (i16 - Y()) - T() : 0;
            if (this.f19494b.canScrollHorizontally(1)) {
                V = (i17 - V()) - W();
                i14 = Y;
                i15 = V;
            }
            i14 = Y;
            i15 = 0;
        } else if (i13 != 8192) {
            i15 = 0;
            i14 = 0;
        } else {
            Y = this.f19494b.canScrollVertically(-1) ? -((i16 - Y()) - T()) : 0;
            if (this.f19494b.canScrollHorizontally(-1)) {
                V = -((i17 - V()) - W());
                i14 = Y;
                i15 = V;
            }
            i14 = Y;
            i15 = 0;
        }
        if (i14 == 0 && i15 == 0) {
            return false;
        }
        this.f19494b.b3(i15, i14, null, Integer.MIN_VALUE, true);
        return true;
    }

    public final View D(int i13) {
        i iVar = this.f19493a;
        if (iVar != null) {
            return iVar.d(i13);
        }
        return null;
    }

    public final void D0(q2 q2Var) {
        for (int E = E() - 1; E >= 0; E--) {
            if (!RecyclerView.w1(D(E)).d0()) {
                G0(E, q2Var);
            }
        }
    }

    public final int E() {
        i iVar = this.f19493a;
        if (iVar != null) {
            return iVar.e();
        }
        return 0;
    }

    public final void E0(q2 q2Var) {
        int size = q2Var.f19602a.size();
        for (int i13 = size - 1; i13 >= 0; i13--) {
            View e13 = q2Var.e(i13);
            y2 w13 = RecyclerView.w1(e13);
            if (!w13.d0()) {
                w13.a0(false);
                if (w13.L()) {
                    this.f19494b.removeDetachedView(e13, false);
                }
                g2 g2Var = this.f19494b.M;
                if (g2Var != null) {
                    g2Var.j(w13);
                }
                w13.a0(true);
                q2Var.i(e13);
            }
        }
        q2Var.f19602a.clear();
        ArrayList arrayList = q2Var.f19603b;
        if (arrayList != null) {
            arrayList.clear();
        }
        if (size > 0) {
            this.f19494b.invalidate();
        }
    }

    public final void F0(View view, q2 q2Var) {
        i iVar = this.f19493a;
        y1 y1Var = iVar.f19441a;
        int i13 = iVar.f19444d;
        if (i13 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i13 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            iVar.f19444d = 1;
            iVar.f19445e = view;
            int indexOfChild = ((RecyclerView) y1Var.f19715a).indexOfChild(view);
            if (indexOfChild >= 0) {
                if (iVar.f19442b.f(indexOfChild)) {
                    iVar.l(view);
                }
                y1Var.o(indexOfChild);
            }
            iVar.f19444d = 0;
            iVar.f19445e = null;
            q2Var.l(view);
        } catch (Throwable th3) {
            iVar.f19444d = 0;
            iVar.f19445e = null;
            throw th3;
        }
    }

    public final boolean G() {
        RecyclerView recyclerView = this.f19494b;
        return recyclerView != null && recyclerView.f19230h;
    }

    public final void G0(int i13, q2 q2Var) {
        View D = D(i13);
        H0(i13);
        q2Var.l(D);
    }

    public int H(q2 q2Var, w2 w2Var) {
        return -1;
    }

    public final void H0(int i13) {
        if (D(i13) != null) {
            this.f19493a.j(i13);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a3, code lost:
    
        if ((r5.bottom - r1) > r13) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean I0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.V()
            int r1 = r8.Y()
            int r2 = r8.f19506n
            int r3 = r8.W()
            int r2 = r2 - r3
            int r3 = r8.f19507o
            int r4 = r8.T()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.Q()
            r7 = 1
            if (r3 != r7) goto L5c
            if (r2 == 0) goto L57
            goto L64
        L57:
            int r2 = java.lang.Math.max(r6, r10)
            goto L64
        L5c:
            if (r6 == 0) goto L5f
            goto L63
        L5f:
            int r6 = java.lang.Math.min(r4, r2)
        L63:
            r2 = r6
        L64:
            if (r1 == 0) goto L67
            goto L6b
        L67:
            int r1 = java.lang.Math.min(r5, r11)
        L6b:
            if (r13 == 0) goto La6
            android.view.View r10 = r9.getFocusedChild()
            if (r10 != 0) goto L74
            goto Lab
        L74:
            int r11 = r8.V()
            int r13 = r8.Y()
            int r3 = r8.f19506n
            int r4 = r8.W()
            int r3 = r3 - r4
            int r4 = r8.f19507o
            int r5 = r8.T()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.f19494b
            android.graphics.Rect r5 = r5.f19234j
            r8.J(r5, r10)
            int r10 = r5.left
            int r10 = r10 - r2
            if (r10 >= r3) goto Lab
            int r10 = r5.right
            int r10 = r10 - r2
            if (r10 <= r11) goto Lab
            int r10 = r5.top
            int r10 = r10 - r1
            if (r10 >= r4) goto Lab
            int r10 = r5.bottom
            int r10 = r10 - r1
            if (r10 > r13) goto La6
            goto Lab
        La6:
            if (r2 != 0) goto Lac
            if (r1 == 0) goto Lab
            goto Lac
        Lab:
            return r0
        Lac:
            if (r12 == 0) goto Lb2
            r9.scrollBy(r2, r1)
            goto Lb5
        Lb2:
            r9.Z2(r2, r1)
        Lb5:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.l2.I0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public void J(Rect rect, View view) {
        RecyclerView.y1(rect, view);
    }

    public final void J0() {
        RecyclerView recyclerView = this.f19494b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void K0(q2 q2Var, int i13, View view) {
        y2 w13 = RecyclerView.w1(view);
        if (w13.d0()) {
            return;
        }
        if (w13.t() && !w13.z() && !this.f19494b.f19240m.f19332b) {
            H0(i13);
            q2Var.m(w13);
        } else {
            D(i13);
            this.f19493a.c(i13);
            q2Var.n(view);
            this.f19494b.f19228g.m(w13);
        }
    }

    public int L0(int i13, q2 q2Var, w2 w2Var) {
        return 0;
    }

    public void M0(int i13) {
        int[] iArr = RecyclerView.A0;
    }

    public int N0(int i13, q2 q2Var, w2 w2Var) {
        return 0;
    }

    public final void O0(RecyclerView recyclerView) {
        P0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final int P() {
        RecyclerView recyclerView = this.f19494b;
        b2 b2Var = recyclerView != null ? recyclerView.f19240m : null;
        if (b2Var != null) {
            return b2Var.e();
        }
        return 0;
    }

    public final void P0(int i13, int i14) {
        this.f19506n = View.MeasureSpec.getSize(i13);
        int mode = View.MeasureSpec.getMode(i13);
        this.f19504l = mode;
        if (mode == 0 && !RecyclerView.C0) {
            this.f19506n = 0;
        }
        this.f19507o = View.MeasureSpec.getSize(i14);
        int mode2 = View.MeasureSpec.getMode(i14);
        this.f19505m = mode2;
        if (mode2 != 0 || RecyclerView.C0) {
            return;
        }
        this.f19507o = 0;
    }

    public final int Q() {
        RecyclerView recyclerView = this.f19494b;
        WeakHashMap weakHashMap = q5.v0.f102521a;
        return recyclerView.getLayoutDirection();
    }

    public void Q0(Rect rect, int i13, int i14) {
        int W = W() + V() + rect.width();
        int T = T() + Y() + rect.height();
        this.f19494b.setMeasuredDimension(n(i13, W, S()), n(i14, T, R()));
    }

    public final int R() {
        RecyclerView recyclerView = this.f19494b;
        WeakHashMap weakHashMap = q5.v0.f102521a;
        return recyclerView.getMinimumHeight();
    }

    public final void R0(int i13, int i14) {
        int E = E();
        if (E == 0) {
            this.f19494b.T(i13, i14);
            return;
        }
        int i15 = Integer.MIN_VALUE;
        int i16 = Integer.MAX_VALUE;
        int i17 = Integer.MIN_VALUE;
        int i18 = Integer.MAX_VALUE;
        for (int i19 = 0; i19 < E; i19++) {
            View D = D(i19);
            Rect rect = this.f19494b.f19234j;
            J(rect, D);
            int i23 = rect.left;
            if (i23 < i18) {
                i18 = i23;
            }
            int i24 = rect.right;
            if (i24 > i15) {
                i15 = i24;
            }
            int i25 = rect.top;
            if (i25 < i16) {
                i16 = i25;
            }
            int i26 = rect.bottom;
            if (i26 > i17) {
                i17 = i26;
            }
        }
        this.f19494b.f19234j.set(i18, i16, i15, i17);
        Q0(this.f19494b.f19234j, i13, i14);
    }

    public final int S() {
        RecyclerView recyclerView = this.f19494b;
        WeakHashMap weakHashMap = q5.v0.f102521a;
        return recyclerView.getMinimumWidth();
    }

    public void S0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f19494b = null;
            this.f19493a = null;
            this.f19506n = 0;
            this.f19507o = 0;
        } else {
            this.f19494b = recyclerView;
            this.f19493a = recyclerView.f19226f;
            this.f19506n = recyclerView.getWidth();
            this.f19507o = recyclerView.getHeight();
        }
        this.f19504l = 1073741824;
        this.f19505m = 1073741824;
    }

    public final int T() {
        RecyclerView recyclerView = this.f19494b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final boolean T0(View view, int i13, int i14, RecyclerView.LayoutParams layoutParams) {
        return (!view.isLayoutRequested() && this.f19500h && e0(view.getWidth(), i13, ((ViewGroup.MarginLayoutParams) layoutParams).width) && e0(view.getHeight(), i14, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
    }

    public final int U() {
        RecyclerView recyclerView = this.f19494b;
        if (recyclerView == null) {
            return 0;
        }
        WeakHashMap weakHashMap = q5.v0.f102521a;
        return recyclerView.getPaddingEnd();
    }

    public boolean U0() {
        return false;
    }

    public int V() {
        RecyclerView recyclerView = this.f19494b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final boolean V0(View view, int i13, int i14, RecyclerView.LayoutParams layoutParams) {
        return (this.f19500h && e0(view.getMeasuredWidth(), i13, ((ViewGroup.MarginLayoutParams) layoutParams).width) && e0(view.getMeasuredHeight(), i14, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
    }

    public int W() {
        RecyclerView recyclerView = this.f19494b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public void W0(RecyclerView recyclerView, w2 w2Var, int i13) {
        Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
    }

    public final int X() {
        RecyclerView recyclerView = this.f19494b;
        if (recyclerView == null) {
            return 0;
        }
        WeakHashMap weakHashMap = q5.v0.f102521a;
        return recyclerView.getPaddingStart();
    }

    public final void X0(v2 v2Var) {
        v2 v2Var2 = this.f19497e;
        if (v2Var2 != null && v2Var != v2Var2 && v2Var2.d()) {
            this.f19497e.j();
        }
        this.f19497e = v2Var;
        v2Var.i(this.f19494b, this);
    }

    public final int Y() {
        RecyclerView recyclerView = this.f19494b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public boolean Y0() {
        return false;
    }

    public int b0(q2 q2Var, w2 w2Var) {
        return -1;
    }

    public final void c0(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((RecyclerView.LayoutParams) view.getLayoutParams()).f19269b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f19494b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f19494b.f19238l;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void d(View view) {
        g(view, -1, true);
    }

    public boolean d0() {
        return false;
    }

    public final void e(View view) {
        g(view, 0, true);
    }

    public final void f(View view) {
        g(view, -1, false);
    }

    public final void g(View view, int i13, boolean z13) {
        y2 w13 = RecyclerView.w1(view);
        if (z13 || w13.z()) {
            this.f19494b.f19228g.b(w13);
        } else {
            this.f19494b.f19228g.m(w13);
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (w13.g0() || w13.D()) {
            if (w13.D()) {
                w13.f19730n.p(w13);
            } else {
                w13.f19726j &= -33;
            }
            this.f19493a.b(view, i13, view.getLayoutParams(), false);
        } else if (view.getParent() == this.f19494b) {
            int h10 = this.f19493a.h(view);
            if (i13 == -1) {
                i13 = this.f19493a.e();
            }
            if (h10 == -1) {
                StringBuilder sb3 = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                sb3.append(this.f19494b.indexOfChild(view));
                throw new IllegalStateException(cb.f(this.f19494b, sb3));
            }
            if (h10 != i13) {
                this.f19494b.f19242n.h0(h10, i13);
            }
        } else {
            this.f19493a.a(view, i13, false);
            layoutParams.f19270c = true;
            v2 v2Var = this.f19497e;
            if (v2Var != null && v2Var.d()) {
                this.f19497e.f(view);
            }
        }
        if (layoutParams.f19271d) {
            w13.f19717a.invalidate();
            layoutParams.f19271d = false;
        }
    }

    public void g0(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        Rect J1 = this.f19494b.J1(view);
        int i13 = J1.left + J1.right;
        int i14 = J1.top + J1.bottom;
        int F = F(k(), this.f19506n, this.f19504l, W() + V() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i13, ((ViewGroup.MarginLayoutParams) layoutParams).width);
        int F2 = F(l(), this.f19507o, this.f19505m, T() + Y() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i14, ((ViewGroup.MarginLayoutParams) layoutParams).height);
        if (T0(view, F, F2, layoutParams)) {
            view.measure(F, F2);
        }
    }

    public void h(String str) {
        RecyclerView recyclerView = this.f19494b;
        if (recyclerView != null) {
            recyclerView.s(str);
        }
    }

    public final void h0(int i13, int i14) {
        View D = D(i13);
        if (D != null) {
            D(i13);
            this.f19493a.c(i13);
            i(D, i14);
        } else {
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i13 + this.f19494b.toString());
        }
    }

    public final void i(View view, int i13) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        y2 w13 = RecyclerView.w1(view);
        if (w13.z()) {
            this.f19494b.f19228g.b(w13);
        } else {
            this.f19494b.f19228g.m(w13);
        }
        this.f19493a.b(view, i13, layoutParams, w13.z());
    }

    public void i0(int i13) {
        RecyclerView recyclerView = this.f19494b;
        if (recyclerView != null) {
            int e13 = recyclerView.f19226f.e();
            for (int i14 = 0; i14 < e13; i14++) {
                recyclerView.f19226f.d(i14).offsetLeftAndRight(i13);
            }
        }
    }

    public final void j(Rect rect, View view) {
        RecyclerView recyclerView = this.f19494b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.J1(view));
        }
    }

    public void j0(int i13) {
        RecyclerView recyclerView = this.f19494b;
        if (recyclerView != null) {
            int e13 = recyclerView.f19226f.e();
            for (int i14 = 0; i14 < e13; i14++) {
                recyclerView.f19226f.d(i14).offsetTopAndBottom(i13);
            }
        }
    }

    public boolean k() {
        return false;
    }

    public void k0() {
    }

    public boolean l() {
        return this instanceof RowsWithVariableColumnsLayoutManager;
    }

    public void l0(RecyclerView recyclerView) {
    }

    public boolean m(RecyclerView.LayoutParams layoutParams) {
        return layoutParams != null;
    }

    public void m0(RecyclerView recyclerView, q2 q2Var) {
    }

    public View n0(View view, int i13, q2 q2Var, w2 w2Var) {
        return null;
    }

    public void o(int i13, int i14, w2 w2Var, g1.i iVar) {
    }

    public void o0(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f19494b;
        q2 q2Var = recyclerView.f19220c;
        w2 w2Var = recyclerView.f19231h0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z13 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f19494b.canScrollVertically(-1) && !this.f19494b.canScrollHorizontally(-1) && !this.f19494b.canScrollHorizontally(1)) {
            z13 = false;
        }
        accessibilityEvent.setScrollable(z13);
        b2 b2Var = this.f19494b.f19240m;
        if (b2Var != null) {
            accessibilityEvent.setItemCount(b2Var.e());
        }
    }

    public void p(int i13, g1.i iVar) {
    }

    public void p0(q2 q2Var, w2 w2Var, r5.e eVar) {
        if (this.f19494b.canScrollVertically(-1) || this.f19494b.canScrollHorizontally(-1)) {
            eVar.a(8192);
            eVar.C(true);
        }
        if (this.f19494b.canScrollVertically(1) || this.f19494b.canScrollHorizontally(1)) {
            eVar.a(4096);
            eVar.C(true);
        }
        eVar.t(y1.i(b0(q2Var, w2Var), H(q2Var, w2Var), 0));
    }

    public int q(w2 w2Var) {
        return 0;
    }

    public final void q0(View view, r5.e eVar) {
        y2 w13 = RecyclerView.w1(view);
        if (w13 == null || w13.z() || this.f19493a.f19443c.contains(w13.f19717a)) {
            return;
        }
        RecyclerView recyclerView = this.f19494b;
        r0(recyclerView.f19220c, recyclerView.f19231h0, view, eVar);
    }

    public int r(w2 w2Var) {
        return 0;
    }

    public void r0(q2 q2Var, w2 w2Var, View view, r5.e eVar) {
    }

    public int s(w2 w2Var) {
        return 0;
    }

    public void s0(RecyclerView recyclerView, int i13, int i14) {
    }

    public int t(w2 w2Var) {
        return 0;
    }

    public void t0(RecyclerView recyclerView) {
    }

    public int u(w2 w2Var) {
        return 0;
    }

    public void u0(RecyclerView recyclerView, int i13, int i14) {
    }

    public int v(w2 w2Var) {
        return 0;
    }

    public void v0(RecyclerView recyclerView, int i13, int i14) {
    }

    public final void w(q2 q2Var) {
        for (int E = E() - 1; E >= 0; E--) {
            K0(q2Var, E, D(E));
        }
    }

    public void w0(RecyclerView recyclerView, int i13, int i14) {
    }

    public final void x(RecyclerView recyclerView, q2 q2Var) {
        this.f19499g = false;
        m0(recyclerView, q2Var);
    }

    public void x0(q2 q2Var, w2 w2Var) {
        Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
    }

    public final View y(View view) {
        View G0;
        RecyclerView recyclerView = this.f19494b;
        if (recyclerView == null || (G0 = recyclerView.G0(view)) == null || this.f19493a.i(G0)) {
            return null;
        }
        return G0;
    }

    public void y0(w2 w2Var) {
    }

    public View z(int i13) {
        int E = E();
        for (int i14 = 0; i14 < E; i14++) {
            View D = D(i14);
            y2 w13 = RecyclerView.w1(D);
            if (w13 != null && w13.m() == i13 && !w13.d0() && (this.f19494b.f19231h0.f19683g || !w13.z())) {
                return D;
            }
        }
        return null;
    }

    public void z0(Parcelable parcelable) {
    }
}
