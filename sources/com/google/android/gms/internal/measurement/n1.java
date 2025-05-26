package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class n1 extends b1 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f31538f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f31539g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Bundle f31540h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f31541i;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d1 f31543k;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Long f31537e = null;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f31542j = true;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(d1 d1Var, String str, String str2, Bundle bundle, boolean z13) {
        super(d1Var, true);
        this.f31543k = d1Var;
        this.f31538f = str;
        this.f31539g = str2;
        this.f31540h = bundle;
        this.f31541i = z13;
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void a() {
        Long l13 = this.f31537e;
        long longValue = l13 == null ? this.f31292a : l13.longValue();
        t0 t0Var = this.f31543k.f31355g;
        com.bumptech.glide.d.t(t0Var);
        t0Var.logEvent(this.f31538f, this.f31539g, this.f31540h, this.f31541i, this.f31542j, longValue);
    }
}
