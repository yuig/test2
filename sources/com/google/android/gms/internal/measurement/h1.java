package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class h1 extends b1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f31414e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f31415f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d1 f31416g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(d1 d1Var, String str, int i13) {
        super(d1Var, true);
        this.f31414e = i13;
        this.f31416g = d1Var;
        this.f31415f = str;
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void a() {
        switch (this.f31414e) {
            case 0:
                t0 t0Var = this.f31416g.f31355g;
                com.bumptech.glide.d.t(t0Var);
                t0Var.endAdUnitExposure(this.f31415f, this.f31293b);
                break;
            default:
                t0 t0Var2 = this.f31416g.f31355g;
                com.bumptech.glide.d.t(t0Var2);
                t0Var2.beginAdUnitExposure(this.f31415f, this.f31293b);
                break;
        }
    }
}
