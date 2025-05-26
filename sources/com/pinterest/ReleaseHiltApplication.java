package com.pinterest;

import af2.b;
import af2.c;
import kotlin.Metadata;
import m60.m0;
import rd.j;
import so.sd;
import ye2.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/ReleaseHiltApplication;", "Lm60/m0;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ReleaseHiltApplication extends m0 implements c {
    public boolean P = false;
    public final h Q = new h(new j(this, 25));

    @Override // af2.c
    public final b componentManager() {
        return this.Q;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return this.Q.generatedComponent();
    }

    @Override // m60.m0, kb0.a, android.app.Application
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void onCreate() {
        if (!this.P) {
            this.P = true;
            ((sd) this.Q.generatedComponent()).getClass();
        }
        super.onCreate();
    }
}
