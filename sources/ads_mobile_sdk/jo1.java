package ads_mobile_sdk;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.view.View;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class jo1 implements a.n6 {

    /* renamed from: a, reason: collision with root package name */
    public NetworkCapabilities f6902a = null;

    public jo1(Context context) {
        io1 io1Var = new io1(this);
        try {
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            ((ConnectivityManager) systemService).registerDefaultNetworkCallback(io1Var);
        } catch (Throwable unused) {
        }
    }

    @Override // a.n6
    public final void a(HashMap hashMap, Context context, View view) {
    }

    @Override // a.n6
    public final void b(HashMap hashMap) {
    }

    @Override // a.n6
    public final void a(HashMap hashMap) {
        NetworkCapabilities networkCapabilities;
        synchronized (this) {
            networkCapabilities = this.f6902a;
        }
        hashMap.put("ntc", networkCapabilities);
        hashMap.put("nt", Long.valueOf(a()));
    }

    public final long a() {
        synchronized (this) {
            try {
                NetworkCapabilities networkCapabilities = this.f6902a;
                if (networkCapabilities != null) {
                    if (networkCapabilities.hasTransport(4)) {
                        return 2L;
                    }
                    if (this.f6902a.hasTransport(1)) {
                        return 1L;
                    }
                    if (this.f6902a.hasTransport(0)) {
                        return 0L;
                    }
                }
                return -1L;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
