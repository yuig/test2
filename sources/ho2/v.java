package ho2;

import ao2.i2;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes2.dex */
public abstract class v extends b implements i2 {

    /* renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f69788d = AtomicIntegerFieldUpdater.newUpdater(v.class, "cleanedAndPointers$volatile");

    /* renamed from: c */
    public final long f69789c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public v(long j13, v vVar, int i13) {
        super(vVar);
        this.f69789c = j13;
        this.cleanedAndPointers$volatile = i13 << 16;
    }

    @Override // ho2.b
    public final boolean e() {
        return f69788d.get(this) == i() && !f();
    }

    public final boolean h() {
        return f69788d.addAndGet(this, -65536) == i() && !f();
    }

    public abstract int i();

    public abstract void j(int i13, CoroutineContext coroutineContext);

    public final void k() {
        if (f69788d.incrementAndGet(this) == i()) {
            g();
        }
    }

    public final boolean l() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i13;
        do {
            atomicIntegerFieldUpdater = f69788d;
            i13 = atomicIntegerFieldUpdater.get(this);
            if (i13 == i() && !f()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i13, 65536 + i13));
        return true;
    }
}
