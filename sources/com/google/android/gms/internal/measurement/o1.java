package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class o1 extends b1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f31563e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Activity f31564f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c1 f31565g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(c1 c1Var, Bundle bundle, Activity activity) {
        super((d1) c1Var.f31316b, true);
        this.f31565g = c1Var;
        this.f31563e = bundle;
        this.f31564f = activity;
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void a() {
        Bundle bundle;
        if (this.f31563e != null) {
            bundle = new Bundle();
            if (this.f31563e.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f31563e.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        t0 t0Var = ((d1) this.f31565g.f31316b).f31355g;
        com.bumptech.glide.d.t(t0Var);
        t0Var.onActivityCreated(new rh.b(this.f31564f), bundle, this.f31293b);
    }
}
