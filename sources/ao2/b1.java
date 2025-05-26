package ao2;

/* loaded from: classes2.dex */
public final class b1 extends c1 {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f20115c;

    public b1(Runnable runnable, long j13) {
        super(j13);
        this.f20115c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20115c.run();
    }

    @Override // ao2.c1
    public final String toString() {
        return super.toString() + this.f20115c;
    }
}
