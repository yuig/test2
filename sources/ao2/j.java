package ao2;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes4.dex */
public final class j implements l {

    /* renamed from: a, reason: collision with root package name */
    public final Future f20165a;

    public j(ScheduledFuture scheduledFuture) {
        this.f20165a = scheduledFuture;
    }

    @Override // ao2.l
    public final void b(Throwable th3) {
        this.f20165a.cancel(false);
    }

    public final String toString() {
        return "CancelFutureOnCancel[" + this.f20165a + ']';
    }
}
