package s2;

/* loaded from: classes.dex */
public abstract class a0 implements z {

    /* renamed from: a, reason: collision with root package name */
    public final i2.g f110603a = new i2.g(0);

    public final boolean f(int i13) {
        return (i13 & this.f110603a.get()) != 0;
    }

    public final void g(int i13) {
        i2.g gVar;
        int i14;
        do {
            gVar = this.f110603a;
            i14 = gVar.get();
            if ((i14 & i13) != 0) {
                return;
            }
        } while (!gVar.compareAndSet(i14, i14 | i13));
    }
}
