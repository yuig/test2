package ao2;

import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes2.dex */
public final class q2 extends ho2.u implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final long f20195e;

    public q2(long j13, bl2.c cVar) {
        super(cVar, cVar.getContext());
        this.f20195e = j13;
    }

    @Override // ao2.a, ao2.a2
    public final String S() {
        return super.S() + "(timeMillis=" + this.f20195e + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        lb.l0.s0(this.f20108c);
        w(new TimeoutCancellationException("Timed out waiting for " + this.f20195e + " ms", this));
    }
}
