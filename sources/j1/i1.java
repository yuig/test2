package j1;

import androidx.compose.animation.core.MutationInterruptedException;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final h1 f74098a;

    /* renamed from: b, reason: collision with root package name */
    public final ao2.o1 f74099b;

    public i1(h1 h1Var, ao2.o1 o1Var) {
        this.f74098a = h1Var;
        this.f74099b = o1Var;
    }

    public final boolean a(i1 i1Var) {
        return this.f74098a.compareTo(i1Var.f74098a) >= 0;
    }

    public final void b() {
        this.f74099b.cancel((CancellationException) new MutationInterruptedException());
    }
}
