package ao2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class n1 extends r1 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f20179f = AtomicIntegerFieldUpdater.newUpdater(n1.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Function1 f20180e;

    public n1(Function1 function1) {
        this.f20180e = function1;
    }

    @Override // ao2.r1
    public final boolean i() {
        return true;
    }

    @Override // ao2.r1
    public final void j(Throwable th3) {
        if (f20179f.compareAndSet(this, 0, 1)) {
            this.f20180e.invoke(th3);
        }
    }
}
