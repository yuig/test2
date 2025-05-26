package gk2;

import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class r0 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final ak2.f f65598c;

    /* renamed from: d, reason: collision with root package name */
    public final int f65599d;

    public r0(k1 k1Var, d51.a aVar, int i13) {
        super(k1Var);
        this.f65598c = aVar;
        this.f65599d = i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // uj2.h
    public final void m(xp2.b bVar) {
        uj2.h hVar = this.f65321b;
        boolean z13 = hVar instanceof Callable;
        ak2.f fVar = this.f65598c;
        if (!z13) {
            hVar.l(new q0(bVar, fVar, this.f65599d));
            return;
        }
        try {
            Object call = ((Callable) hVar).call();
            if (call == null) {
                ok2.d.complete(bVar);
                return;
            }
            try {
                h0.o(bVar, ((Iterable) fVar.apply(call)).iterator());
            } catch (Throwable th3) {
                bp1.h.H(th3);
                ok2.d.error(th3, bVar);
            }
        } catch (Throwable th4) {
            bp1.h.H(th4);
            ok2.d.error(th4, bVar);
        }
    }
}
