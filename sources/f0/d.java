package f0;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class d implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static volatile d f60728a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
