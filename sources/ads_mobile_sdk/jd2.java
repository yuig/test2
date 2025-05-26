package ads_mobile_sdk;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public abstract class jd2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f6765a;

    public jd2() {
        this.f6765a = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e13) {
            TaskCompletionSource taskCompletionSource = this.f6765a;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(e13);
            }
        }
    }

    public jd2(TaskCompletionSource taskCompletionSource) {
        this.f6765a = taskCompletionSource;
    }
}
