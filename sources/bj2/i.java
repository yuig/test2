package bj2;

import jk.v;

/* loaded from: classes4.dex */
public final class i implements si2.d {

    /* renamed from: a, reason: collision with root package name */
    public final d f22999a;

    /* renamed from: b, reason: collision with root package name */
    public final zi2.a f23000b;

    static {
        ((si2.f) v.q(si2.b.f113009a, "io.opentelemetry.api.incubator.logs.ExtendedDefaultLoggerProvider")).get();
    }

    public i(d dVar, zi2.a aVar, ej2.a aVar2) {
        this.f22999a = dVar;
        this.f23000b = aVar;
    }

    @Override // si2.d
    public final si2.c a() {
        return new g(this.f22999a, this.f23000b);
    }
}
