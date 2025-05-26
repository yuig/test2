package org.chromium.net;

import J.N;
import android.annotation.SuppressLint;
import java.util.ArrayList;
import java.util.Iterator;
import m60.f0;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* loaded from: classes2.dex */
public class NetworkChangeNotifier {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    @SuppressLint({"StaticFieldLeak"})
    private static NetworkChangeNotifier sInstance;
    private NetworkChangeNotifierAutoDetect mAutoDetector;
    private int mCurrentConnectionType = 0;
    private int mCurrentConnectionCost = 0;
    private final ArrayList<Long> mNativeChangeNotifiers = new ArrayList<>();
    private final dp2.g mConnectionTypeObservers = new dp2.g();

    /* loaded from: classes4.dex */
    public interface ConnectionTypeObserver {
        void onConnectionTypeChanged(int i13);
    }

    public static void addConnectionTypeObserver(ConnectionTypeObserver connectionTypeObserver) {
        getInstance().addConnectionTypeObserverInternal(connectionTypeObserver);
    }

    private void addConnectionTypeObserverInternal(ConnectionTypeObserver connectionTypeObserver) {
        this.mConnectionTypeObservers.b(connectionTypeObserver);
    }

    private void destroyAutoDetector() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.mAutoDetector;
        if (networkChangeNotifierAutoDetect != null) {
            networkChangeNotifierAutoDetect.destroy();
            this.mAutoDetector = null;
        }
    }

    @CalledByNative
    public static void fakeConnectionCostChanged(int i13) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfConnectionCostChange(i13);
    }

    @CalledByNative
    public static void fakeConnectionSubtypeChanged(int i13) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfConnectionSubtypeChange(i13);
    }

    @CalledByNative
    public static void fakeDefaultNetwork(long j13, int i13) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfConnectionTypeChange(i13, j13);
    }

    @CalledByNative
    public static void fakeNetworkConnected(long j13, int i13) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfNetworkConnect(j13, i13);
    }

    @CalledByNative
    public static void fakeNetworkDisconnected(long j13) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfNetworkDisconnect(j13);
    }

    @CalledByNative
    public static void fakeNetworkSoonToBeDisconnected(long j13) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfNetworkSoonToDisconnect(j13);
    }

    @CalledByNative
    public static void fakePurgeActiveNetworkList(long[] jArr) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversToPurgeActiveNetworkList(jArr);
    }

    @CalledByNative
    public static void forceConnectivityState(boolean z13) {
        setAutoDetectConnectivityState(false);
        getInstance().forceConnectivityStateInternal(z13);
    }

    private void forceConnectivityStateInternal(boolean z13) {
        if ((this.mCurrentConnectionType != 6) != z13) {
            updateCurrentConnectionType(z13 ? 0 : 6);
            notifyObserversOfConnectionSubtypeChange(!z13 ? 1 : 0);
        }
    }

    public static NetworkChangeNotifierAutoDetect getAutoDetectorForTest() {
        return getInstance().mAutoDetector;
    }

    public static NetworkChangeNotifier getInstance() {
        return sInstance;
    }

    @CalledByNative
    public static NetworkChangeNotifier init() {
        if (sInstance == null) {
            sInstance = new NetworkChangeNotifier();
        }
        return sInstance;
    }

    public static boolean isInitialized() {
        return sInstance != null;
    }

    public static boolean isOnline() {
        return getInstance().getCurrentConnectionType() != 6;
    }

    public static void registerToReceiveNotificationsAlways() {
        getInstance().setAutoDetectConnectivityStateInternal(true, new RegistrationPolicyAlwaysRegister());
    }

    public static void removeConnectionTypeObserver(ConnectionTypeObserver connectionTypeObserver) {
        getInstance().removeConnectionTypeObserverInternal(connectionTypeObserver);
    }

    private void removeConnectionTypeObserverInternal(ConnectionTypeObserver connectionTypeObserver) {
        this.mConnectionTypeObservers.d(connectionTypeObserver);
    }

    public static void resetInstanceForTests() {
        sInstance = new NetworkChangeNotifier();
    }

    @CalledByNative
    public static void setAutoDetectConnectivityState(boolean z13) {
        getInstance().setAutoDetectConnectivityStateInternal(z13, new RegistrationPolicyApplicationStatus());
    }

    private void setAutoDetectConnectivityStateInternal(boolean z13, NetworkChangeNotifierAutoDetect.RegistrationPolicy registrationPolicy) {
        if (!z13) {
            destroyAutoDetector();
            return;
        }
        if (this.mAutoDetector == null) {
            NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = new NetworkChangeNotifierAutoDetect(new k(this), registrationPolicy);
            this.mAutoDetector = networkChangeNotifierAutoDetect;
            NetworkChangeNotifierAutoDetect.NetworkState currentNetworkState = networkChangeNotifierAutoDetect.getCurrentNetworkState();
            updateCurrentConnectionType(currentNetworkState.getConnectionType());
            updateCurrentConnectionCost(currentNetworkState.getConnectionCost());
            notifyObserversOfConnectionSubtypeChange(currentNetworkState.getConnectionSubtype());
        }
    }

    private void updateCurrentConnectionCost(int i13) {
        this.mCurrentConnectionCost = i13;
        notifyObserversOfConnectionCostChange(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateCurrentConnectionType(int i13) {
        this.mCurrentConnectionType = i13;
        notifyObserversOfConnectionTypeChange(i13);
    }

    @CalledByNative
    public void addNativeObserver(long j13) {
        this.mNativeChangeNotifiers.add(Long.valueOf(j13));
    }

    @CalledByNative
    public int getCurrentConnectionCost() {
        return this.mCurrentConnectionCost;
    }

    @CalledByNative
    public int getCurrentConnectionSubtype() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.mAutoDetector;
        if (networkChangeNotifierAutoDetect == null) {
            return 0;
        }
        return networkChangeNotifierAutoDetect.getCurrentNetworkState().getConnectionSubtype();
    }

    @CalledByNative
    public int getCurrentConnectionType() {
        return this.mCurrentConnectionType;
    }

    @CalledByNative
    public long getCurrentDefaultNetId() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.mAutoDetector;
        if (networkChangeNotifierAutoDetect == null) {
            return -1L;
        }
        return networkChangeNotifierAutoDetect.getDefaultNetId();
    }

    @CalledByNative
    public long[] getCurrentNetworksAndTypes() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.mAutoDetector;
        return networkChangeNotifierAutoDetect == null ? new long[0] : networkChangeNotifierAutoDetect.getNetworksAndTypes();
    }

    public void notifyObserversOfConnectionCostChange(int i13) {
        Iterator<Long> it = this.mNativeChangeNotifiers.iterator();
        while (it.hasNext()) {
            new f0().o0(it.next().longValue(), this, i13);
        }
    }

    public void notifyObserversOfConnectionSubtypeChange(int i13) {
        Iterator<Long> it = this.mNativeChangeNotifiers.iterator();
        while (it.hasNext()) {
            new f0().p0(it.next().longValue(), this, i13);
        }
    }

    public void notifyObserversOfConnectionTypeChange(int i13) {
        notifyObserversOfConnectionTypeChange(i13, getCurrentDefaultNetId());
    }

    public void notifyObserversOfNetworkConnect(long j13, int i13) {
        Iterator<Long> it = this.mNativeChangeNotifiers.iterator();
        while (it.hasNext()) {
            N.MBT1i5cd(it.next().longValue(), this, j13, i13);
        }
    }

    public void notifyObserversOfNetworkDisconnect(long j13) {
        Iterator<Long> it = this.mNativeChangeNotifiers.iterator();
        while (it.hasNext()) {
            N.MDpuHJTB(it.next().longValue(), this, j13);
        }
    }

    public void notifyObserversOfNetworkSoonToDisconnect(long j13) {
        Iterator<Long> it = this.mNativeChangeNotifiers.iterator();
        while (it.hasNext()) {
            N.MiJIMrTb(it.next().longValue(), this, j13);
        }
    }

    public void notifyObserversToPurgeActiveNetworkList(long[] jArr) {
        Iterator<Long> it = this.mNativeChangeNotifiers.iterator();
        while (it.hasNext()) {
            N.MpF$179U(it.next().longValue(), this, jArr);
        }
    }

    @CalledByNative
    public boolean registerNetworkCallbackFailed() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.mAutoDetector;
        if (networkChangeNotifierAutoDetect == null) {
            return false;
        }
        return networkChangeNotifierAutoDetect.registerNetworkCallbackFailed();
    }

    @CalledByNative
    public void removeNativeObserver(long j13) {
        this.mNativeChangeNotifiers.remove(Long.valueOf(j13));
    }

    private void notifyObserversOfConnectionTypeChange(int i13, long j13) {
        Iterator<Long> it = this.mNativeChangeNotifiers.iterator();
        while (it.hasNext()) {
            N.MbPIImnU(it.next().longValue(), this, i13, j13);
        }
        Iterator it2 = this.mConnectionTypeObservers.iterator();
        while (true) {
            dp2.f fVar = (dp2.f) it2;
            if (!fVar.hasNext()) {
                return;
            } else {
                ((ConnectionTypeObserver) fVar.next()).onConnectionTypeChanged(i13);
            }
        }
    }

    public static void resetInstanceForTests(NetworkChangeNotifier networkChangeNotifier) {
        sInstance = networkChangeNotifier;
    }

    public static void setAutoDetectConnectivityState(NetworkChangeNotifierAutoDetect.RegistrationPolicy registrationPolicy) {
        getInstance().setAutoDetectConnectivityStateInternal(true, registrationPolicy);
    }
}
