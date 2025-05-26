package c0;

import a.jg;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.c3;
import androidx.camera.core.impl.i2;
import androidx.camera.core.impl.j2;
import androidx.camera.core.impl.w1;
import androidx.camera.core.impl.y2;
import androidx.camera.core.impl.z2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class w0 extends s1 {

    /* renamed from: v, reason: collision with root package name */
    public static final u0 f24371v = new u0();

    /* renamed from: w, reason: collision with root package name */
    public static final f0.g f24372w = l3.c.H0();

    /* renamed from: o, reason: collision with root package name */
    public v0 f24373o;

    /* renamed from: p, reason: collision with root package name */
    public Executor f24374p;

    /* renamed from: q, reason: collision with root package name */
    public i2 f24375q;

    /* renamed from: r, reason: collision with root package name */
    public k1 f24376r;

    /* renamed from: s, reason: collision with root package name */
    public l0.s f24377s;

    /* renamed from: t, reason: collision with root package name */
    public p1 f24378t;

    /* renamed from: u, reason: collision with root package name */
    public j2 f24379u;

    public final void B() {
        j2 j2Var = this.f24379u;
        if (j2Var != null) {
            j2Var.b();
            this.f24379u = null;
        }
        k1 k1Var = this.f24376r;
        if (k1Var != null) {
            k1Var.a();
            this.f24376r = null;
        }
        l0.s sVar = this.f24377s;
        if (sVar != null) {
            sVar.c();
            this.f24377s = null;
        }
        this.f24378t = null;
    }

    public final void C(v0 v0Var) {
        f0.h.s();
        if (v0Var == null) {
            this.f24373o = null;
            this.f24336c = q1.INACTIVE;
            p();
            return;
        }
        this.f24373o = v0Var;
        this.f24374p = f24372w;
        androidx.camera.core.impl.k kVar = this.f24340g;
        if ((kVar != null ? kVar.f16893a : null) != null) {
            D((w1) this.f24339f, kVar);
            o();
        }
        n();
    }

    public final void D(w1 w1Var, androidx.camera.core.impl.k kVar) {
        Rect rect;
        f0.h.s();
        androidx.camera.core.impl.j0 c13 = c();
        Objects.requireNonNull(c13);
        B();
        int i13 = 0;
        com.bumptech.glide.d.v(null, this.f24377s == null);
        Matrix matrix = this.f24343j;
        boolean m13 = c13.m();
        Size size = kVar.f16893a;
        Rect rect2 = this.f24342i;
        if (rect2 != null) {
            rect = rect2;
        } else {
            rect = size != null ? new Rect(0, 0, size.getWidth(), size.getHeight()) : null;
        }
        Objects.requireNonNull(rect);
        l0.s sVar = new l0.s(1, 34, kVar, matrix, m13, rect, h(c13, l(c13)), b(), c13.m() && l(c13));
        this.f24377s = sVar;
        sVar.a(new Runnable() { // from class: c0.t0
            @Override // java.lang.Runnable
            public final void run() {
                w0.this.o();
            }
        });
        p1 d2 = this.f24377s.d(c13, true);
        this.f24378t = d2;
        this.f24376r = d2.f24310l;
        if (this.f24373o != null) {
            androidx.camera.core.impl.j0 c14 = c();
            l0.s sVar2 = this.f24377s;
            if (c14 != null && sVar2 != null) {
                f0.h.m0(new l0.p(sVar2, h(c14, l(c14)), b(), i13));
            }
            v0 v0Var = this.f24373o;
            v0Var.getClass();
            p1 p1Var = this.f24378t;
            p1Var.getClass();
            this.f24374p.execute(new jg(15, v0Var, p1Var));
        }
        i2 d13 = i2.d(kVar.f16893a, w1Var);
        v.c1 c1Var = d13.f16863b;
        c1Var.getClass();
        ((androidx.camera.core.impl.q1) ((androidx.camera.core.impl.p1) c1Var.f123388e)).s(androidx.camera.core.impl.s0.f16966k, kVar.f16895c);
        int r13 = w1Var.r();
        if (r13 != 0) {
            c1Var.getClass();
            if (r13 != 0) {
                ((androidx.camera.core.impl.q1) ((androidx.camera.core.impl.p1) c1Var.f123388e)).s(z2.f17025wn, Integer.valueOf(r13));
            }
        }
        androidx.camera.core.impl.v0 v0Var2 = kVar.f16896d;
        if (v0Var2 != null) {
            c1Var.c(v0Var2);
        }
        if (this.f24373o != null) {
            d13.b(this.f24376r, kVar.f16894b, ((Integer) ((androidx.camera.core.impl.j1) this.f24339f).j(androidx.camera.core.impl.j1.f16883fn, -1)).intValue());
        }
        j2 j2Var = this.f24379u;
        if (j2Var != null) {
            j2Var.b();
        }
        j2 j2Var2 = new j2(new v.i2(this, 2));
        this.f24379u = j2Var2;
        d13.f16867f = j2Var2;
        this.f24375q = d13;
        Object[] objArr = {d13.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        A(Collections.unmodifiableList(arrayList));
    }

    @Override // c0.s1
    public final z2 f(boolean z13, c3 c3Var) {
        f24371v.getClass();
        w1 w1Var = u0.f24356a;
        androidx.camera.core.impl.v0 a13 = c3Var.a(w1Var.A(), 1);
        if (z13) {
            a13 = androidx.camera.core.impl.v0.B(a13, w1Var);
        }
        if (a13 == null) {
            return null;
        }
        return k(a13).e();
    }

    @Override // c0.s1
    public final HashSet j() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // c0.s1
    public final u.a k(androidx.camera.core.impl.v0 v0Var) {
        return new u.a(androidx.camera.core.impl.q1.k(v0Var), 4);
    }

    @Override // c0.s1
    public final z2 s(androidx.camera.core.impl.h0 h0Var, y2 y2Var) {
        u.a aVar = (u.a) y2Var;
        aVar.f119717b.s(androidx.camera.core.impl.i1.f16872an, 34);
        return aVar.e();
    }

    public final String toString() {
        return "Preview:".concat(g());
    }

    @Override // c0.s1
    public final androidx.camera.core.impl.k v(androidx.camera.core.impl.v0 v0Var) {
        this.f24375q.f16863b.c(v0Var);
        Object[] objArr = {this.f24375q.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        A(Collections.unmodifiableList(arrayList));
        androidx.camera.core.impl.j a13 = this.f24340g.a();
        a13.f16878e = v0Var;
        return a13.b();
    }

    @Override // c0.s1
    public final androidx.camera.core.impl.k w(androidx.camera.core.impl.k kVar, androidx.camera.core.impl.k kVar2) {
        D((w1) this.f24339f, kVar);
        return kVar;
    }

    @Override // c0.s1
    public final void x() {
        B();
    }

    @Override // c0.s1
    public final void y(Rect rect) {
        this.f24342i = rect;
        androidx.camera.core.impl.j0 c13 = c();
        l0.s sVar = this.f24377s;
        if (c13 == null || sVar == null) {
            return;
        }
        f0.h.m0(new l0.p(sVar, h(c13, l(c13)), b(), 0));
    }
}
