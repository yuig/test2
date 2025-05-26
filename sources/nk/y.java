package nk;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class y extends x {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f91087g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x f91088h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c f91089i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(c cVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, x xVar) {
        super(taskCompletionSource);
        this.f91089i = cVar;
        this.f91087g = taskCompletionSource2;
        this.f91088h = xVar;
    }

    @Override // nk.x
    public final void b() {
        synchronized (this.f91089i.f91067f) {
            try {
                c cVar = this.f91089i;
                TaskCompletionSource taskCompletionSource = this.f91087g;
                cVar.f91066e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new com.google.android.gms.common.api.internal.t(cVar, taskCompletionSource, 2));
                if (this.f91089i.f91073l.getAndIncrement() > 0) {
                    this.f91089i.f91063b.c("Already connected to the service.", new Object[0]);
                }
                c.b(this.f91089i, this.f91088h);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
