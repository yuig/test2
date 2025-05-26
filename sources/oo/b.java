package oo;

import android.accounts.AccountManagerCallback;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.i;
import org.chromium.net.j;

/* loaded from: classes3.dex */
public final class b extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96792a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f96793b;

    /* renamed from: c, reason: collision with root package name */
    public Object f96794c;

    public b() {
        this.f96792a = 0;
        this.f96793b = a.f96790k;
        this.f96794c = a.f96789j;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f96792a) {
            case 0:
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                Intrinsics.checkNotNullParameter(context, "context");
                Object systemService = context.getSystemService("connectivity");
                if (systemService == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
                }
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    ((Function0) this.f96793b).invoke();
                    return;
                } else {
                    ((Function0) this.f96794c).invoke();
                    return;
                }
            default:
                ((Context) this.f96793b).unregisterReceiver(this);
                i iVar = (i) this.f96794c;
                j jVar = iVar.f97341b;
                jVar.f97443b.getAuthToken(jVar.f97446e, jVar.f97445d, jVar.f97444c, true, (AccountManagerCallback<Bundle>) new i(iVar.f97342c, jVar, 1), (Handler) null);
                return;
        }
    }

    public b(i iVar, Context context) {
        this.f96792a = 1;
        this.f96794c = iVar;
        this.f96793b = context;
    }
}
