package mk2;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: classes2.dex */
public final class v extends a implements Callable {
    @Override // java.util.concurrent.Callable
    public final Object call() {
        FutureTask futureTask = a.f87347c;
        this.f87350b = Thread.currentThread();
        try {
            this.f87349a.run();
            return null;
        } finally {
            lazySet(futureTask);
            this.f87350b = null;
        }
    }
}
