package y6;

import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.common.api.i;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public int f137897a;

    /* renamed from: b, reason: collision with root package name */
    public c f137898b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f137899c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f137900d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f137901e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f137902f;

    /* renamed from: g, reason: collision with root package name */
    public Executor f137903g;

    /* renamed from: h, reason: collision with root package name */
    public volatile a f137904h;

    /* renamed from: i, reason: collision with root package name */
    public volatile a f137905i;

    public final void a() {
        if (this.f137904h != null) {
            boolean z13 = this.f137899c;
            if (!z13) {
                if (z13) {
                    c();
                } else {
                    this.f137902f = true;
                }
            }
            if (this.f137905i != null) {
                this.f137904h.getClass();
                this.f137904h = null;
                return;
            }
            this.f137904h.getClass();
            a aVar = this.f137904h;
            aVar.f137894c.set(true);
            if (aVar.f137892a.cancel(false)) {
                this.f137905i = this.f137904h;
            }
            this.f137904h = null;
        }
    }

    public final void b() {
        if (this.f137905i != null || this.f137904h == null) {
            return;
        }
        this.f137904h.getClass();
        if (this.f137903g == null) {
            this.f137903g = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        a aVar = this.f137904h;
        Executor executor = this.f137903g;
        if (aVar.f137893b == g.PENDING) {
            aVar.f137893b = g.RUNNING;
            executor.execute(aVar.f137892a);
            return;
        }
        int i13 = f.f137909a[aVar.f137893b.ordinal()];
        if (i13 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i13 == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    public final void c() {
        a();
        this.f137904h = new a(this);
        b();
    }

    public final void d() {
        fh.d dVar = (fh.d) this;
        Iterator it = dVar.f62139k.iterator();
        if (it.hasNext()) {
            ((i) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        try {
            dVar.f62138j.tryAcquire(0, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e13) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e13);
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        StringBuilder sb3 = new StringBuilder(64);
        Class<?> cls = getClass();
        sb3.append(cls.getSimpleName());
        sb3.append("{");
        sb3.append(Integer.toHexString(System.identityHashCode(cls)));
        sb3.append(" id=");
        return a.a.n(sb3, this.f137897a, "}");
    }
}
