package dm;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class i implements k {

    /* renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f55326a;

    public i(TaskCompletionSource taskCompletionSource) {
        this.f55326a = taskCompletionSource;
    }

    @Override // dm.k
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // dm.k
    public final boolean b(em.a aVar) {
        em.c cVar = em.c.UNREGISTERED;
        em.c cVar2 = aVar.f59572b;
        if (cVar2 != cVar && cVar2 != em.c.REGISTERED && cVar2 != em.c.REGISTER_ERROR) {
            return false;
        }
        this.f55326a.trySetResult(aVar.f59571a);
        return true;
    }
}
