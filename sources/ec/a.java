package ec;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f58281a;

    /* renamed from: b, reason: collision with root package name */
    public final dc.f f58282b;

    /* renamed from: c, reason: collision with root package name */
    public final dc.a f58283c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f58284d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f58285e;

    public a(String str, dc.f fVar, dc.a aVar, boolean z13, boolean z14) {
        this.f58281a = str;
        this.f58282b = fVar;
        this.f58283c = aVar;
        this.f58284d = z13;
        this.f58285e = z14;
    }

    @Override // ec.b
    public final yb.c a(com.airbnb.lottie.v vVar, com.airbnb.lottie.h hVar, fc.c cVar) {
        return new yb.f(vVar, cVar, this);
    }
}
