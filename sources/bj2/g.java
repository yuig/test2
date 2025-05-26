package bj2;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class g implements si2.c {

    /* renamed from: a, reason: collision with root package name */
    public final d f22991a;

    /* renamed from: b, reason: collision with root package name */
    public final a f22992b;

    /* renamed from: c, reason: collision with root package name */
    public final zi2.a f22993c;

    /* renamed from: d, reason: collision with root package name */
    public long f22994d;

    /* renamed from: e, reason: collision with root package name */
    public si2.g f22995e = si2.g.UNDEFINED_SEVERITY_NUMBER;

    /* renamed from: f, reason: collision with root package name */
    public String f22996f;

    /* renamed from: g, reason: collision with root package name */
    public qi2.e f22997g;

    /* renamed from: h, reason: collision with root package name */
    public aj2.b f22998h;

    public g(d dVar, zi2.a aVar) {
        this.f22991a = dVar;
        this.f22992b = (a) dVar.f22984c.get();
        this.f22993c = aVar;
    }

    @Override // si2.c
    public final si2.c H(si2.g gVar) {
        this.f22995e = gVar;
        return this;
    }

    @Override // si2.c
    public final void n() {
        d dVar = this.f22991a;
        if (dVar.f22987f != null) {
            return;
        }
        vi2.c cVar = vi2.g.f125879b;
        vi2.b current = cVar.current();
        if (current == null) {
            current = cVar.root();
        }
        long now = dVar.f22986e.now();
        c cVar2 = dVar.f22985d;
        cVar2.U0(current, new l(dVar.f22983b, this.f22993c, this.f22994d, now, ui2.j.c(current).h(), this.f22995e, this.f22996f, this.f22997g, this.f22998h));
    }

    @Override // si2.c
    public final si2.c o(ri2.e eVar, Object obj) {
        if (eVar != null && !eVar.f108404b.isEmpty() && obj != null) {
            if (this.f22998h == null) {
                this.f22998h = new aj2.b(r0.f22970a, this.f22992b.f22971b);
            }
            this.f22998h.c(eVar, obj);
        }
        return this;
    }

    @Override // si2.c
    public final si2.c r(String str) {
        this.f22996f = str;
        return this;
    }

    @Override // si2.c
    public final si2.c t(String str) {
        Objects.requireNonNull(str, "value must not be null");
        this.f22997g = new qi2.e(str);
        return this;
    }

    @Override // si2.c
    public final si2.c x(long j13, TimeUnit timeUnit) {
        this.f22994d = timeUnit.toNanos(j13);
        return this;
    }
}
