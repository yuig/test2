package org.chromium.net;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import org.chromium.base.TraceEvent;

/* loaded from: classes2.dex */
public final class t extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public Network f97465a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NetworkChangeNotifierAutoDetect f97466b;

    public t(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        this.f97466b = networkChangeNotifierAutoDetect;
    }

    public final boolean a(Network network, NetworkCapabilities networkCapabilities) {
        Network network2 = this.f97465a;
        if (network2 == null || network2.equals(network)) {
            NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.f97466b;
            if (networkCapabilities == null) {
                networkCapabilities = networkChangeNotifierAutoDetect.mConnectivityManagerDelegate.c(network);
            }
            if (networkCapabilities != null) {
                if (networkCapabilities.hasTransport(4)) {
                    networkChangeNotifierAutoDetect.mConnectivityManagerDelegate.getClass();
                    if (!m.f(network)) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037 A[Catch: all -> 0x002e, TryCatch #1 {all -> 0x002e, blocks: (B:3:0x0008, B:11:0x001d, B:13:0x0023, B:15:0x0027, B:21:0x0037, B:22:0x0039), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // android.net.ConnectivityManager.NetworkCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onAvailable(android.net.Network r10) {
        /*
            r9 = this;
            org.chromium.net.NetworkChangeNotifierAutoDetect r0 = r9.f97466b
            java.lang.String r1 = "NetworkChangeNotifierCallback::onAvailable"
            org.chromium.base.TraceEvent r1 = org.chromium.base.TraceEvent.c(r1)
            org.chromium.net.m r2 = org.chromium.net.NetworkChangeNotifierAutoDetect.b(r0)     // Catch: java.lang.Throwable -> L2e
            android.net.NetworkCapabilities r2 = r2.c(r10)     // Catch: java.lang.Throwable -> L2e
            boolean r3 = r9.a(r10, r2)     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L1c
            if (r1 == 0) goto L1b
            r1.close()
        L1b:
            return
        L1c:
            r3 = 4
            boolean r2 = r2.hasTransport(r3)     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L33
            android.net.Network r2 = r9.f97465a     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L30
            boolean r2 = r10.equals(r2)     // Catch: java.lang.Throwable -> L2e
            if (r2 != 0) goto L33
            goto L30
        L2e:
            r10 = move-exception
            goto L55
        L30:
            r2 = 1
        L31:
            r8 = r2
            goto L35
        L33:
            r2 = 0
            goto L31
        L35:
            if (r8 == 0) goto L39
            r9.f97465a = r10     // Catch: java.lang.Throwable -> L2e
        L39:
            long r5 = org.chromium.net.NetworkChangeNotifierAutoDetect.networkToNetId(r10)     // Catch: java.lang.Throwable -> L2e
            org.chromium.net.m r2 = org.chromium.net.NetworkChangeNotifierAutoDetect.b(r0)     // Catch: java.lang.Throwable -> L2e
            int r7 = r2.a(r10)     // Catch: java.lang.Throwable -> L2e
            org.chromium.net.n r10 = new org.chromium.net.n     // Catch: java.lang.Throwable -> L2e
            r3 = r10
            r4 = r9
            r3.<init>(r4, r5, r7, r8)     // Catch: java.lang.Throwable -> L2e
            org.chromium.net.NetworkChangeNotifierAutoDetect.i(r0, r10)     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L54
            r1.close()
        L54:
            return
        L55:
            if (r1 == 0) goto L5f
            r1.close()     // Catch: java.lang.Throwable -> L5b
            goto L5f
        L5b:
            r0 = move-exception
            r10.addSuppressed(r0)
        L5f:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.t.onAvailable(android.net.Network):void");
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.f97466b;
        TraceEvent c13 = TraceEvent.c("NetworkChangeNotifierCallback::onCapabilitiesChanged");
        try {
            if (a(network, networkCapabilities)) {
                if (c13 != null) {
                    c13.close();
                }
            } else {
                networkChangeNotifierAutoDetect.runOnThread(new o(this, NetworkChangeNotifierAutoDetect.networkToNetId(network), networkChangeNotifierAutoDetect.mConnectivityManagerDelegate.a(network)));
                if (c13 != null) {
                    c13.close();
                }
            }
        } catch (Throwable th3) {
            if (c13 != null) {
                try {
                    c13.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLosing(Network network, int i13) {
        TraceEvent c13 = TraceEvent.c("NetworkChangeNotifierCallback::onLosing");
        try {
            if (a(network, null)) {
                if (c13 != null) {
                    c13.close();
                }
            } else {
                this.f97466b.runOnThread(new p(this, NetworkChangeNotifierAutoDetect.networkToNetId(network)));
                if (c13 != null) {
                    c13.close();
                }
            }
        } catch (Throwable th3) {
            if (c13 != null) {
                try {
                    c13.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.f97466b;
        TraceEvent c13 = TraceEvent.c("NetworkChangeNotifierCallback::onLost");
        try {
            Network network2 = this.f97465a;
            if (network2 != null && !network2.equals(network)) {
                if (c13 != null) {
                    c13.close();
                    return;
                }
                return;
            }
            networkChangeNotifierAutoDetect.runOnThread(new q(this, network));
            if (this.f97465a != null) {
                this.f97465a = null;
                for (Network network3 : NetworkChangeNotifierAutoDetect.getAllNetworksFiltered(networkChangeNotifierAutoDetect.mConnectivityManagerDelegate, network)) {
                    onAvailable(network3);
                }
                networkChangeNotifierAutoDetect.runOnThread(new s(this, networkChangeNotifierAutoDetect.getCurrentNetworkState().getConnectionType()));
            }
            if (c13 != null) {
                c13.close();
            }
        } catch (Throwable th3) {
            if (c13 != null) {
                try {
                    c13.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }
}
