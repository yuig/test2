package kk;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
public abstract class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f79904a;

    public u() {
        this.f79904a = null;
    }

    public final TaskCompletionSource a() {
        return this.f79904a;
    }

    public final void b(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f79904a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void c();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            c();
        } catch (Exception e13) {
            b(e13);
        }
    }

    public u(TaskCompletionSource taskCompletionSource) {
        this.f79904a = taskCompletionSource;
    }
}
