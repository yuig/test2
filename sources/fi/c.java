package fi;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public abstract class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f62179a;

    public c() {
        this.f62179a = null;
    }

    public abstract void a();

    public final void b(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f62179a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e13) {
            b(e13);
        }
    }

    public c(TaskCompletionSource taskCompletionSource) {
        this.f62179a = taskCompletionSource;
    }
}
