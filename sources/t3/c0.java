package t3;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c0 extends ViewGroup implements s3.a2, n3.d0, androidx.lifecycle.f {

    /* renamed from: y0, reason: collision with root package name */
    public static Class f115866y0;

    /* renamed from: z0, reason: collision with root package name */
    public static Method f115867z0;
    public final s3.c2 A;
    public boolean B;
    public w1 C;
    public m2 D;
    public n4.a E;
    public boolean F;
    public final s3.d1 G;
    public final u1 H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public final int[] f115868J;
    public final float[] K;
    public final float[] L;
    public final float[] M;
    public long N;
    public boolean O;
    public long P;
    public boolean Q;
    public final ParcelableSnapshotMutableState R;
    public final i2.o0 S;
    public Function1 T;
    public final k U;
    public final l V;
    public final m W;

    /* renamed from: a, reason: collision with root package name */
    public long f115869a;

    /* renamed from: a0, reason: collision with root package name */
    public final h4.k0 f115870a0;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f115871b;

    /* renamed from: b0, reason: collision with root package name */
    public final h4.g0 f115872b0;

    /* renamed from: c, reason: collision with root package name */
    public final s3.m0 f115873c;

    /* renamed from: c0, reason: collision with root package name */
    public final AtomicReference f115874c0;

    /* renamed from: d, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f115875d;

    /* renamed from: d0, reason: collision with root package name */
    public final h2 f115876d0;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.compose.ui.focus.b f115877e;

    /* renamed from: e0, reason: collision with root package name */
    public final q2 f115878e0;

    /* renamed from: f, reason: collision with root package name */
    public CoroutineContext f115879f;

    /* renamed from: f0, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f115880f0;

    /* renamed from: g, reason: collision with root package name */
    public final l2 f115881g;

    /* renamed from: g0, reason: collision with root package name */
    public int f115882g0;

    /* renamed from: h, reason: collision with root package name */
    public final m4 f115883h;

    /* renamed from: h0, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f115884h0;

    /* renamed from: i, reason: collision with root package name */
    public final h1.b f115885i;

    /* renamed from: i0, reason: collision with root package name */
    public final j3.b f115886i0;

    /* renamed from: j, reason: collision with root package name */
    public final s3.k0 f115887j;

    /* renamed from: j0, reason: collision with root package name */
    public final k3.c f115888j0;

    /* renamed from: k, reason: collision with root package name */
    public final z3.r f115889k;

    /* renamed from: k0, reason: collision with root package name */
    public final r3.e f115890k0;

    /* renamed from: l, reason: collision with root package name */
    public final v0 f115891l;

    /* renamed from: l0, reason: collision with root package name */
    public final l1 f115892l0;

    /* renamed from: m, reason: collision with root package name */
    public final w2.f f115893m;

    /* renamed from: m0, reason: collision with root package name */
    public MotionEvent f115894m0;

    /* renamed from: n, reason: collision with root package name */
    public final i f115895n;

    /* renamed from: n0, reason: collision with root package name */
    public long f115896n0;

    /* renamed from: o, reason: collision with root package name */
    public final b3.g f115897o;

    /* renamed from: o0, reason: collision with root package name */
    public final k4 f115898o0;

    /* renamed from: p, reason: collision with root package name */
    public final v2.e f115899p;

    /* renamed from: p0, reason: collision with root package name */
    public final k2.e f115900p0;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f115901q;

    /* renamed from: q0, reason: collision with root package name */
    public final androidx.appcompat.app.v f115902q0;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f115903r;

    /* renamed from: r0, reason: collision with root package name */
    public final androidx.activity.d f115904r0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f115905s;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f115906s0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f115907t;

    /* renamed from: t0, reason: collision with root package name */
    public final z f115908t0;

    /* renamed from: u, reason: collision with root package name */
    public final n3.f f115909u;

    /* renamed from: u0, reason: collision with root package name */
    public final x1 f115910u0;

    /* renamed from: v, reason: collision with root package name */
    public final n3.u f115911v;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f115912v0;

    /* renamed from: w, reason: collision with root package name */
    public Function1 f115913w;

    /* renamed from: w0, reason: collision with root package name */
    public final y3.m f115914w0;

    /* renamed from: x, reason: collision with root package name */
    public final v2.a f115915x;

    /* renamed from: x0, reason: collision with root package name */
    public final y f115916x0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f115917y;

    /* renamed from: z, reason: collision with root package name */
    public final j f115918z;

    /* JADX WARN: Type inference failed for: r14v4, types: [t3.k] */
    /* JADX WARN: Type inference failed for: r14v5, types: [t3.l] */
    /* JADX WARN: Type inference failed for: r14v6, types: [t3.m] */
    public c0(Context context, CoroutineContext coroutineContext) {
        super(context);
        this.f115869a = y2.h.f136670b;
        int i13 = 1;
        this.f115871b = true;
        this.f115873c = new s3.m0();
        n4.d a13 = bf.b.a(context);
        i2.p2 p2Var = i2.p2.f71234a;
        ParcelableSnapshotMutableState u13 = bs1.c.u1(a13, p2Var);
        this.f115875d = u13;
        z3.d dVar = new z3.d();
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(dVar);
        androidx.compose.ui.focus.b bVar = new androidx.compose.ui.focus.b(new t(this, 0), new u(2, this, c0.class, "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", 0), new t(this, 1), new r(this, 1), new r(this, 2), new v(this, c0.class, "layoutDirection", "getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;", 0));
        this.f115877e = bVar;
        l2 l2Var = new l2();
        this.f115879f = coroutineContext;
        this.f115881g = l2Var;
        this.f115883h = new m4();
        u2.q a14 = androidx.compose.ui.input.key.a.a(u2.n.f120041b, new o(this, i13));
        u2.q a15 = androidx.compose.ui.input.rotary.a.a();
        this.f115885i = new h1.b(2);
        int i14 = 3;
        int i15 = 0;
        s3.k0 k0Var = new s3.k0(false, 3, 0);
        k0Var.e0(q3.i1.f102221b);
        k0Var.b0((n4.b) u13.getValue());
        k0Var.f0(emptySemanticsElement.j(a15).j(a14).j(bVar.f17412i).j(l2Var.f116075c));
        this.f115887j = k0Var;
        this.f115889k = new z3.r(k0Var, dVar);
        v0 v0Var = new v0(this);
        this.f115891l = v0Var;
        w2.f fVar = new w2.f(this, new r(this, 0));
        this.f115893m = fVar;
        this.f115895n = new i(context);
        this.f115897o = new b3.g(this);
        v2.e eVar = new v2.e();
        this.f115899p = eVar;
        this.f115901q = new ArrayList();
        this.f115909u = new n3.f();
        this.f115911v = new n3.u(k0Var);
        this.f115913w = p.f116116j;
        this.f115915x = new v2.a(this, eVar);
        this.f115918z = new j(context);
        this.A = new s3.c2(new o(this, 2));
        this.G = new s3.d1(k0Var);
        this.H = new u1(ViewConfiguration.get(context));
        this.I = d7.b.a(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.f115868J = new int[]{0, 0};
        float[] a16 = b3.i0.a();
        this.K = a16;
        this.L = b3.i0.a();
        this.M = b3.i0.a();
        this.N = -1L;
        this.P = 9187343241974906880L;
        this.Q = true;
        i2.y3 y3Var = i2.y3.f71400a;
        this.R = bs1.c.u1(null, y3Var);
        this.S = bs1.c.S(new z(this, i13));
        this.U = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: t3.k
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                c0.this.L();
            }
        };
        this.V = new ViewTreeObserver.OnScrollChangedListener() { // from class: t3.l
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                c0.this.L();
            }
        };
        this.W = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: t3.m
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z13) {
                k3.c cVar = c0.this.f115888j0;
                int i16 = z13 ? 1 : 2;
                cVar.getClass();
                cVar.f78224b.setValue(new k3.a(i16));
            }
        };
        h4.k0 k0Var2 = new h4.k0(this, this);
        this.f115870a0 = k0Var2;
        h4.g0 g0Var = new h4.g0(k0Var2);
        this.f115872b0 = g0Var;
        this.f115874c0 = new AtomicReference(null);
        this.f115876d0 = new h2(g0Var);
        this.f115878e0 = new q2();
        this.f115880f0 = bs1.c.u1(lb.l0.Q(context), p2Var);
        Configuration configuration = context.getResources().getConfiguration();
        int i16 = Build.VERSION.SDK_INT;
        this.f115882g0 = i16 >= 31 ? configuration.fontWeightAdjustment : 0;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        n4.k kVar = layoutDirection != 0 ? layoutDirection != 1 ? null : n4.k.Rtl : n4.k.Ltr;
        this.f115884h0 = bs1.c.u1(kVar == null ? n4.k.Ltr : kVar, y3Var);
        this.f115886i0 = new j3.b(this);
        this.f115888j0 = new k3.c(isInTouchMode() ? 1 : 2, new o(this, i15));
        this.f115890k0 = new r3.e(this);
        this.f115892l0 = new l1(this);
        this.f115898o0 = new k4();
        this.f115900p0 = new k2.e(new Function0[16]);
        this.f115902q0 = new androidx.appcompat.app.v(this, i13);
        this.f115904r0 = new androidx.activity.d(this, i14);
        this.f115908t0 = new z(this, i15);
        this.f115910u0 = i16 < 29 ? new y1(a16) : new z1();
        addOnAttachStateChangeListener(fVar);
        setWillNotDraw(false);
        setFocusable(true);
        c1.f115919a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        q5.v0.o(this, v0Var);
        setOnDragListener(l2Var);
        k0Var.e(this);
        if (i16 >= 29) {
            x0.f116260a.a(this);
        }
        this.f115914w0 = i16 >= 31 ? new y3.m() : null;
        this.f115916x0 = new y(this);
    }

    public static final void b(c0 c0Var, int i13, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int g13;
        v0 v0Var = c0Var.f115891l;
        if (Intrinsics.d(str, v0Var.E)) {
            int g14 = v0Var.C.g(i13);
            if (g14 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, g14);
                return;
            }
            return;
        }
        if (!Intrinsics.d(str, v0Var.F) || (g13 = v0Var.D.g(i13)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, g13);
    }

    public static final boolean e(c0 c0Var, z2.c cVar, a3.d dVar) {
        Integer u13;
        if (c0Var.isFocused() || c0Var.hasFocus()) {
            return true;
        }
        return super.requestFocus((cVar == null || (u13 = nl.b.u(cVar.d())) == null) ? RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN : u13.intValue(), dVar != null ? kh2.n3.L0(dVar) : null);
    }

    public static void f(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = viewGroup.getChildAt(i13);
            if (childAt instanceof c0) {
                ((c0) childAt).x();
            } else if (childAt instanceof ViewGroup) {
                f((ViewGroup) childAt);
            }
        }
    }

    public static long g(int i13) {
        long j13;
        long j14;
        int mode = View.MeasureSpec.getMode(i13);
        int size = View.MeasureSpec.getSize(i13);
        if (mode == Integer.MIN_VALUE) {
            xk2.d0 d0Var = xk2.e0.f135207b;
            j13 = 0 << 32;
        } else {
            if (mode != 0) {
                if (mode != 1073741824) {
                    throw new IllegalStateException();
                }
                j14 = size;
                xk2.d0 d0Var2 = xk2.e0.f135207b;
                j13 = j14 << 32;
                return j13 | j14;
            }
            xk2.d0 d0Var3 = xk2.e0.f135207b;
            j13 = 0 << 32;
            size = Integer.MAX_VALUE;
        }
        j14 = size;
        return j13 | j14;
    }

    public static View i(View view, int i13) {
        if (Build.VERSION.SDK_INT >= 29) {
            return null;
        }
        Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", new Class[0]);
        declaredMethod.setAccessible(true);
        if (Intrinsics.d(declaredMethod.invoke(view, new Object[0]), Integer.valueOf(i13))) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View i15 = i(viewGroup.getChildAt(i14), i13);
            if (i15 != null) {
                return i15;
            }
        }
        return null;
    }

    public static void o(s3.k0 k0Var) {
        k0Var.C();
        k2.e y13 = k0Var.y();
        int i13 = y13.f78184c;
        if (i13 > 0) {
            Object[] objArr = y13.f78182a;
            int i14 = 0;
            do {
                o((s3.k0) objArr[i14]);
                i14++;
            } while (i14 < i13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082 A[LOOP:0: B:20:0x004c->B:35:0x0082, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085 A[EDGE_INSN: B:36:0x0085->B:39:0x0085 BREAK  A[LOOP:0: B:20:0x004c->B:35:0x0082], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean q(android.view.MotionEvent r6) {
        /*
            float r0 = r6.getX()
            boolean r1 = java.lang.Float.isInfinite(r0)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            float r0 = r6.getY()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            float r0 = r6.getRawX()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            float r0 = r6.getRawY()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            r0 = r2
            goto L45
        L44:
            r0 = r3
        L45:
            if (r0 != 0) goto L85
            int r1 = r6.getPointerCount()
            r4 = r3
        L4c:
            if (r4 >= r1) goto L85
            float r0 = r6.getX(r4)
            boolean r5 = java.lang.Float.isInfinite(r0)
            if (r5 != 0) goto L7f
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L7f
            float r0 = r6.getY(r4)
            boolean r5 = java.lang.Float.isInfinite(r0)
            if (r5 != 0) goto L7f
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L7f
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r0 < r5) goto L7d
            t3.z2 r0 = t3.z2.f116289a
            boolean r0 = r0.a(r6, r4)
            if (r0 != 0) goto L7d
            goto L7f
        L7d:
            r0 = r2
            goto L80
        L7f:
            r0 = r3
        L80:
            if (r0 != 0) goto L85
            int r4 = r4 + 1
            goto L4c
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.c0.q(android.view.MotionEvent):boolean");
    }

    public final void A(s3.k0 k0Var, boolean z13, boolean z14, boolean z15) {
        s3.d1 d1Var = this.G;
        if (z13) {
            if (d1Var.s(k0Var, z14) && z15) {
                F(k0Var);
                return;
            }
            return;
        }
        if (d1Var.t(k0Var, z14) && z15) {
            F(k0Var);
        }
    }

    public final void B(s3.k0 k0Var, boolean z13, boolean z14) {
        s3.d1 d1Var = this.G;
        if (z13) {
            if (d1Var.r(k0Var, z14)) {
                F(null);
                return;
            }
            return;
        }
        d1Var.getClass();
        int i13 = s3.c1.f110745a[k0Var.f110838z.f110969c.ordinal()];
        if (i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4) {
            return;
        }
        if (i13 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        s3.v0 v0Var = k0Var.f110838z;
        if (!z14 && k0Var.H() == v0Var.f110984r.f110949t && (v0Var.f110970d || v0Var.f110971e)) {
            return;
        }
        v0Var.f110971e = true;
        v0Var.f110972f = true;
        if (!k0Var.I && v0Var.f110984r.f110949t) {
            s3.k0 v13 = k0Var.v();
            if ((v13 == null || !v13.f110838z.f110971e) && (v13 == null || !v13.f110838z.f110970d)) {
                d1Var.f110758b.a(k0Var, false);
            }
            if (d1Var.f110760d) {
                return;
            }
            F(null);
        }
    }

    public final void C() {
        v0 v0Var = this.f115891l;
        v0Var.f116232y = true;
        if (v0Var.D() && !v0Var.f116210J) {
            v0Var.f116210J = true;
            v0Var.f116219l.post(v0Var.K);
        }
        w2.f fVar = this.f115893m;
        fVar.f127619h = true;
        if (!fVar.f() || fVar.f127627p) {
            return;
        }
        fVar.f127627p = true;
        fVar.f127622k.post(fVar.f127628q);
    }

    public final void D() {
        if (this.O) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.N) {
            this.N = currentAnimationTimeMillis;
            x1 x1Var = this.f115910u0;
            float[] fArr = this.L;
            x1Var.a(this, fArr);
            d7.b.d0(fArr, this.M);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.f115868J;
            view.getLocationOnScreen(iArr);
            float f13 = iArr[0];
            float f14 = iArr[1];
            view.getLocationInWindow(iArr);
            this.P = com.bumptech.glide.c.d(f13 - iArr[0], f14 - iArr[1]);
        }
    }

    public final void E(s3.y1 y1Var) {
        k4 k4Var;
        Reference poll;
        k2.e eVar;
        if (this.D != null) {
            f4 f4Var = g4.f116013o;
        }
        do {
            k4Var = this.f115898o0;
            poll = k4Var.f116061b.poll();
            eVar = k4Var.f116060a;
            if (poll != null) {
                eVar.n(poll);
            }
        } while (poll != null);
        eVar.b(new WeakReference(y1Var, k4Var.f116061b));
    }

    public final void F(s3.k0 k0Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (k0Var != null) {
            while (k0Var != null && k0Var.f110838z.f110984r.f110940k == s3.i0.InMeasureBlock) {
                if (!this.F) {
                    s3.k0 v13 = k0Var.v();
                    if (v13 == null) {
                        break;
                    }
                    long j13 = v13.f110837y.f110805b.f102181d;
                    if (n4.a.f(j13) && n4.a.e(j13)) {
                        break;
                    }
                }
                k0Var = k0Var.v();
            }
            if (k0Var == this.f115887j) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long G(long j13) {
        D();
        float d2 = a3.c.d(j13) - a3.c.d(this.P);
        float e13 = a3.c.e(j13) - a3.c.e(this.P);
        return b3.i0.b(com.bumptech.glide.c.d(d2, e13), this.M);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int H(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.f115912v0
            r1 = 0
            if (r0 == 0) goto L1a
            r7.f115912v0 = r1
            int r0 = r8.getMetaState()
            t3.m4 r2 = r7.f115883h
            r2.getClass()
            n3.c0 r2 = new n3.c0
            r2.<init>(r0)
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = t3.m4.f116093b
            r0.setValue(r2)
        L1a:
            n3.f r0 = r7.f115909u
            n3.s r2 = r0.a(r8, r7)
            n3.u r3 = r7.f115911v
            if (r2 == 0) goto L7a
            java.util.List r1 = r2.a()
            int r4 = r1.size()
            int r4 = r4 + (-1)
            if (r4 < 0) goto L45
        L30:
            int r5 = r4 + (-1)
            java.lang.Object r4 = r1.get(r4)
            r6 = r4
            n3.t r6 = (n3.t) r6
            boolean r6 = r6.a()
            if (r6 == 0) goto L40
            goto L46
        L40:
            if (r5 >= 0) goto L43
            goto L45
        L43:
            r4 = r5
            goto L30
        L45:
            r4 = 0
        L46:
            n3.t r4 = (n3.t) r4
            if (r4 == 0) goto L50
            long r4 = r4.b()
            r7.f115869a = r4
        L50:
            boolean r1 = r7.r(r8)
            int r1 = r3.a(r2, r7, r1)
            int r2 = r8.getActionMasked()
            if (r2 == 0) goto L61
            r3 = 5
            if (r2 != r3) goto L81
        L61:
            boolean r2 = ph.a.H(r1)
            if (r2 != 0) goto L81
            int r2 = r8.getActionIndex()
            int r8 = r8.getPointerId(r2)
            android.util.SparseBooleanArray r2 = r0.f89050c
            r2.delete(r8)
            android.util.SparseLongArray r0 = r0.f89049b
            r0.delete(r8)
            goto L81
        L7a:
            r3.b()
            int r1 = f0.h.e(r1, r1)
        L81:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.c0.H(android.view.MotionEvent):int");
    }

    public final void I(MotionEvent motionEvent, int i13, long j13, boolean z13) {
        int actionMasked = motionEvent.getActionMasked();
        int i14 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i14 = motionEvent.getActionIndex();
            }
        } else if (i13 != 9 && i13 != 10) {
            i14 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i14 >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i15 = 0; i15 < pointerCount; i15++) {
            pointerPropertiesArr[i15] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i16 = 0; i16 < pointerCount; i16++) {
            pointerCoordsArr[i16] = new MotionEvent.PointerCoords();
        }
        int i17 = 0;
        while (i17 < pointerCount) {
            int i18 = ((i14 < 0 || i17 < i14) ? 0 : 1) + i17;
            motionEvent.getPointerProperties(i18, pointerPropertiesArr[i17]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i17];
            motionEvent.getPointerCoords(i18, pointerCoords);
            long t13 = t(com.bumptech.glide.c.d(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = a3.c.d(t13);
            pointerCoords.y = a3.c.e(t13);
            i17++;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j13 : motionEvent.getDownTime(), j13, i13, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z13 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        n3.s a13 = this.f115909u.a(obtain, this);
        Intrinsics.f(a13);
        this.f115911v.a(a13, this, true);
        obtain.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [s3.m, u2.p] */
    /* JADX WARN: Type inference failed for: r3v10, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void J(CoroutineContext coroutineContext) {
        this.f115879f = coroutineContext;
        ?? r112 = this.f115887j.f110837y.f110808e;
        if (r112 instanceof n3.h0) {
            ((n3.o0) ((n3.h0) r112)).O0();
        }
        u2.p pVar = r112.f120042a;
        if (!pVar.f120054m) {
            jk.r.y("visitSubtree called on an unattached node");
            throw null;
        }
        u2.p pVar2 = pVar.f120047f;
        s3.k0 U0 = com.bumptech.glide.c.U0(r112);
        s3.h1 h1Var = new s3.h1();
        while (U0 != null) {
            if (pVar2 == null) {
                pVar2 = U0.f110837y.f110808e;
            }
            if ((pVar2.f120045d & 16) != 0) {
                while (pVar2 != null) {
                    if ((pVar2.f120044c & 16) != 0) {
                        s3.n nVar = pVar2;
                        ?? r53 = 0;
                        while (nVar != 0) {
                            if (nVar instanceof s3.f2) {
                                s3.f2 f2Var = (s3.f2) nVar;
                                if (f2Var instanceof n3.h0) {
                                    ((n3.o0) ((n3.h0) f2Var)).O0();
                                }
                            } else if ((nVar.f120044c & 16) != 0 && (nVar instanceof s3.n)) {
                                u2.p pVar3 = nVar.f110843o;
                                int i13 = 0;
                                nVar = nVar;
                                r53 = r53;
                                while (pVar3 != null) {
                                    if ((pVar3.f120044c & 16) != 0) {
                                        i13++;
                                        r53 = r53;
                                        if (i13 == 1) {
                                            nVar = pVar3;
                                        } else {
                                            if (r53 == 0) {
                                                r53 = new k2.e(new u2.p[16]);
                                            }
                                            if (nVar != 0) {
                                                r53.b(nVar);
                                                nVar = 0;
                                            }
                                            r53.b(pVar3);
                                        }
                                    }
                                    pVar3 = pVar3.f120047f;
                                    nVar = nVar;
                                    r53 = r53;
                                }
                                if (i13 == 1) {
                                }
                            }
                            nVar = com.bumptech.glide.c.g(r53);
                        }
                    }
                    pVar2 = pVar2.f120047f;
                }
            }
            h1Var.c(U0.y());
            U0 = h1Var.a() ? (s3.k0) h1Var.b() : null;
            pVar2 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final cl2.a K(kotlin.jvm.functions.Function2 r6, bl2.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof t3.b0
            if (r0 == 0) goto L13
            r0 = r7
            t3.b0 r0 = (t3.b0) r0
            int r1 = r0.f115854t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f115854t = r1
            goto L18
        L13:
            t3.b0 r0 = new t3.b0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f115852r
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f115854t
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2b:
            ue.c.H(r7)
            goto L4a
        L2f:
            ue.c.H(r7)
            java.util.concurrent.atomic.AtomicReference r7 = r5.f115874c0
            q0.e r2 = new q0.e
            r4 = 28
            r2.<init>(r5, r4)
            r0.f115854t = r3
            u2.w r3 = new u2.w
            r4 = 0
            r3.<init>(r7, r4, r2, r6)
            java.lang.Object r6 = dl2.b.O(r3, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.c0.K(kotlin.jvm.functions.Function2, bl2.c):cl2.a");
    }

    public final void L() {
        int[] iArr = this.f115868J;
        getLocationOnScreen(iArr);
        long j13 = this.I;
        int i13 = (int) (j13 >> 32);
        int i14 = (int) (j13 & 4294967295L);
        boolean z13 = false;
        int i15 = iArr[0];
        if (i13 != i15 || i14 != iArr[1]) {
            this.I = d7.b.a(i15, iArr[1]);
            if (i13 != Integer.MAX_VALUE && i14 != Integer.MAX_VALUE) {
                this.f115887j.f110838z.f110984r.B0();
                z13 = true;
            }
        }
        this.G.a(z13);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        v2.a aVar = this.f115915x;
        if (aVar != null) {
            kh2.r.g1(aVar, sparseArray);
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i13) {
        return this.f115891l.o(i13, this.f115869a, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i13) {
        return this.f115891l.o(i13, this.f115869a, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z13;
        if (!isAttachedToWindow()) {
            o(this.f115887j);
        }
        u(true);
        synchronized (s2.p.f110667b) {
            g1.g0 g0Var = ((s2.b) s2.p.f110674i.get()).f110610h;
            if (g0Var != null) {
                z13 = g0Var.c();
            }
        }
        if (z13) {
            s2.p.a();
        }
        this.f115905s = true;
        h1.b bVar = this.f115885i;
        b3.d dVar = (b3.d) bVar.f66449b;
        Canvas canvas2 = dVar.f21309a;
        dVar.f21309a = canvas;
        this.f115887j.j(dVar, null);
        ((b3.d) bVar.f66449b).f21309a = canvas2;
        if (true ^ this.f115901q.isEmpty()) {
            int size = this.f115901q.size();
            for (int i13 = 0; i13 < size; i13++) {
                ((s3.y1) this.f115901q.get(i13)).j();
            }
        }
        if (g4.f116017s) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        this.f115901q.clear();
        this.f115905s = false;
        ArrayList arrayList = this.f115903r;
        if (arrayList != null) {
            this.f115901q.addAll(arrayList);
            arrayList.clear();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:?, code lost:
    
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r0v19, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r14v10, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r14v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v9, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r6v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.c0.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00f8  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r25) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.c0.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean isFocused = isFocused();
        androidx.compose.ui.focus.b bVar = this.f115877e;
        if (!isFocused) {
            return bVar.c(keyEvent, new k1.v0(13, this, keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.f115883h.getClass();
        m4.f116093b.setValue(new n3.c0(metaState));
        return bVar.c(keyEvent, z2.i.f140625j) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        s3.j1 j1Var;
        if (isFocused()) {
            androidx.compose.ui.focus.b bVar = this.f115877e;
            if (!(!bVar.f17410g.a())) {
                throw new IllegalStateException("Dispatching intercepted soft keyboard event while focus system is invalidated.".toString());
            }
            z2.z g13 = androidx.compose.ui.focus.a.g(bVar.f17409f);
            if (g13 != null) {
                u2.p pVar = g13.f120042a;
                if (!pVar.f120054m) {
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
                s3.k0 U0 = com.bumptech.glide.c.U0(g13);
                while (U0 != null) {
                    if ((U0.f110837y.f110808e.f120045d & 131072) != 0) {
                        while (pVar != null) {
                            if ((pVar.f120044c & 131072) != 0) {
                                u2.p pVar2 = pVar;
                                k2.e eVar = null;
                                while (pVar2 != null) {
                                    if ((pVar2.f120044c & 131072) != 0 && (pVar2 instanceof s3.n)) {
                                        int i13 = 0;
                                        for (u2.p pVar3 = ((s3.n) pVar2).f110843o; pVar3 != null; pVar3 = pVar3.f120047f) {
                                            if ((pVar3.f120044c & 131072) != 0) {
                                                i13++;
                                                if (i13 == 1) {
                                                    pVar2 = pVar3;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new k2.e(new u2.p[16]);
                                                    }
                                                    if (pVar2 != null) {
                                                        eVar.b(pVar2);
                                                        pVar2 = null;
                                                    }
                                                    eVar.b(pVar3);
                                                }
                                            }
                                        }
                                        if (i13 == 1) {
                                        }
                                    }
                                    pVar2 = com.bumptech.glide.c.g(eVar);
                                }
                            }
                            pVar = pVar.f120046e;
                        }
                    }
                    U0 = U0.v();
                    pVar = (U0 == null || (j1Var = U0.f110837y) == null) ? null : j1Var.f110807d;
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            w0.f116249a.a(viewStructure, this);
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f115906s0) {
            androidx.activity.d dVar = this.f115904r0;
            removeCallbacks(dVar);
            MotionEvent motionEvent2 = this.f115894m0;
            Intrinsics.f(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.f115906s0 = false;
            } else {
                dVar.run();
            }
        }
        if (q(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !s(motionEvent)) {
            return false;
        }
        int m13 = m(motionEvent);
        if (ph.a.A(m13)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return ph.a.H(m13);
    }

    public final View findViewByAccessibilityIdTraversal(int i13) {
        View view = null;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(this, Integer.valueOf(i13));
                if (invoke instanceof View) {
                    view = (View) invoke;
                }
            } else {
                view = i(this, i13);
            }
        } catch (NoSuchMethodException unused) {
        }
        return view;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i13) {
        if (view != null) {
            a3.d d2 = nl.b.d(view);
            z2.c v13 = nl.b.v(i13);
            if (Intrinsics.d(this.f115877e.d(v13 != null ? v13.d() : 6, d2, w.f116244j), Boolean.TRUE)) {
                return this;
            }
        }
        return super.focusSearch(view, i13);
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        Unit unit;
        a3.d y13 = y();
        if (y13 != null) {
            rect.left = Math.round(y13.f484a);
            rect.top = Math.round(y13.f485b);
            rect.right = Math.round(y13.f486c);
            rect.bottom = Math.round(y13.f487d);
            unit = Unit.f80348a;
        } else {
            unit = null;
        }
        if (unit == null) {
            super.getFocusedRect(rect);
        }
    }

    public final s3.y1 h(p1.p1 p1Var, androidx.activity.a0 a0Var, e3.d dVar) {
        Reference poll;
        k2.e eVar;
        Object obj;
        if (dVar != null) {
            return new p2(dVar, null, this, p1Var, a0Var);
        }
        do {
            k4 k4Var = this.f115898o0;
            poll = k4Var.f116061b.poll();
            eVar = k4Var.f116060a;
            if (poll != null) {
                eVar.n(poll);
            }
        } while (poll != null);
        while (true) {
            if (!eVar.m()) {
                obj = null;
                break;
            }
            obj = ((Reference) eVar.o(eVar.f78184c - 1)).get();
            if (obj != null) {
                break;
            }
        }
        s3.y1 y1Var = (s3.y1) obj;
        if (y1Var != null) {
            y1Var.b(p1Var, a0Var);
            return y1Var;
        }
        if (isHardwareAccelerated() && Build.VERSION.SDK_INT != 28) {
            return new p2(this.f115897o.a(), this.f115897o, this, p1Var, a0Var);
        }
        if (isHardwareAccelerated() && this.Q) {
            try {
                return new l3(this, p1Var, a0Var);
            } catch (Throwable unused) {
                this.Q = false;
            }
        }
        if (this.D == null) {
            if (!g4.f116016r) {
                e3.b.m(new View(getContext()));
            }
            m2 m2Var = g4.f116017s ? new m2(getContext()) : new h4(getContext());
            this.D = m2Var;
            addView(m2Var, -1);
        }
        m2 m2Var2 = this.D;
        Intrinsics.f(m2Var2);
        return new g4(this, m2Var2, p1Var, a0Var);
    }

    public final void j(s3.k0 k0Var, boolean z13) {
        this.G.f(k0Var, z13);
    }

    public final w1 k() {
        if (this.C == null) {
            w1 w1Var = new w1(getContext());
            this.C = w1Var;
            addView(w1Var, -1);
            requestLayout();
        }
        w1 w1Var2 = this.C;
        Intrinsics.f(w1Var2);
        return w1Var2;
    }

    public final n l() {
        return (n) this.S.getValue();
    }

    public final int m(MotionEvent motionEvent) {
        int i13;
        int actionMasked;
        float[] fArr = this.L;
        removeCallbacks(this.f115902q0);
        try {
            this.N = AnimationUtils.currentAnimationTimeMillis();
            this.f115910u0.a(this, fArr);
            d7.b.d0(fArr, this.M);
            long b13 = b3.i0.b(com.bumptech.glide.c.d(motionEvent.getX(), motionEvent.getY()), fArr);
            this.P = com.bumptech.glide.c.d(motionEvent.getRawX() - a3.c.d(b13), motionEvent.getRawY() - a3.c.e(b13));
            boolean z13 = true;
            this.O = true;
            u(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.f115894m0;
                boolean z14 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
                n3.u uVar = this.f115911v;
                if (motionEvent2 != null && (motionEvent2.getSource() != motionEvent.getSource() || motionEvent2.getToolType(0) != motionEvent.getToolType(0))) {
                    if (motionEvent2.getButtonState() == 0 && (actionMasked = motionEvent2.getActionMasked()) != 0 && actionMasked != 2 && actionMasked != 6) {
                        if (motionEvent2.getActionMasked() != 10 && z14) {
                            I(motionEvent2, 10, motionEvent2.getEventTime(), true);
                        }
                    }
                    uVar.b();
                }
                boolean z15 = motionEvent.getToolType(0) == 3;
                if (z14 || !z15 || actionMasked2 == 3 || actionMasked2 == 9 || !r(motionEvent)) {
                    i13 = 9;
                } else {
                    i13 = 9;
                    I(motionEvent, 9, motionEvent.getEventTime(), true);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent3 = this.f115894m0;
                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                    MotionEvent motionEvent4 = this.f115894m0;
                    int pointerId = motionEvent4 != null ? motionEvent4.getPointerId(0) : -1;
                    int action = motionEvent.getAction();
                    n3.f fVar = this.f115909u;
                    if (action == i13 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            fVar.f89050c.delete(pointerId);
                            fVar.f89049b.delete(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent5 = this.f115894m0;
                        float x13 = motionEvent5 != null ? motionEvent5.getX() : Float.NaN;
                        MotionEvent motionEvent6 = this.f115894m0;
                        boolean z16 = (x13 == motionEvent.getX() && (motionEvent6 != null ? motionEvent6.getY() : Float.NaN) == motionEvent.getY()) ? false : true;
                        MotionEvent motionEvent7 = this.f115894m0;
                        if ((motionEvent7 != null ? motionEvent7.getEventTime() : -1L) == motionEvent.getEventTime()) {
                            z13 = false;
                        }
                        if (z16 || z13) {
                            if (pointerId >= 0) {
                                fVar.f89050c.delete(pointerId);
                                fVar.f89049b.delete(pointerId);
                            }
                            uVar.f89137b.f89042b.f89065a.h();
                        }
                    }
                }
                this.f115894m0 = MotionEvent.obtainNoHistory(motionEvent);
                return H(motionEvent);
            } finally {
                Trace.endSection();
            }
        } finally {
            this.O = false;
        }
    }

    public final void n() {
        o(this.f115887j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        androidx.lifecycle.z zVar;
        androidx.lifecycle.s lifecycle;
        androidx.lifecycle.z zVar2;
        androidx.lifecycle.z zVar3;
        super.onAttachedToWindow();
        this.f115883h.f116094a.setValue(Boolean.valueOf(hasWindowFocus()));
        s3.k0 k0Var = this.f115887j;
        p(k0Var);
        o(k0Var);
        this.A.f110746a.e();
        v2.a aVar = this.f115915x;
        if (aVar != null) {
            v2.d.f123850a.a(aVar);
        }
        androidx.lifecycle.z r13 = b7.c.r(this);
        ma.i l03 = lb.l0.l0(this);
        n l13 = l();
        if (l13 == null || (r13 != null && l03 != null && (r13 != (zVar3 = l13.f116095a) || l03 != zVar3))) {
            if (r13 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (l03 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (l13 != null && (zVar = l13.f116095a) != null && (lifecycle = zVar.getLifecycle()) != null) {
                lifecycle.b(this);
            }
            r13.getLifecycle().a(this);
            n nVar = new n(r13, l03);
            this.R.setValue(nVar);
            Function1 function1 = this.T;
            if (function1 != null) {
                function1.invoke(nVar);
            }
            this.T = null;
        }
        int i13 = isInTouchMode() ? 1 : 2;
        k3.c cVar = this.f115888j0;
        cVar.getClass();
        cVar.f78224b.setValue(new k3.a(i13));
        n l14 = l();
        androidx.lifecycle.s lifecycle2 = (l14 == null || (zVar2 = l14.f116095a) == null) ? null : zVar2.getLifecycle();
        if (lifecycle2 == null) {
            jk.r.z("No lifecycle owner exists");
            throw null;
        }
        lifecycle2.a(this);
        lifecycle2.a(this.f115893m);
        getViewTreeObserver().addOnGlobalLayoutListener(this.U);
        getViewTreeObserver().addOnScrollChangedListener(this.V);
        getViewTreeObserver().addOnTouchModeChangeListener(this.W);
        if (Build.VERSION.SDK_INT >= 31) {
            a1.f115831a.b(this);
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        u2.v vVar = (u2.v) this.f115874c0.get();
        k1 k1Var = (k1) (vVar != null ? vVar.f120057b : null);
        return k1Var == null ? this.f115870a0.f67575d : k1Var.b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f115875d.setValue(bf.b.a(getContext()));
        int i13 = Build.VERSION.SDK_INT;
        if ((i13 >= 31 ? configuration.fontWeightAdjustment : 0) != this.f115882g0) {
            this.f115882g0 = i13 >= 31 ? configuration.fontWeightAdjustment : 0;
            this.f115880f0.setValue(lb.l0.Q(getContext()));
        }
        this.f115913w.invoke(configuration);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (r13 != false) goto L14;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r15) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.c0.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        w2.f fVar = this.f115893m;
        fVar.getClass();
        w2.d.f127606a.b(fVar, jArr, iArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        androidx.lifecycle.z zVar;
        super.onDetachedFromWindow();
        s2.w wVar = this.A.f110746a;
        s2.h hVar = wVar.f110703g;
        if (hVar != null) {
            hVar.a();
        }
        wVar.b();
        n l13 = l();
        androidx.lifecycle.s lifecycle = (l13 == null || (zVar = l13.f116095a) == null) ? null : zVar.getLifecycle();
        if (lifecycle == null) {
            jk.r.z("No lifecycle owner exists");
            throw null;
        }
        lifecycle.b(this.f115893m);
        lifecycle.b(this);
        v2.a aVar = this.f115915x;
        if (aVar != null) {
            v2.d.f123850a.b(aVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.U);
        getViewTreeObserver().removeOnScrollChangedListener(this.V);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.W);
        if (Build.VERSION.SDK_INT >= 31) {
            a1.f115831a.a(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z13, int i13, Rect rect) {
        super.onFocusChanged(z13, i13, rect);
        if (z13 || hasFocus()) {
            return;
        }
        androidx.compose.ui.focus.b bVar = this.f115877e;
        z2.a0 a0Var = bVar.f17411h;
        boolean z14 = a0Var.f140603c;
        z2.z zVar = bVar.f17409f;
        if (z14) {
            androidx.compose.ui.focus.a.d(zVar, true, true);
            return;
        }
        try {
            a0Var.f140603c = true;
            androidx.compose.ui.focus.a.d(zVar, true, true);
        } finally {
            z2.a0.b(a0Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        this.G.l(this.f115908t0);
        this.E = null;
        L();
        if (this.C != null) {
            k().layout(0, 0, i15 - i13, i16 - i14);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        s3.d1 d1Var = this.G;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            boolean isAttachedToWindow = isAttachedToWindow();
            s3.k0 k0Var = this.f115887j;
            if (!isAttachedToWindow) {
                p(k0Var);
            }
            long g13 = g(i13);
            xk2.d0 d0Var = xk2.e0.f135207b;
            int i15 = (int) (g13 >>> 32);
            int i16 = (int) (g13 & 4294967295L);
            long g14 = g(i14);
            int i17 = (int) (g14 & 4294967295L);
            int min = Math.min((int) (g14 >>> 32), 262142);
            int i18 = Integer.MAX_VALUE;
            int min2 = i17 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i17, 262142);
            int g15 = bs1.c.g(min2 == Integer.MAX_VALUE ? min : min2);
            if (i16 != Integer.MAX_VALUE) {
                i18 = Math.min(g15, i16);
            }
            long a13 = bs1.c.a(Math.min(g15, i15), i18, min, min2);
            n4.a aVar = this.E;
            if (aVar == null) {
                this.E = new n4.a(a13);
                this.F = false;
            } else if (!n4.a.b(aVar.f89168a, a13)) {
                this.F = true;
            }
            d1Var.u(a13);
            d1Var.n();
            s3.v0 v0Var = k0Var.f110838z;
            s3.v0 v0Var2 = k0Var.f110838z;
            s3.t0 t0Var = v0Var.f110984r;
            setMeasuredDimension(t0Var.f102178a, t0Var.f102179b);
            if (this.C != null) {
                k().measure(View.MeasureSpec.makeMeasureSpec(v0Var2.f110984r.f102178a, 1073741824), View.MeasureSpec.makeMeasureSpec(v0Var2.f110984r.f102179b, 1073741824));
            }
            Unit unit = Unit.f80348a;
            Trace.endSection();
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i13) {
        v2.a aVar;
        if (viewStructure == null || (aVar = this.f115915x) == null) {
            return;
        }
        kh2.r.h1(aVar, viewStructure);
    }

    @Override // androidx.lifecycle.f
    public final void onResume(androidx.lifecycle.z zVar) {
        this.B = e3.e.a();
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i13) {
        if (this.f115871b) {
            n4.k kVar = i13 != 0 ? i13 != 1 ? null : n4.k.Rtl : n4.k.Ltr;
            if (kVar == null) {
                kVar = n4.k.Ltr;
            }
            this.f115884h0.setValue(kVar);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        y3.m mVar;
        if (Build.VERSION.SDK_INT < 31 || (mVar = this.f115914w0) == null) {
            return;
        }
        mVar.a(this, this.f115889k, this.f115879f, consumer);
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        w2.f fVar = this.f115893m;
        fVar.getClass();
        w2.d.f127606a.c(fVar, longSparseArray);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z13) {
        boolean a13;
        this.f115883h.f116094a.setValue(Boolean.valueOf(z13));
        this.f115912v0 = true;
        super.onWindowFocusChanged(z13);
        if (!z13 || this.B == (a13 = e3.e.a())) {
            return;
        }
        this.B = a13;
        n();
    }

    public final void p(s3.k0 k0Var) {
        int i13 = 0;
        this.G.t(k0Var, false);
        k2.e y13 = k0Var.y();
        int i14 = y13.f78184c;
        if (i14 > 0) {
            Object[] objArr = y13.f78182a;
            do {
                p((s3.k0) objArr[i13]);
                i13++;
            } while (i13 < i14);
        }
    }

    public final boolean r(MotionEvent motionEvent) {
        float x13 = motionEvent.getX();
        float y13 = motionEvent.getY();
        return 0.0f <= x13 && x13 <= ((float) getWidth()) && 0.0f <= y13 && y13 <= ((float) getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i13, Rect rect) {
        if (isFocused()) {
            return true;
        }
        androidx.compose.ui.focus.b bVar = this.f115877e;
        if (bVar.f17409f.N0().getHasFocus()) {
            return super.requestFocus(i13, rect);
        }
        z2.c v13 = nl.b.v(i13);
        int d2 = v13 != null ? v13.d() : 7;
        Boolean d13 = bVar.d(d2, rect != null ? kh2.n3.O0(rect) : null, new r1.j0(d2, 2));
        if (d13 != null) {
            return d13.booleanValue();
        }
        return false;
    }

    public final boolean s(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f115894m0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final long t(long j13) {
        D();
        long b13 = b3.i0.b(j13, this.L);
        return com.bumptech.glide.c.d(a3.c.d(this.P) + a3.c.d(b13), a3.c.e(this.P) + a3.c.e(b13));
    }

    public final void u(boolean z13) {
        z zVar;
        s3.d1 d1Var = this.G;
        if (d1Var.f110758b.c() || d1Var.f110761e.f110998a.m()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z13) {
                try {
                    zVar = this.f115908t0;
                } catch (Throwable th3) {
                    Trace.endSection();
                    throw th3;
                }
            } else {
                zVar = null;
            }
            if (d1Var.l(zVar)) {
                requestLayout();
            }
            d1Var.a(false);
            if (this.f115907t) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.f115907t = false;
            }
            Unit unit = Unit.f80348a;
            Trace.endSection();
        }
    }

    public final void v(s3.k0 k0Var, long j13) {
        s3.d1 d1Var = this.G;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            d1Var.m(k0Var, j13);
            if (!d1Var.f110758b.c()) {
                d1Var.a(false);
                if (this.f115907t) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.f115907t = false;
                }
            }
            Unit unit = Unit.f80348a;
        } finally {
            Trace.endSection();
        }
    }

    public final void w(s3.y1 y1Var, boolean z13) {
        ArrayList arrayList = this.f115901q;
        if (!z13) {
            if (this.f115905s) {
                return;
            }
            arrayList.remove(y1Var);
            ArrayList arrayList2 = this.f115903r;
            if (arrayList2 != null) {
                arrayList2.remove(y1Var);
                return;
            }
            return;
        }
        if (!this.f115905s) {
            arrayList.add(y1Var);
            return;
        }
        ArrayList arrayList3 = this.f115903r;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            this.f115903r = arrayList3;
        }
        arrayList3.add(y1Var);
    }

    public final void x() {
        if (this.f115917y) {
            this.A.a();
            this.f115917y = false;
        }
        w1 w1Var = this.C;
        if (w1Var != null) {
            f(w1Var);
        }
        while (true) {
            k2.e eVar = this.f115900p0;
            if (!eVar.m()) {
                return;
            }
            int i13 = eVar.f78184c;
            for (int i14 = 0; i14 < i13; i14++) {
                Object[] objArr = eVar.f78182a;
                Function0 function0 = (Function0) objArr[i14];
                objArr[i14] = null;
                if (function0 != null) {
                    function0.invoke();
                }
            }
            eVar.p(0, i13);
        }
    }

    public final a3.d y() {
        if (isFocused()) {
            z2.z g13 = androidx.compose.ui.focus.a.g(this.f115877e.f17409f);
            if (g13 != null) {
                return androidx.compose.ui.focus.a.j(g13);
            }
            return null;
        }
        View findFocus = findFocus();
        if (findFocus != null) {
            return nl.b.d(findFocus);
        }
        return null;
    }

    public final void z(s3.k0 k0Var) {
        v0 v0Var = this.f115891l;
        v0Var.f116232y = true;
        if (v0Var.D()) {
            v0Var.F(k0Var);
        }
        w2.f fVar = this.f115893m;
        fVar.f127619h = true;
        if (fVar.f()) {
            fVar.h(k0Var);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i13, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i13, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i13) {
        Intrinsics.f(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i13, layoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i13, int i14) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i13;
        generateDefaultLayoutParams.height = i14;
        Unit unit = Unit.f80348a;
        addViewInLayout(view, -1, generateDefaultLayoutParams, true);
    }
}
