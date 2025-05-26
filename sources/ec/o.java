package ec;

/* loaded from: classes3.dex */
public final class o implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58327a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final String f58328b;

    /* renamed from: c, reason: collision with root package name */
    public final dc.b f58329c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f58330d;

    /* renamed from: e, reason: collision with root package name */
    public final dc.f f58331e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f58332f;

    public o(String str, dc.b bVar, dc.b bVar2, dc.e eVar, boolean z13) {
        this.f58328b = str;
        this.f58329c = bVar;
        this.f58331e = bVar2;
        this.f58332f = eVar;
        this.f58330d = z13;
    }

    @Override // ec.b
    public final yb.c a(com.airbnb.lottie.v vVar, com.airbnb.lottie.h hVar, fc.c cVar) {
        switch (this.f58327a) {
            case 0:
                return new yb.q(vVar, cVar, this);
            default:
                return new yb.r(vVar, cVar, this);
        }
    }

    public final String toString() {
        switch (this.f58327a) {
            case 0:
                return "RectangleShape{position=" + this.f58331e + ", size=" + ((dc.f) this.f58332f) + '}';
            default:
                return super.toString();
        }
    }

    public o(String str, dc.f fVar, dc.a aVar, dc.b bVar, boolean z13) {
        this.f58328b = str;
        this.f58331e = fVar;
        this.f58332f = aVar;
        this.f58329c = bVar;
        this.f58330d = z13;
    }
}
