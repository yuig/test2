package bk;

/* loaded from: classes3.dex */
public final class g extends f {

    /* renamed from: a, reason: collision with root package name */
    public final float f23029a;

    public g(float f13) {
        this.f23029a = f13 - 0.001f;
    }

    @Override // bk.f
    public final void Q(float f13, float f14, float f15, z zVar) {
        double d2 = this.f23029a;
        float sqrt = (float) ((Math.sqrt(2.0d) * d2) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow(d2, 2.0d) - Math.pow(sqrt, 2.0d));
        zVar.e(f14 - sqrt, ((float) (-((Math.sqrt(2.0d) * d2) - d2))) + sqrt2, 270.0f, 0.0f);
        zVar.d(f14, (float) (-((Math.sqrt(2.0d) * d2) - d2)));
        zVar.d(f14 + sqrt, ((float) (-((Math.sqrt(2.0d) * d2) - d2))) + sqrt2);
    }
}
