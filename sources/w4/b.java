package w4;

/* loaded from: classes3.dex */
public final class b extends x4.n {

    /* renamed from: a, reason: collision with root package name */
    public final t4.o f127922a;

    /* renamed from: b, reason: collision with root package name */
    public t4.l f127923b;

    /* renamed from: c, reason: collision with root package name */
    public t4.n f127924c;

    public b() {
        t4.o oVar = new t4.o();
        oVar.f116397k = false;
        this.f127922a = oVar;
        this.f127924c = oVar;
    }

    @Override // x4.n
    public final float a() {
        return this.f127924c.a();
    }

    public final void b(float f13, float f14, float f15, float f16, float f17, float f18) {
        t4.o oVar = this.f127922a;
        this.f127924c = oVar;
        oVar.f116398l = f13;
        boolean z13 = f13 > f14;
        oVar.f116397k = z13;
        if (z13) {
            oVar.d(-f15, f13 - f14, f17, f18, f16);
        } else {
            oVar.d(f15, f14 - f13, f17, f18, f16);
        }
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f13) {
        return this.f127924c.getInterpolation(f13);
    }
}
