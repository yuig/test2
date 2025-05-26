package vb;

import android.os.Handler;
import android.os.Looper;
import ao2.f0;
import java.util.concurrent.ExecutorService;
import ub.j;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final j f125444a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f125445b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f125446c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public final a f125447d = new a(this, 0);

    public b(ExecutorService executorService) {
        j jVar = new j(executorService);
        this.f125444a = jVar;
        this.f125445b = dl2.b.o0(jVar);
    }

    public final void a(Runnable runnable) {
        this.f125444a.execute(runnable);
    }
}
