package m5;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes3.dex */
public final class j implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public static volatile j f85863c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85864a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f85865b;

    public j(Looper looper) {
        this.f85864a = 1;
        this.f85865b = new bi.f(looper, 1);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i13 = this.f85864a;
        Object obj = this.f85865b;
        switch (i13) {
            case 0:
                Handler handler = (Handler) obj;
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case 1:
                ((Handler) obj).post(runnable);
                return;
            default:
                ((ExecutorService) obj).execute(runnable);
                return;
        }
    }

    public j() {
        this.f85864a = 2;
        this.f85865b = Executors.newFixedThreadPool(2, new f0.b(0));
    }

    public j(Handler handler) {
        this.f85864a = 0;
        handler.getClass();
        this.f85865b = handler;
    }
}
