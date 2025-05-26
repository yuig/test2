package mk2;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class n extends uj2.z implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final m f87401b;

    /* renamed from: c, reason: collision with root package name */
    public final o f87402c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f87403d = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    public final xj2.b f87400a = new xj2.b();

    public n(m mVar) {
        o oVar;
        o oVar2;
        this.f87401b = mVar;
        if (mVar.f87396c.f135163b) {
            oVar2 = p.f87409h;
        } else {
            while (true) {
                if (mVar.f87395b.isEmpty()) {
                    oVar = new o(mVar.f87399f);
                    mVar.f87396c.a(oVar);
                    break;
                } else {
                    oVar = (o) mVar.f87395b.poll();
                    if (oVar != null) {
                        break;
                    }
                }
            }
            oVar2 = oVar;
        }
        this.f87402c = oVar2;
    }

    @Override // uj2.z
    public final xj2.c c(Runnable runnable, long j13, TimeUnit timeUnit) {
        return this.f87400a.f135163b ? bk2.d.INSTANCE : this.f87402c.e(runnable, j13, timeUnit, this.f87400a);
    }

    @Override // xj2.c
    public final void dispose() {
        if (this.f87403d.compareAndSet(false, true)) {
            this.f87400a.dispose();
            if (p.f87410i) {
                this.f87402c.e(this, 0L, TimeUnit.NANOSECONDS, null);
                return;
            }
            m mVar = this.f87401b;
            mVar.getClass();
            long nanoTime = System.nanoTime() + mVar.f87394a;
            o oVar = this.f87402c;
            oVar.f87404c = nanoTime;
            mVar.f87395b.offer(oVar);
        }
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f87403d.get();
    }

    @Override // java.lang.Runnable
    public final void run() {
        m mVar = this.f87401b;
        mVar.getClass();
        long nanoTime = System.nanoTime() + mVar.f87394a;
        o oVar = this.f87402c;
        oVar.f87404c = nanoTime;
        mVar.f87395b.offer(oVar);
    }
}
