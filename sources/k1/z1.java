package k1;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class z1 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f78108a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    public final mo2.c f78109b = mo2.d.a();

    public static final void a(z1 z1Var, w1 w1Var) {
        while (true) {
            AtomicReference atomicReference = z1Var.f78108a;
            w1 w1Var2 = (w1) atomicReference.get();
            if (w1Var2 != null && !w1Var.a(w1Var2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(w1Var2, w1Var)) {
                if (atomicReference.get() != w1Var2) {
                    break;
                }
            }
            if (w1Var2 != null) {
                w1Var2.b();
                return;
            }
            return;
        }
    }
}
