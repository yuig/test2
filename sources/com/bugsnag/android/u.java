package com.bugsnag.android;

import android.content.Context;
import android.net.ConnectivityManager;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class u implements s {

    /* renamed from: a, reason: collision with root package name */
    public final s f29654a;

    public u(Context context, n nVar) {
        ConnectivityManager connectivityManager = null;
        try {
            Object systemService = context.getSystemService("connectivity");
            connectivityManager = (ConnectivityManager) (systemService instanceof ConnectivityManager ? systemService : null);
        } catch (RuntimeException unused) {
        }
        this.f29654a = connectivityManager == null ? a0.f29140b : new t(connectivityManager, nVar);
    }

    @Override // com.bugsnag.android.s
    public final void e() {
        try {
            xk2.q qVar = xk2.s.f135225b;
            this.f29654a.e();
            Unit unit = Unit.f80348a;
        } catch (Throwable th3) {
            xk2.q qVar2 = xk2.s.f135225b;
            ue.c.m(th3);
        }
    }

    @Override // com.bugsnag.android.s
    public final boolean j() {
        Object m13;
        try {
            xk2.q qVar = xk2.s.f135225b;
            m13 = Boolean.valueOf(this.f29654a.j());
        } catch (Throwable th3) {
            xk2.q qVar2 = xk2.s.f135225b;
            m13 = ue.c.m(th3);
        }
        if (xk2.s.a(m13) != null) {
            m13 = Boolean.TRUE;
        }
        return ((Boolean) m13).booleanValue();
    }

    @Override // com.bugsnag.android.s
    public final String k() {
        Object m13;
        try {
            xk2.q qVar = xk2.s.f135225b;
            m13 = this.f29654a.k();
        } catch (Throwable th3) {
            xk2.q qVar2 = xk2.s.f135225b;
            m13 = ue.c.m(th3);
        }
        if (xk2.s.a(m13) != null) {
            m13 = "unknown";
        }
        return (String) m13;
    }
}
