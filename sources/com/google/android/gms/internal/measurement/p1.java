package com.google.android.gms.internal.measurement;

import android.app.Activity;

/* loaded from: classes.dex */
public final class p1 extends b1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f31579e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Activity f31580f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c1 f31581g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(c1 c1Var, Activity activity, int i13) {
        super((d1) c1Var.f31316b, true);
        this.f31579e = i13;
        if (i13 == 1) {
            this.f31581g = c1Var;
            this.f31580f = activity;
            super((d1) c1Var.f31316b, true);
            return;
        }
        if (i13 == 2) {
            this.f31581g = c1Var;
            this.f31580f = activity;
            super((d1) c1Var.f31316b, true);
        } else if (i13 == 3) {
            this.f31581g = c1Var;
            this.f31580f = activity;
            super((d1) c1Var.f31316b, true);
        } else if (i13 != 4) {
            this.f31581g = c1Var;
            this.f31580f = activity;
        } else {
            this.f31581g = c1Var;
            this.f31580f = activity;
            super((d1) c1Var.f31316b, true);
        }
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void a() {
        switch (this.f31579e) {
            case 0:
                t0 t0Var = ((d1) this.f31581g.f31316b).f31355g;
                com.bumptech.glide.d.t(t0Var);
                t0Var.onActivityResumed(new rh.b(this.f31580f), this.f31293b);
                break;
            case 1:
                t0 t0Var2 = ((d1) this.f31581g.f31316b).f31355g;
                com.bumptech.glide.d.t(t0Var2);
                t0Var2.onActivityStarted(new rh.b(this.f31580f), this.f31293b);
                break;
            case 2:
                t0 t0Var3 = ((d1) this.f31581g.f31316b).f31355g;
                com.bumptech.glide.d.t(t0Var3);
                t0Var3.onActivityStopped(new rh.b(this.f31580f), this.f31293b);
                break;
            case 3:
                t0 t0Var4 = ((d1) this.f31581g.f31316b).f31355g;
                com.bumptech.glide.d.t(t0Var4);
                t0Var4.onActivityPaused(new rh.b(this.f31580f), this.f31293b);
                break;
            default:
                t0 t0Var5 = ((d1) this.f31581g.f31316b).f31355g;
                com.bumptech.glide.d.t(t0Var5);
                t0Var5.onActivityDestroyed(new rh.b(this.f31580f), this.f31293b);
                break;
        }
    }
}
