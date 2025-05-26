package com.appsflyer.internal;

/* loaded from: classes.dex */
public class AFe1mSDK {
    public final long getMediationNetwork;

    public AFe1mSDK(long j13) {
        this.getMediationNetwork = j13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.getMediationNetwork == ((AFe1mSDK) obj).getMediationNetwork;
    }

    public int hashCode() {
        long j13 = this.getMediationNetwork;
        return (int) (j13 ^ (j13 >>> 32));
    }
}
