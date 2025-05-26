package kb;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f78962a;

    /* renamed from: b, reason: collision with root package name */
    public final WorkerParameters f78963b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f78964c = new AtomicInteger(-256);

    /* renamed from: d, reason: collision with root package name */
    public boolean f78965d;

    public a0(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f78962a = context;
        this.f78963b = workerParameters;
    }

    public abstract r4.l d();

    public final boolean e() {
        return this.f78964c.get() != -256;
    }

    public void f() {
    }

    public abstract r4.l g();

    public final void h(int i13) {
        if (this.f78964c.compareAndSet(-256, i13)) {
            f();
        }
    }
}
