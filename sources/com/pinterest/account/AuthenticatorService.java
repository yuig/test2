package com.pinterest.account;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import ey.j3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ny.i;
import to.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/account/AuthenticatorService;", "Landroid/app/Service;", "<init>", "()V", "identity_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class AuthenticatorService extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return new a(this).getIBinder();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        new i().i();
        j3 j3Var = j3.f60510a;
        j3.j();
    }
}
