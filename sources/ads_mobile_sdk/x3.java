package ads_mobile_sdk;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class x3 extends a.se {

    /* renamed from: a, reason: collision with root package name */
    public final a.ee f13404a;

    public x3(a.ee eeVar) {
        new TaskCompletionSource().getTask();
        this.f13404a = eeVar;
    }

    @Override // a.se
    public final Task a(int i13, long j13, Exception exc) {
        ((x71) this.f13404a).a(i13, j13, exc, null);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setResult(Boolean.TRUE);
        return taskCompletionSource.getTask();
    }
}
