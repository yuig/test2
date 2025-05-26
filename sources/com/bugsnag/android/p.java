package com.bugsnag.android;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class p implements ComponentCallbacks2 {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f29399a;

    /* renamed from: b, reason: collision with root package name */
    public final Function2 f29400b;

    /* renamed from: c, reason: collision with root package name */
    public final Function2 f29401c;

    public p(k0 k0Var, n nVar, n nVar2) {
        this.f29399a = k0Var;
        this.f29400b = nVar;
        this.f29401c = nVar2;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        k0 k0Var = this.f29399a;
        String d2 = k0Var.d();
        int i13 = configuration.orientation;
        if (k0Var.f29316q.getAndSet(i13) != i13) {
            this.f29400b.invoke(d2, k0Var.d());
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f29401c.invoke(Boolean.TRUE, null);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i13) {
        this.f29401c.invoke(Boolean.valueOf(i13 >= 80), Integer.valueOf(i13));
    }
}
