package org.chromium.net;

import java.net.InetAddress;
import java.util.List;
import org.chromium.base.annotations.CalledByNative;

/* loaded from: classes2.dex */
public class DnsStatus {
    private final List<InetAddress> mDnsServers;
    private final boolean mPrivateDnsActive;
    private final String mPrivateDnsServerName;
    private final String mSearchDomains;

    public DnsStatus(List<InetAddress> list, boolean z13, String str, String str2) {
        this.mDnsServers = list;
        this.mPrivateDnsActive = z13;
        this.mPrivateDnsServerName = str == null ? "" : str;
        this.mSearchDomains = str2 == null ? "" : str2;
    }

    @CalledByNative
    public byte[][] getDnsServers() {
        byte[][] bArr = new byte[this.mDnsServers.size()][];
        for (int i13 = 0; i13 < this.mDnsServers.size(); i13++) {
            bArr[i13] = this.mDnsServers.get(i13).getAddress();
        }
        return bArr;
    }

    @CalledByNative
    public boolean getPrivateDnsActive() {
        return this.mPrivateDnsActive;
    }

    @CalledByNative
    public String getPrivateDnsServerName() {
        return this.mPrivateDnsServerName;
    }

    @CalledByNative
    public String getSearchDomains() {
        return this.mSearchDomains;
    }
}
