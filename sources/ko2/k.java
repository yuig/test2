package ko2;

import ao2.m0;

/* loaded from: classes2.dex */
public final class k extends j {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f80333c;

    public k(long j13, Runnable runnable, boolean z13) {
        super(j13, z13);
        this.f80333c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f80333c.run();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Task[");
        Runnable runnable = this.f80333c;
        sb3.append(runnable.getClass().getSimpleName());
        sb3.append('@');
        sb3.append(m0.y(runnable));
        sb3.append(", ");
        sb3.append(this.f80331a);
        sb3.append(", ");
        return ep.b.k(sb3, this.f80332b ? "Blocking" : "Non-blocking", ']');
    }
}
