package ub;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import lb.x;

/* loaded from: classes.dex */
public final class j implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final Executor f121666b;

    /* renamed from: c, reason: collision with root package name */
    public Runnable f121667c;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f121665a = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final Object f121668d = new Object();

    public j(ExecutorService executorService) {
        this.f121666b = executorService;
    }

    public final void a() {
        Runnable runnable = (Runnable) this.f121665a.poll();
        this.f121667c = runnable;
        if (runnable != null) {
            this.f121666b.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f121668d) {
            try {
                this.f121665a.add(new x(this, runnable, 2));
                if (this.f121667c == null) {
                    a();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
