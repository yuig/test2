package l7;

import android.view.Surface;

/* loaded from: classes3.dex */
public abstract class u0 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f81881a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f81882b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public y0 f81883c;

    public u0(z0 z0Var) {
        this.f81881a = z0Var;
    }

    public void a() {
    }

    public void b() {
        synchronized (this.f81882b) {
            try {
                y0 y0Var = this.f81883c;
                if (y0Var != null) {
                    this.f81881a.f(y0Var);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public Surface c() {
        throw new UnsupportedOperationException();
    }

    public abstract int d();

    public void e(a7.s sVar) {
        throw new UnsupportedOperationException();
    }

    public abstract void f();

    public void g() {
    }

    public void h(a7.s sVar, boolean z13) {
    }

    public abstract void i(m mVar);

    public abstract void j();

    @Override // l7.g0
    public final void n() {
        this.f81881a.e(new p(this, 5), true);
    }
}
