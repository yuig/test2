package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes3.dex */
public final class e0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    Context f30800a;

    /* renamed from: b, reason: collision with root package name */
    private final d0 f30801b;

    public e0(d0 d0Var) {
        this.f30801b = d0Var;
    }

    public final void a(Context context) {
        this.f30800a = context;
    }

    public final synchronized void b() {
        try {
            Context context = this.f30800a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f30800a = null;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f30801b.a();
            b();
        }
    }
}
