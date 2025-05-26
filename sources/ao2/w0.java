package ao2;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes4.dex */
public final class w0 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public final Future f20224a;

    public w0(ScheduledFuture scheduledFuture) {
        this.f20224a = scheduledFuture;
    }

    @Override // ao2.x0
    public final void dispose() {
        this.f20224a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f20224a + ']';
    }
}
