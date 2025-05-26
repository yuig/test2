package ao2;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CompletionHandlerException;

/* loaded from: classes2.dex */
public abstract class a extends a2 implements bl2.c, j0 {

    /* renamed from: c, reason: collision with root package name */
    public final CoroutineContext f20108c;

    public a(CoroutineContext coroutineContext, boolean z13, boolean z14) {
        super(z14);
        if (z13) {
            N((o1) coroutineContext.get(g0.f20154b));
        }
        this.f20108c = coroutineContext.plus(this);
    }

    @Override // ao2.a2
    public final String A() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // ao2.a2
    public final void M(CompletionHandlerException completionHandlerException) {
        kh2.j1.l0(this.f20108c, completionHandlerException);
    }

    @Override // ao2.a2
    public String S() {
        return super.S();
    }

    @Override // ao2.a2
    public final void V(Object obj) {
        if (!(obj instanceof z)) {
            f0(obj);
            return;
        }
        z zVar = (z) obj;
        Throwable th3 = zVar.f20242a;
        zVar.getClass();
        e0(z.f20241b.get(zVar) != 0, th3);
    }

    public void e0(boolean z13, Throwable th3) {
    }

    public void f0(Object obj) {
    }

    @Override // bl2.c
    public final CoroutineContext getContext() {
        return this.f20108c;
    }

    @Override // ao2.j0
    public final CoroutineContext getCoroutineContext() {
        return this.f20108c;
    }

    @Override // ao2.a2, ao2.o1
    public boolean isActive() {
        return super.isActive();
    }

    @Override // bl2.c
    public final void resumeWith(Object obj) {
        Throwable a13 = xk2.s.a(obj);
        if (a13 != null) {
            obj = new z(false, a13);
        }
        Object R = R(obj);
        if (R == b2.f20117b) {
            return;
        }
        u(R);
    }
}
