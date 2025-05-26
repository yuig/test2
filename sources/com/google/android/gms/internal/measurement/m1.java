package com.google.android.gms.internal.measurement;

import android.app.Activity;

/* loaded from: classes3.dex */
public final class m1 extends b1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f31518e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r0 f31519f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f31520g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f31521h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(c1 c1Var, Activity activity, r0 r0Var) {
        super((d1) c1Var.f31316b, true);
        this.f31521h = c1Var;
        this.f31520g = activity;
        this.f31519f = r0Var;
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void a() {
        switch (this.f31518e) {
            case 0:
                t0 t0Var = ((d1) this.f31521h).f31355g;
                com.bumptech.glide.d.t(t0Var);
                t0Var.getMaxUserProperties((String) this.f31520g, this.f31519f);
                break;
            default:
                t0 t0Var2 = ((d1) ((c1) this.f31521h).f31316b).f31355g;
                com.bumptech.glide.d.t(t0Var2);
                t0Var2.onActivitySaveInstanceState(new rh.b((Activity) this.f31520g), this.f31519f, this.f31293b);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void b() {
        switch (this.f31518e) {
            case 0:
                this.f31519f.f(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(d1 d1Var, String str, r0 r0Var) {
        super(d1Var, true);
        this.f31521h = d1Var;
        this.f31520g = str;
        this.f31519f = r0Var;
    }
}
