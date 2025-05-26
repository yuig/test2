package ec;

/* loaded from: classes3.dex */
public final class z implements b {

    /* renamed from: a, reason: collision with root package name */
    public final y f58362a;

    /* renamed from: b, reason: collision with root package name */
    public final dc.b f58363b;

    /* renamed from: c, reason: collision with root package name */
    public final dc.b f58364c;

    /* renamed from: d, reason: collision with root package name */
    public final dc.b f58365d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f58366e;

    public z(String str, y yVar, dc.b bVar, dc.b bVar2, dc.b bVar3, boolean z13) {
        this.f58362a = yVar;
        this.f58363b = bVar;
        this.f58364c = bVar2;
        this.f58365d = bVar3;
        this.f58366e = z13;
    }

    @Override // ec.b
    public final yb.c a(com.airbnb.lottie.v vVar, com.airbnb.lottie.h hVar, fc.c cVar) {
        return new yb.w(cVar, this);
    }

    public final dc.b b() {
        return this.f58364c;
    }

    public final dc.b c() {
        return this.f58365d;
    }

    public final dc.b d() {
        return this.f58363b;
    }

    public final y e() {
        return this.f58362a;
    }

    public final boolean f() {
        return this.f58366e;
    }

    public final String toString() {
        return "Trim Path: {start: " + this.f58363b + ", end: " + this.f58364c + ", offset: " + this.f58365d + "}";
    }
}
