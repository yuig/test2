package g0;

import java.util.concurrent.ScheduledFuture;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f63197a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduledFuture f63198b;

    public /* synthetic */ g(ScheduledFuture scheduledFuture, int i13) {
        this.f63197a = i13;
        this.f63198b = scheduledFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f63197a;
        ScheduledFuture scheduledFuture = this.f63198b;
        switch (i13) {
            case 0:
                scheduledFuture.cancel(true);
                break;
            default:
                scheduledFuture.cancel(true);
                break;
        }
    }
}
