package fk2;

import io.reactivex.exceptions.CompositeException;
import lb.l0;

/* loaded from: classes2.dex */
public final class w implements uj2.d, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.d f62480a;

    /* renamed from: b, reason: collision with root package name */
    public xj2.c f62481b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f62482c;

    public w(x xVar, uj2.d dVar) {
        this.f62482c = xVar;
        this.f62480a = dVar;
    }

    @Override // uj2.d
    public final void a() {
        uj2.d dVar = this.f62480a;
        x xVar = this.f62482c;
        if (this.f62481b == bk2.c.DISPOSED) {
            return;
        }
        try {
            xVar.f62486d.run();
            xVar.f62487e.run();
            dVar.a();
            try {
                xVar.f62488f.run();
            } catch (Throwable th3) {
                bp1.h.H(th3);
                l0.R0(th3);
            }
        } catch (Throwable th4) {
            bp1.h.H(th4);
            dVar.onError(th4);
        }
    }

    @Override // uj2.d
    public final void b(xj2.c cVar) {
        uj2.d dVar = this.f62480a;
        try {
            this.f62482c.f62484b.accept(cVar);
            if (bk2.c.validate(this.f62481b, cVar)) {
                this.f62481b = cVar;
                dVar.b(this);
            }
        } catch (Throwable th3) {
            bp1.h.H(th3);
            cVar.dispose();
            this.f62481b = bk2.c.DISPOSED;
            bk2.d.error(th3, dVar);
        }
    }

    @Override // xj2.c
    public final void dispose() {
        try {
            this.f62482c.f62489g.run();
        } catch (Throwable th3) {
            bp1.h.H(th3);
            l0.R0(th3);
        }
        this.f62481b.dispose();
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f62481b.isDisposed();
    }

    @Override // uj2.d
    public final void onError(Throwable th3) {
        x xVar = this.f62482c;
        if (this.f62481b == bk2.c.DISPOSED) {
            l0.R0(th3);
            return;
        }
        try {
            xVar.f62485c.accept(th3);
            xVar.f62487e.run();
        } catch (Throwable th4) {
            bp1.h.H(th4);
            th3 = new CompositeException(th3, th4);
        }
        this.f62480a.onError(th3);
        try {
            xVar.f62488f.run();
        } catch (Throwable th5) {
            bp1.h.H(th5);
            l0.R0(th5);
        }
    }
}
