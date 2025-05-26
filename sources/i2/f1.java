package i2;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class f1 implements q2 {

    /* renamed from: a, reason: collision with root package name */
    public final Function2 f71107a;

    /* renamed from: b, reason: collision with root package name */
    public final ho2.c f71108b;

    /* renamed from: c, reason: collision with root package name */
    public ao2.k2 f71109c;

    public f1(CoroutineContext coroutineContext, Function2 function2) {
        this.f71107a = function2;
        this.f71108b = dl2.b.b(coroutineContext);
    }

    @Override // i2.q2
    public final void a() {
        ao2.k2 k2Var = this.f71109c;
        if (k2Var != null) {
            k2Var.cancel(kh2.u2.c("Old job was still running!", null));
        }
        this.f71109c = kotlin.jvm.internal.j.z(this.f71108b, null, null, this.f71107a, 3);
    }

    @Override // i2.q2
    public final void b() {
        ao2.k2 k2Var = this.f71109c;
        if (k2Var != null) {
            k2Var.cancel((CancellationException) new h1());
        }
        this.f71109c = null;
    }

    @Override // i2.q2
    public final void c() {
        ao2.k2 k2Var = this.f71109c;
        if (k2Var != null) {
            k2Var.cancel((CancellationException) new h1());
        }
        this.f71109c = null;
    }
}
