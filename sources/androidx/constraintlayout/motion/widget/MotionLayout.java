package androidx.constraintlayout.motion.widget;

import a.a;
import a.cb;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.MotionEffect;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.s;
import androidx.constraintlayout.widget.w;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kh2.n3;
import m4.i;
import q5.t;
import t4.e;
import t4.f;
import u4.h;
import w4.b;
import x4.a0;
import x4.b0;
import x4.k;
import x4.l;
import x4.m;
import x4.n;
import x4.o;
import x4.p;
import x4.q;
import x4.r;
import x4.u;
import x4.v;
import x4.x;
import x4.y;
import x4.z;

/* loaded from: classes3.dex */
public class MotionLayout extends ConstraintLayout implements t {

    /* renamed from: m0, reason: collision with root package name */
    public static boolean f17523m0;
    public boolean A;
    public float B;
    public float C;
    public long D;
    public float E;
    public boolean F;
    public ArrayList G;
    public ArrayList H;
    public ArrayList I;

    /* renamed from: J, reason: collision with root package name */
    public CopyOnWriteArrayList f17524J;
    public int K;
    public long L;
    public float M;
    public int N;
    public float O;
    public boolean P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public float W;

    /* renamed from: a, reason: collision with root package name */
    public z f17525a;

    /* renamed from: a0, reason: collision with root package name */
    public final f f17526a0;

    /* renamed from: b, reason: collision with root package name */
    public n f17527b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f17528b0;

    /* renamed from: c, reason: collision with root package name */
    public Interpolator f17529c;

    /* renamed from: c0, reason: collision with root package name */
    public x4.t f17530c0;

    /* renamed from: d, reason: collision with root package name */
    public float f17531d;

    /* renamed from: d0, reason: collision with root package name */
    public Runnable f17532d0;

    /* renamed from: e, reason: collision with root package name */
    public int f17533e;

    /* renamed from: e0, reason: collision with root package name */
    public final Rect f17534e0;

    /* renamed from: f, reason: collision with root package name */
    public int f17535f;

    /* renamed from: f0, reason: collision with root package name */
    public v f17536f0;

    /* renamed from: g, reason: collision with root package name */
    public int f17537g;

    /* renamed from: g0, reason: collision with root package name */
    public final r f17538g0;

    /* renamed from: h, reason: collision with root package name */
    public int f17539h;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f17540h0;

    /* renamed from: i, reason: collision with root package name */
    public int f17541i;

    /* renamed from: i0, reason: collision with root package name */
    public final RectF f17542i0;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f17543j;

    /* renamed from: j0, reason: collision with root package name */
    public View f17544j0;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f17545k;

    /* renamed from: k0, reason: collision with root package name */
    public Matrix f17546k0;

    /* renamed from: l, reason: collision with root package name */
    public long f17547l;

    /* renamed from: l0, reason: collision with root package name */
    public final ArrayList f17548l0;

    /* renamed from: m, reason: collision with root package name */
    public float f17549m;

    /* renamed from: n, reason: collision with root package name */
    public float f17550n;

    /* renamed from: o, reason: collision with root package name */
    public float f17551o;

    /* renamed from: p, reason: collision with root package name */
    public long f17552p;

    /* renamed from: q, reason: collision with root package name */
    public float f17553q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f17554r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f17555s;

    /* renamed from: t, reason: collision with root package name */
    public int f17556t;

    /* renamed from: u, reason: collision with root package name */
    public q f17557u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f17558v;

    /* renamed from: w, reason: collision with root package name */
    public final b f17559w;

    /* renamed from: x, reason: collision with root package name */
    public final p f17560x;

    /* renamed from: y, reason: collision with root package name */
    public int f17561y;

    /* renamed from: z, reason: collision with root package name */
    public int f17562z;

    public MotionLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17529c = null;
        this.f17531d = 0.0f;
        this.f17533e = -1;
        this.f17535f = -1;
        this.f17537g = -1;
        this.f17539h = 0;
        this.f17541i = 0;
        this.f17543j = true;
        this.f17545k = new HashMap();
        this.f17547l = 0L;
        this.f17549m = 1.0f;
        this.f17550n = 0.0f;
        this.f17551o = 0.0f;
        this.f17553q = 0.0f;
        this.f17555s = false;
        this.f17556t = 0;
        this.f17558v = false;
        this.f17559w = new b();
        this.f17560x = new p(this);
        this.A = false;
        this.F = false;
        this.G = null;
        this.H = null;
        this.I = null;
        this.f17524J = null;
        this.K = 0;
        this.L = -1L;
        this.M = 0.0f;
        this.N = 0;
        this.O = 0.0f;
        this.P = false;
        this.f17526a0 = new f(0);
        this.f17528b0 = false;
        this.f17532d0 = null;
        new HashMap();
        this.f17534e0 = new Rect();
        this.f17536f0 = v.UNDEFINED;
        this.f17538g0 = new r(this);
        this.f17540h0 = false;
        this.f17542i0 = new RectF();
        this.f17544j0 = null;
        this.f17546k0 = null;
        this.f17548l0 = new ArrayList();
        F0(attributeSet);
    }

    public static Rect L(MotionLayout motionLayout, h hVar) {
        motionLayout.getClass();
        int A = hVar.A();
        Rect rect = motionLayout.f17534e0;
        rect.top = A;
        rect.left = hVar.z();
        rect.right = hVar.y() + rect.left;
        rect.bottom = hVar.o() + rect.top;
        return rect;
    }

    public final boolean B0(float f13, float f14, MotionEvent motionEvent, View view) {
        boolean z13;
        boolean onTouchEvent;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                if (B0((r3.getLeft() + f13) - view.getScrollX(), (r3.getTop() + f14) - view.getScrollY(), motionEvent, viewGroup.getChildAt(childCount))) {
                    z13 = true;
                    break;
                }
            }
        }
        z13 = false;
        if (!z13) {
            RectF rectF = this.f17542i0;
            rectF.set(f13, f14, (view.getRight() + f13) - view.getLeft(), (view.getBottom() + f14) - view.getTop());
            if (motionEvent.getAction() != 0 || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                float f15 = -f13;
                float f16 = -f14;
                Matrix matrix = view.getMatrix();
                if (matrix.isIdentity()) {
                    motionEvent.offsetLocation(f15, f16);
                    onTouchEvent = view.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(-f15, -f16);
                } else {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(f15, f16);
                    if (this.f17546k0 == null) {
                        this.f17546k0 = new Matrix();
                    }
                    matrix.invert(this.f17546k0);
                    obtain.transform(this.f17546k0);
                    onTouchEvent = view.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (onTouchEvent) {
                    return true;
                }
            }
        }
        return z13;
    }

    public final void F0(AttributeSet attributeSet) {
        z zVar;
        f17523m0 = isInEditMode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s.MotionLayout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z13 = true;
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = obtainStyledAttributes.getIndex(i13);
                if (index == s.MotionLayout_layoutDescription) {
                    this.f17525a = new z(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == s.MotionLayout_currentState) {
                    this.f17535f = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == s.MotionLayout_motionProgress) {
                    this.f17553q = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.f17555s = true;
                } else if (index == s.MotionLayout_applyMotionScene) {
                    z13 = obtainStyledAttributes.getBoolean(index, z13);
                } else if (index == s.MotionLayout_showPaths) {
                    if (this.f17556t == 0) {
                        this.f17556t = obtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == s.MotionLayout_motionDebug) {
                    this.f17556t = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (this.f17525a == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z13) {
                this.f17525a = null;
            }
        }
        if (this.f17556t != 0) {
            z zVar2 = this.f17525a;
            if (zVar2 == null) {
                Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            } else {
                int f13 = zVar2.f();
                z zVar3 = this.f17525a;
                androidx.constraintlayout.widget.p b13 = zVar3.b(zVar3.f());
                String w13 = n3.w(getContext(), f13);
                int childCount = getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = getChildAt(i14);
                    int id3 = childAt.getId();
                    if (id3 == -1) {
                        StringBuilder o13 = cb.o("CHECK: ", w13, " ALL VIEWS SHOULD HAVE ID's ");
                        o13.append(childAt.getClass().getName());
                        o13.append(" does not!");
                        Log.w("MotionLayout", o13.toString());
                    }
                    if (b13.x(id3) == null) {
                        StringBuilder o14 = cb.o("CHECK: ", w13, " NO CONSTRAINTS for ");
                        o14.append(n3.x(childAt));
                        Log.w("MotionLayout", o14.toString());
                    }
                }
                Integer[] numArr = (Integer[]) b13.f17857f.keySet().toArray(new Integer[0]);
                int length = numArr.length;
                int[] iArr = new int[length];
                for (int i15 = 0; i15 < length; i15++) {
                    iArr[i15] = numArr[i15].intValue();
                }
                for (int i16 = 0; i16 < length; i16++) {
                    int i17 = iArr[i16];
                    String w14 = n3.w(getContext(), i17);
                    if (findViewById(iArr[i16]) == null) {
                        Log.w("MotionLayout", "CHECK: " + w13 + " NO View matches id " + w14);
                    }
                    if (b13.w(i17).f17767e.f17779d == -1) {
                        Log.w("MotionLayout", a.m("CHECK: ", w13, "(", w14, ") no LAYOUT_HEIGHT"));
                    }
                    if (b13.w(i17).f17767e.f17777c == -1) {
                        Log.w("MotionLayout", a.m("CHECK: ", w13, "(", w14, ") no LAYOUT_HEIGHT"));
                    }
                }
                SparseIntArray sparseIntArray = new SparseIntArray();
                SparseIntArray sparseIntArray2 = new SparseIntArray();
                Iterator it = this.f17525a.f131877d.iterator();
                while (it.hasNext()) {
                    y yVar = (y) it.next();
                    if (yVar == this.f17525a.f131876c) {
                        Log.v("MotionLayout", "CHECK: CURRENT");
                    }
                    if (yVar.f131859d == yVar.f131858c) {
                        Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
                    }
                    int i18 = yVar.f131859d;
                    int i19 = yVar.f131858c;
                    String w15 = n3.w(getContext(), i18);
                    String w16 = n3.w(getContext(), i19);
                    if (sparseIntArray.get(i18) == i19) {
                        Log.e("MotionLayout", "CHECK: two transitions with the same start and end " + w15 + "->" + w16);
                    }
                    if (sparseIntArray2.get(i19) == i18) {
                        Log.e("MotionLayout", "CHECK: you can't have reverse transitions" + w15 + "->" + w16);
                    }
                    sparseIntArray.put(i18, i19);
                    sparseIntArray2.put(i19, i18);
                    if (this.f17525a.b(i18) == null) {
                        Log.e("MotionLayout", " no such constraintSetStart " + w15);
                    }
                    if (this.f17525a.b(i19) == null) {
                        Log.e("MotionLayout", " no such constraintSetEnd " + w15);
                    }
                }
            }
        }
        if (this.f17535f != -1 || (zVar = this.f17525a) == null) {
            return;
        }
        this.f17535f = zVar.f();
        this.f17533e = this.f17525a.f();
        y yVar2 = this.f17525a.f131876c;
        this.f17537g = yVar2 != null ? yVar2.f131858c : -1;
    }

    public final void G0() {
        y yVar;
        b0 b0Var;
        View view;
        z zVar = this.f17525a;
        if (zVar == null) {
            return;
        }
        if (zVar.a(this.f17535f, this)) {
            requestLayout();
            return;
        }
        int i13 = this.f17535f;
        if (i13 != -1) {
            z zVar2 = this.f17525a;
            ArrayList arrayList = zVar2.f131877d;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                y yVar2 = (y) it.next();
                if (yVar2.f131868m.size() > 0) {
                    Iterator it2 = yVar2.f131868m.iterator();
                    while (it2.hasNext()) {
                        ((x) it2.next()).b(this);
                    }
                }
            }
            ArrayList arrayList2 = zVar2.f131879f;
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                y yVar3 = (y) it3.next();
                if (yVar3.f131868m.size() > 0) {
                    Iterator it4 = yVar3.f131868m.iterator();
                    while (it4.hasNext()) {
                        ((x) it4.next()).b(this);
                    }
                }
            }
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                y yVar4 = (y) it5.next();
                if (yVar4.f131868m.size() > 0) {
                    Iterator it6 = yVar4.f131868m.iterator();
                    while (it6.hasNext()) {
                        ((x) it6.next()).a(this, i13, yVar4);
                    }
                }
            }
            Iterator it7 = arrayList2.iterator();
            while (it7.hasNext()) {
                y yVar5 = (y) it7.next();
                if (yVar5.f131868m.size() > 0) {
                    Iterator it8 = yVar5.f131868m.iterator();
                    while (it8.hasNext()) {
                        ((x) it8.next()).a(this, i13, yVar5);
                    }
                }
            }
        }
        if (!this.f17525a.n() || (yVar = this.f17525a.f131876c) == null || (b0Var = yVar.f131867l) == null) {
            return;
        }
        int i14 = b0Var.f131665d;
        if (i14 != -1) {
            MotionLayout motionLayout = b0Var.f131679r;
            view = motionLayout.findViewById(i14);
            if (view == null) {
                Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + n3.w(motionLayout.getContext(), b0Var.f131665d));
            }
        } else {
            view = null;
        }
        if (view instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            nestedScrollView.setOnTouchListener(new a0());
            nestedScrollView.A = new i();
        }
    }

    public final void H0() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f17524J;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.f17548l0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            CopyOnWriteArrayList copyOnWriteArrayList2 = this.f17524J;
            if (copyOnWriteArrayList2 != null) {
                Iterator it2 = copyOnWriteArrayList2.iterator();
                while (it2.hasNext()) {
                    ((u) it2.next()).a(num.intValue());
                }
            }
        }
        arrayList.clear();
    }

    public final void I0() {
        this.f17538g0.f();
        invalidate();
    }

    public final void K0(float f13) {
        if (f13 < 0.0f || f13 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!super.isAttachedToWindow()) {
            if (this.f17530c0 == null) {
                this.f17530c0 = new x4.t(this);
            }
            this.f17530c0.f131830a = f13;
            return;
        }
        if (f13 <= 0.0f) {
            if (this.f17551o == 1.0f && this.f17535f == this.f17537g) {
                P0(v.MOVING);
            }
            this.f17535f = this.f17533e;
            if (this.f17551o == 0.0f) {
                P0(v.FINISHED);
            }
        } else if (f13 >= 1.0f) {
            if (this.f17551o == 0.0f && this.f17535f == this.f17533e) {
                P0(v.MOVING);
            }
            this.f17535f = this.f17537g;
            if (this.f17551o == 1.0f) {
                P0(v.FINISHED);
            }
        } else {
            this.f17535f = -1;
            P0(v.MOVING);
        }
        if (this.f17525a == null) {
            return;
        }
        this.f17554r = true;
        this.f17553q = f13;
        this.f17550n = f13;
        this.f17552p = -1L;
        this.f17547l = -1L;
        this.f17527b = null;
        this.f17555s = true;
        invalidate();
    }

    public final void L0(float f13, float f14) {
        if (!super.isAttachedToWindow()) {
            if (this.f17530c0 == null) {
                this.f17530c0 = new x4.t(this);
            }
            x4.t tVar = this.f17530c0;
            tVar.f131830a = f13;
            tVar.f131831b = f14;
            return;
        }
        K0(f13);
        P0(v.MOVING);
        this.f17531d = f14;
        if (f14 != 0.0f) {
            d0(f14 > 0.0f ? 1.0f : 0.0f);
        } else {
            if (f13 == 0.0f || f13 == 1.0f) {
                return;
            }
            d0(f13 > 0.5f ? 1.0f : 0.0f);
        }
    }

    public final void P0(v vVar) {
        v vVar2 = v.FINISHED;
        if (vVar == vVar2 && this.f17535f == -1) {
            return;
        }
        v vVar3 = this.f17536f0;
        this.f17536f0 = vVar;
        v vVar4 = v.MOVING;
        if (vVar3 == vVar4 && vVar == vVar4) {
            o0();
        }
        int i13 = o.f131802a[vVar3.ordinal()];
        if (i13 != 1 && i13 != 2) {
            if (i13 == 3 && vVar == vVar2) {
                r0();
                return;
            }
            return;
        }
        if (vVar == vVar4) {
            o0();
        }
        if (vVar == vVar2) {
            r0();
        }
    }

    public final void S0(int i13, int i14) {
        if (!super.isAttachedToWindow()) {
            if (this.f17530c0 == null) {
                this.f17530c0 = new x4.t(this);
            }
            x4.t tVar = this.f17530c0;
            tVar.f131832c = i13;
            tVar.f131833d = i14;
            return;
        }
        z zVar = this.f17525a;
        if (zVar != null) {
            this.f17533e = i13;
            this.f17537g = i14;
            zVar.m(i13, i14);
            this.f17538g0.e(this.f17525a.b(i13), this.f17525a.b(i14));
            I0();
            this.f17551o = 0.0f;
            d0(0.0f);
        }
    }

    public final void T0(y yVar) {
        b0 b0Var;
        z zVar = this.f17525a;
        zVar.f131876c = yVar;
        if (yVar != null && (b0Var = yVar.f131867l) != null) {
            b0Var.c(zVar.f131889p);
        }
        P0(v.SETUP);
        int i13 = this.f17535f;
        y yVar2 = this.f17525a.f131876c;
        if (i13 == (yVar2 == null ? -1 : yVar2.f131858c)) {
            this.f17551o = 1.0f;
            this.f17550n = 1.0f;
            this.f17553q = 1.0f;
        } else {
            this.f17551o = 0.0f;
            this.f17550n = 0.0f;
            this.f17553q = 0.0f;
        }
        this.f17552p = (yVar.f131873r & 1) != 0 ? -1L : System.nanoTime();
        int f13 = this.f17525a.f();
        z zVar2 = this.f17525a;
        y yVar3 = zVar2.f131876c;
        int i14 = yVar3 != null ? yVar3.f131858c : -1;
        if (f13 == this.f17533e && i14 == this.f17537g) {
            return;
        }
        this.f17533e = f13;
        this.f17537g = i14;
        zVar2.m(f13, i14);
        androidx.constraintlayout.widget.p b13 = this.f17525a.b(this.f17533e);
        androidx.constraintlayout.widget.p b14 = this.f17525a.b(this.f17537g);
        r rVar = this.f17538g0;
        rVar.e(b13, b14);
        int i15 = this.f17533e;
        int i16 = this.f17537g;
        rVar.f131825e = i15;
        rVar.f131826f = i16;
        rVar.f();
        I0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if (r19 != 7) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        if ((((r18 * r3) - (((r2 * r3) * r3) / 2.0f)) + r1) > 1.0f) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0087, code lost:
    
        r2 = r16.f17551o;
        r5 = r16.f17549m;
        r6 = r16.f17525a.e();
        r1 = r16.f17525a.f131876c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
    
        if (r1 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
    
        r1 = r1.f131867l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0099, code lost:
    
        if (r1 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
    
        r7 = r1.f131680s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a0, code lost:
    
        r16.f17559w.b(r2, r17, r18, r5, r6, r7);
        r16.f17531d = 0.0f;
        r1 = r16.f17535f;
        r16.f17553q = r8;
        r16.f17535f = r1;
        r16.f17527b = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
    
        r7 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0076, code lost:
    
        r1 = r16.f17551o;
        r2 = r16.f17525a.e();
        r15.f131803a = r18;
        r15.f131804b = r1;
        r15.f131805c = r2;
        r16.f17527b = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0074, code lost:
    
        if ((((((r2 * r3) * r3) / 2.0f) + (r18 * r3)) + r1) < 0.0f) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Y0(float r17, float r18, int r19) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.Y0(float, float, int):void");
    }

    public final void b1() {
        d0(1.0f);
        this.f17532d0 = null;
    }

    public final void d0(float f13) {
        z zVar = this.f17525a;
        if (zVar == null) {
            return;
        }
        float f14 = this.f17551o;
        float f15 = this.f17550n;
        if (f14 != f15 && this.f17554r) {
            this.f17551o = f15;
        }
        float f16 = this.f17551o;
        if (f16 == f13) {
            return;
        }
        this.f17558v = false;
        this.f17553q = f13;
        this.f17549m = (zVar.f131876c != null ? r3.f131863h : zVar.f131883j) / 1000.0f;
        K0(f13);
        Interpolator interpolator = null;
        this.f17527b = null;
        z zVar2 = this.f17525a;
        y yVar = zVar2.f131876c;
        int i13 = yVar.f131860e;
        if (i13 == -2) {
            interpolator = AnimationUtils.loadInterpolator(zVar2.f131874a.getContext(), zVar2.f131876c.f131862g);
        } else if (i13 == -1) {
            interpolator = new l(e.c(yVar.f131861f), 1);
        } else if (i13 == 0) {
            interpolator = new AccelerateDecelerateInterpolator();
        } else if (i13 == 1) {
            interpolator = new AccelerateInterpolator();
        } else if (i13 == 2) {
            interpolator = new DecelerateInterpolator();
        } else if (i13 == 4) {
            interpolator = new BounceInterpolator();
        } else if (i13 == 5) {
            interpolator = new OvershootInterpolator();
        } else if (i13 == 6) {
            interpolator = new AnticipateInterpolator();
        }
        this.f17529c = interpolator;
        this.f17554r = false;
        this.f17547l = System.nanoTime();
        this.f17555s = true;
        this.f17550n = f16;
        this.f17551o = f16;
        invalidate();
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0361  */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dispatchDraw(android.graphics.Canvas r35) {
        /*
            Method dump skipped, instructions count: 1328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    public final void g0() {
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            m mVar = (m) this.f17545k.get(getChildAt(i13));
            if (mVar != null) {
                "button".equals(n3.x(mVar.f131777b));
            }
        }
    }

    @Override // q5.s
    public final void i(View view, View view2, int i13, int i14) {
        this.D = System.nanoTime();
        this.E = 0.0f;
        this.B = 0.0f;
        this.C = 0.0f;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    @Override // q5.s
    public final void k(View view, int i13) {
        b0 b0Var;
        z zVar = this.f17525a;
        if (zVar != null) {
            float f13 = this.E;
            if (f13 == 0.0f) {
                return;
            }
            float f14 = this.B / f13;
            float f15 = this.C / f13;
            y yVar = zVar.f131876c;
            if (yVar == null || (b0Var = yVar.f131867l) == null) {
                return;
            }
            b0Var.f131674m = false;
            MotionLayout motionLayout = b0Var.f131679r;
            float f16 = motionLayout.f17551o;
            motionLayout.t0(f16, b0Var.f131669h, b0Var.f131668g, b0Var.f131665d, b0Var.f131675n);
            float f17 = b0Var.f131672k;
            float[] fArr = b0Var.f131675n;
            float f18 = f17 != 0.0f ? (f14 * f17) / fArr[0] : (f15 * b0Var.f131673l) / fArr[1];
            if (!Float.isNaN(f18)) {
                f16 += f18 / 3.0f;
            }
            if (f16 != 0.0f) {
                boolean z13 = f16 != 1.0f;
                int i14 = b0Var.f131664c;
                if ((i14 != 3) && z13) {
                    motionLayout.Y0(((double) f16) >= 0.5d ? 1.0f : 0.0f, f18, i14);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k0(boolean r23) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.k0(boolean):void");
    }

    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // q5.s
    public final void l(View view, int i13, int i14, int[] iArr, int i15) {
        y yVar;
        boolean z13;
        ?? r13;
        b0 b0Var;
        float f13;
        b0 b0Var2;
        b0 b0Var3;
        b0 b0Var4;
        int i16;
        z zVar = this.f17525a;
        if (zVar == null || (yVar = zVar.f131876c) == null || !(!yVar.f131870o)) {
            return;
        }
        int i17 = -1;
        if (!z13 || (b0Var4 = yVar.f131867l) == null || (i16 = b0Var4.f131666e) == -1 || view.getId() == i16) {
            y yVar2 = zVar.f131876c;
            if (yVar2 != null && (b0Var3 = yVar2.f131867l) != null && b0Var3.f131682u) {
                b0 b0Var5 = yVar.f131867l;
                if (b0Var5 != null && (b0Var5.f131684w & 4) != 0) {
                    i17 = i14;
                }
                float f14 = this.f17550n;
                if ((f14 == 1.0f || f14 == 0.0f) && view.canScrollVertically(i17)) {
                    return;
                }
            }
            b0 b0Var6 = yVar.f131867l;
            if (b0Var6 != null && (b0Var6.f131684w & 1) != 0) {
                float f15 = i13;
                float f16 = i14;
                y yVar3 = zVar.f131876c;
                if (yVar3 == null || (b0Var2 = yVar3.f131867l) == null) {
                    f13 = 0.0f;
                } else {
                    MotionLayout motionLayout = b0Var2.f131679r;
                    motionLayout.t0(motionLayout.f17551o, b0Var2.f131669h, b0Var2.f131668g, b0Var2.f131665d, b0Var2.f131675n);
                    float f17 = b0Var2.f131672k;
                    float[] fArr = b0Var2.f131675n;
                    if (f17 != 0.0f) {
                        if (fArr[0] == 0.0f) {
                            fArr[0] = 1.0E-7f;
                        }
                        f13 = (f15 * f17) / fArr[0];
                    } else {
                        if (fArr[1] == 0.0f) {
                            fArr[1] = 1.0E-7f;
                        }
                        f13 = (f16 * b0Var2.f131673l) / fArr[1];
                    }
                }
                float f18 = this.f17551o;
                if ((f18 <= 0.0f && f13 < 0.0f) || (f18 >= 1.0f && f13 > 0.0f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new androidx.appcompat.app.z(view));
                    return;
                }
            }
            float f19 = this.f17550n;
            long nanoTime = System.nanoTime();
            float f23 = i13;
            this.B = f23;
            float f24 = i14;
            this.C = f24;
            this.E = (float) ((nanoTime - this.D) * 1.0E-9d);
            this.D = nanoTime;
            y yVar4 = zVar.f131876c;
            if (yVar4 != null && (b0Var = yVar4.f131867l) != null) {
                MotionLayout motionLayout2 = b0Var.f131679r;
                float f25 = motionLayout2.f17551o;
                if (!b0Var.f131674m) {
                    b0Var.f131674m = true;
                    motionLayout2.K0(f25);
                }
                b0Var.f131679r.t0(f25, b0Var.f131669h, b0Var.f131668g, b0Var.f131665d, b0Var.f131675n);
                float f26 = b0Var.f131672k;
                float[] fArr2 = b0Var.f131675n;
                if (Math.abs((b0Var.f131673l * fArr2[1]) + (f26 * fArr2[0])) < 0.01d) {
                    fArr2[0] = 0.01f;
                    fArr2[1] = 0.01f;
                }
                float f27 = b0Var.f131672k;
                float max = Math.max(Math.min(f25 + (f27 != 0.0f ? (f23 * f27) / fArr2[0] : (f24 * b0Var.f131673l) / fArr2[1]), 1.0f), 0.0f);
                if (max != motionLayout2.f17551o) {
                    motionLayout2.K0(max);
                }
            }
            if (f19 != this.f17550n) {
                iArr[0] = i13;
                r13 = 1;
                iArr[1] = i14;
            } else {
                r13 = 1;
            }
            k0(false);
            if (iArr[0] == 0 && iArr[r13] == 0) {
                return;
            }
            this.A = r13;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void loadLayoutDescription(int i13) {
        y yVar;
        if (i13 == 0) {
            this.f17525a = null;
            return;
        }
        try {
            z zVar = new z(getContext(), this, i13);
            this.f17525a = zVar;
            int i14 = -1;
            if (this.f17535f == -1) {
                this.f17535f = zVar.f();
                this.f17533e = this.f17525a.f();
                y yVar2 = this.f17525a.f131876c;
                if (yVar2 != null) {
                    i14 = yVar2.f131858c;
                }
                this.f17537g = i14;
            }
            if (!super.isAttachedToWindow()) {
                this.f17525a = null;
                return;
            }
            try {
                Display display = getDisplay();
                if (display != null) {
                    display.getRotation();
                }
                z zVar2 = this.f17525a;
                if (zVar2 != null) {
                    androidx.constraintlayout.widget.p b13 = zVar2.b(this.f17535f);
                    this.f17525a.l(this);
                    ArrayList arrayList = this.I;
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((MotionHelper) it.next()).getClass();
                        }
                    }
                    if (b13 != null) {
                        b13.b(this);
                    }
                    this.f17533e = this.f17535f;
                }
                G0();
                x4.t tVar = this.f17530c0;
                if (tVar != null) {
                    tVar.a();
                    return;
                }
                z zVar3 = this.f17525a;
                if (zVar3 == null || (yVar = zVar3.f131876c) == null || yVar.f131869n != 4) {
                    return;
                }
                b1();
                P0(v.SETUP);
                P0(v.MOVING);
            } catch (Exception e13) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e13);
            }
        } catch (Exception e14) {
            throw new IllegalArgumentException("unable to parse MotionScene file", e14);
        }
    }

    public final void n1(int i13) {
        if (super.isAttachedToWindow()) {
            p1(i13, -1);
            return;
        }
        if (this.f17530c0 == null) {
            this.f17530c0 = new x4.t(this);
        }
        this.f17530c0.f131833d = i13;
    }

    public final void o0() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        CopyOnWriteArrayList copyOnWriteArrayList2 = this.f17524J;
        if (copyOnWriteArrayList2 == null || copyOnWriteArrayList2.isEmpty() || this.O == this.f17550n) {
            return;
        }
        if (this.N != -1 && (copyOnWriteArrayList = this.f17524J) != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((u) it.next()).getClass();
            }
        }
        this.N = -1;
        this.O = this.f17550n;
        CopyOnWriteArrayList copyOnWriteArrayList3 = this.f17524J;
        if (copyOnWriteArrayList3 != null) {
            Iterator it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                ((u) it2.next()).getClass();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        y yVar;
        int i13;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        z zVar = this.f17525a;
        if (zVar != null && (i13 = this.f17535f) != -1) {
            androidx.constraintlayout.widget.p b13 = zVar.b(i13);
            this.f17525a.l(this);
            ArrayList arrayList = this.I;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((MotionHelper) it.next()).getClass();
                }
            }
            if (b13 != null) {
                b13.b(this);
            }
            this.f17533e = this.f17535f;
        }
        G0();
        x4.t tVar = this.f17530c0;
        if (tVar != null) {
            tVar.a();
            return;
        }
        z zVar2 = this.f17525a;
        if (zVar2 == null || (yVar = zVar2.f131876c) == null || yVar.f131869n != 4) {
            return;
        }
        b1();
        P0(v.SETUP);
        P0(v.MOVING);
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x010c  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r25) {
        /*
            Method dump skipped, instructions count: 1206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        this.f17528b0 = true;
        try {
            if (this.f17525a == null) {
                super.onLayout(z13, i13, i14, i15, i16);
                return;
            }
            int i17 = i15 - i13;
            int i18 = i16 - i14;
            if (this.f17561y != i17 || this.f17562z != i18) {
                I0();
                k0(true);
            }
            this.f17561y = i17;
            this.f17562z = i18;
        } finally {
            this.f17528b0 = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        boolean z13;
        if (this.f17525a == null) {
            super.onMeasure(i13, i14);
            return;
        }
        boolean z14 = true;
        boolean z15 = (this.f17539h == i13 && this.f17541i == i14) ? false : true;
        if (this.f17540h0) {
            this.f17540h0 = false;
            G0();
            H0();
            z15 = true;
        }
        if (this.mDirtyHierarchy) {
            z15 = true;
        }
        this.f17539h = i13;
        this.f17541i = i14;
        int f13 = this.f17525a.f();
        y yVar = this.f17525a.f131876c;
        int i15 = yVar == null ? -1 : yVar.f131858c;
        r rVar = this.f17538g0;
        if ((!z15 && f13 == rVar.f131825e && i15 == rVar.f131826f) || this.f17533e == -1) {
            if (z15) {
                super.onMeasure(i13, i14);
            }
            z13 = true;
        } else {
            super.onMeasure(i13, i14);
            rVar.e(this.f17525a.b(f13), this.f17525a.b(i15));
            rVar.f();
            rVar.f131825e = f13;
            rVar.f131826f = i15;
            z13 = false;
        }
        if (this.P || z13) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int y13 = this.mLayoutWidget.y() + getPaddingRight() + getPaddingLeft();
            int o13 = this.mLayoutWidget.o() + paddingBottom;
            int i16 = this.U;
            if (i16 == Integer.MIN_VALUE || i16 == 0) {
                y13 = (int) ((this.W * (this.S - r1)) + this.Q);
                requestLayout();
            }
            int i17 = this.V;
            if (i17 == Integer.MIN_VALUE || i17 == 0) {
                o13 = (int) ((this.W * (this.T - r2)) + this.R);
                requestLayout();
            }
            setMeasuredDimension(y13, o13);
        }
        float signum = Math.signum(this.f17553q - this.f17551o);
        long nanoTime = System.nanoTime();
        n nVar = this.f17527b;
        float f14 = this.f17551o + (!(nVar instanceof b) ? (((nanoTime - this.f17552p) * signum) * 1.0E-9f) / this.f17549m : 0.0f);
        if (this.f17554r) {
            f14 = this.f17553q;
        }
        if ((signum <= 0.0f || f14 < this.f17553q) && (signum > 0.0f || f14 > this.f17553q)) {
            z14 = false;
        } else {
            f14 = this.f17553q;
        }
        if (nVar != null && !z14) {
            f14 = this.f17558v ? nVar.getInterpolation((nanoTime - this.f17547l) * 1.0E-9f) : nVar.getInterpolation(f14);
        }
        if ((signum > 0.0f && f14 >= this.f17553q) || (signum <= 0.0f && f14 <= this.f17553q)) {
            f14 = this.f17553q;
        }
        this.W = f14;
        int childCount = getChildCount();
        long nanoTime2 = System.nanoTime();
        Interpolator interpolator = this.f17529c;
        if (interpolator != null) {
            f14 = interpolator.getInterpolation(f14);
        }
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            m mVar = (m) this.f17545k.get(childAt);
            if (mVar != null) {
                mVar.e(f14, nanoTime2, childAt, this.f17526a0);
            }
        }
        if (this.P) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f13, float f14, boolean z13) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f13, float f14) {
        return false;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i13) {
        b0 b0Var;
        z zVar = this.f17525a;
        if (zVar != null) {
            boolean isRtl = isRtl();
            zVar.f131889p = isRtl;
            y yVar = zVar.f131876c;
            if (yVar == null || (b0Var = yVar.f131867l) == null) {
                return;
            }
            b0Var.c(isRtl);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:204:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x07dc A[RETURN] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r37) {
        /*
            Method dump skipped, instructions count: 2019
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.f17524J == null) {
                this.f17524J = new CopyOnWriteArrayList();
            }
            this.f17524J.add(motionHelper);
            if (motionHelper.f17521i) {
                if (this.G == null) {
                    this.G = new ArrayList();
                }
                this.G.add(motionHelper);
            }
            if (motionHelper.f17522j) {
                if (this.H == null) {
                    this.H = new ArrayList();
                }
                this.H.add(motionHelper);
            }
            if (motionHelper instanceof MotionEffect) {
                if (this.I == null) {
                    this.I = new ArrayList();
                }
                this.I.add(motionHelper);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList arrayList = this.G;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList arrayList2 = this.H;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public final void p1(int i13, int i14) {
        androidx.constraintlayout.widget.x xVar;
        z zVar = this.f17525a;
        if (zVar != null && (xVar = zVar.f131875b) != null) {
            int i15 = this.f17535f;
            float f13 = -1;
            androidx.constraintlayout.widget.v vVar = (androidx.constraintlayout.widget.v) ((SparseArray) xVar.f17873d).get(i13);
            if (vVar == null) {
                i15 = i13;
            } else {
                ArrayList arrayList = vVar.f17863b;
                int i16 = vVar.f17864c;
                if (f13 != -1.0f && f13 != -1.0f) {
                    Iterator it = arrayList.iterator();
                    w wVar = null;
                    while (true) {
                        if (it.hasNext()) {
                            w wVar2 = (w) it.next();
                            if (wVar2.a(f13, f13)) {
                                if (i15 == wVar2.f17869e) {
                                    break;
                                } else {
                                    wVar = wVar2;
                                }
                            }
                        } else if (wVar != null) {
                            i15 = wVar.f17869e;
                        }
                    }
                } else if (i16 != i15) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (i15 == ((w) it2.next()).f17869e) {
                            break;
                        }
                    }
                    i15 = i16;
                }
            }
            if (i15 != -1) {
                i13 = i15;
            }
        }
        int i17 = this.f17535f;
        if (i17 == i13) {
            return;
        }
        if (this.f17533e == i13) {
            d0(0.0f);
            if (i14 > 0) {
                this.f17549m = i14 / 1000.0f;
                return;
            }
            return;
        }
        if (this.f17537g == i13) {
            d0(1.0f);
            if (i14 > 0) {
                this.f17549m = i14 / 1000.0f;
                return;
            }
            return;
        }
        this.f17537g = i13;
        if (i17 != -1) {
            S0(i17, i13);
            d0(1.0f);
            this.f17551o = 0.0f;
            b1();
            if (i14 > 0) {
                this.f17549m = i14 / 1000.0f;
                return;
            }
            return;
        }
        this.f17558v = false;
        this.f17553q = 1.0f;
        this.f17550n = 0.0f;
        this.f17551o = 0.0f;
        this.f17552p = System.nanoTime();
        this.f17547l = System.nanoTime();
        this.f17554r = false;
        this.f17527b = null;
        if (i14 == -1) {
            this.f17549m = (this.f17525a.f131876c != null ? r7.f131863h : r3.f131883j) / 1000.0f;
        }
        this.f17533e = -1;
        this.f17525a.m(-1, this.f17537g);
        SparseArray sparseArray = new SparseArray();
        if (i14 == 0) {
            this.f17549m = (this.f17525a.f131876c != null ? r3.f131863h : r15.f131883j) / 1000.0f;
        } else if (i14 > 0) {
            this.f17549m = i14 / 1000.0f;
        }
        int childCount = getChildCount();
        HashMap hashMap = this.f17545k;
        hashMap.clear();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            hashMap.put(childAt, new m(childAt));
            sparseArray.put(childAt.getId(), (m) hashMap.get(childAt));
        }
        this.f17555s = true;
        androidx.constraintlayout.widget.p b13 = this.f17525a.b(i13);
        r rVar = this.f17538g0;
        rVar.e(null, b13);
        I0();
        rVar.a();
        int childCount2 = getChildCount();
        for (int i19 = 0; i19 < childCount2; i19++) {
            View childAt2 = getChildAt(i19);
            m mVar = (m) hashMap.get(childAt2);
            if (mVar != null) {
                x4.w wVar3 = mVar.f131781f;
                wVar3.f131838c = 0.0f;
                wVar3.f131839d = 0.0f;
                wVar3.f(childAt2.getX(), childAt2.getY(), childAt2.getWidth(), childAt2.getHeight());
                k kVar = mVar.f131783h;
                kVar.getClass();
                childAt2.getX();
                childAt2.getY();
                childAt2.getWidth();
                childAt2.getHeight();
                kVar.f131759c = childAt2.getVisibility();
                kVar.f131757a = childAt2.getVisibility() != 0 ? 0.0f : childAt2.getAlpha();
                kVar.f131760d = childAt2.getElevation();
                kVar.f131761e = childAt2.getRotation();
                kVar.f131762f = childAt2.getRotationX();
                kVar.f131763g = childAt2.getRotationY();
                kVar.f131764h = childAt2.getScaleX();
                kVar.f131765i = childAt2.getScaleY();
                kVar.f131766j = childAt2.getPivotX();
                kVar.f131767k = childAt2.getPivotY();
                kVar.f131768l = childAt2.getTranslationX();
                kVar.f131769m = childAt2.getTranslationY();
                kVar.f131770n = childAt2.getTranslationZ();
            }
        }
        int width = getWidth();
        int height = getHeight();
        if (this.I != null) {
            for (int i23 = 0; i23 < childCount; i23++) {
                m mVar2 = (m) hashMap.get(getChildAt(i23));
                if (mVar2 != null) {
                    this.f17525a.d(mVar2);
                }
            }
            Iterator it3 = this.I.iterator();
            while (it3.hasNext()) {
                ((MotionHelper) it3.next()).y(this, hashMap);
            }
            for (int i24 = 0; i24 < childCount; i24++) {
                m mVar3 = (m) hashMap.get(getChildAt(i24));
                if (mVar3 != null) {
                    mVar3.h(width, height, System.nanoTime());
                }
            }
        } else {
            for (int i25 = 0; i25 < childCount; i25++) {
                m mVar4 = (m) hashMap.get(getChildAt(i25));
                if (mVar4 != null) {
                    this.f17525a.d(mVar4);
                    mVar4.h(width, height, System.nanoTime());
                }
            }
        }
        y yVar = this.f17525a.f131876c;
        float f14 = yVar != null ? yVar.f131864i : 0.0f;
        if (f14 != 0.0f) {
            float f15 = Float.MAX_VALUE;
            float f16 = -3.4028235E38f;
            for (int i26 = 0; i26 < childCount; i26++) {
                x4.w wVar4 = ((m) hashMap.get(getChildAt(i26))).f131782g;
                float f17 = wVar4.f131841f + wVar4.f131840e;
                f15 = Math.min(f15, f17);
                f16 = Math.max(f16, f17);
            }
            for (int i27 = 0; i27 < childCount; i27++) {
                m mVar5 = (m) hashMap.get(getChildAt(i27));
                x4.w wVar5 = mVar5.f131782g;
                float f18 = wVar5.f131840e;
                float f19 = wVar5.f131841f;
                mVar5.f131789n = 1.0f / (1.0f - f14);
                mVar5.f131788m = f14 - ((((f18 + f19) - f15) * f14) / (f16 - f15));
            }
        }
        this.f17550n = 0.0f;
        this.f17551o = 0.0f;
        this.f17555s = true;
        invalidate();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void parseLayoutDescription(int i13) {
        this.mConstraintLayoutSpec = null;
    }

    public final void r0() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f17524J;
        if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty() && this.N == -1) {
            this.N = this.f17535f;
            ArrayList arrayList = this.f17548l0;
            int intValue = !arrayList.isEmpty() ? ((Integer) ep.b.h(arrayList, 1)).intValue() : -1;
            int i13 = this.f17535f;
            if (intValue != i13 && i13 != -1) {
                arrayList.add(Integer.valueOf(i13));
            }
        }
        H0();
        Runnable runnable = this.f17532d0;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void r1(int i13, androidx.constraintlayout.widget.p pVar) {
        z zVar = this.f17525a;
        if (zVar != null) {
            zVar.f131880g.put(i13, pVar);
        }
        this.f17538g0.e(this.f17525a.b(this.f17533e), this.f17525a.b(this.f17537g));
        I0();
        if (this.f17535f == i13) {
            pVar.b(this);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        z zVar;
        y yVar;
        if (!this.P && this.f17535f == -1 && (zVar = this.f17525a) != null && (yVar = zVar.f131876c) != null) {
            int i13 = yVar.f131872q;
            if (i13 == 0) {
                return;
            }
            if (i13 == 2) {
                int childCount = getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    ((m) this.f17545k.get(getChildAt(i14))).f131779d = true;
                }
                return;
            }
        }
        super.requestLayout();
    }

    @Override // q5.t
    public final void s(View view, int i13, int i14, int i15, int i16, int i17, int[] iArr) {
        if (this.A || i13 != 0 || i14 != 0) {
            iArr[0] = iArr[0] + i15;
            iArr[1] = iArr[1] + i16;
        }
        this.A = false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void setState(int i13, int i14, int i15) {
        P0(v.SETUP);
        this.f17535f = i13;
        this.f17533e = -1;
        this.f17537g = -1;
        androidx.constraintlayout.widget.i iVar = this.mConstraintLayoutSpec;
        if (iVar != null) {
            iVar.b(i14, i15, i13);
            return;
        }
        z zVar = this.f17525a;
        if (zVar != null) {
            zVar.b(i13).b(this);
        }
    }

    @Override // q5.s
    public final void t(View view, int i13, int i14, int i15, int i16, int i17) {
    }

    public final void t0(float f13, float f14, float f15, int i13, float[] fArr) {
        View viewById = getViewById(i13);
        m mVar = (m) this.f17545k.get(viewById);
        if (mVar != null) {
            mVar.d(fArr, f13, f14, f15);
            viewById.getY();
        } else {
            Log.w("MotionLayout", "WARNING could not find view id " + (viewById == null ? a.d("", i13) : viewById.getContext().getResources().getResourceName(i13)));
        }
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return n3.w(context, this.f17533e) + "->" + n3.w(context, this.f17537g) + " (pos:" + this.f17551o + " Dpos/Dt:" + this.f17531d;
    }

    @Override // q5.s
    public final boolean x(View view, View view2, int i13, int i14) {
        y yVar;
        b0 b0Var;
        z zVar = this.f17525a;
        return (zVar == null || (yVar = zVar.f131876c) == null || (b0Var = yVar.f131867l) == null || (b0Var.f131684w & 2) != 0) ? false : true;
    }

    public final y z0(int i13) {
        Iterator it = this.f17525a.f131877d.iterator();
        while (it.hasNext()) {
            y yVar = (y) it.next();
            if (yVar.f131856a == i13) {
                return yVar;
            }
        }
        return null;
    }

    public MotionLayout(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f17529c = null;
        this.f17531d = 0.0f;
        this.f17533e = -1;
        this.f17535f = -1;
        this.f17537g = -1;
        this.f17539h = 0;
        this.f17541i = 0;
        this.f17543j = true;
        this.f17545k = new HashMap();
        this.f17547l = 0L;
        this.f17549m = 1.0f;
        this.f17550n = 0.0f;
        this.f17551o = 0.0f;
        this.f17553q = 0.0f;
        this.f17555s = false;
        this.f17556t = 0;
        this.f17558v = false;
        this.f17559w = new b();
        this.f17560x = new p(this);
        this.A = false;
        this.F = false;
        this.G = null;
        this.H = null;
        this.I = null;
        this.f17524J = null;
        this.K = 0;
        this.L = -1L;
        this.M = 0.0f;
        this.N = 0;
        this.O = 0.0f;
        this.P = false;
        this.f17526a0 = new f(0);
        this.f17528b0 = false;
        this.f17532d0 = null;
        new HashMap();
        this.f17534e0 = new Rect();
        this.f17536f0 = v.UNDEFINED;
        this.f17538g0 = new r(this);
        this.f17540h0 = false;
        this.f17542i0 = new RectF();
        this.f17544j0 = null;
        this.f17546k0 = null;
        this.f17548l0 = new ArrayList();
        F0(attributeSet);
    }
}
