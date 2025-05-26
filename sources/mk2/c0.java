package mk2;

import java.util.concurrent.TimeUnit;
import lb.l0;

/* loaded from: classes2.dex */
public final class c0 extends uj2.a0 {

    /* renamed from: c, reason: collision with root package name */
    public static final c0 f87367c = new c0();

    @Override // uj2.a0
    public final uj2.z a() {
        return new b0();
    }

    @Override // uj2.a0
    public final xj2.c b(Runnable runnable) {
        ck2.i.b(runnable, "run is null");
        runnable.run();
        return bk2.d.INSTANCE;
    }

    @Override // uj2.a0
    public final xj2.c c(Runnable runnable, long j13, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j13);
            ck2.i.b(runnable, "run is null");
            runnable.run();
        } catch (InterruptedException e13) {
            Thread.currentThread().interrupt();
            l0.R0(e13);
        }
        return bk2.d.INSTANCE;
    }
}
