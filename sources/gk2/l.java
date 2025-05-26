package gk2;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public abstract class l extends AtomicLong implements uj2.i, xp2.c {

    /* renamed from: a, reason: collision with root package name */
    public final xp2.b f65490a;

    /* renamed from: b, reason: collision with root package name */
    public final bk2.a f65491b = new bk2.a();

    public l(xp2.b bVar) {
        this.f65490a = bVar;
    }

    @Override // uj2.i
    public boolean a(Throwable th3) {
        return d(th3);
    }

    public final void b() {
        bk2.a aVar = this.f65491b;
        if (aVar.isDisposed()) {
            return;
        }
        try {
            this.f65490a.a();
        } finally {
            aVar.dispose();
        }
    }

    @Override // xp2.c
    public final void cancel() {
        this.f65491b.dispose();
        g();
    }

    public final boolean d(Throwable th3) {
        if (th3 == null) {
            th3 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        bk2.a aVar = this.f65491b;
        if (aVar.isDisposed()) {
            return false;
        }
        try {
            this.f65490a.onError(th3);
            aVar.dispose();
            return true;
        } catch (Throwable th4) {
            aVar.dispose();
            throw th4;
        }
    }

    public final void e(Throwable th3) {
        if (a(th3)) {
            return;
        }
        lb.l0.R0(th3);
    }

    public void f() {
    }

    public void g() {
    }

    @Override // xp2.c
    public final void request(long j13) {
        if (ok2.g.validate(j13)) {
            d7.b.e(this, j13);
            f();
        }
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return a.a.l(getClass().getSimpleName(), "{", super.toString(), "}");
    }
}
