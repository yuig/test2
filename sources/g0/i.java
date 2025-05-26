package g0;

import com.google.common.util.concurrent.c0;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final /* synthetic */ class i implements r4.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f63201a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduledExecutorService f63202b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f63203c = null;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f63204d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f63205e;

    public /* synthetic */ i(long j13, c0 c0Var, ScheduledExecutorService scheduledExecutorService) {
        this.f63201a = c0Var;
        this.f63202b = scheduledExecutorService;
        this.f63205e = j13;
    }

    @Override // r4.j
    public final Object C(r4.i iVar) {
        c0 c0Var = this.f63201a;
        m.g(c0Var, iVar);
        if (!c0Var.isDone()) {
            c0Var.d(new g(this.f63202b.schedule(new k(iVar, this.f63203c, this.f63204d, c0Var), this.f63205e, TimeUnit.MILLISECONDS), 1), l3.c.s());
        }
        return "TimeoutFuture[" + c0Var + "]";
    }
}
