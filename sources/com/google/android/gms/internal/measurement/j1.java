package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class j1 extends b1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f31472e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f31473f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f31474g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f31475h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d1 f31476i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f31477j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(d1 d1Var, String str) {
        super(d1Var, true);
        this.f31472e = 1;
        this.f31476i = d1Var;
        this.f31473f = "fcm";
        this.f31474g = "_ln";
        this.f31477j = str;
        this.f31475h = true;
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void a() {
        switch (this.f31472e) {
            case 0:
                t0 t0Var = this.f31476i.f31355g;
                com.bumptech.glide.d.t(t0Var);
                t0Var.getUserProperties(this.f31473f, this.f31474g, this.f31475h, (r0) this.f31477j);
                break;
            default:
                t0 t0Var2 = this.f31476i.f31355g;
                com.bumptech.glide.d.t(t0Var2);
                t0Var2.setUserProperty(this.f31473f, this.f31474g, new rh.b(this.f31477j), this.f31475h, this.f31292a);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void b() {
        switch (this.f31472e) {
            case 0:
                ((r0) this.f31477j).f(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(d1 d1Var, String str, String str2, boolean z13, r0 r0Var) {
        super(d1Var, true);
        this.f31472e = 0;
        this.f31476i = d1Var;
        this.f31473f = str;
        this.f31474g = str2;
        this.f31475h = z13;
        this.f31477j = r0Var;
    }
}
