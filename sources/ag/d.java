package ag;

/* loaded from: classes3.dex */
public final class d extends e {

    /* renamed from: d, reason: collision with root package name */
    public static final f f15086d;

    /* renamed from: b, reason: collision with root package name */
    public float f15087b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f15088c = 0.0f;

    static {
        f a13 = f.a(32, new d());
        f15086d = a13;
        a13.f15096f = 0.5f;
    }

    public static d b(float f13, float f14) {
        d dVar = (d) f15086d.b();
        dVar.f15087b = f13;
        dVar.f15088c = f14;
        return dVar;
    }

    public static void c(d dVar) {
        f15086d.c(dVar);
    }

    @Override // ag.e
    public final e a() {
        return new d();
    }
}
