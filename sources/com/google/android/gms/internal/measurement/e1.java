package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class e1 extends b1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f31367e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bundle f31368f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d1 f31369g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(d1 d1Var, Bundle bundle, int i13) {
        super(d1Var, true);
        this.f31367e = i13;
        this.f31369g = d1Var;
        this.f31368f = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void a() {
        switch (this.f31367e) {
            case 0:
                t0 t0Var = this.f31369g.f31355g;
                com.bumptech.glide.d.t(t0Var);
                t0Var.setConditionalUserProperty(this.f31368f, this.f31292a);
                break;
            default:
                t0 t0Var2 = this.f31369g.f31355g;
                com.bumptech.glide.d.t(t0Var2);
                t0Var2.setConsentThirdParty(this.f31368f, this.f31292a);
                break;
        }
    }
}
