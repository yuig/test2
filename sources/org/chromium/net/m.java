package org.chromium.net;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import java.io.IOException;
import java.net.Socket;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f97451a;

    public m(Context context) {
        this.f97451a = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public static boolean f(Network network) {
        Socket socket = new Socket();
        try {
            dp2.j a13 = dp2.j.a();
            try {
                try {
                    network.bindSocket(socket);
                    a13.close();
                    try {
                        socket.close();
                        return true;
                    } catch (IOException unused) {
                        return true;
                    }
                } finally {
                }
            } catch (IOException unused2) {
                return false;
            }
        } catch (IOException unused3) {
            socket.close();
            return false;
        } catch (Throwable th3) {
            try {
                socket.close();
            } catch (IOException unused4) {
            }
            throw th3;
        }
    }

    public final int a(Network network) {
        NetworkInfo d2 = d(network);
        if (d2 == null || !d2.isConnected()) {
            return 6;
        }
        return NetworkChangeNotifierAutoDetect.convertToConnectionType(d2.getType(), d2.getSubtype());
    }

    public final Network b() {
        ConnectivityManager connectivityManager = this.f97451a;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork != null) {
            return activeNetwork;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return null;
        }
        for (Network network : NetworkChangeNotifierAutoDetect.getAllNetworksFiltered(this, null)) {
            NetworkInfo e13 = e(network);
            if (e13 != null && (e13.getType() == activeNetworkInfo.getType() || e13.getType() == 17)) {
                if (activeNetwork != null && Build.VERSION.SDK_INT >= 29) {
                    if (e13.getDetailedState() != NetworkInfo.DetailedState.CONNECTING) {
                        NetworkInfo e14 = e(activeNetwork);
                        if (e14 != null) {
                            e14.getDetailedState();
                        }
                    }
                }
                activeNetwork = network;
            }
        }
        return activeNetwork;
    }

    public final NetworkCapabilities c(Network network) {
        for (int i13 = 0; i13 < 2; i13++) {
            try {
                return this.f97451a.getNetworkCapabilities(network);
            } catch (SecurityException unused) {
            }
        }
        return null;
    }

    public final NetworkInfo d(Network network) {
        NetworkInfo e13 = e(network);
        return (e13 == null || e13.getType() != 17) ? e13 : this.f97451a.getActiveNetworkInfo();
    }

    public final NetworkInfo e(Network network) {
        ConnectivityManager connectivityManager = this.f97451a;
        try {
            try {
                return connectivityManager.getNetworkInfo(network);
            } catch (NullPointerException unused) {
                return connectivityManager.getNetworkInfo(network);
            }
        } catch (NullPointerException unused2) {
            return null;
        }
    }
}
