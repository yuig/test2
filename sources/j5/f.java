package j5;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes3.dex */
public final class f implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74676a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f74677b;

    public f(Handler handler) {
        this.f74676a = 0;
        this.f74677b = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i13 = this.f74676a;
        Handler handler = this.f74677b;
        switch (i13) {
            case 0:
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            default:
                handler.post(runnable);
                return;
        }
    }

    public f() {
        this.f74676a = 1;
        this.f74677b = new Handler(Looper.getMainLooper());
    }
}
