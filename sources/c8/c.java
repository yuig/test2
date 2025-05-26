package c8;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;

/* loaded from: classes3.dex */
public final class c extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public boolean f26938a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f26939b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f26940c;

    public c(d dVar) {
        this.f26940c = dVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        ((Handler) this.f26940c.f26945e).post(new b(this, 0));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z13) {
        if (z13) {
            return;
        }
        ((Handler) this.f26940c.f26945e).post(new b(this, 1));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        boolean hasCapability = networkCapabilities.hasCapability(16);
        boolean z13 = this.f26938a;
        int i13 = 1;
        d dVar = this.f26940c;
        if (z13 && this.f26939b == hasCapability) {
            if (hasCapability) {
                ((Handler) dVar.f26945e).post(new b(this, i13));
            }
        } else {
            this.f26938a = true;
            this.f26939b = hasCapability;
            ((Handler) dVar.f26945e).post(new b(this, 0));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        ((Handler) this.f26940c.f26945e).post(new b(this, 0));
    }
}
