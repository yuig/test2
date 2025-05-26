package androidx.recyclerview.widget;

import a.cb;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.customview.view.AbsSavedState;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import t3.y3;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements q5.y, q5.r {
    public static final int[] A0 = {R.attr.nestedScrollingEnabled};
    public static final float B0 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean C0 = true;
    public static final boolean D0 = true;
    public static final boolean E0 = true;
    public static final Class[] F0;
    public static final x1 G0;
    public static final androidx.lifecycle.n1 H0;
    public boolean A;
    public final AccessibilityManager B;
    public ArrayList C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public final androidx.lifecycle.n1 H;
    public EdgeEffect I;

    /* renamed from: J */
    public EdgeEffect f19215J;
    public EdgeEffect K;
    public EdgeEffect L;
    public g2 M;
    public int N;
    public int O;
    public VelocityTracker P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public c3 V;
    public final int W;

    /* renamed from: a */
    public final float f19216a;

    /* renamed from: a0 */
    public final int f19217a0;

    /* renamed from: b */
    public final r2 f19218b;

    /* renamed from: b0 */
    public final float f19219b0;

    /* renamed from: c */
    public final q2 f19220c;

    /* renamed from: c0 */
    public final float f19221c0;

    /* renamed from: d */
    public SavedState f19222d;

    /* renamed from: d0 */
    public final boolean f19223d0;

    /* renamed from: e */
    public final b f19224e;

    /* renamed from: e0 */
    public final x2 f19225e0;

    /* renamed from: f */
    public final i f19226f;

    /* renamed from: f0 */
    public h0 f19227f0;

    /* renamed from: g */
    public final n3 f19228g;

    /* renamed from: g0 */
    public final g1.i f19229g0;

    /* renamed from: h */
    public boolean f19230h;

    /* renamed from: h0 */
    public final w2 f19231h0;

    /* renamed from: i */
    public final w1 f19232i;

    /* renamed from: i0 */
    public ArrayList f19233i0;

    /* renamed from: j */
    public final Rect f19234j;

    /* renamed from: j0 */
    public boolean f19235j0;

    /* renamed from: k */
    public final Rect f19236k;

    /* renamed from: k0 */
    public boolean f19237k0;

    /* renamed from: l */
    public final RectF f19238l;

    /* renamed from: l0 */
    public final y1 f19239l0;

    /* renamed from: m */
    public b2 f19240m;

    /* renamed from: m0 */
    public boolean f19241m0;

    /* renamed from: n */
    public l2 f19242n;

    /* renamed from: n0 */
    public a3 f19243n0;

    /* renamed from: o */
    public final ArrayList f19244o;

    /* renamed from: o0 */
    public e2 f19245o0;

    /* renamed from: p */
    public final ArrayList f19246p;

    /* renamed from: p0 */
    public final int[] f19247p0;

    /* renamed from: q */
    public final ArrayList f19248q;

    /* renamed from: q0 */
    public e3.a f19249q0;

    /* renamed from: r */
    public n2 f19250r;

    /* renamed from: r0 */
    public final int[] f19251r0;

    /* renamed from: s */
    public boolean f19252s;

    /* renamed from: s0 */
    public final int[] f19253s0;

    /* renamed from: t */
    public boolean f19254t;

    /* renamed from: t0 */
    public final int[] f19255t0;

    /* renamed from: u */
    public boolean f19256u;

    /* renamed from: u0 */
    public final ArrayList f19257u0;

    /* renamed from: v */
    public int f19258v;

    /* renamed from: v0 */
    public final w1 f19259v0;

    /* renamed from: w */
    public boolean f19260w;

    /* renamed from: w0 */
    public boolean f19261w0;

    /* renamed from: x */
    public boolean f19262x;

    /* renamed from: x0 */
    public int f19263x0;

    /* renamed from: y */
    public boolean f19264y;

    /* renamed from: y0 */
    public int f19265y0;

    /* renamed from: z */
    public int f19266z;

    /* renamed from: z0 */
    public final y1 f19267z0;

    /* loaded from: classes3.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new s2();

        /* renamed from: c */
        public Parcelable f19272c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f19272c = parcel.readParcelable(classLoader == null ? l2.class.getClassLoader() : classLoader);
        }

        public final void b(SavedState savedState) {
            this.f19272c = savedState.f19272c;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeParcelable(this.f19272c, 0);
        }
    }

    static {
        Class cls = Integer.TYPE;
        F0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        G0 = new x1(0);
        H0 = new androidx.lifecycle.n1();
    }

    public RecyclerView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ia.a.recyclerViewStyle);
    }

    public static int D(int i13, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i14) {
        if (i13 > 0 && edgeEffect != null && ph.a.I(edgeEffect) != 0.0f) {
            int round = Math.round(ph.a.D0(edgeEffect, ((-i13) * 4.0f) / i14, 0.5f) * ((-i14) / 4.0f));
            if (round != i13) {
                edgeEffect.finish();
            }
            return i13 - round;
        }
        if (i13 >= 0 || edgeEffect2 == null || ph.a.I(edgeEffect2) == 0.0f) {
            return i13;
        }
        float f13 = i14;
        int round2 = Math.round(ph.a.D0(edgeEffect2, (i13 * 4.0f) / f13, 0.5f) * (f13 / 4.0f));
        if (round2 != i13) {
            edgeEffect2.finish();
        }
        return i13 - round2;
    }

    public static String H1(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    public static RecyclerView L0(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            RecyclerView L0 = L0(viewGroup.getChildAt(i13));
            if (L0 != null) {
                return L0;
            }
        }
        return null;
    }

    public static int r1(View view) {
        y2 w13 = w1(view);
        if (w13 != null) {
            return w13.j();
        }
        return -1;
    }

    public static int s1(View view) {
        y2 w13 = w1(view);
        if (w13 != null) {
            return w13.m();
        }
        return -1;
    }

    public static y2 w1(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f19268a;
    }

    public static void x(y2 y2Var) {
        WeakReference weakReference = y2Var.f19718b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == y2Var.f19717a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            y2Var.f19718b = null;
        }
    }

    public static void y1(Rect rect, View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.f19269b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
    }

    public static int z1(View view) {
        int id3 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id3 = view.getId();
            }
        }
        return id3;
    }

    public final void A2() {
        VelocityTracker velocityTracker = this.P;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z13 = false;
        M1().s(0);
        EdgeEffect edgeEffect = this.I;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z13 = this.I.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f19215J;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z13 |= this.f19215J.isFinished();
        }
        EdgeEffect edgeEffect3 = this.K;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z13 |= this.K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.L;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z13 |= this.L.isFinished();
        }
        if (z13) {
            WeakHashMap weakHashMap = q5.v0.f102521a;
            postInvalidateOnAnimation();
        }
    }

    public final void B0(w2 w2Var) {
        if (this.N != 2) {
            w2Var.getClass();
            return;
        }
        OverScroller overScroller = this.f19225e0.f19702c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        w2Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public final void C(int i13, int i14) {
        boolean z13;
        EdgeEffect edgeEffect = this.I;
        if (edgeEffect == null || edgeEffect.isFinished() || i13 <= 0) {
            z13 = false;
        } else {
            this.I.onRelease();
            z13 = this.I.isFinished();
        }
        EdgeEffect edgeEffect2 = this.K;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i13 < 0) {
            this.K.onRelease();
            z13 |= this.K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f19215J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i14 > 0) {
            this.f19215J.onRelease();
            z13 |= this.f19215J.isFinished();
        }
        EdgeEffect edgeEffect4 = this.L;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i14 < 0) {
            this.L.onRelease();
            z13 |= this.L.isFinished();
        }
        if (z13) {
            WeakHashMap weakHashMap = q5.v0.f102521a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x010d, code lost:
    
        if (r8 == 0.0f) goto L95;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean D2(int r20, int r21, android.view.MotionEvent r22, int r23) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.D2(int, int, android.view.MotionEvent, int):boolean");
    }

    public final void E2(int i13, int i14, int[] iArr) {
        y2 y2Var;
        e3();
        c2();
        int i15 = j5.k.f74682a;
        Trace.beginSection("RV Scroll");
        w2 w2Var = this.f19231h0;
        B0(w2Var);
        q2 q2Var = this.f19220c;
        int L0 = i13 != 0 ? this.f19242n.L0(i13, q2Var, w2Var) : 0;
        int N0 = i14 != 0 ? this.f19242n.N0(i14, q2Var, w2Var) : 0;
        Trace.endSection();
        int e13 = this.f19226f.e();
        for (int i16 = 0; i16 < e13; i16++) {
            View d2 = this.f19226f.d(i16);
            y2 t13 = t1(d2);
            if (t13 != null && (y2Var = t13.f19725i) != null) {
                int left = d2.getLeft();
                int top = d2.getTop();
                View view = y2Var.f19717a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        d2(true);
        g3(false);
        if (iArr != null) {
            iArr[0] = L0;
            iArr[1] = N0;
        }
    }

    public final View F0(float f13, float f14) {
        for (int e13 = this.f19226f.e() - 1; e13 >= 0; e13--) {
            View d2 = this.f19226f.d(e13);
            float translationX = d2.getTranslationX();
            float translationY = d2.getTranslationY();
            if (f13 >= d2.getLeft() + translationX && f13 <= d2.getRight() + translationX && f14 >= d2.getTop() + translationY && f14 <= d2.getBottom() + translationY) {
                return d2;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View G0(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.G0(android.view.View):android.view.View");
    }

    public final void G2(int i13) {
        if (this.f19262x) {
            return;
        }
        h3();
        l2 l2Var = this.f19242n;
        if (l2Var == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            l2Var.M0(i13);
            awakenScrollBars();
        }
    }

    public final y2 H0(View view) {
        View G02 = G0(view);
        if (G02 == null) {
            return null;
        }
        return t1(G02);
    }

    public final void H2(b2 b2Var) {
        suppressLayout(false);
        b2 b2Var2 = this.f19240m;
        r2 r2Var = this.f19218b;
        if (b2Var2 != null) {
            b2Var2.B(r2Var);
            this.f19240m.u(this);
        }
        g2 g2Var = this.M;
        if (g2Var != null) {
            g2Var.k();
        }
        l2 l2Var = this.f19242n;
        q2 q2Var = this.f19220c;
        if (l2Var != null) {
            l2Var.D0(q2Var);
            this.f19242n.E0(q2Var);
        }
        q2Var.f19602a.clear();
        q2Var.j();
        b bVar = this.f19224e;
        bVar.o(bVar.f19322b);
        bVar.o(bVar.f19323c);
        bVar.f19326f = 0;
        b2 b2Var3 = this.f19240m;
        this.f19240m = b2Var;
        if (b2Var != null) {
            b2Var.z(r2Var);
            b2Var.q(this);
        }
        l2 l2Var2 = this.f19242n;
        if (l2Var2 != null) {
            l2Var2.k0();
        }
        b2 b2Var4 = this.f19240m;
        q2Var.f19602a.clear();
        q2Var.j();
        q2Var.h(b2Var3, true);
        e5.d c13 = q2Var.c();
        if (b2Var3 != null) {
            c13.f57215b--;
        }
        if (c13.f57215b == 0) {
            c13.b();
        }
        if (b2Var4 != null) {
            c13.f57215b++;
        }
        q2Var.g();
        this.f19231h0.f19682f = true;
        k2(false);
        requestLayout();
    }

    public final boolean I0(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f19248q;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            n2 n2Var = (n2) arrayList.get(i13);
            if (n2Var.b(this, motionEvent) && action != 3) {
                this.f19250r = n2Var;
                return true;
            }
        }
        return false;
    }

    public final Rect J1(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        boolean z13 = layoutParams.f19270c;
        Rect rect = layoutParams.f19269b;
        if (!z13) {
            return rect;
        }
        w2 w2Var = this.f19231h0;
        if (w2Var.f19683g && (layoutParams.f19268a.T() || layoutParams.a())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f19246p;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            Rect rect2 = this.f19234j;
            rect2.set(0, 0, 0, 0);
            ((h2) arrayList.get(i13)).f(rect2, view, this, w2Var);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        layoutParams.f19270c = false;
        return rect;
    }

    public final void K0(int[] iArr) {
        int e13 = this.f19226f.e();
        if (e13 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MIN_VALUE;
        for (int i15 = 0; i15 < e13; i15++) {
            y2 w13 = w1(this.f19226f.d(i15));
            if (!w13.d0()) {
                int m13 = w13.m();
                if (m13 < i13) {
                    i13 = m13;
                }
                if (m13 > i14) {
                    i14 = m13;
                }
            }
        }
        iArr[0] = i13;
        iArr[1] = i14;
    }

    public final long K1() {
        if (E0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public final void L() {
        if (!this.f19256u || this.D) {
            int i13 = j5.k.f74682a;
            Trace.beginSection("RV FullInvalidate");
            Y();
            Trace.endSection();
            return;
        }
        if (this.f19224e.i()) {
            b bVar = this.f19224e;
            int i14 = bVar.f19326f;
            if ((i14 & 4) == 0 || (i14 & 11) != 0) {
                if (bVar.i()) {
                    int i15 = j5.k.f74682a;
                    Trace.beginSection("RV FullInvalidate");
                    Y();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i16 = j5.k.f74682a;
            Trace.beginSection("RV PartialInvalidate");
            e3();
            c2();
            this.f19224e.m();
            if (!this.f19260w) {
                if (R1()) {
                    Y();
                } else {
                    this.f19224e.d();
                }
            }
            g3(true);
            d2(true);
            Trace.endSection();
        }
    }

    public final e3.a M1() {
        if (this.f19249q0 == null) {
            this.f19249q0 = new e3.a(this);
        }
        return this.f19249q0;
    }

    public final void M2(mj.m mVar) {
        if (mVar == this.f19245o0) {
            return;
        }
        this.f19245o0 = mVar;
        setChildrenDrawingOrderEnabled(mVar != null);
    }

    public final void O1(long j13, y2 y2Var, y2 y2Var2) {
        int e13 = this.f19226f.e();
        for (int i13 = 0; i13 < e13; i13++) {
            y2 w13 = w1(this.f19226f.d(i13));
            if (w13 != y2Var && p1(w13) == j13) {
                b2 b2Var = this.f19240m;
                if (b2Var == null || !b2Var.f19332b) {
                    StringBuilder sb3 = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                    sb3.append(w13);
                    sb3.append(" \n View Holder 2:");
                    sb3.append(y2Var);
                    throw new IllegalStateException(cb.f(this, sb3));
                }
                StringBuilder sb4 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                sb4.append(w13);
                sb4.append(" \n View Holder 2:");
                sb4.append(y2Var);
                throw new IllegalStateException(cb.f(this, sb4));
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + y2Var2 + " cannot be found but it is necessary for " + y2Var + z0());
    }

    public final void O2(g2 g2Var) {
        g2 g2Var2 = this.M;
        if (g2Var2 != null) {
            g2Var2.k();
            this.M.f19419a = null;
        }
        this.M = g2Var;
        if (g2Var != null) {
            g2Var.f19419a = this.f19239l0;
        }
    }

    public final View P0() {
        y2 S0;
        View view;
        w2 w2Var = this.f19231h0;
        int i13 = w2Var.f19688l;
        if (i13 == -1) {
            i13 = 0;
        }
        int b13 = w2Var.b();
        for (int i14 = i13; i14 < b13; i14++) {
            y2 S02 = S0(i14);
            if (S02 == null) {
                break;
            }
            View view2 = S02.f19717a;
            if (view2.hasFocusable()) {
                return view2;
            }
        }
        int min = Math.min(b13, i13);
        do {
            min--;
            if (min < 0 || (S0 = S0(min)) == null) {
                return null;
            }
            view = S0.f19717a;
        } while (!view.hasFocusable());
        return view;
    }

    public final boolean R1() {
        int e13 = this.f19226f.e();
        for (int i13 = 0; i13 < e13; i13++) {
            y2 w13 = w1(this.f19226f.d(i13));
            if (w13 != null && !w13.d0() && w13.T()) {
                return true;
            }
        }
        return false;
    }

    public final void R2(l2 l2Var) {
        int i13;
        y1 y1Var;
        Object obj;
        if (l2Var == this.f19242n) {
            return;
        }
        h3();
        l2 l2Var2 = this.f19242n;
        q2 q2Var = this.f19220c;
        if (l2Var2 != null) {
            g2 g2Var = this.M;
            if (g2Var != null) {
                g2Var.k();
            }
            this.f19242n.D0(q2Var);
            this.f19242n.E0(q2Var);
            q2Var.f19602a.clear();
            q2Var.j();
            if (this.f19252s) {
                this.f19242n.x(this, q2Var);
            }
            this.f19242n.S0(null);
            this.f19242n = null;
        } else {
            q2Var.f19602a.clear();
            q2Var.j();
        }
        i iVar = this.f19226f;
        iVar.f19442b.g();
        ArrayList arrayList = iVar.f19443c;
        int size = arrayList.size() - 1;
        while (true) {
            i13 = 0;
            y1Var = iVar.f19441a;
            if (size < 0) {
                break;
            }
            View view = (View) arrayList.get(size);
            y1Var.getClass();
            y2 w13 = w1(view);
            if (w13 != null) {
                RecyclerView recyclerView = (RecyclerView) y1Var.f19715a;
                int i14 = w13.f19732p;
                if (recyclerView.V1()) {
                    w13.f19733q = i14;
                    recyclerView.f19257u0.add(w13);
                } else {
                    WeakHashMap weakHashMap = q5.v0.f102521a;
                    w13.f19717a.setImportantForAccessibility(i14);
                }
                w13.f19732p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int g13 = y1Var.g();
        while (true) {
            obj = y1Var.f19715a;
            if (i13 >= g13) {
                break;
            }
            View f13 = y1Var.f(i13);
            ((RecyclerView) obj).X(f13);
            f13.clearAnimation();
            i13++;
        }
        ((RecyclerView) obj).removeAllViews();
        this.f19242n = l2Var;
        if (l2Var != null) {
            if (l2Var.f19494b != null) {
                StringBuilder sb3 = new StringBuilder("LayoutManager ");
                sb3.append(l2Var);
                sb3.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(cb.f(l2Var.f19494b, sb3));
            }
            l2Var.S0(this);
            if (this.f19252s) {
                l2 l2Var3 = this.f19242n;
                l2Var3.f19499g = true;
                l2Var3.l0(this);
            }
        }
        q2Var.q();
        requestLayout();
    }

    public final y2 S0(int i13) {
        y2 y2Var = null;
        if (this.D) {
            return null;
        }
        int g13 = this.f19226f.f19441a.g();
        for (int i14 = 0; i14 < g13; i14++) {
            y2 w13 = w1(this.f19226f.f19441a.f(i14));
            if (w13 != null && !w13.z() && n1(w13) == i13) {
                if (!this.f19226f.i(w13.f19717a)) {
                    return w13;
                }
                y2Var = w13;
            }
        }
        return y2Var;
    }

    public final void T(int i13, int i14) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = q5.v0.f102521a;
        setMeasuredDimension(l2.n(i13, paddingRight, getMinimumWidth()), l2.n(i14, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final y2 T0(long j13) {
        b2 b2Var = this.f19240m;
        y2 y2Var = null;
        if (b2Var != null && b2Var.f19332b) {
            int g13 = this.f19226f.f19441a.g();
            for (int i13 = 0; i13 < g13; i13++) {
                y2 w13 = w1(this.f19226f.f19441a.f(i13));
                if (w13 != null && !w13.z() && w13.f19721e == j13) {
                    if (!this.f19226f.i(w13.f19717a)) {
                        return w13;
                    }
                    y2Var = w13;
                }
            }
        }
        return y2Var;
    }

    public final void U1(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException(cb.f(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
        }
        Resources resources = getContext().getResources();
        new f0(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(ia.b.fastscroll_default_thickness), resources.getDimensionPixelSize(ia.b.fastscroll_minimum_range), resources.getDimensionPixelOffset(ia.b.fastscroll_margin));
    }

    public final boolean V1() {
        return this.F > 0;
    }

    public final void W2(int i13) {
        v2 v2Var;
        if (i13 == this.N) {
            return;
        }
        this.N = i13;
        if (i13 != 2) {
            x2 x2Var = this.f19225e0;
            x2Var.f19706g.removeCallbacks(x2Var);
            x2Var.f19702c.abortAnimation();
            l2 l2Var = this.f19242n;
            if (l2Var != null && (v2Var = l2Var.f19497e) != null) {
                v2Var.j();
            }
        }
        d0(i13);
    }

    public final void X(View view) {
        y2 w13 = w1(view);
        b2 b2Var = this.f19240m;
        if (b2Var != null && w13 != null) {
            b2Var.x(w13);
        }
        ArrayList arrayList = this.C;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((m2) this.C.get(size)).c(view);
            }
        }
    }

    public final void X1(int i13) {
        if (this.f19242n == null) {
            return;
        }
        W2(2);
        this.f19242n.M0(i13);
        awakenScrollBars();
    }

    public final boolean X2(EdgeEffect edgeEffect, int i13, int i14) {
        if (i13 > 0) {
            return true;
        }
        float I = ph.a.I(edgeEffect) * i14;
        float abs = Math.abs(-i13) * 0.35f;
        float f13 = this.f19216a * 0.015f;
        double log = Math.log(abs / f13);
        double d2 = B0;
        return ((float) (Math.exp((d2 / (d2 - 1.0d)) * log) * ((double) f13))) < I;
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x025b, code lost:
    
        if (r15.f19226f.f19443c.contains(getFocusedChild()) == false) goto L304;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0295  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Y() {
        /*
            Method dump skipped, instructions count: 692
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Y():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.recyclerview.widget.y2 Y0(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.i r0 = r5.f19226f
            androidx.recyclerview.widget.y1 r0 = r0.f19441a
            int r0 = r0.g()
            r1 = 0
            r2 = 0
        La:
            if (r2 >= r0) goto L40
            androidx.recyclerview.widget.i r3 = r5.f19226f
            androidx.recyclerview.widget.y1 r3 = r3.f19441a
            android.view.View r3 = r3.f(r2)
            androidx.recyclerview.widget.y2 r3 = w1(r3)
            if (r3 == 0) goto L3d
            boolean r4 = r3.z()
            if (r4 != 0) goto L3d
            if (r7 == 0) goto L27
            int r4 = r3.f19719c
            if (r4 == r6) goto L2e
            goto L3d
        L27:
            int r4 = r3.m()
            if (r4 == r6) goto L2e
            goto L3d
        L2e:
            androidx.recyclerview.widget.i r1 = r5.f19226f
            java.util.ArrayList r1 = r1.f19443c
            android.view.View r4 = r3.f19717a
            boolean r1 = r1.contains(r4)
            if (r1 == 0) goto L3c
            r1 = r3
            goto L3d
        L3c:
            return r3
        L3d:
            int r2 = r2 + 1
            goto La
        L40:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Y0(int, boolean):androidx.recyclerview.widget.y2");
    }

    public final void Z() {
        m3 m3Var;
        w2 w2Var = this.f19231h0;
        w2Var.a(1);
        B0(w2Var);
        w2Var.f19685i = false;
        e3();
        n3 n3Var = this.f19228g;
        ((g1.o0) n3Var.f19526a).clear();
        ((g1.p) n3Var.f19527b).a();
        c2();
        i2();
        View focusedChild = (this.f19223d0 && hasFocus() && this.f19240m != null) ? getFocusedChild() : null;
        y2 H02 = focusedChild != null ? H0(focusedChild) : null;
        if (H02 == null) {
            w2Var.f19689m = -1L;
            w2Var.f19688l = -1;
            w2Var.f19690n = -1;
        } else {
            w2Var.f19689m = this.f19240m.f19332b ? H02.l() : -1L;
            w2Var.f19688l = this.D ? -1 : H02.z() ? H02.f19720d : H02.j();
            w2Var.f19690n = z1(H02.f19717a);
        }
        w2Var.f19684h = w2Var.f19686j && this.f19237k0;
        this.f19237k0 = false;
        this.f19235j0 = false;
        w2Var.f19683g = w2Var.f19687k;
        w2Var.f19681e = this.f19240m.e();
        K0(this.f19247p0);
        if (w2Var.f19686j) {
            int e13 = this.f19226f.e();
            for (int i13 = 0; i13 < e13; i13++) {
                y2 w13 = w1(this.f19226f.d(i13));
                if (!w13.d0() && (!w13.t() || this.f19240m.f19332b)) {
                    g2 g2Var = this.M;
                    g2.e(w13);
                    w13.n();
                    g2Var.getClass();
                    f2 f2Var = new f2();
                    View view = w13.f19717a;
                    f2Var.f19405b = view.getLeft();
                    f2Var.f19406c = view.getTop();
                    f2Var.f19407d = view.getRight();
                    f2Var.f19408e = view.getBottom();
                    n3Var.e(w13, f2Var);
                    if (w2Var.f19684h && w13.T() && !w13.z() && !w13.d0() && !w13.t()) {
                        n3Var.c(p1(w13), w13);
                    }
                }
            }
        }
        if (w2Var.f19687k) {
            int g13 = this.f19226f.f19441a.g();
            for (int i14 = 0; i14 < g13; i14++) {
                y2 w14 = w1(this.f19226f.f19441a.f(i14));
                if (!w14.d0() && w14.f19720d == -1) {
                    w14.f19720d = w14.f19719c;
                }
            }
            boolean z13 = w2Var.f19682f;
            w2Var.f19682f = false;
            this.f19242n.x0(this.f19220c, w2Var);
            w2Var.f19682f = z13;
            for (int i15 = 0; i15 < this.f19226f.e(); i15++) {
                y2 w15 = w1(this.f19226f.d(i15));
                if (!w15.d0() && ((m3Var = (m3) ((g1.o0) n3Var.f19526a).get(w15)) == null || (m3Var.f19515a & 4) == 0)) {
                    g2.e(w15);
                    boolean o13 = w15.o(8192);
                    g2 g2Var2 = this.M;
                    w15.n();
                    g2Var2.getClass();
                    f2 f2Var2 = new f2();
                    View view2 = w15.f19717a;
                    f2Var2.f19405b = view2.getLeft();
                    f2Var2.f19406c = view2.getTop();
                    f2Var2.f19407d = view2.getRight();
                    f2Var2.f19408e = view2.getBottom();
                    if (o13) {
                        l2(w15, f2Var2);
                    } else {
                        n3Var.a(w15, f2Var2);
                    }
                }
            }
            z();
        } else {
            z();
        }
        d2(true);
        g3(false);
        w2Var.f19680d = 2;
    }

    public final void Z2(int i13, int i14) {
        b3(i13, i14, null, Integer.MIN_VALUE, false);
    }

    public final void a0() {
        e3();
        c2();
        w2 w2Var = this.f19231h0;
        w2Var.a(6);
        this.f19224e.e();
        w2Var.f19681e = this.f19240m.e();
        w2Var.f19679c = 0;
        if (this.f19222d != null && this.f19240m.b()) {
            Parcelable parcelable = this.f19222d.f19272c;
            if (parcelable != null) {
                this.f19242n.z0(parcelable);
            }
            this.f19222d = null;
        }
        w2Var.f19683g = false;
        this.f19242n.x0(this.f19220c, w2Var);
        w2Var.f19682f = false;
        w2Var.f19686j = w2Var.f19686j && this.M != null;
        w2Var.f19680d = 4;
        d2(true);
        g3(false);
    }

    public final void a2() {
        int g13 = this.f19226f.f19441a.g();
        for (int i13 = 0; i13 < g13; i13++) {
            ((LayoutParams) this.f19226f.f19441a.f(i13).getLayoutParams()).f19270c = true;
        }
        ArrayList arrayList = this.f19220c.f19604c;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            LayoutParams layoutParams = (LayoutParams) ((y2) arrayList.get(i14)).f19717a.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.f19270c = true;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i13, int i14) {
        l2 l2Var = this.f19242n;
        if (l2Var != null) {
            l2Var.getClass();
        }
        super.addFocusables(arrayList, i13, i14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00eb  */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b1(int r12, int r13) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.b1(int, int):boolean");
    }

    public final void b2(int i13, int i14, boolean z13) {
        int i15 = i13 + i14;
        int g13 = this.f19226f.f19441a.g();
        for (int i16 = 0; i16 < g13; i16++) {
            y2 w13 = w1(this.f19226f.f19441a.f(i16));
            if (w13 != null && !w13.d0()) {
                int i17 = w13.f19719c;
                w2 w2Var = this.f19231h0;
                if (i17 >= i15) {
                    w13.Y(-i14, z13);
                    w2Var.f19682f = true;
                } else if (i17 >= i13) {
                    w13.i(i13 - 1, -i14, z13);
                    w2Var.f19682f = true;
                }
            }
        }
        q2 q2Var = this.f19220c;
        ArrayList arrayList = q2Var.f19604c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            y2 y2Var = (y2) arrayList.get(size);
            if (y2Var != null) {
                int i18 = y2Var.f19719c;
                if (i18 >= i15) {
                    y2Var.Y(-i14, z13);
                } else if (i18 >= i13) {
                    y2Var.g(8);
                    q2Var.k(size);
                }
            }
        }
        requestLayout();
    }

    public final void b3(int i13, int i14, DecelerateInterpolator decelerateInterpolator, int i15, boolean z13) {
        l2 l2Var = this.f19242n;
        if (l2Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f19262x) {
            return;
        }
        if (!l2Var.k()) {
            i13 = 0;
        }
        if (!this.f19242n.l()) {
            i14 = 0;
        }
        if (i13 == 0 && i14 == 0) {
            return;
        }
        if (i15 != Integer.MIN_VALUE && i15 <= 0) {
            scrollBy(i13, i14);
            return;
        }
        if (z13) {
            int i16 = i13 != 0 ? 1 : 0;
            if (i14 != 0) {
                i16 |= 2;
            }
            M1().q(i16, 1);
        }
        this.f19225e0.c(i13, i14, i15, decelerateInterpolator);
    }

    public final void c2() {
        this.F++;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && this.f19242n.m((LayoutParams) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        l2 l2Var = this.f19242n;
        if (l2Var != null && l2Var.k()) {
            return this.f19242n.q(this.f19231h0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        l2 l2Var = this.f19242n;
        if (l2Var != null && l2Var.k()) {
            return this.f19242n.r(this.f19231h0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        l2 l2Var = this.f19242n;
        if (l2Var != null && l2Var.k()) {
            return this.f19242n.s(this.f19231h0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        l2 l2Var = this.f19242n;
        if (l2Var != null && l2Var.l()) {
            return this.f19242n.t(this.f19231h0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        l2 l2Var = this.f19242n;
        if (l2Var != null && l2Var.l()) {
            return this.f19242n.u(this.f19231h0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        l2 l2Var = this.f19242n;
        if (l2Var != null && l2Var.l()) {
            return this.f19242n.v(this.f19231h0);
        }
        return 0;
    }

    public final void d0(int i13) {
        l2 l2Var = this.f19242n;
        if (l2Var != null) {
            l2Var.B0(i13);
        }
        ArrayList arrayList = this.f19233i0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((o2) this.f19233i0.get(size)).g(this, i13);
            }
        }
    }

    public final void d2(boolean z13) {
        int i13;
        AccessibilityManager accessibilityManager;
        int i14 = this.F - 1;
        this.F = i14;
        if (i14 < 1) {
            this.F = 0;
            if (z13) {
                int i15 = this.f19266z;
                this.f19266z = 0;
                if (i15 != 0 && (accessibilityManager = this.B) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i15);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.f19257u0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    y2 y2Var = (y2) arrayList.get(size);
                    if (y2Var.f19717a.getParent() == this && !y2Var.d0() && (i13 = y2Var.f19733q) != -1) {
                        WeakHashMap weakHashMap = q5.v0.f102521a;
                        y2Var.f19717a.setImportantForAccessibility(i13);
                        y2Var.f19733q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void d3(int i13) {
        if (this.f19262x) {
            return;
        }
        l2 l2Var = this.f19242n;
        if (l2Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            l2Var.W0(this, this.f19231h0, i13);
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f13, float f14, boolean z13) {
        return M1().b(f13, f14, z13);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f13, float f14) {
        return M1().c(f13, f14);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i13, int i14, int[] iArr, int[] iArr2) {
        return M1().d(i13, i14, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i13, int i14, int i15, int i16, int[] iArr) {
        return M1().e(i13, i14, i15, i16, 0, iArr, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z13;
        super.draw(canvas);
        ArrayList arrayList = this.f19246p;
        int size = arrayList.size();
        boolean z14 = false;
        for (int i13 = 0; i13 < size; i13++) {
            ((h2) arrayList.get(i13)).h(canvas, this);
        }
        EdgeEffect edgeEffect = this.I;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z13 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f19230h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.I;
            z13 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f19215J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f19230h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f19215J;
            z13 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.K;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f19230h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.K;
            z13 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.L;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f19230h) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.L;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z14 = true;
            }
            z13 |= z14;
            canvas.restoreToCount(save4);
        }
        if ((z13 || this.M == null || arrayList.size() <= 0 || !this.M.l()) && !z13) {
            return;
        }
        WeakHashMap weakHashMap = q5.v0.f102521a;
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j13) {
        return super.drawChild(canvas, view, j13);
    }

    public final void e3() {
        int i13 = this.f19258v + 1;
        this.f19258v = i13;
        if (i13 != 1 || this.f19262x) {
            return;
        }
        this.f19260w = false;
    }

    public final void f2(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.O) {
            int i13 = actionIndex == 0 ? 1 : 0;
            this.O = motionEvent.getPointerId(i13);
            int x13 = (int) (motionEvent.getX(i13) + 0.5f);
            this.S = x13;
            this.Q = x13;
            int y13 = (int) (motionEvent.getY(i13) + 0.5f);
            this.T = y13;
            this.R = y13;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r18, int r19) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g0(int i13, int i14) {
        this.G++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i13, scrollY - i14);
        ArrayList arrayList = this.f19233i0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((o2) this.f19233i0.get(size)).j(this, i13, i14);
            }
        }
        this.G--;
    }

    public final void g2() {
        if (this.f19241m0 || !this.f19252s) {
            return;
        }
        WeakHashMap weakHashMap = q5.v0.f102521a;
        postOnAnimation(this.f19259v0);
        this.f19241m0 = true;
    }

    public final void g3(boolean z13) {
        if (this.f19258v < 1) {
            this.f19258v = 1;
        }
        if (!z13 && !this.f19262x) {
            this.f19260w = false;
        }
        if (this.f19258v == 1) {
            if (z13 && this.f19260w && !this.f19262x && this.f19242n != null && this.f19240m != null) {
                Y();
            }
            if (!this.f19262x) {
                this.f19260w = false;
            }
        }
        this.f19258v--;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        l2 l2Var = this.f19242n;
        if (l2Var != null) {
            return l2Var.A();
        }
        throw new IllegalStateException(cb.f(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        l2 l2Var = this.f19242n;
        if (l2Var != null) {
            return l2Var.B(getContext(), attributeSet);
        }
        throw new IllegalStateException(cb.f(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @Override // android.view.View
    public final int getBaseline() {
        l2 l2Var = this.f19242n;
        if (l2Var == null) {
            return super.getBaseline();
        }
        l2Var.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i13, int i14) {
        e2 e2Var = this.f19245o0;
        return e2Var == null ? super.getChildDrawingOrder(i13, i14) : e2Var.n(i13, i14);
    }

    @Override // android.view.ViewGroup
    public final boolean getClipToPadding() {
        return this.f19230h;
    }

    public final void h3() {
        v2 v2Var;
        W2(0);
        x2 x2Var = this.f19225e0;
        x2Var.f19706g.removeCallbacks(x2Var);
        x2Var.f19702c.abortAnimation();
        l2 l2Var = this.f19242n;
        if (l2Var == null || (v2Var = l2Var.f19497e) == null) {
            return;
        }
        v2Var.j();
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return M1().h(0);
    }

    public final void i2() {
        boolean z13;
        boolean z14 = false;
        if (this.D) {
            b bVar = this.f19224e;
            bVar.o(bVar.f19322b);
            bVar.o(bVar.f19323c);
            bVar.f19326f = 0;
            if (this.E) {
                this.f19242n.t0(this);
            }
        }
        if (this.M == null || !this.f19242n.Y0()) {
            this.f19224e.e();
        } else {
            this.f19224e.m();
        }
        boolean z15 = this.f19235j0 || this.f19237k0;
        boolean z16 = this.f19256u && this.M != null && ((z13 = this.D) || z15 || this.f19242n.f19498f) && (!z13 || this.f19240m.f19332b);
        w2 w2Var = this.f19231h0;
        w2Var.f19686j = z16;
        if (z16 && z15 && !this.D && this.M != null && this.f19242n.Y0()) {
            z14 = true;
        }
        w2Var.f19687k = z14;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f19252s;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f19262x;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return M1().f56995a;
    }

    public final void k0() {
        if (this.L != null) {
            return;
        }
        this.H.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.L = edgeEffect;
        if (this.f19230h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void k2(boolean z13) {
        this.E = z13 | this.E;
        this.D = true;
        int g13 = this.f19226f.f19441a.g();
        for (int i13 = 0; i13 < g13; i13++) {
            y2 w13 = w1(this.f19226f.f19441a.f(i13));
            if (w13 != null && !w13.d0()) {
                w13.g(6);
            }
        }
        a2();
        q2 q2Var = this.f19220c;
        ArrayList arrayList = q2Var.f19604c;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            y2 y2Var = (y2) arrayList.get(i14);
            if (y2Var != null) {
                y2Var.g(6);
                y2Var.b(null);
            }
        }
        b2 b2Var = q2Var.f19610i.f19240m;
        if (b2Var == null || !b2Var.f19332b) {
            q2Var.j();
        }
    }

    public final void l(y2 y2Var) {
        View view = y2Var.f19717a;
        boolean z13 = view.getParent() == this;
        this.f19220c.p(t1(view));
        if (y2Var.L()) {
            this.f19226f.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z13) {
            this.f19226f.a(view, -1, true);
            return;
        }
        i iVar = this.f19226f;
        int indexOfChild = ((RecyclerView) iVar.f19441a.f19715a).indexOfChild(view);
        if (indexOfChild >= 0) {
            iVar.f19442b.h(indexOfChild);
            iVar.g(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void l2(y2 y2Var, f2 f2Var) {
        y2Var.f19726j &= -8193;
        boolean z13 = this.f19231h0.f19684h;
        n3 n3Var = this.f19228g;
        if (z13 && y2Var.T() && !y2Var.z() && !y2Var.d0()) {
            n3Var.c(p1(y2Var), y2Var);
        }
        n3Var.e(y2Var, f2Var);
    }

    public final void m(h2 h2Var) {
        l2 l2Var = this.f19242n;
        if (l2Var != null) {
            l2Var.h("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f19246p;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(h2Var);
        a2();
        requestLayout();
    }

    public final void n(m2 m2Var) {
        if (this.C == null) {
            this.C = new ArrayList();
        }
        this.C.add(m2Var);
    }

    public final int n1(y2 y2Var) {
        if (y2Var.o(524) || !y2Var.s()) {
            return -1;
        }
        b bVar = this.f19224e;
        int i13 = y2Var.f19719c;
        ArrayList arrayList = bVar.f19322b;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            a aVar = (a) arrayList.get(i14);
            int i15 = aVar.f19313a;
            if (i15 != 1) {
                if (i15 == 2) {
                    int i16 = aVar.f19314b;
                    if (i16 <= i13) {
                        int i17 = aVar.f19316d;
                        if (i16 + i17 > i13) {
                            return -1;
                        }
                        i13 -= i17;
                    } else {
                        continue;
                    }
                } else if (i15 == 8) {
                    int i18 = aVar.f19314b;
                    if (i18 == i13) {
                        i13 = aVar.f19316d;
                    } else {
                        if (i18 < i13) {
                            i13--;
                        }
                        if (aVar.f19316d <= i13) {
                            i13++;
                        }
                    }
                }
            } else if (aVar.f19314b <= i13) {
                i13 += aVar.f19316d;
            }
        }
        return i13;
    }

    public final void o(o2 o2Var) {
        if (this.f19233i0 == null) {
            this.f19233i0 = new ArrayList();
        }
        this.f19233i0.add(o2Var);
    }

    public final void o0() {
        if (this.I != null) {
            return;
        }
        this.H.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.I = edgeEffect;
        if (this.f19230h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        if (r1 >= 30.0f) goto L48;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.F = r0
            r1 = 1
            r5.f19252s = r1
            boolean r2 = r5.f19256u
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.f19256u = r2
            androidx.recyclerview.widget.q2 r2 = r5.f19220c
            r2.g()
            androidx.recyclerview.widget.l2 r2 = r5.f19242n
            if (r2 == 0) goto L26
            r2.f19499g = r1
            r2.l0(r5)
        L26:
            r5.f19241m0 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.E0
            if (r0 == 0) goto L7e
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.h0.f19434e
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.h0 r1 = (androidx.recyclerview.widget.h0) r1
            r5.f19227f0 = r1
            if (r1 != 0) goto L74
            androidx.recyclerview.widget.h0 r1 = new androidx.recyclerview.widget.h0
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f19436a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f19439d = r2
            r5.f19227f0 = r1
            java.util.WeakHashMap r1 = q5.v0.f102521a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L66
            if (r1 == 0) goto L66
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L66
            goto L68
        L66:
            r1 = 1114636288(0x42700000, float:60.0)
        L68:
            androidx.recyclerview.widget.h0 r2 = r5.f19227f0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f19438c = r3
            r0.set(r2)
        L74:
            androidx.recyclerview.widget.h0 r0 = r5.f19227f0
            r0.getClass()
            java.util.ArrayList r0 = r0.f19436a
            r0.add(r5)
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        h0 h0Var;
        super.onDetachedFromWindow();
        g2 g2Var = this.M;
        if (g2Var != null) {
            g2Var.k();
        }
        h3();
        this.f19252s = false;
        l2 l2Var = this.f19242n;
        q2 q2Var = this.f19220c;
        if (l2Var != null) {
            l2Var.x(this, q2Var);
        }
        this.f19257u0.clear();
        removeCallbacks(this.f19259v0);
        this.f19228g.getClass();
        while (m3.f19514d.b() != null) {
        }
        int i13 = 0;
        while (true) {
            ArrayList arrayList = q2Var.f19604c;
            if (i13 >= arrayList.size()) {
                break;
            }
            x5.a.a(((y2) arrayList.get(i13)).f19717a);
            i13++;
        }
        q2Var.h(q2Var.f19610i.f19240m, false);
        int i14 = x5.a.f133834a;
        Intrinsics.checkNotNullParameter(this, "<this>");
        Iterator it = d7.b.O(this).iterator();
        while (it.hasNext()) {
            ArrayList arrayList2 = x5.a.b((View) it.next()).f133836a;
            for (int i15 = kotlin.collections.f0.i(arrayList2); -1 < i15; i15--) {
                ((y3) arrayList2.get(i15)).f116282a.g();
            }
        }
        if (!E0 || (h0Var = this.f19227f0) == null) {
            return;
        }
        h0Var.f19436a.remove(this);
        this.f19227f0 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f19246p;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((h2) arrayList.get(i13)).g(canvas, this, this.f19231h0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d1, code lost:
    
        if (r0 != false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x019b, code lost:
    
        if (r11.N != 2) goto L177;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        int i17 = j5.k.f74682a;
        Trace.beginSection("RV OnLayout");
        Y();
        Trace.endSection();
        this.f19256u = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        l2 l2Var = this.f19242n;
        if (l2Var == null) {
            T(i13, i14);
            return;
        }
        boolean d03 = l2Var.d0();
        boolean z13 = false;
        w2 w2Var = this.f19231h0;
        if (d03) {
            int mode = View.MeasureSpec.getMode(i13);
            int mode2 = View.MeasureSpec.getMode(i14);
            this.f19242n.f19494b.T(i13, i14);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z13 = true;
            }
            this.f19261w0 = z13;
            if (z13 || this.f19240m == null) {
                return;
            }
            if (w2Var.f19680d == 1) {
                Z();
            }
            this.f19242n.P0(i13, i14);
            w2Var.f19685i = true;
            a0();
            this.f19242n.R0(i13, i14);
            if (this.f19242n.U0()) {
                this.f19242n.P0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                w2Var.f19685i = true;
                a0();
                this.f19242n.R0(i13, i14);
            }
            this.f19263x0 = getMeasuredWidth();
            this.f19265y0 = getMeasuredHeight();
            return;
        }
        if (this.f19254t) {
            this.f19242n.f19494b.T(i13, i14);
            return;
        }
        if (this.A) {
            e3();
            c2();
            i2();
            d2(true);
            if (w2Var.f19687k) {
                w2Var.f19683g = true;
            } else {
                this.f19224e.e();
                w2Var.f19683g = false;
            }
            this.A = false;
            g3(false);
        } else if (w2Var.f19687k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        b2 b2Var = this.f19240m;
        if (b2Var != null) {
            w2Var.f19681e = b2Var.e();
        } else {
            w2Var.f19681e = 0;
        }
        e3();
        this.f19242n.f19494b.T(i13, i14);
        g3(false);
        w2Var.f19683g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i13, Rect rect) {
        if (V1()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i13, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f19222d = savedState;
        super.onRestoreInstanceState(savedState.a());
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f19222d;
        if (savedState2 != null) {
            savedState.b(savedState2);
        } else {
            l2 l2Var = this.f19242n;
            if (l2Var != null) {
                savedState.f19272c = l2Var.A0();
            } else {
                savedState.f19272c = null;
            }
        }
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        if (i13 == i15 && i14 == i16) {
            return;
        }
        this.L = null;
        this.f19215J = null;
        this.K = null;
        this.I = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0101  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final long p1(y2 y2Var) {
        return this.f19240m.f19332b ? y2Var.l() : y2Var.f19719c;
    }

    public final void q(y2 y2Var, y2 y2Var2, f2 f2Var, f2 f2Var2, boolean z13, boolean z14) {
        y2Var.a0(false);
        if (z13) {
            l(y2Var);
        }
        if (y2Var != y2Var2) {
            if (z14) {
                l(y2Var2);
            }
            y2Var.f19724h = y2Var2;
            l(y2Var);
            this.f19220c.p(y2Var);
            y2Var2.a0(false);
            y2Var2.f19725i = y2Var;
        }
        if (this.M.b(y2Var, y2Var2, f2Var, f2Var2)) {
            g2();
        }
    }

    public final void r0() {
        if (this.K != null) {
            return;
        }
        this.H.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.K = edgeEffect;
        if (this.f19230h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final int r2(int i13, float f13) {
        float height = f13 / getHeight();
        float width = i13 / getWidth();
        EdgeEffect edgeEffect = this.I;
        float f14 = 0.0f;
        if (edgeEffect == null || ph.a.I(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.K;
            if (edgeEffect2 != null && ph.a.I(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.K.onRelease();
                } else {
                    float D02 = ph.a.D0(this.K, width, height);
                    if (ph.a.I(this.K) == 0.0f) {
                        this.K.onRelease();
                    }
                    f14 = D02;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.I.onRelease();
            } else {
                float f15 = -ph.a.D0(this.I, -width, 1.0f - height);
                if (ph.a.I(this.I) == 0.0f) {
                    this.I.onRelease();
                }
                f14 = f15;
            }
            invalidate();
        }
        return Math.round(f14 * getWidth());
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z13) {
        y2 w13 = w1(view);
        if (w13 != null) {
            if (w13.L()) {
                w13.f19726j &= -257;
            } else if (!w13.d0()) {
                StringBuilder sb3 = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb3.append(w13);
                throw new IllegalArgumentException(cb.f(this, sb3));
            }
        }
        view.clearAnimation();
        X(view);
        super.removeDetachedView(view, z13);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        v2 v2Var = this.f19242n.f19497e;
        if ((v2Var == null || !v2Var.d()) && !V1() && view2 != null) {
            x2(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z13) {
        return this.f19242n.I0(this, view, rect, z13, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z13) {
        ArrayList arrayList = this.f19248q;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((n2) arrayList.get(i13)).e(z13);
        }
        super.requestDisallowInterceptTouchEvent(z13);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f19258v != 0 || this.f19262x) {
            this.f19260w = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(String str) {
        if (V1()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(cb.f(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.G > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(cb.f(this, new StringBuilder(""))));
        }
    }

    public final int s2(int i13, float f13) {
        float width = f13 / getWidth();
        float height = i13 / getHeight();
        EdgeEffect edgeEffect = this.f19215J;
        float f14 = 0.0f;
        if (edgeEffect == null || ph.a.I(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.L;
            if (edgeEffect2 != null && ph.a.I(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.L.onRelease();
                } else {
                    float D02 = ph.a.D0(this.L, height, 1.0f - width);
                    if (ph.a.I(this.L) == 0.0f) {
                        this.L.onRelease();
                    }
                    f14 = D02;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.f19215J.onRelease();
            } else {
                float f15 = -ph.a.D0(this.f19215J, -height, width);
                if (ph.a.I(this.f19215J) == 0.0f) {
                    this.f19215J.onRelease();
                }
                f14 = f15;
            }
            invalidate();
        }
        return Math.round(f14 * getHeight());
    }

    @Override // android.view.View
    public final void scrollBy(int i13, int i14) {
        l2 l2Var = this.f19242n;
        if (l2Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f19262x) {
            return;
        }
        boolean k13 = l2Var.k();
        boolean l13 = this.f19242n.l();
        if (k13 || l13) {
            if (!k13) {
                i13 = 0;
            }
            if (!l13) {
                i14 = 0;
            }
            D2(i13, i14, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i13, int i14) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!V1()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f19266z |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void setClipToPadding(boolean z13) {
        if (z13 != this.f19230h) {
            this.L = null;
            this.f19215J = null;
            this.K = null;
            this.I = null;
        }
        this.f19230h = z13;
        super.setClipToPadding(z13);
        if (this.f19256u) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z13) {
        M1().o(z13);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i13) {
        return M1().q(i13, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        M1().s(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z13) {
        if (z13 != this.f19262x) {
            s("Do not suppressLayout in layout or scroll");
            if (z13) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f19262x = true;
                this.f19264y = true;
                h3();
                return;
            }
            this.f19262x = false;
            if (this.f19260w && this.f19242n != null && this.f19240m != null) {
                requestLayout();
            }
            this.f19260w = false;
        }
    }

    public final boolean t(y2 y2Var) {
        g2 g2Var = this.M;
        return g2Var == null || g2Var.g(y2Var, y2Var.n());
    }

    public final void t0() {
        if (this.f19215J != null) {
            return;
        }
        this.H.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f19215J = edgeEffect;
        if (this.f19230h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final y2 t1(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return w1(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final void t2(h2 h2Var) {
        l2 l2Var = this.f19242n;
        if (l2Var != null) {
            l2Var.h("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f19246p;
        arrayList.remove(h2Var);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        a2();
        requestLayout();
    }

    public final void w2(o2 o2Var) {
        ArrayList arrayList = this.f19233i0;
        if (arrayList != null) {
            arrayList.remove(o2Var);
        }
    }

    public final void x2(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f19234j;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.f19270c) {
                int i13 = rect.left;
                Rect rect2 = layoutParams2.f19269b;
                rect.left = i13 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f19242n.I0(this, view, this.f19234j, !this.f19256u, view2 == null);
    }

    public final void z() {
        int g13 = this.f19226f.f19441a.g();
        for (int i13 = 0; i13 < g13; i13++) {
            y2 w13 = w1(this.f19226f.f19441a.f(i13));
            if (!w13.d0()) {
                w13.f19720d = -1;
                w13.f19723g = -1;
            }
        }
        q2 q2Var = this.f19220c;
        ArrayList arrayList = q2Var.f19604c;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            y2 y2Var = (y2) arrayList.get(i14);
            y2Var.f19720d = -1;
            y2Var.f19723g = -1;
        }
        ArrayList arrayList2 = q2Var.f19602a;
        int size2 = arrayList2.size();
        for (int i15 = 0; i15 < size2; i15++) {
            y2 y2Var2 = (y2) arrayList2.get(i15);
            y2Var2.f19720d = -1;
            y2Var2.f19723g = -1;
        }
        ArrayList arrayList3 = q2Var.f19603b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i16 = 0; i16 < size3; i16++) {
                y2 y2Var3 = (y2) q2Var.f19603b.get(i16);
                y2Var3.f19720d = -1;
                y2Var3.f19723g = -1;
            }
        }
    }

    public final String z0() {
        return " " + super.toString() + ", adapter:" + this.f19240m + ", layout:" + this.f19242n + ", context:" + getContext();
    }

    public RecyclerView(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Constructor constructor;
        Object[] objArr;
        this.f19218b = new r2(this);
        this.f19220c = new q2(this);
        this.f19228g = new n3();
        this.f19232i = new w1(this, 0);
        this.f19234j = new Rect();
        this.f19236k = new Rect();
        this.f19238l = new RectF();
        this.f19244o = new ArrayList();
        this.f19246p = new ArrayList();
        this.f19248q = new ArrayList();
        this.f19258v = 0;
        this.D = false;
        this.E = false;
        this.F = 0;
        this.G = 0;
        this.H = H0;
        this.M = new s();
        this.N = 0;
        this.O = -1;
        this.f19219b0 = Float.MIN_VALUE;
        this.f19221c0 = Float.MIN_VALUE;
        int i14 = 1;
        this.f19223d0 = true;
        this.f19225e0 = new x2(this);
        this.f19229g0 = E0 ? new g1.i(1) : null;
        w2 w2Var = new w2();
        w2Var.f19677a = -1;
        w2Var.f19678b = 0;
        w2Var.f19679c = 0;
        w2Var.f19680d = 1;
        w2Var.f19681e = 0;
        w2Var.f19682f = false;
        w2Var.f19683g = false;
        w2Var.f19684h = false;
        w2Var.f19685i = false;
        w2Var.f19686j = false;
        w2Var.f19687k = false;
        this.f19231h0 = w2Var;
        this.f19235j0 = false;
        this.f19237k0 = false;
        y1 y1Var = new y1(this);
        this.f19239l0 = y1Var;
        this.f19241m0 = false;
        this.f19247p0 = new int[2];
        this.f19251r0 = new int[2];
        this.f19253s0 = new int[2];
        this.f19255t0 = new int[2];
        this.f19257u0 = new ArrayList();
        this.f19259v0 = new w1(this, i14);
        this.f19263x0 = 0;
        this.f19265y0 = 0;
        this.f19267z0 = new y1(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.U = viewConfiguration.getScaledTouchSlop();
        this.f19219b0 = viewConfiguration.getScaledHorizontalScrollFactor();
        this.f19221c0 = viewConfiguration.getScaledVerticalScrollFactor();
        this.W = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f19217a0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f19216a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.M.f19419a = y1Var;
        this.f19224e = new b(new y1(this));
        this.f19226f = new i(new y1(this));
        WeakHashMap weakHashMap = q5.v0.f102521a;
        if (q5.p0.a(this) == 0) {
            q5.p0.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.B = (AccessibilityManager) getContext().getSystemService("accessibility");
        a3 a3Var = new a3(this);
        this.f19243n0 = a3Var;
        q5.v0.o(this, a3Var);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ia.d.RecyclerView, i13, 0);
        q5.v0.n(this, context, ia.d.RecyclerView, attributeSet, obtainStyledAttributes, i13, 0);
        String string = obtainStyledAttributes.getString(ia.d.RecyclerView_layoutManager);
        if (obtainStyledAttributes.getInt(ia.d.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f19230h = obtainStyledAttributes.getBoolean(ia.d.RecyclerView_android_clipToPadding, true);
        if (obtainStyledAttributes.getBoolean(ia.d.RecyclerView_fastScrollEnabled, false)) {
            U1((StateListDrawable) obtainStyledAttributes.getDrawable(ia.d.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes.getDrawable(ia.d.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes.getDrawable(ia.d.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes.getDrawable(ia.d.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        obtainStyledAttributes.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                String H1 = H1(context, trim);
                try {
                    Class<? extends U> asSubclass = Class.forName(H1, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(l2.class);
                    try {
                        constructor = asSubclass.getConstructor(F0);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i13), 0};
                    } catch (NoSuchMethodException e13) {
                        try {
                            constructor = asSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        } catch (NoSuchMethodException e14) {
                            e14.initCause(e13);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + H1, e14);
                        }
                    }
                    constructor.setAccessible(true);
                    R2((l2) constructor.newInstance(objArr));
                } catch (ClassCastException e15) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + H1, e15);
                } catch (ClassNotFoundException e16) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + H1, e16);
                } catch (IllegalAccessException e17) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + H1, e17);
                } catch (InstantiationException e18) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + H1, e18);
                } catch (InvocationTargetException e19) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + H1, e19);
                }
            }
        }
        int[] iArr = A0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i13, 0);
        q5.v0.n(this, context, iArr, attributeSet, obtainStyledAttributes2, i13, 0);
        boolean z13 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z13);
        int i15 = x5.a.f133834a;
        Intrinsics.checkNotNullParameter(this, "<this>");
        setTag(x5.a.f133835b, Boolean.TRUE);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public y2 f19268a;

        /* renamed from: b */
        public final Rect f19269b;

        /* renamed from: c */
        public boolean f19270c;

        /* renamed from: d */
        public boolean f19271d;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f19269b = new Rect();
            this.f19270c = true;
            this.f19271d = false;
        }

        public final boolean a() {
            return this.f19268a.t();
        }

        public LayoutParams(int i13, int i14) {
            super(i13, i14);
            this.f19269b = new Rect();
            this.f19270c = true;
            this.f19271d = false;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f19269b = new Rect();
            this.f19270c = true;
            this.f19271d = false;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f19269b = new Rect();
            this.f19270c = true;
            this.f19271d = false;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.f19269b = new Rect();
            this.f19270c = true;
            this.f19271d = false;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        l2 l2Var = this.f19242n;
        if (l2Var != null) {
            return l2Var.C(layoutParams);
        }
        throw new IllegalStateException(cb.f(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }
}
