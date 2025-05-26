package c0;

import android.view.Surface;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class c1 implements androidx.camera.core.impl.l1 {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.camera.core.impl.l1 f24211d;

    /* renamed from: e, reason: collision with root package name */
    public final Surface f24212e;

    /* renamed from: f, reason: collision with root package name */
    public a0 f24213f;

    /* renamed from: a, reason: collision with root package name */
    public final Object f24208a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public int f24209b = 0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24210c = false;

    /* renamed from: g, reason: collision with root package name */
    public final b1 f24214g = new a0() { // from class: c0.b1
        @Override // c0.a0
        public final void a(n0 n0Var) {
            a0 a0Var;
            c1 c1Var = c1.this;
            synchronized (c1Var.f24208a) {
                try {
                    int i13 = c1Var.f24209b - 1;
                    c1Var.f24209b = i13;
                    if (c1Var.f24210c && i13 == 0) {
                        c1Var.close();
                    }
                    a0Var = c1Var.f24213f;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (a0Var != null) {
                a0Var.a(n0Var);
            }
        }
    };

    /* JADX WARN: Type inference failed for: r0v2, types: [c0.b1] */
    public c1(androidx.camera.core.impl.l1 l1Var) {
        this.f24211d = l1Var;
        this.f24212e = l1Var.z();
    }

    @Override // androidx.camera.core.impl.l1
    public final n0 F() {
        e1 e1Var;
        synchronized (this.f24208a) {
            n0 F = this.f24211d.F();
            if (F != null) {
                this.f24209b++;
                e1Var = new e1(F);
                e1Var.a(this.f24214g);
            } else {
                e1Var = null;
            }
        }
        return e1Var;
    }

    public final void a() {
        synchronized (this.f24208a) {
            try {
                this.f24210c = true;
                this.f24211d.o();
                if (this.f24209b == 0) {
                    close();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.camera.core.impl.l1
    public final void close() {
        synchronized (this.f24208a) {
            try {
                Surface surface = this.f24212e;
                if (surface != null) {
                    surface.release();
                }
                this.f24211d.close();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.camera.core.impl.l1
    public final int i() {
        int i13;
        synchronized (this.f24208a) {
            i13 = this.f24211d.i();
        }
        return i13;
    }

    @Override // androidx.camera.core.impl.l1
    public final int j() {
        int j13;
        synchronized (this.f24208a) {
            j13 = this.f24211d.j();
        }
        return j13;
    }

    @Override // androidx.camera.core.impl.l1
    public final n0 l() {
        e1 e1Var;
        synchronized (this.f24208a) {
            n0 l13 = this.f24211d.l();
            if (l13 != null) {
                this.f24209b++;
                e1Var = new e1(l13);
                e1Var.a(this.f24214g);
            } else {
                e1Var = null;
            }
        }
        return e1Var;
    }

    @Override // androidx.camera.core.impl.l1
    public final int m() {
        int m13;
        synchronized (this.f24208a) {
            m13 = this.f24211d.m();
        }
        return m13;
    }

    @Override // androidx.camera.core.impl.l1
    public final void o() {
        synchronized (this.f24208a) {
            this.f24211d.o();
        }
    }

    @Override // androidx.camera.core.impl.l1
    public final int s() {
        int s13;
        synchronized (this.f24208a) {
            s13 = this.f24211d.s();
        }
        return s13;
    }

    @Override // androidx.camera.core.impl.l1
    public final void v(androidx.camera.core.impl.k1 k1Var, Executor executor) {
        synchronized (this.f24208a) {
            this.f24211d.v(new a1(this, k1Var, 0), executor);
        }
    }

    @Override // androidx.camera.core.impl.l1
    public final Surface z() {
        Surface z13;
        synchronized (this.f24208a) {
            z13 = this.f24211d.z();
        }
        return z13;
    }
}
