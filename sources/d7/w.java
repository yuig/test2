package d7;

import android.os.Handler;
import android.view.Choreographer;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53896a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53897b;

    public /* synthetic */ w(Object obj, int i13) {
        this.f53896a = i13;
        this.f53897b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        int i13 = this.f53896a;
        Object obj = this.f53897b;
        switch (i13) {
            case 0:
                ((Handler) obj).post(runnable);
                break;
            case 1:
                ((Handler) obj).post(runnable);
                break;
            default:
                ((Choreographer) obj).postFrameCallback(new Choreographer.FrameCallback() { // from class: h4.l0
                    @Override // android.view.Choreographer.FrameCallback
                    public final void doFrame(long j13) {
                        runnable.run();
                    }
                });
                break;
        }
    }
}
