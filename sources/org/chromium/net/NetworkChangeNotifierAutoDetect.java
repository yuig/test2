package org.chromium.net;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import org.chromium.base.ApplicationStatus;

@SuppressLint({"NewApi"})
/* loaded from: classes2.dex */
public class NetworkChangeNotifierAutoDetect extends BroadcastReceiver {
    private static final String TAG = "NetworkChangeNotifierAutoDetect";
    private static final int UNKNOWN_LINK_SPEED = -1;
    private m mConnectivityManagerDelegate;
    private ConnectivityManager.NetworkCallback mDefaultNetworkCallback;
    private final Handler mHandler;
    private boolean mIgnoreNextBroadcast;
    private final NetworkConnectivityIntentFilter mIntentFilter;
    private final Looper mLooper;
    private t mNetworkCallback;
    private NetworkRequest mNetworkRequest;
    private NetworkState mNetworkState;
    private final Observer mObserver;
    private boolean mRegisterNetworkCallbackFailed;
    private boolean mRegistered;
    private final RegistrationPolicy mRegistrationPolicy;
    private boolean mShouldSignalObserver;
    private u mWifiManagerDelegate;

    public static class NetworkConnectivityIntentFilter extends IntentFilter {
        public NetworkConnectivityIntentFilter() {
            addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
    }

    public static class NetworkState {
        private final boolean mConnected;
        private final boolean mIsMetered;
        private final boolean mIsPrivateDnsActive;
        private final String mNetworkIdentifier;
        private final String mPrivateDnsServerName;
        private final int mSubtype;
        private final int mType;

        public NetworkState(boolean z13, int i13, int i14, boolean z14, String str, boolean z15, String str2) {
            this.mConnected = z13;
            this.mType = i13;
            this.mSubtype = i14;
            this.mIsMetered = z14;
            this.mNetworkIdentifier = str == null ? "" : str;
            this.mIsPrivateDnsActive = z15;
            this.mPrivateDnsServerName = str2 == null ? "" : str2;
        }

        public int getConnectionCost() {
            return isMetered() ? 2 : 1;
        }

        public int getConnectionSubtype() {
            if (!isConnected()) {
                return 1;
            }
            int networkType = getNetworkType();
            if (networkType != 0 && networkType != 4 && networkType != 5) {
                return 0;
            }
            switch (getNetworkSubType()) {
            }
            return 0;
        }

        public int getConnectionType() {
            if (isConnected()) {
                return NetworkChangeNotifierAutoDetect.convertToConnectionType(getNetworkType(), getNetworkSubType());
            }
            return 6;
        }

        public String getNetworkIdentifier() {
            return this.mNetworkIdentifier;
        }

        public int getNetworkSubType() {
            return this.mSubtype;
        }

        public int getNetworkType() {
            return this.mType;
        }

        public String getPrivateDnsServerName() {
            return this.mPrivateDnsServerName;
        }

        public boolean isConnected() {
            return this.mConnected;
        }

        public boolean isMetered() {
            return this.mIsMetered;
        }

        public boolean isPrivateDnsActive() {
            return this.mIsPrivateDnsActive;
        }
    }

    public interface Observer {
        void onConnectionCostChanged(int i13);

        void onConnectionSubtypeChanged(int i13);

        void onConnectionTypeChanged(int i13);

        void onNetworkConnect(long j13, int i13);

        void onNetworkDisconnect(long j13);

        void onNetworkSoonToDisconnect(long j13);

        void purgeActiveNetworkList(long[] jArr);
    }

    public static abstract class RegistrationPolicy {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private NetworkChangeNotifierAutoDetect mNotifier;

        public abstract void destroy();

        public void init(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
            this.mNotifier = networkChangeNotifierAutoDetect;
        }

        public final void register() {
            this.mNotifier.register();
        }

        public final void unregister() {
            this.mNotifier.unregister();
        }
    }

    public NetworkChangeNotifierAutoDetect(Observer observer, RegistrationPolicy registrationPolicy) {
        Looper myLooper = Looper.myLooper();
        this.mLooper = myLooper;
        this.mHandler = new Handler(myLooper);
        this.mObserver = observer;
        this.mConnectivityManagerDelegate = new m(so.a.f113317a);
        int i13 = Build.VERSION.SDK_INT;
        this.mNetworkCallback = new t(this);
        this.mNetworkRequest = new NetworkRequest.Builder().addCapability(12).removeCapability(15).build();
        if (i13 >= 30) {
            this.mDefaultNetworkCallback = new l(this);
        } else {
            this.mDefaultNetworkCallback = i13 >= 28 ? new rb.h(this) : null;
        }
        this.mNetworkState = getCurrentNetworkState();
        this.mIntentFilter = new NetworkConnectivityIntentFilter();
        this.mIgnoreNextBroadcast = false;
        this.mShouldSignalObserver = false;
        this.mRegistrationPolicy = registrationPolicy;
        registrationPolicy.init(this);
        this.mShouldSignalObserver = true;
    }

    private void assertOnThread() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectionTypeChanged() {
        connectionTypeChangedTo(getCurrentNetworkState());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectionTypeChangedTo(NetworkState networkState) {
        if (networkState.getConnectionType() != this.mNetworkState.getConnectionType() || !networkState.getNetworkIdentifier().equals(this.mNetworkState.getNetworkIdentifier()) || networkState.isPrivateDnsActive() != this.mNetworkState.isPrivateDnsActive() || !networkState.getPrivateDnsServerName().equals(this.mNetworkState.getPrivateDnsServerName())) {
            this.mObserver.onConnectionTypeChanged(networkState.getConnectionType());
        }
        if (networkState.getConnectionType() != this.mNetworkState.getConnectionType() || networkState.getConnectionSubtype() != this.mNetworkState.getConnectionSubtype()) {
            this.mObserver.onConnectionSubtypeChanged(networkState.getConnectionSubtype());
        }
        if (networkState.getConnectionCost() != this.mNetworkState.getConnectionCost()) {
            this.mObserver.onConnectionCostChanged(networkState.getConnectionCost());
        }
        this.mNetworkState = networkState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int convertToConnectionType(int i13, int i14) {
        if (i13 != 0) {
            if (i13 == 1) {
                return 2;
            }
            if (i13 != 4 && i13 != 5) {
                if (i13 == 6) {
                    return 5;
                }
                if (i13 != 7) {
                    return i13 != 9 ? 0 : 1;
                }
                return 7;
            }
        }
        if (i14 == 20) {
            return 8;
        }
        switch (i14) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return 3;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return 4;
            case 13:
                return 5;
            default:
                return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Network[] getAllNetworksFiltered(m mVar, Network network) {
        NetworkCapabilities c13;
        Network[] allNetworks = mVar.f97451a.getAllNetworks();
        if (allNetworks == null) {
            allNetworks = new Network[0];
        }
        int i13 = 0;
        for (Network network2 : allNetworks) {
            if (!network2.equals(network) && (c13 = mVar.c(network2)) != null && c13.hasCapability(12)) {
                if (!c13.hasTransport(4)) {
                    allNetworks[i13] = network2;
                    i13++;
                } else if (m.f(network2)) {
                    return new Network[]{network2};
                }
            }
        }
        return (Network[]) Arrays.copyOf(allNetworks, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runOnThread$0(Runnable runnable) {
        if (this.mRegistered) {
            runnable.run();
        }
    }

    private /* synthetic */ void lambda$setConnectivityManagerDelegateForTests$1(m mVar) {
        this.mConnectivityManagerDelegate = mVar;
    }

    private /* synthetic */ void lambda$setWifiManagerDelegateForTests$2(u uVar) {
    }

    public static long networkToNetId(Network network) {
        return network.getNetworkHandle();
    }

    private boolean onThread() {
        return this.mLooper == Looper.myLooper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runOnThread(Runnable runnable) {
        if (onThread()) {
            runnable.run();
        } else {
            this.mHandler.post(new nl1.a(2, this, runnable));
        }
    }

    public void destroy() {
        assertOnThread();
        this.mRegistrationPolicy.destroy();
        unregister();
    }

    public NetworkState getCurrentNetworkState() {
        m mVar = this.mConnectivityManagerDelegate;
        Network b13 = mVar.b();
        NetworkInfo d2 = mVar.d(b13);
        if (d2 == null || (!d2.isConnected() && (d2.getDetailedState() != NetworkInfo.DetailedState.BLOCKED || ApplicationStatus.getStateForApplication() != 1))) {
            d2 = null;
        }
        if (d2 == null) {
            return new NetworkState(false, -1, -1, false, null, false, "");
        }
        if (b13 != null) {
            NetworkCapabilities c13 = mVar.c(b13);
            boolean z13 = (c13 == null || c13.hasCapability(11)) ? false : true;
            DnsStatus a13 = AndroidNetworkLibrary.a(b13);
            return a13 == null ? new NetworkState(true, d2.getType(), d2.getSubtype(), z13, String.valueOf(networkToNetId(b13)), false, "") : new NetworkState(true, d2.getType(), d2.getSubtype(), z13, String.valueOf(networkToNetId(b13)), a13.getPrivateDnsActive(), a13.getPrivateDnsServerName());
        }
        if (d2.getType() != 1) {
            return new NetworkState(true, d2.getType(), d2.getSubtype(), false, null, false, "");
        }
        if (d2.getExtraInfo() != null && !"".equals(d2.getExtraInfo())) {
            return new NetworkState(true, d2.getType(), d2.getSubtype(), false, d2.getExtraInfo(), false, "");
        }
        d2.getType();
        d2.getSubtype();
        throw null;
    }

    public long getDefaultNetId() {
        Network defaultNetwork = getDefaultNetwork();
        if (defaultNetwork == null) {
            return -1L;
        }
        return networkToNetId(defaultNetwork);
    }

    public Network getDefaultNetwork() {
        return this.mConnectivityManagerDelegate.b();
    }

    public long[] getNetworksAndTypes() {
        Network[] allNetworksFiltered = getAllNetworksFiltered(this.mConnectivityManagerDelegate, null);
        long[] jArr = new long[allNetworksFiltered.length * 2];
        int i13 = 0;
        for (Network network : allNetworksFiltered) {
            int i14 = i13 + 1;
            jArr[i13] = networkToNetId(network);
            i13 += 2;
            jArr[i14] = this.mConnectivityManagerDelegate.a(r5);
        }
        return jArr;
    }

    public Network[] getNetworksForTesting() {
        return getAllNetworksFiltered(this.mConnectivityManagerDelegate, null);
    }

    public RegistrationPolicy getRegistrationPolicy() {
        return this.mRegistrationPolicy;
    }

    public boolean isReceiverRegisteredForTesting() {
        return this.mRegistered;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        runOnThread(new ne0.b(this, 14));
    }

    public void register() {
        NetworkCapabilities c13;
        assertOnThread();
        if (this.mRegistered) {
            connectionTypeChanged();
            return;
        }
        if (this.mShouldSignalObserver) {
            connectionTypeChanged();
        }
        ConnectivityManager.NetworkCallback networkCallback = this.mDefaultNetworkCallback;
        if (networkCallback != null) {
            try {
                this.mConnectivityManagerDelegate.f97451a.registerDefaultNetworkCallback(networkCallback, this.mHandler);
            } catch (RuntimeException unused) {
                this.mDefaultNetworkCallback = null;
            }
        }
        if (this.mDefaultNetworkCallback == null) {
            this.mIgnoreNextBroadcast = so.a.h(so.a.f113317a, this, this.mIntentFilter) != null;
        }
        this.mRegistered = true;
        t tVar = this.mNetworkCallback;
        if (tVar != null) {
            NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = tVar.f97466b;
            Network[] allNetworksFiltered = getAllNetworksFiltered(networkChangeNotifierAutoDetect.mConnectivityManagerDelegate, null);
            tVar.f97465a = null;
            if (allNetworksFiltered.length == 1 && (c13 = networkChangeNotifierAutoDetect.mConnectivityManagerDelegate.c(allNetworksFiltered[0])) != null && c13.hasTransport(4)) {
                tVar.f97465a = allNetworksFiltered[0];
            }
            try {
                m mVar = this.mConnectivityManagerDelegate;
                NetworkRequest networkRequest = this.mNetworkRequest;
                t tVar2 = this.mNetworkCallback;
                Handler handler = this.mHandler;
                mVar.getClass();
                dp2.j c14 = dp2.j.c();
                try {
                    mVar.f97451a.registerNetworkCallback(networkRequest, tVar2, handler);
                    c14.close();
                } finally {
                }
            } catch (RuntimeException unused2) {
                this.mRegisterNetworkCallbackFailed = true;
                this.mNetworkCallback = null;
            }
            if (this.mRegisterNetworkCallbackFailed || !this.mShouldSignalObserver) {
                return;
            }
            Network[] allNetworksFiltered2 = getAllNetworksFiltered(this.mConnectivityManagerDelegate, null);
            long[] jArr = new long[allNetworksFiltered2.length];
            for (int i13 = 0; i13 < allNetworksFiltered2.length; i13++) {
                jArr[i13] = networkToNetId(allNetworksFiltered2[i13]);
            }
            this.mObserver.purgeActiveNetworkList(jArr);
        }
    }

    public boolean registerNetworkCallbackFailed() {
        return this.mRegisterNetworkCallbackFailed;
    }

    public void setConnectivityManagerDelegateForTests(m mVar) {
        this.mConnectivityManagerDelegate = mVar;
    }

    public void setWifiManagerDelegateForTests(u uVar) {
    }

    public void unregister() {
        assertOnThread();
        if (this.mRegistered) {
            this.mRegistered = false;
            t tVar = this.mNetworkCallback;
            if (tVar != null) {
                this.mConnectivityManagerDelegate.f97451a.unregisterNetworkCallback(tVar);
            }
            ConnectivityManager.NetworkCallback networkCallback = this.mDefaultNetworkCallback;
            if (networkCallback != null) {
                this.mConnectivityManagerDelegate.f97451a.unregisterNetworkCallback(networkCallback);
            } else {
                so.a.f113317a.unregisterReceiver(this);
            }
        }
    }
}
