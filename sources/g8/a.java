package g8;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f64172a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f64173b = new HashSet(1);

    /* renamed from: c, reason: collision with root package name */
    public final h0 f64174c = new h0(new CopyOnWriteArrayList(), 0, null);

    /* renamed from: d, reason: collision with root package name */
    public final s7.m f64175d = new s7.m(new CopyOnWriteArrayList(), 0, null);

    /* renamed from: e, reason: collision with root package name */
    public Looper f64176e;

    /* renamed from: f, reason: collision with root package name */
    public a7.b1 f64177f;

    /* renamed from: g, reason: collision with root package name */
    public n7.q0 f64178g;

    public final h0 a(e0 e0Var) {
        return new h0(this.f64174c.f64278c, 0, e0Var);
    }

    public abstract c0 b(e0 e0Var, l8.m mVar, long j13);

    public final void c(f0 f0Var) {
        HashSet hashSet = this.f64173b;
        boolean z13 = !hashSet.isEmpty();
        hashSet.remove(f0Var);
        if (z13 && hashSet.isEmpty()) {
            f();
        }
    }

    public void f() {
    }

    public final void g(f0 f0Var) {
        this.f64176e.getClass();
        HashSet hashSet = this.f64173b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(f0Var);
        if (isEmpty) {
            h();
        }
    }

    public void h() {
    }

    public /* bridge */ /* synthetic */ a7.b1 i() {
        return null;
    }

    public abstract a7.i0 j();

    public /* bridge */ /* synthetic */ boolean k() {
        return true;
    }

    public abstract void l();

    public final void m(f0 f0Var, g7.a0 a0Var, n7.q0 q0Var) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f64176e;
        bf.b.i(looper == null || looper == myLooper);
        this.f64178g = q0Var;
        a7.b1 b1Var = this.f64177f;
        this.f64172a.add(f0Var);
        if (this.f64176e == null) {
            this.f64176e = myLooper;
            this.f64173b.add(f0Var);
            n(a0Var);
        } else if (b1Var != null) {
            g(f0Var);
            f0Var.a(this, b1Var);
        }
    }

    public abstract void n(g7.a0 a0Var);

    public final void o(a7.b1 b1Var) {
        this.f64177f = b1Var;
        Iterator it = this.f64172a.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).a(this, b1Var);
        }
    }

    public abstract void q(c0 c0Var);

    public final void r(f0 f0Var) {
        ArrayList arrayList = this.f64172a;
        arrayList.remove(f0Var);
        if (!arrayList.isEmpty()) {
            c(f0Var);
            return;
        }
        this.f64176e = null;
        this.f64177f = null;
        this.f64178g = null;
        this.f64173b.clear();
        t();
    }

    public abstract void t();

    public final void u(s7.n nVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f64175d.f111329c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            s7.l lVar = (s7.l) it.next();
            if (lVar.f111326b == nVar) {
                copyOnWriteArrayList.remove(lVar);
            }
        }
    }

    public final void v(i0 i0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f64174c.f64278c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            g0 g0Var = (g0) it.next();
            if (g0Var.f64268b == i0Var) {
                copyOnWriteArrayList.remove(g0Var);
            }
        }
    }

    public /* bridge */ /* synthetic */ void w(a7.i0 i0Var) {
    }
}
