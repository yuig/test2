package sk2;

import java.util.concurrent.atomic.AtomicLong;
import ok2.g;

/* loaded from: classes4.dex */
public final class b extends AtomicLong implements xp2.c {

    /* renamed from: a, reason: collision with root package name */
    public final xp2.b f113098a;

    /* renamed from: b, reason: collision with root package name */
    public final c f113099b;

    public b(xp2.b bVar, c cVar) {
        this.f113098a = bVar;
        this.f113099b = cVar;
    }

    @Override // xp2.c
    public final void cancel() {
        if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
            this.f113099b.o(this);
        }
    }

    @Override // xp2.c
    public final void request(long j13) {
        if (g.validate(j13)) {
            d7.b.g(this, j13);
        }
    }
}
