package l0;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import androidx.camera.core.impl.j0;
import c0.g1;
import c0.k1;
import c0.o1;
import c0.p1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import v.p2;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f81267a;

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f81268b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f81269c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f81270d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f81271e;

    /* renamed from: f, reason: collision with root package name */
    public final int f81272f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.camera.core.impl.k f81273g;

    /* renamed from: h, reason: collision with root package name */
    public int f81274h;

    /* renamed from: i, reason: collision with root package name */
    public int f81275i;

    /* renamed from: k, reason: collision with root package name */
    public p1 f81277k;

    /* renamed from: l, reason: collision with root package name */
    public r f81278l;

    /* renamed from: j, reason: collision with root package name */
    public boolean f81276j = false;

    /* renamed from: m, reason: collision with root package name */
    public final HashSet f81279m = new HashSet();

    /* renamed from: n, reason: collision with root package name */
    public boolean f81280n = false;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f81281o = new ArrayList();

    public s(int i13, int i14, androidx.camera.core.impl.k kVar, Matrix matrix, boolean z13, Rect rect, int i15, int i16, boolean z14) {
        this.f81272f = i13;
        this.f81267a = i14;
        this.f81273g = kVar;
        this.f81268b = matrix;
        this.f81269c = z13;
        this.f81270d = rect;
        this.f81275i = i15;
        this.f81274h = i16;
        this.f81271e = z14;
        this.f81278l = new r(i14, kVar.f16893a);
    }

    public final void a(Runnable runnable) {
        f0.h.s();
        b();
        this.f81279m.add(runnable);
    }

    public final void b() {
        com.bumptech.glide.d.v("Edge is already closed.", !this.f81280n);
    }

    public final void c() {
        f0.h.s();
        this.f81278l.a();
        this.f81280n = true;
    }

    public final p1 d(j0 j0Var, boolean z13) {
        f0.h.s();
        b();
        androidx.camera.core.impl.k kVar = this.f81273g;
        int i13 = 0;
        p1 p1Var = new p1(kVar.f16893a, j0Var, z13, kVar.f16894b, kVar.f16895c, new n(this, i13));
        try {
            k1 k1Var = p1Var.f24310l;
            r rVar = this.f81278l;
            Objects.requireNonNull(rVar);
            if (rVar.g(k1Var, new o(rVar, i13))) {
                g0.m.f(rVar.f17009e).d(new p2(k1Var, 1), l3.c.s());
            }
            this.f81277k = p1Var;
            f();
            return p1Var;
        } catch (DeferrableSurface$SurfaceClosedException e13) {
            throw new AssertionError("Surface is somehow already closed", e13);
        } catch (RuntimeException e14) {
            p1Var.d();
            throw e14;
        }
    }

    public final void e() {
        boolean z13;
        f0.h.s();
        b();
        r rVar = this.f81278l;
        rVar.getClass();
        f0.h.s();
        if (rVar.f81265q == null) {
            synchronized (rVar.f17005a) {
                z13 = rVar.f17007c;
            }
            if (!z13) {
                return;
            }
        }
        this.f81276j = false;
        this.f81278l.a();
        this.f81278l = new r(this.f81267a, this.f81273g.f16893a);
        Iterator it = this.f81279m.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void f() {
        o1 o1Var;
        Executor executor;
        f0.h.s();
        c0.k kVar = new c0.k(this.f81270d, this.f81275i, this.f81274h, this.f81269c, this.f81268b, this.f81271e);
        p1 p1Var = this.f81277k;
        if (p1Var != null) {
            synchronized (p1Var.f24299a) {
                p1Var.f24311m = kVar;
                o1Var = p1Var.f24312n;
                executor = p1Var.f24313o;
            }
            if (o1Var != null && executor != null) {
                executor.execute(new g1(o1Var, kVar, 0));
            }
        }
        Iterator it = this.f81281o.iterator();
        while (it.hasNext()) {
            ((p5.a) it.next()).accept(kVar);
        }
    }
}
