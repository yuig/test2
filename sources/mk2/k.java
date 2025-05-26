package mk2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import lb.l0;
import oi.o6;

/* loaded from: classes2.dex */
public final class k extends uj2.a0 {

    /* renamed from: d, reason: collision with root package name */
    public static final uj2.a0 f87386d = tk2.e.f118015a;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f87387c;

    public k(Executor executor) {
        this.f87387c = executor;
    }

    @Override // uj2.a0
    public final uj2.z a() {
        return new j(this.f87387c);
    }

    @Override // uj2.a0
    public final xj2.c b(Runnable runnable) {
        Executor executor = this.f87387c;
        ck2.i.b(runnable, "run is null");
        try {
            if (executor instanceof ExecutorService) {
                v vVar = new v(runnable);
                vVar.a(((ExecutorService) executor).submit(vVar));
                return vVar;
            }
            h hVar = new h(runnable);
            executor.execute(hVar);
            return hVar;
        } catch (RejectedExecutionException e13) {
            l0.R0(e13);
            return bk2.d.INSTANCE;
        }
    }

    @Override // uj2.a0
    public final xj2.c c(Runnable runnable, long j13, TimeUnit timeUnit) {
        ck2.i.b(runnable, "run is null");
        Executor executor = this.f87387c;
        if (executor instanceof ScheduledExecutorService) {
            try {
                v vVar = new v(runnable);
                vVar.a(((ScheduledExecutorService) executor).schedule(vVar, j13, timeUnit));
                return vVar;
            } catch (RejectedExecutionException e13) {
                l0.R0(e13);
                return bk2.d.INSTANCE;
            }
        }
        g gVar = new g(runnable);
        xj2.c c13 = f87386d.c(new o6(20, this, gVar), j13, timeUnit);
        bk2.a aVar = gVar.f87374a;
        aVar.getClass();
        bk2.c.replace(aVar, c13);
        return gVar;
    }

    @Override // uj2.a0
    public final xj2.c d(Runnable runnable, long j13, long j14, TimeUnit timeUnit) {
        Executor executor = this.f87387c;
        if (!(executor instanceof ScheduledExecutorService)) {
            return super.d(runnable, j13, j14, timeUnit);
        }
        try {
            u uVar = new u(runnable);
            uVar.a(((ScheduledExecutorService) executor).scheduleAtFixedRate(uVar, j13, j14, timeUnit));
            return uVar;
        } catch (RejectedExecutionException e13) {
            l0.R0(e13);
            return bk2.d.INSTANCE;
        }
    }
}
