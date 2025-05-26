package m8;

import c3.e;
import d7.i;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class a implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Executor f86524a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f86525b;

    public a(ExecutorService executorService, e eVar) {
        this.f86524a = executorService;
        this.f86525b = eVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f86524a.execute(runnable);
    }
}
