package k1;

import androidx.compose.foundation.MutationInterruptedException;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class w1 {

    /* renamed from: a, reason: collision with root package name */
    public final v1 f78070a;

    /* renamed from: b, reason: collision with root package name */
    public final ao2.o1 f78071b;

    public w1(v1 v1Var, ao2.o1 o1Var) {
        this.f78070a = v1Var;
        this.f78071b = o1Var;
    }

    public final boolean a(w1 w1Var) {
        return this.f78070a.compareTo(w1Var.f78070a) >= 0;
    }

    public final void b() {
        this.f78071b.cancel((CancellationException) new MutationInterruptedException());
    }
}
