package pq2;

import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class q implements k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Type f101074a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Executor f101075b;

    public q(Type type, Executor executor) {
        this.f101074a = type;
        this.f101075b = executor;
    }

    @Override // pq2.k
    public final Object a(g0 g0Var) {
        Executor executor = this.f101075b;
        return executor == null ? g0Var : new r(executor, g0Var);
    }

    @Override // pq2.k
    public final Type b() {
        return this.f101074a;
    }
}
