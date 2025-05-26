package on2;

import java.util.concurrent.locks.Lock;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class a implements t {

    /* renamed from: a, reason: collision with root package name */
    public final Lock f96768a;

    public a(Lock lock) {
        Intrinsics.checkNotNullParameter(lock, "lock");
        this.f96768a = lock;
    }

    @Override // on2.t
    public void lock() {
        this.f96768a.lock();
    }

    @Override // on2.t
    public final void unlock() {
        this.f96768a.unlock();
    }
}
