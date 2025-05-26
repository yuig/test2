package xj2;

/* loaded from: classes2.dex */
public final class e extends d {
    @Override // xj2.d
    public final void a(Object obj) {
        ((Runnable) obj).run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return "RunnableDisposable(disposed=" + isDisposed() + ", " + get() + ")";
    }
}
