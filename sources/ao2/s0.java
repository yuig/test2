package ao2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public final class s0 extends ho2.u {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f20203e = AtomicIntegerFieldUpdater.newUpdater(s0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // ho2.u, ao2.a2
    public final void t(Object obj) {
        u(obj);
    }

    @Override // ho2.u, ao2.a2
    public final void u(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f20203e;
            int i13 = atomicIntegerFieldUpdater.get(this);
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
                ho2.f.a(bs1.c.J1(obj), cl2.h.b(this.f69787d));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
