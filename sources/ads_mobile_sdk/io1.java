package ads_mobile_sdk;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* loaded from: classes2.dex */
public final class io1 extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jo1 f6510a;

    public io1(jo1 jo1Var) {
        this.f6510a = jo1Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (this.f6510a) {
            this.f6510a.f6902a = networkCapabilities;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (this.f6510a) {
            this.f6510a.f6902a = null;
        }
    }
}
