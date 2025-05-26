package org.chromium.net;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.net.TransportInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.util.Log;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URLConnection;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Enumeration;
import java.util.List;
import kh2.u2;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.CalledByNativeUnchecked;

/* loaded from: classes2.dex */
public class AndroidNetworkLibrary {

    /* renamed from: a, reason: collision with root package name */
    public static Boolean f97330a;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f97331b;

    /* loaded from: classes4.dex */
    public static class NetworkSecurityPolicyProxy {
        private static NetworkSecurityPolicyProxy sInstance = new NetworkSecurityPolicyProxy();

        public static NetworkSecurityPolicyProxy getInstance() {
            return sInstance;
        }

        public static void setInstanceForTesting(NetworkSecurityPolicyProxy networkSecurityPolicyProxy) {
            sInstance = networkSecurityPolicyProxy;
        }

        public boolean isCleartextTrafficPermitted(String str) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        }

        public boolean isCleartextTrafficPermitted() {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        }
    }

    public static DnsStatus a(Network network) {
        ConnectivityManager connectivityManager;
        boolean isPrivateDnsActive;
        String privateDnsServerName;
        boolean z13;
        if (f97330a == null) {
            if (so.a.f113317a.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0) {
                z13 = true;
                f97330a = Boolean.valueOf(z13);
            }
            z13 = false;
            f97330a = Boolean.valueOf(z13);
        }
        if (!f97330a.booleanValue() || (connectivityManager = (ConnectivityManager) so.a.f113317a.getSystemService("connectivity")) == null) {
            return null;
        }
        if (network == null) {
            network = connectivityManager.getActiveNetwork();
        }
        if (network == null) {
            return null;
        }
        try {
            LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
            if (linkProperties == null) {
                return null;
            }
            List<InetAddress> dnsServers = linkProperties.getDnsServers();
            String domains = linkProperties.getDomains();
            if (Build.VERSION.SDK_INT < 28) {
                return new DnsStatus(dnsServers, false, "", domains);
            }
            isPrivateDnsActive = linkProperties.isPrivateDnsActive();
            privateDnsServerName = linkProperties.getPrivateDnsServerName();
            return new DnsStatus(dnsServers, isPrivateDnsActive, privateDnsServerName, domains);
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @CalledByNativeUnchecked
    public static void addTestRootCertificate(byte[] bArr) {
        X509Util.addTestRootCertificate(bArr);
    }

    public static WifiInfo b() {
        TransportInfo Y;
        if (!c()) {
            Intent h10 = so.a.h(so.a.f113317a, null, new IntentFilter("android.net.wifi.STATE_CHANGE"));
            if (h10 != null) {
                return (WifiInfo) h10.getParcelableExtra("wifiInfo");
            }
            return null;
        }
        if (Build.VERSION.SDK_INT < 31) {
            return ((WifiManager) so.a.f113317a.getSystemService("wifi")).getConnectionInfo();
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) so.a.f113317a.getSystemService("connectivity");
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasTransport(1) && (Y = u2.Y(networkCapabilities)) != null && (Y instanceof WifiInfo)) {
                return (WifiInfo) Y;
            }
        }
        return null;
    }

    public static boolean c() {
        boolean z13;
        if (f97331b == null) {
            if (so.a.f113317a.checkPermission("android.permission.ACCESS_WIFI_STATE", Process.myPid(), Process.myUid()) == 0) {
                z13 = true;
                f97331b = Boolean.valueOf(z13);
            }
            z13 = false;
            f97331b = Boolean.valueOf(z13);
        }
        return f97331b.booleanValue();
    }

    @CalledByNativeUnchecked
    public static void clearTestRootCertificates() {
        X509Util.clearTestRootCertificates();
    }

    @CalledByNative
    public static DnsStatus getCurrentDnsStatus() {
        return a(null);
    }

    @CalledByNative
    public static DnsStatus getDnsStatusForNetwork(long j13) {
        Network fromNetworkHandle;
        try {
            fromNetworkHandle = Network.fromNetworkHandle(j13);
            return a(fromNetworkHandle);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @CalledByNative
    public static boolean getIsCaptivePortal() {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = (ConnectivityManager) so.a.f113317a.getSystemService("connectivity");
        return (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(17)) ? false : true;
    }

    @CalledByNative
    public static boolean getIsRoaming() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) so.a.f113317a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return false;
        }
        return activeNetworkInfo.isRoaming();
    }

    @CalledByNative
    public static String getMimeTypeFromExtension(String str) {
        return URLConnection.guessContentTypeFromName("foo." + str);
    }

    @CalledByNative
    public static String getNetworkOperator() {
        TelephonyManager telephonyManager = (TelephonyManager) so.a.f113317a.getSystemService("phone");
        return telephonyManager == null ? "" : telephonyManager.getNetworkOperator();
    }

    @CalledByNative
    public static byte[][] getUserAddedRoots() {
        return X509Util.getUserAddedRoots();
    }

    @CalledByNative
    public static String getWifiSSID() {
        String ssid;
        WifiInfo b13 = b();
        return (b13 == null || (ssid = b13.getSSID()) == null || ssid.equals("<unknown ssid>")) ? "" : ssid;
    }

    @CalledByNative
    public static int getWifiSignalLevel(int i13) {
        int intExtra;
        int calculateSignalLevel;
        Context context = so.a.f113317a;
        if (context == null || context.getContentResolver() == null) {
            return -1;
        }
        if (c()) {
            WifiInfo b13 = b();
            if (b13 == null) {
                return -1;
            }
            intExtra = b13.getRssi();
        } else {
            try {
                Intent h10 = so.a.h(so.a.f113317a, null, new IntentFilter("android.net.wifi.RSSI_CHANGED"));
                if (h10 == null) {
                    return -1;
                }
                intExtra = h10.getIntExtra("newRssi", Integer.MIN_VALUE);
            } catch (IllegalArgumentException unused) {
            }
        }
        if (intExtra != Integer.MIN_VALUE && (calculateSignalLevel = WifiManager.calculateSignalLevel(intExtra, i13)) >= 0 && calculateSignalLevel < i13) {
            return calculateSignalLevel;
        }
        return -1;
    }

    @CalledByNative
    public static boolean haveOnlyLoopbackAddresses() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                return false;
            }
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                try {
                    if (nextElement.isUp() && !nextElement.isLoopback()) {
                        return false;
                    }
                } catch (SocketException unused) {
                }
            }
            return true;
        } catch (Exception e13) {
            Log.w("AndroidNetworkLibrary", "could not get network interfaces: " + e13);
            return false;
        }
    }

    @CalledByNative
    public static boolean isCleartextPermitted(String str) {
        try {
            return NetworkSecurityPolicyProxy.getInstance().isCleartextTrafficPermitted(str);
        } catch (IllegalArgumentException unused) {
            return NetworkSecurityPolicyProxy.getInstance().isCleartextTrafficPermitted();
        }
    }

    @CalledByNative
    public static boolean reportBadDefaultNetwork() {
        ConnectivityManager connectivityManager = (ConnectivityManager) so.a.f113317a.getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        connectivityManager.reportNetworkConnectivity(null, false);
        return true;
    }

    @CalledByNative
    public static void tagSocket(int i13, int i14, int i15) {
        int threadStatsTag = TrafficStats.getThreadStatsTag();
        if (i15 != threadStatsTag) {
            TrafficStats.setThreadStatsTag(i15);
        }
        if (i14 != -1) {
            ThreadStatsUid.set(i14);
        }
        ParcelFileDescriptor adoptFd = ParcelFileDescriptor.adoptFd(i13);
        b bVar = new b(adoptFd.getFileDescriptor());
        TrafficStats.tagSocket(bVar);
        bVar.close();
        adoptFd.detachFd();
        if (i15 != threadStatsTag) {
            TrafficStats.setThreadStatsTag(threadStatsTag);
        }
        if (i14 != -1) {
            ThreadStatsUid.clear();
        }
    }

    @CalledByNative
    public static AndroidCertVerifyResult verifyServerCertificates(byte[][] bArr, String str, String str2) {
        try {
            return X509Util.verifyServerCertificates(bArr, str, str2);
        } catch (IllegalArgumentException unused) {
            return new AndroidCertVerifyResult(-1);
        } catch (KeyStoreException unused2) {
            return new AndroidCertVerifyResult(-1);
        } catch (NoSuchAlgorithmException unused3) {
            return new AndroidCertVerifyResult(-1);
        }
    }
}
