package org.chromium.net;

import android.net.ConnectivityManager;
import org.chromium.base.annotations.CalledByNative;

/* loaded from: classes2.dex */
public class NetworkActiveNotifier implements ConnectivityManager.OnNetworkActiveListener {
    private boolean mAreNotificationsEnabled;
    private final ConnectivityManager mConnectivityManager = (ConnectivityManager) so.a.f113317a.getSystemService("connectivity");
    private final long mNativeNetworkActiveObserver;

    private NetworkActiveNotifier(long j13) {
        this.mNativeNetworkActiveObserver = j13;
    }

    @CalledByNative
    public static NetworkActiveNotifier build(long j13) {
        return new NetworkActiveNotifier(j13);
    }

    @CalledByNative
    public void disableNotifications() {
        this.mAreNotificationsEnabled = false;
        this.mConnectivityManager.removeDefaultNetworkActiveListener(this);
    }

    @CalledByNative
    public void enableNotifications() {
        this.mAreNotificationsEnabled = true;
        this.mConnectivityManager.addDefaultNetworkActiveListener(this);
    }

    @CalledByNative
    public void fakeDefaultNetworkActive() {
        if (this.mAreNotificationsEnabled) {
            onNetworkActive();
        }
    }

    @CalledByNative
    public boolean isDefaultNetworkActive() {
        return this.mConnectivityManager.isDefaultNetworkActive();
    }

    @Override // android.net.ConnectivityManager.OnNetworkActiveListener
    public void onNetworkActive() {
        g4.u.i0().q0(this.mNativeNetworkActiveObserver);
    }
}
