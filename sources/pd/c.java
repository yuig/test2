package pd;

import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f99637a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f99638b;

    /* renamed from: c, reason: collision with root package name */
    public final ReferenceQueue f99639c;

    /* renamed from: d, reason: collision with root package name */
    public z f99640d;

    public c() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new a(0));
        this.f99638b = new HashMap();
        this.f99639c = new ReferenceQueue();
        this.f99637a = false;
        newSingleThreadExecutor.execute(new androidx.appcompat.app.v(this, 7));
    }

    public final synchronized void a(nd.h hVar, a0 a0Var) {
        b bVar = (b) this.f99638b.put(hVar, new b(hVar, a0Var, this.f99639c, this.f99637a));
        if (bVar != null) {
            bVar.a();
        }
    }

    public final void b(b bVar) {
        g0 g0Var;
        synchronized (this) {
            this.f99638b.remove(bVar.f99632a);
            if (bVar.f99633b && (g0Var = bVar.f99634c) != null) {
                ((t) this.f99640d).e(bVar.f99632a, new a0(g0Var, true, false, bVar.f99632a, this.f99640d));
            }
        }
    }
}
