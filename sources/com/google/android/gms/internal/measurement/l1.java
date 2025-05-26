package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class l1 extends b1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f31500e = "Error with data collection. Data lost.";

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f31501f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d1 f31502g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(d1 d1Var, Object obj) {
        super(d1Var, false);
        this.f31502g = d1Var;
        this.f31501f = obj;
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void a() {
        t0 t0Var = this.f31502g.f31355g;
        com.bumptech.glide.d.t(t0Var);
        t0Var.logHealthData(5, this.f31500e, new rh.b(this.f31501f), new rh.b(null), new rh.b(null));
    }
}
