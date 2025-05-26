package hc;

/* loaded from: classes.dex */
public final class e0 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final e0 f68640a = new e0();

    @Override // hc.l0
    public final Object f(ic.d dVar, float f13) {
        boolean z13 = dVar.g() == ic.c.BEGIN_ARRAY;
        if (z13) {
            dVar.a();
        }
        float s13 = (float) dVar.s1();
        float s14 = (float) dVar.s1();
        while (dVar.hasNext()) {
            dVar.E();
        }
        if (z13) {
            dVar.d();
        }
        return new kc.c((s13 / 100.0f) * f13, (s14 / 100.0f) * f13);
    }
}
