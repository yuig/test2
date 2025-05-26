package nk;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public abstract class x implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final TaskCompletionSource f91086a;

    public x() {
        this.f91086a = null;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f91086a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void b();

    public final TaskCompletionSource c() {
        return this.f91086a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e13) {
            a(e13);
        }
    }

    public x(TaskCompletionSource taskCompletionSource) {
        this.f91086a = taskCompletionSource;
    }
}
