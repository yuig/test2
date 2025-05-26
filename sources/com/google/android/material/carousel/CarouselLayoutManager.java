package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l2;
import androidx.recyclerview.widget.m1;
import androidx.recyclerview.widget.q2;
import androidx.recyclerview.widget.u2;
import androidx.recyclerview.widget.w2;
import bk.b0;
import com.google.android.material.carousel.CarouselLayoutManager;
import fj.e;
import fj.m;
import gj.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import je.n2;
import mj.b;
import mj.c;
import mj.d;
import mj.f;
import mj.g;
import mj.i;
import mj.j;
import mj.k;
import mj.l;
import mj.n;

/* loaded from: classes3.dex */
public class CarouselLayoutManager extends l2 implements u2 {
    public int A;
    public int B;
    public final int C;

    /* renamed from: p, reason: collision with root package name */
    public int f32400p;

    /* renamed from: q, reason: collision with root package name */
    public int f32401q;

    /* renamed from: r, reason: collision with root package name */
    public int f32402r;

    /* renamed from: s, reason: collision with root package name */
    public final c f32403s;

    /* renamed from: t, reason: collision with root package name */
    public final g f32404t;

    /* renamed from: u, reason: collision with root package name */
    public k f32405u;

    /* renamed from: v, reason: collision with root package name */
    public j f32406v;

    /* renamed from: w, reason: collision with root package name */
    public int f32407w;

    /* renamed from: x, reason: collision with root package name */
    public HashMap f32408x;

    /* renamed from: y, reason: collision with root package name */
    public f f32409y;

    /* renamed from: z, reason: collision with root package name */
    public final b f32410z;

    /* JADX WARN: Type inference failed for: r2v0, types: [mj.b] */
    public CarouselLayoutManager() {
        n nVar = new n();
        this.f32403s = new c();
        this.f32407w = 0;
        final int i13 = 1;
        this.f32410z = new View.OnLayoutChangeListener() { // from class: mj.b
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i14, int i15, int i16, int i17, int i18, int i19, int i23, int i24) {
                int i25 = i13;
                CarouselLayoutManager carouselLayoutManager = this;
                carouselLayoutManager.getClass();
                switch (i25) {
                    case 0:
                        if (i14 != i18 || i15 != i19 || i16 != i23 || i17 != i24) {
                            view.post(new com.airbnb.lottie.k(carouselLayoutManager, 14));
                            break;
                        }
                    default:
                        if (i14 != i18 || i15 != i19 || i16 != i23 || i17 != i24) {
                            view.post(new com.airbnb.lottie.k(carouselLayoutManager, 14));
                            break;
                        }
                }
            }
        };
        this.B = -1;
        this.C = 0;
        this.f32404t = nVar;
        s1();
        u1(0);
    }

    public static float i1(float f13, bh.b bVar) {
        i iVar = (i) bVar.f22798b;
        float f14 = iVar.f87249d;
        i iVar2 = (i) bVar.f22799c;
        return a.b(f14, iVar2.f87249d, iVar.f87247b, iVar2.f87247b, f13);
    }

    public static bh.b l1(float f13, List list, boolean z13) {
        float f14 = Float.MAX_VALUE;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        float f15 = -3.4028235E38f;
        float f16 = Float.MAX_VALUE;
        float f17 = Float.MAX_VALUE;
        for (int i17 = 0; i17 < list.size(); i17++) {
            i iVar = (i) list.get(i17);
            float f18 = z13 ? iVar.f87247b : iVar.f87246a;
            float abs = Math.abs(f18 - f13);
            if (f18 <= f13 && abs <= f14) {
                i13 = i17;
                f14 = abs;
            }
            if (f18 > f13 && abs <= f16) {
                i15 = i17;
                f16 = abs;
            }
            if (f18 <= f17) {
                i14 = i17;
                f17 = f18;
            }
            if (f18 > f15) {
                i16 = i17;
                f15 = f18;
            }
        }
        if (i13 == -1) {
            i13 = i14;
        }
        if (i15 == -1) {
            i15 = i16;
        }
        return new bh.b((i) list.get(i13), (i) list.get(i15));
    }

    @Override // androidx.recyclerview.widget.l2
    public final RecyclerView.LayoutParams A() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.l2
    public final boolean I0(RecyclerView recyclerView, View view, Rect rect, boolean z13, boolean z14) {
        int k13;
        if (this.f32405u == null || (k13 = k1(l2.Z(view), h1(l2.Z(view)))) == 0) {
            return false;
        }
        int i13 = this.f32400p;
        int i14 = this.f32401q;
        int i15 = this.f32402r;
        int i16 = i13 + k13;
        if (i16 < i14) {
            k13 = i14 - i13;
        } else if (i16 > i15) {
            k13 = i15 - i13;
        }
        int k14 = k1(l2.Z(view), this.f32405u.b(i13 + k13, i14, i15));
        if (m1()) {
            recyclerView.scrollBy(k14, 0);
            return true;
        }
        recyclerView.scrollBy(0, k14);
        return true;
    }

    @Override // androidx.recyclerview.widget.l2
    public final void J(Rect rect, View view) {
        RecyclerView.y1(rect, view);
        float centerY = rect.centerY();
        if (m1()) {
            centerY = rect.centerX();
        }
        float i13 = i1(centerY, l1(centerY, this.f32406v.f87255b, true));
        float width = m1() ? (rect.width() - i13) / 2.0f : 0.0f;
        float height = m1() ? 0.0f : (rect.height() - i13) / 2.0f;
        rect.set((int) (rect.left + width), (int) (rect.top + height), (int) (rect.right - width), (int) (rect.bottom - height));
    }

    @Override // androidx.recyclerview.widget.l2
    public final int L0(int i13, q2 q2Var, w2 w2Var) {
        if (m1()) {
            return t1(i13, q2Var, w2Var);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.l2
    public final void M0(int i13) {
        this.B = i13;
        if (this.f32405u == null) {
            return;
        }
        this.f32400p = j1(i13, h1(i13));
        this.f32407w = com.bumptech.glide.c.q(i13, 0, Math.max(0, P() - 1));
        w1(this.f32405u);
        J0();
    }

    @Override // androidx.recyclerview.widget.l2
    public final int N0(int i13, q2 q2Var, w2 w2Var) {
        if (l()) {
            return t1(i13, q2Var, w2Var);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.l2
    public final void W0(RecyclerView recyclerView, w2 w2Var, int i13) {
        m1 m1Var = new m1(3, recyclerView.getContext(), this);
        m1Var.f19651a = i13;
        X0(m1Var);
    }

    public final void Z0(View view, int i13, n2 n2Var) {
        float f13 = this.f32406v.f87254a / 2.0f;
        g(view, i13, false);
        float f14 = n2Var.f75713b;
        this.f32409y.j(view, (int) (f14 - f13), (int) (f14 + f13));
        v1(view, n2Var.f75712a, (bh.b) n2Var.f75715d);
    }

    @Override // androidx.recyclerview.widget.u2
    public final PointF a(int i13) {
        if (this.f32405u == null) {
            return null;
        }
        int j13 = j1(i13, h1(i13)) - this.f32400p;
        return m1() ? new PointF(j13, 0.0f) : new PointF(0.0f, j13);
    }

    public final float a1(float f13, float f14) {
        return n1() ? f13 - f14 : f13 + f14;
    }

    public final void b1(int i13, q2 q2Var, w2 w2Var) {
        float e13 = e1(i13);
        while (i13 < w2Var.b()) {
            n2 q13 = q1(q2Var, e13, i13);
            float f13 = q13.f75713b;
            Object obj = q13.f75715d;
            if (o1(f13, (bh.b) obj)) {
                return;
            }
            e13 = a1(e13, this.f32406v.f87254a);
            if (!p1(q13.f75713b, (bh.b) obj)) {
                Z0((View) q13.f75714c, -1, q13);
            }
            i13++;
        }
    }

    public final void c1(int i13, q2 q2Var) {
        float e13 = e1(i13);
        while (i13 >= 0) {
            n2 q13 = q1(q2Var, e13, i13);
            float f13 = q13.f75713b;
            bh.b bVar = (bh.b) q13.f75715d;
            if (p1(f13, bVar)) {
                return;
            }
            float f14 = this.f32406v.f87254a;
            e13 = n1() ? e13 + f14 : e13 - f14;
            if (!o1(q13.f75713b, bVar)) {
                Z0((View) q13.f75714c, 0, q13);
            }
            i13--;
        }
    }

    @Override // androidx.recyclerview.widget.l2
    public final boolean d0() {
        return true;
    }

    public final float d1(View view, float f13, bh.b bVar) {
        i iVar = (i) bVar.f22798b;
        float f14 = iVar.f87247b;
        i iVar2 = (i) bVar.f22799c;
        float b13 = a.b(f14, iVar2.f87247b, iVar.f87246a, iVar2.f87246a, f13);
        if (((i) bVar.f22799c) != this.f32406v.b() && ((i) bVar.f22798b) != this.f32406v.d()) {
            return b13;
        }
        float b14 = this.f32409y.b((RecyclerView.LayoutParams) view.getLayoutParams()) / this.f32406v.f87254a;
        i iVar3 = (i) bVar.f22799c;
        return b13 + (((1.0f - iVar3.f87248c) + b14) * (f13 - iVar3.f87246a));
    }

    public final float e1(int i13) {
        return a1(this.f32409y.h() - this.f32400p, this.f32406v.f87254a * i13);
    }

    public final void f1(q2 q2Var, w2 w2Var) {
        while (E() > 0) {
            View D = D(0);
            Rect rect = new Rect();
            RecyclerView.y1(rect, D);
            float centerX = m1() ? rect.centerX() : rect.centerY();
            if (!p1(centerX, l1(centerX, this.f32406v.f87255b, true))) {
                break;
            } else {
                F0(D, q2Var);
            }
        }
        while (E() - 1 >= 0) {
            View D2 = D(E() - 1);
            Rect rect2 = new Rect();
            RecyclerView.y1(rect2, D2);
            float centerX2 = m1() ? rect2.centerX() : rect2.centerY();
            if (!o1(centerX2, l1(centerX2, this.f32406v.f87255b, true))) {
                break;
            } else {
                F0(D2, q2Var);
            }
        }
        if (E() == 0) {
            c1(this.f32407w - 1, q2Var);
            b1(this.f32407w, q2Var, w2Var);
        } else {
            int Z = l2.Z(D(0));
            int Z2 = l2.Z(D(E() - 1));
            c1(Z - 1, q2Var);
            b1(Z2 + 1, q2Var, w2Var);
        }
    }

    @Override // androidx.recyclerview.widget.l2
    public final void g0(View view) {
        if (!(view instanceof l)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        Rect rect = new Rect();
        j(rect, view);
        int i13 = rect.left + rect.right;
        int i14 = rect.top + rect.bottom;
        k kVar = this.f32405u;
        view.measure(l2.F(m1(), this.f19506n, this.f19504l, W() + V() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i13, (int) ((kVar == null || this.f32409y.f87234a != 0) ? ((ViewGroup.MarginLayoutParams) layoutParams).width : kVar.f87258a.f87254a)), l2.F(l(), this.f19507o, this.f19505m, T() + Y() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i14, (int) ((kVar == null || this.f32409y.f87234a != 1) ? ((ViewGroup.MarginLayoutParams) layoutParams).height : kVar.f87258a.f87254a)));
    }

    public final int g1() {
        return m1() ? this.f19506n : this.f19507o;
    }

    public final j h1(int i13) {
        j jVar;
        HashMap hashMap = this.f32408x;
        return (hashMap == null || (jVar = (j) hashMap.get(Integer.valueOf(com.bumptech.glide.c.q(i13, 0, Math.max(0, P() + (-1)))))) == null) ? this.f32405u.f87258a : jVar;
    }

    public final int j1(int i13, j jVar) {
        if (!n1()) {
            return (int) ((jVar.f87254a / 2.0f) + ((i13 * jVar.f87254a) - jVar.a().f87246a));
        }
        float g13 = g1() - jVar.c().f87246a;
        float f13 = jVar.f87254a;
        return (int) ((g13 - (i13 * f13)) - (f13 / 2.0f));
    }

    @Override // androidx.recyclerview.widget.l2
    public final boolean k() {
        return m1();
    }

    public final int k1(int i13, j jVar) {
        int i14 = Integer.MAX_VALUE;
        for (i iVar : jVar.f87255b.subList(jVar.f87256c, jVar.f87257d + 1)) {
            float f13 = jVar.f87254a;
            float f14 = (f13 / 2.0f) + (i13 * f13);
            int g13 = (n1() ? (int) ((g1() - iVar.f87246a) - f14) : (int) (f14 - iVar.f87246a)) - this.f32400p;
            if (Math.abs(i14) > Math.abs(g13)) {
                i14 = g13;
            }
        }
        return i14;
    }

    @Override // androidx.recyclerview.widget.l2
    public final boolean l() {
        return !m1();
    }

    @Override // androidx.recyclerview.widget.l2
    public final void l0(RecyclerView recyclerView) {
        g gVar = this.f32404t;
        Context context = recyclerView.getContext();
        float f13 = gVar.f87235a;
        if (f13 <= 0.0f) {
            f13 = context.getResources().getDimension(e.m3_carousel_small_item_size_min);
        }
        gVar.f87235a = f13;
        float f14 = gVar.f87236b;
        if (f14 <= 0.0f) {
            f14 = context.getResources().getDimension(e.m3_carousel_small_item_size_max);
        }
        gVar.f87236b = f14;
        s1();
        recyclerView.addOnLayoutChangeListener(this.f32410z);
    }

    @Override // androidx.recyclerview.widget.l2
    public final void m0(RecyclerView recyclerView, q2 q2Var) {
        recyclerView.removeOnLayoutChangeListener(this.f32410z);
    }

    public final boolean m1() {
        return this.f32409y.f87234a == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x003a, code lost:
    
        if (r9 == 1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0043, code lost:
    
        if (n1() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0046, code lost:
    
        if (r9 == 1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x004f, code lost:
    
        if (n1() != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    @Override // androidx.recyclerview.widget.l2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View n0(android.view.View r6, int r7, androidx.recyclerview.widget.q2 r8, androidx.recyclerview.widget.w2 r9) {
        /*
            r5 = this;
            int r9 = r5.E()
            r0 = 0
            if (r9 != 0) goto L8
            return r0
        L8:
            mj.f r9 = r5.f32409y
            int r9 = r9.f87234a
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            if (r7 == r3) goto L53
            r4 = 2
            if (r7 == r4) goto L51
            r4 = 17
            if (r7 == r4) goto L49
            r4 = 33
            if (r7 == r4) goto L46
            r4 = 66
            if (r7 == r4) goto L3d
            r4 = 130(0x82, float:1.82E-43)
            if (r7 == r4) goto L3a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r4 = "Unknown focus request:"
            r9.<init>(r4)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            java.lang.String r9 = "CarouselLayoutManager"
            android.util.Log.d(r9, r7)
        L38:
            r7 = r1
            goto L54
        L3a:
            if (r9 != r3) goto L38
            goto L51
        L3d:
            if (r9 != 0) goto L38
            boolean r7 = r5.n1()
            if (r7 == 0) goto L51
            goto L53
        L46:
            if (r9 != r3) goto L38
            goto L53
        L49:
            if (r9 != 0) goto L38
            boolean r7 = r5.n1()
            if (r7 == 0) goto L53
        L51:
            r7 = r3
            goto L54
        L53:
            r7 = r2
        L54:
            if (r7 != r1) goto L57
            return r0
        L57:
            r9 = 0
            if (r7 != r2) goto L93
            int r6 = androidx.recyclerview.widget.l2.Z(r6)
            if (r6 != 0) goto L61
            return r0
        L61:
            android.view.View r6 = r5.D(r9)
            int r6 = androidx.recyclerview.widget.l2.Z(r6)
            int r6 = r6 - r3
            if (r6 < 0) goto L82
            int r7 = r5.P()
            if (r6 < r7) goto L73
            goto L82
        L73:
            float r7 = r5.e1(r6)
            je.n2 r6 = r5.q1(r8, r7, r6)
            java.lang.Object r7 = r6.f75714c
            android.view.View r7 = (android.view.View) r7
            r5.Z0(r7, r9, r6)
        L82:
            boolean r6 = r5.n1()
            if (r6 == 0) goto L8e
            int r6 = r5.E()
            int r9 = r6 + (-1)
        L8e:
            android.view.View r6 = r5.D(r9)
            goto Ld6
        L93:
            int r6 = androidx.recyclerview.widget.l2.Z(r6)
            int r7 = r5.P()
            int r7 = r7 - r3
            if (r6 != r7) goto L9f
            return r0
        L9f:
            int r6 = r5.E()
            int r6 = r6 - r3
            android.view.View r6 = r5.D(r6)
            int r6 = androidx.recyclerview.widget.l2.Z(r6)
            int r6 = r6 + r3
            if (r6 < 0) goto Lc5
            int r7 = r5.P()
            if (r6 < r7) goto Lb6
            goto Lc5
        Lb6:
            float r7 = r5.e1(r6)
            je.n2 r6 = r5.q1(r8, r7, r6)
            java.lang.Object r7 = r6.f75714c
            android.view.View r7 = (android.view.View) r7
            r5.Z0(r7, r2, r6)
        Lc5:
            boolean r6 = r5.n1()
            if (r6 == 0) goto Lcc
            goto Ld2
        Lcc:
            int r6 = r5.E()
            int r9 = r6 + (-1)
        Ld2:
            android.view.View r6 = r5.D(r9)
        Ld6:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.n0(android.view.View, int, androidx.recyclerview.widget.q2, androidx.recyclerview.widget.w2):android.view.View");
    }

    public final boolean n1() {
        return m1() && Q() == 1;
    }

    @Override // androidx.recyclerview.widget.l2
    public final void o0(AccessibilityEvent accessibilityEvent) {
        super.o0(accessibilityEvent);
        if (E() > 0) {
            accessibilityEvent.setFromIndex(l2.Z(D(0)));
            accessibilityEvent.setToIndex(l2.Z(D(E() - 1)));
        }
    }

    public final boolean o1(float f13, bh.b bVar) {
        float i13 = i1(f13, bVar) / 2.0f;
        float f14 = n1() ? f13 + i13 : f13 - i13;
        if (n1()) {
            if (f14 >= 0.0f) {
                return false;
            }
        } else if (f14 <= g1()) {
            return false;
        }
        return true;
    }

    public final boolean p1(float f13, bh.b bVar) {
        float a13 = a1(f13, i1(f13, bVar) / 2.0f);
        if (n1()) {
            if (a13 <= g1()) {
                return false;
            }
        } else if (a13 >= 0.0f) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.l2
    public final int q(w2 w2Var) {
        if (E() == 0 || this.f32405u == null || P() <= 1) {
            return 0;
        }
        return (int) (this.f19506n * (this.f32405u.f87258a.f87254a / s(w2Var)));
    }

    public final n2 q1(q2 q2Var, float f13, int i13) {
        View f14 = q2Var.f(i13);
        g0(f14);
        float a13 = a1(f13, this.f32406v.f87254a / 2.0f);
        bh.b l13 = l1(a13, this.f32406v.f87255b, false);
        return new n2(f14, a13, d1(f14, a13, l13), l13);
    }

    @Override // androidx.recyclerview.widget.l2
    public final int r(w2 w2Var) {
        return this.f32400p;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public final void r1(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r32v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    @Override // androidx.recyclerview.widget.l2
    public final int s(w2 w2Var) {
        return this.f32402r - this.f32401q;
    }

    @Override // androidx.recyclerview.widget.l2
    public final void s0(RecyclerView recyclerView, int i13, int i14) {
        x1();
    }

    public final void s1() {
        this.f32405u = null;
        J0();
    }

    @Override // androidx.recyclerview.widget.l2
    public final int t(w2 w2Var) {
        if (E() == 0 || this.f32405u == null || P() <= 1) {
            return 0;
        }
        return (int) (this.f19507o * (this.f32405u.f87258a.f87254a / v(w2Var)));
    }

    public final int t1(int i13, q2 q2Var, w2 w2Var) {
        if (E() == 0 || i13 == 0) {
            return 0;
        }
        if (this.f32405u == null) {
            r1(q2Var);
        }
        int i14 = this.f32400p;
        int i15 = this.f32401q;
        int i16 = this.f32402r;
        int i17 = i14 + i13;
        if (i17 < i15) {
            i13 = i15 - i14;
        } else if (i17 > i16) {
            i13 = i16 - i14;
        }
        this.f32400p = i14 + i13;
        w1(this.f32405u);
        float f13 = this.f32406v.f87254a / 2.0f;
        float e13 = e1(l2.Z(D(0)));
        Rect rect = new Rect();
        float f14 = n1() ? this.f32406v.c().f87247b : this.f32406v.a().f87247b;
        float f15 = Float.MAX_VALUE;
        for (int i18 = 0; i18 < E(); i18++) {
            View D = D(i18);
            float a13 = a1(e13, f13);
            bh.b l13 = l1(a13, this.f32406v.f87255b, false);
            float d13 = d1(D, a13, l13);
            RecyclerView.y1(rect, D);
            v1(D, a13, l13);
            this.f32409y.l(f13, d13, rect, D);
            float abs = Math.abs(f14 - d13);
            if (abs < f15) {
                this.B = l2.Z(D);
                f15 = abs;
            }
            e13 = a1(e13, this.f32406v.f87254a);
        }
        f1(q2Var, w2Var);
        return i13;
    }

    @Override // androidx.recyclerview.widget.l2
    public final int u(w2 w2Var) {
        return this.f32400p;
    }

    public final void u1(int i13) {
        f eVar;
        if (i13 != 0 && i13 != 1) {
            throw new IllegalArgumentException(a.a.d("invalid orientation:", i13));
        }
        h(null);
        f fVar = this.f32409y;
        if (fVar == null || i13 != fVar.f87234a) {
            if (i13 == 0) {
                eVar = new mj.e(this);
            } else {
                if (i13 != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                eVar = new d(this);
            }
            this.f32409y = eVar;
            s1();
        }
    }

    @Override // androidx.recyclerview.widget.l2
    public final int v(w2 w2Var) {
        return this.f32402r - this.f32401q;
    }

    @Override // androidx.recyclerview.widget.l2
    public final void v0(RecyclerView recyclerView, int i13, int i14) {
        x1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v1(View view, float f13, bh.b bVar) {
        if (view instanceof l) {
            i iVar = (i) bVar.f22798b;
            float f14 = iVar.f87248c;
            i iVar2 = (i) bVar.f22799c;
            float b13 = a.b(f14, iVar2.f87248c, iVar.f87246a, iVar2.f87246a, f13);
            float height = view.getHeight();
            float width = view.getWidth();
            RectF c13 = this.f32409y.c(height, width, a.b(0.0f, height / 2.0f, 0.0f, 1.0f, b13), a.b(0.0f, width / 2.0f, 0.0f, 1.0f, b13));
            float d13 = d1(view, f13, bVar);
            RectF rectF = new RectF(d13 - (c13.width() / 2.0f), d13 - (c13.height() / 2.0f), (c13.width() / 2.0f) + d13, (c13.height() / 2.0f) + d13);
            RectF rectF2 = new RectF(this.f32409y.f(), this.f32409y.i(), this.f32409y.g(), this.f32409y.d());
            this.f32404t.getClass();
            this.f32409y.a(c13, rectF, rectF2);
            this.f32409y.k(c13, rectF, rectF2);
            MaskableFrameLayout maskableFrameLayout = (MaskableFrameLayout) ((l) view);
            RectF rectF3 = maskableFrameLayout.f32413b;
            rectF3.set(c13);
            b0 b0Var = maskableFrameLayout.f32414c;
            b0Var.f23024d = rectF3;
            b0Var.c();
            b0Var.a(maskableFrameLayout);
        }
    }

    public final void w1(k kVar) {
        int i13 = this.f32402r;
        int i14 = this.f32401q;
        if (i13 <= i14) {
            this.f32406v = n1() ? kVar.a() : kVar.c();
        } else {
            this.f32406v = kVar.b(this.f32400p, i14, i13);
        }
        List list = this.f32406v.f87255b;
        c cVar = this.f32403s;
        cVar.getClass();
        cVar.f87231b = Collections.unmodifiableList(list);
    }

    @Override // androidx.recyclerview.widget.l2
    public final void x0(q2 q2Var, w2 w2Var) {
        if (w2Var.b() <= 0 || g1() <= 0.0f) {
            D0(q2Var);
            this.f32407w = 0;
            return;
        }
        boolean n13 = n1();
        boolean z13 = this.f32405u == null;
        if (z13) {
            r1(q2Var);
        }
        k kVar = this.f32405u;
        boolean n14 = n1();
        j a13 = n14 ? kVar.a() : kVar.c();
        float f13 = (n14 ? a13.c() : a13.a()).f87246a;
        float f14 = a13.f87254a / 2.0f;
        int h10 = (int) (this.f32409y.h() - (n1() ? f13 + f14 : f13 - f14));
        k kVar2 = this.f32405u;
        boolean n15 = n1();
        j c13 = n15 ? kVar2.c() : kVar2.a();
        i a14 = n15 ? c13.a() : c13.c();
        int b13 = (int) (((((w2Var.b() - 1) * c13.f87254a) * (n15 ? -1.0f : 1.0f)) - (a14.f87246a - this.f32409y.h())) + (this.f32409y.e() - a14.f87246a) + (n15 ? -a14.f87252g : a14.f87253h));
        int min = n15 ? Math.min(0, b13) : Math.max(0, b13);
        this.f32401q = n13 ? min : h10;
        if (n13) {
            min = h10;
        }
        this.f32402r = min;
        if (z13) {
            this.f32400p = h10;
            k kVar3 = this.f32405u;
            int P = P();
            int i13 = this.f32401q;
            int i14 = this.f32402r;
            boolean n16 = n1();
            float f15 = kVar3.f87258a.f87254a;
            HashMap hashMap = new HashMap();
            int i15 = 0;
            int i16 = 0;
            while (true) {
                if (i15 >= P) {
                    break;
                }
                int i17 = n16 ? (P - i15) - 1 : i15;
                float f16 = i17 * f15 * (n16 ? -1 : 1);
                float f17 = i14 - kVar3.f87264g;
                List list = kVar3.f87260c;
                if (f16 > f17 || i15 >= P - list.size()) {
                    hashMap.put(Integer.valueOf(i17), (j) list.get(com.bumptech.glide.c.q(i16, 0, list.size() - 1)));
                    i16++;
                }
                i15++;
            }
            int i18 = 0;
            for (int i19 = P - 1; i19 >= 0; i19--) {
                int i23 = n16 ? (P - i19) - 1 : i19;
                float f18 = i23 * f15 * (n16 ? -1 : 1);
                float f19 = i13 + kVar3.f87263f;
                List list2 = kVar3.f87259b;
                if (f18 < f19 || i19 < list2.size()) {
                    hashMap.put(Integer.valueOf(i23), (j) list2.get(com.bumptech.glide.c.q(i18, 0, list2.size() - 1)));
                    i18++;
                }
            }
            this.f32408x = hashMap;
            int i24 = this.B;
            if (i24 != -1) {
                this.f32400p = j1(i24, h1(i24));
            }
        }
        int i25 = this.f32400p;
        int i26 = this.f32401q;
        int i27 = this.f32402r;
        this.f32400p = (i25 < i26 ? i26 - i25 : i25 > i27 ? i27 - i25 : 0) + i25;
        this.f32407w = com.bumptech.glide.c.q(this.f32407w, 0, w2Var.b());
        w1(this.f32405u);
        w(q2Var);
        f1(q2Var, w2Var);
        this.A = P();
    }

    public final void x1() {
        int P = P();
        int i13 = this.A;
        if (P == i13 || this.f32405u == null) {
            return;
        }
        n nVar = (n) this.f32404t;
        if ((i13 < nVar.f87268c && P() >= nVar.f87268c) || (i13 >= nVar.f87268c && P() < nVar.f87268c)) {
            s1();
        }
        this.A = P;
    }

    @Override // androidx.recyclerview.widget.l2
    public final void y0(w2 w2Var) {
        if (E() == 0) {
            this.f32407w = 0;
        } else {
            this.f32407w = l2.Z(D(0));
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [mj.b] */
    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i13, int i14) {
        this.f32403s = new c();
        final int i15 = 0;
        this.f32407w = 0;
        this.f32410z = new View.OnLayoutChangeListener() { // from class: mj.b
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i142, int i152, int i16, int i17, int i18, int i19, int i23, int i24) {
                int i25 = i15;
                CarouselLayoutManager carouselLayoutManager = this;
                carouselLayoutManager.getClass();
                switch (i25) {
                    case 0:
                        if (i142 != i18 || i152 != i19 || i16 != i23 || i17 != i24) {
                            view.post(new com.airbnb.lottie.k(carouselLayoutManager, 14));
                            break;
                        }
                    default:
                        if (i142 != i18 || i152 != i19 || i16 != i23 || i17 != i24) {
                            view.post(new com.airbnb.lottie.k(carouselLayoutManager, 14));
                            break;
                        }
                }
            }
        };
        this.B = -1;
        this.C = 0;
        this.f32404t = new n();
        s1();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.Carousel);
            this.C = obtainStyledAttributes.getInt(m.Carousel_carousel_alignment, 0);
            s1();
            u1(obtainStyledAttributes.getInt(m.RecyclerView_android_orientation, 0));
            obtainStyledAttributes.recycle();
        }
    }
}
