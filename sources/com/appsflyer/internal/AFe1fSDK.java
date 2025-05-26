package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class AFe1fSDK {

    @NotNull
    final String getCurrencyIso4217Code;

    @NotNull
    final String getMediationNetwork;

    public AFe1fSDK(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.getCurrencyIso4217Code = str;
        this.getMediationNetwork = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFe1fSDK)) {
            return false;
        }
        AFe1fSDK aFe1fSDK = (AFe1fSDK) obj;
        return Intrinsics.d(this.getCurrencyIso4217Code, aFe1fSDK.getCurrencyIso4217Code) && Intrinsics.d(this.getMediationNetwork, aFe1fSDK.getMediationNetwork);
    }

    public final int hashCode() {
        return this.getMediationNetwork.hashCode() + (this.getCurrencyIso4217Code.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return a.a.m("HostConfig(prefix=", this.getCurrencyIso4217Code, ", host=", this.getMediationNetwork, ")");
    }
}
