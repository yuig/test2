package dm;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class h implements k {

    /* renamed from: a, reason: collision with root package name */
    public final l f55324a;

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f55325b;

    public h(l lVar, TaskCompletionSource taskCompletionSource) {
        this.f55324a = lVar;
        this.f55325b = taskCompletionSource;
    }

    @Override // dm.k
    public final boolean a(Exception exc) {
        this.f55325b.trySetException(exc);
        return true;
    }

    @Override // dm.k
    public final boolean b(em.a aVar) {
        if (aVar.f59572b != em.c.REGISTERED || this.f55324a.b(aVar)) {
            return false;
        }
        String str = aVar.f59573c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f55325b.setResult(new a(str, aVar.f59575e, aVar.f59576f));
        return true;
    }
}
