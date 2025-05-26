package mk2;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import lb.l0;

/* loaded from: classes2.dex */
public final class j extends uj2.z implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final Executor f87381b;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f87383d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicInteger f87384e = new AtomicInteger();

    /* renamed from: f, reason: collision with root package name */
    public final xj2.b f87385f = new xj2.b();

    /* renamed from: c, reason: collision with root package name */
    public final tb.e f87382c = new tb.e(15);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f87380a = false;

    public j(Executor executor) {
        this.f87381b = executor;
    }

    @Override // uj2.z
    public final xj2.c b(Runnable runnable) {
        xj2.c hVar;
        if (this.f87383d) {
            return bk2.d.INSTANCE;
        }
        ck2.i.b(runnable, "run is null");
        if (this.f87380a) {
            hVar = new i(runnable, this.f87385f);
            this.f87385f.a(hVar);
        } else {
            hVar = new h(runnable);
        }
        this.f87382c.offer(hVar);
        if (this.f87384e.getAndIncrement() == 0) {
            try {
                this.f87381b.execute(this);
            } catch (RejectedExecutionException e13) {
                this.f87383d = true;
                this.f87382c.clear();
                l0.R0(e13);
                return bk2.d.INSTANCE;
            }
        }
        return hVar;
    }

    @Override // uj2.z
    public final xj2.c c(Runnable runnable, long j13, TimeUnit timeUnit) {
        if (j13 <= 0) {
            return b(runnable);
        }
        if (this.f87383d) {
            return bk2.d.INSTANCE;
        }
        bk2.a aVar = new bk2.a();
        bk2.a aVar2 = new bk2.a(aVar);
        ck2.i.b(runnable, "run is null");
        w wVar = new w(new s.f(this, aVar2, runnable, 27), this.f87385f);
        this.f87385f.a(wVar);
        Executor executor = this.f87381b;
        if (executor instanceof ScheduledExecutorService) {
            try {
                wVar.a(((ScheduledExecutorService) executor).schedule((Callable) wVar, j13, timeUnit));
            } catch (RejectedExecutionException e13) {
                this.f87383d = true;
                l0.R0(e13);
                return bk2.d.INSTANCE;
            }
        } else {
            wVar.a(new f(k.f87386d.c(wVar, j13, timeUnit)));
        }
        bk2.c.replace(aVar, wVar);
        return aVar2;
    }

    @Override // xj2.c
    public final void dispose() {
        if (this.f87383d) {
            return;
        }
        this.f87383d = true;
        this.f87385f.dispose();
        if (this.f87384e.getAndIncrement() == 0) {
            this.f87382c.clear();
        }
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f87383d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tb.e eVar = this.f87382c;
        int i13 = 1;
        while (!this.f87383d) {
            do {
                Runnable runnable = (Runnable) eVar.poll();
                if (runnable != null) {
                    runnable.run();
                } else if (this.f87383d) {
                    eVar.clear();
                    return;
                } else {
                    i13 = this.f87384e.addAndGet(-i13);
                    if (i13 == 0) {
                        return;
                    }
                }
            } while (!this.f87383d);
            eVar.clear();
            return;
        }
        eVar.clear();
    }
}
