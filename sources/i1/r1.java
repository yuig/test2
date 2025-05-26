package i1;

/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: a */
    public final float f70888a;

    /* renamed from: b */
    public final float f70889b;

    public r1(float f13, n4.b bVar) {
        this.f70888a = f13;
        float b13 = bVar.b();
        float f14 = s1.f70898a;
        this.f70889b = b13 * 386.0878f * 160.0f * 0.84f;
    }

    public final q1 a(float f13) {
        float[] fArr = b.f70719a;
        double a13 = b.a(f13, this.f70888a * this.f70889b);
        double d2 = s1.f70898a;
        double d13 = d2 - 1.0d;
        return new q1((long) (Math.exp(a13 / d13) * 1000.0d), f13, (float) (Math.exp((d2 / d13) * a13) * r0 * r1));
    }
}
