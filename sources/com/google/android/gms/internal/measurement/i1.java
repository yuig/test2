package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class i1 extends b1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f31423e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r0 f31424f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d1 f31425g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(d1 d1Var, r0 r0Var, int i13) {
        super(d1Var, true);
        this.f31423e = i13;
        this.f31425g = d1Var;
        this.f31424f = r0Var;
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void a() {
        switch (this.f31423e) {
            case 0:
                t0 t0Var = this.f31425g.f31355g;
                com.bumptech.glide.d.t(t0Var);
                t0Var.getCachedAppInstanceId(this.f31424f);
                break;
            case 1:
                t0 t0Var2 = this.f31425g.f31355g;
                com.bumptech.glide.d.t(t0Var2);
                t0Var2.getGmpAppId(this.f31424f);
                break;
            case 2:
                t0 t0Var3 = this.f31425g.f31355g;
                com.bumptech.glide.d.t(t0Var3);
                t0Var3.getCurrentScreenName(this.f31424f);
                break;
            case 3:
                t0 t0Var4 = this.f31425g.f31355g;
                com.bumptech.glide.d.t(t0Var4);
                t0Var4.generateEventId(this.f31424f);
                break;
            default:
                t0 t0Var5 = this.f31425g.f31355g;
                com.bumptech.glide.d.t(t0Var5);
                t0Var5.getCurrentScreenClass(this.f31424f);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void b() {
        int i13 = this.f31423e;
        r0 r0Var = this.f31424f;
        switch (i13) {
            case 0:
                r0Var.f(null);
                break;
            case 1:
                r0Var.f(null);
                break;
            case 2:
                r0Var.f(null);
                break;
            case 3:
                r0Var.f(null);
                break;
            default:
                r0Var.f(null);
                break;
        }
    }
}
