package am2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public final u1 f15569a;

    public q(u1 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f15569a = delegate;
    }

    public abstract boolean a(vb0.i iVar, p pVar, m mVar);

    public final String toString() {
        return this.f15569a.b();
    }
}
