package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;

/* loaded from: classes3.dex */
public final class g1 extends b1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f31400e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f31401f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f31402g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d1 f31403h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f31404i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(d1 d1Var, Activity activity, String str, String str2) {
        super(d1Var, true);
        this.f31400e = 2;
        this.f31403h = d1Var;
        this.f31404i = activity;
        this.f31401f = str;
        this.f31402g = str2;
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void a() {
        switch (this.f31400e) {
            case 0:
                t0 t0Var = this.f31403h.f31355g;
                com.bumptech.glide.d.t(t0Var);
                t0Var.getConditionalUserProperties(this.f31401f, this.f31402g, (r0) this.f31404i);
                break;
            case 1:
                t0 t0Var2 = this.f31403h.f31355g;
                com.bumptech.glide.d.t(t0Var2);
                t0Var2.clearConditionalUserProperty(this.f31401f, this.f31402g, (Bundle) this.f31404i);
                break;
            default:
                t0 t0Var3 = this.f31403h.f31355g;
                com.bumptech.glide.d.t(t0Var3);
                t0Var3.setCurrentScreen(new rh.b((Activity) this.f31404i), this.f31401f, this.f31402g, this.f31292a);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void b() {
        switch (this.f31400e) {
            case 0:
                ((r0) this.f31404i).f(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(d1 d1Var, String str, String str2, Object obj, int i13) {
        super(d1Var, true);
        this.f31400e = i13;
        this.f31403h = d1Var;
        this.f31401f = str;
        this.f31402g = str2;
        this.f31404i = obj;
    }
}
