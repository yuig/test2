package ao2;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class t0 extends ko2.j {

    /* renamed from: c, reason: collision with root package name */
    public int f20207c;

    public t0(int i13) {
        super(0L, false);
        this.f20207c = i13;
    }

    public void b(CancellationException cancellationException) {
    }

    public abstract bl2.c c();

    public Throwable d(Object obj) {
        z zVar = obj instanceof z ? (z) obj : null;
        if (zVar != null) {
            return zVar.f20242a;
        }
        return null;
    }

    public Object g(Object obj) {
        return obj;
    }

    public final void k(Throwable th3) {
        kh2.j1.l0(c().getContext(), new ul2.u1("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th3));
    }

    public abstract Object l();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            bl2.c c13 = c();
            Intrinsics.g(c13, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            ho2.e eVar = (ho2.e) c13;
            bl2.c cVar = eVar.f69755e;
            Object obj = eVar.f69757g;
            CoroutineContext context = cVar.getContext();
            Object c14 = ho2.y.c(context, obj);
            o1 o1Var = null;
            t2 d2 = c14 != ho2.y.f69792a ? d0.d(cVar, context, c14) : null;
            try {
                CoroutineContext context2 = cVar.getContext();
                Object l13 = l();
                Throwable d13 = d(l13);
                if (d13 == null && com.bumptech.glide.c.p0(this.f20207c)) {
                    o1Var = (o1) context2.get(g0.f20154b);
                }
                if (o1Var != null && !o1Var.isActive()) {
                    CancellationException cancellationException = o1Var.getCancellationException();
                    b(cancellationException);
                    xk2.q qVar = xk2.s.f135225b;
                    cVar.resumeWith(ue.c.m(cancellationException));
                } else if (d13 != null) {
                    xk2.q qVar2 = xk2.s.f135225b;
                    cVar.resumeWith(ue.c.m(d13));
                } else {
                    xk2.q qVar3 = xk2.s.f135225b;
                    cVar.resumeWith(g(l13));
                }
                Unit unit = Unit.f80348a;
                if (d2 == null || d2.g0()) {
                    ho2.y.a(context, c14);
                }
            } catch (Throwable th3) {
                if (d2 == null || d2.g0()) {
                    ho2.y.a(context, c14);
                }
                throw th3;
            }
        } catch (Throwable th4) {
            k(th4);
        }
    }
}
