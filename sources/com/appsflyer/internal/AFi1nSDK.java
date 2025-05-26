package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class AFi1nSDK extends AFi1mSDK {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/net/Network;", "p0", "Landroid/net/NetworkInfo;", "z_", "(Landroid/net/Network;)Landroid/net/NetworkInfo;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFi1nSDK$1, reason: invalid class name */
    public static final class AnonymousClass1 extends s implements Function1<Network, NetworkInfo> {
        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: z_, reason: merged with bridge method [inline-methods] */
        public final NetworkInfo invoke(Network network) {
            ConnectivityManager connectivityManager = AFi1nSDK.this.getMonetizationNetwork;
            Intrinsics.f(connectivityManager);
            return connectivityManager.getNetworkInfo(network);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFi1nSDK(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    private static boolean y_(NetworkCapabilities networkCapabilities) {
        return (networkCapabilities == null || !networkCapabilities.hasTransport(4) || networkCapabilities.hasCapability(15)) ? false : true;
    }

    @Override // com.appsflyer.internal.AFi1mSDK
    @NotNull
    public final String AFAdRevenueData() {
        Network[] allNetworks;
        Sequence v13;
        Object obj;
        ConnectivityManager connectivityManager = this.getMonetizationNetwork;
        if (connectivityManager != null && (allNetworks = connectivityManager.getAllNetworks()) != null && (v13 = c0.v(allNetworks)) != null) {
            yn2.h hVar = new yn2.h(yn2.c0.q(v13, new AnonymousClass1()));
            while (true) {
                if (!hVar.hasNext()) {
                    obj = null;
                    break;
                }
                obj = hVar.next();
                if (AFi1mSDK.x_((NetworkInfo) obj)) {
                    break;
                }
            }
            NetworkInfo networkInfo = (NetworkInfo) obj;
            if (networkInfo != null) {
                int type = networkInfo.getType();
                return type != 0 ? type != 1 ? "unknown" : "WIFI" : "MOBILE";
            }
        }
        return "unknown";
    }

    @Override // com.appsflyer.internal.AFi1mSDK
    public final boolean getRevenue() {
        Network[] allNetworks;
        try {
            ConnectivityManager connectivityManager = this.getMonetizationNetwork;
            if (connectivityManager == null || (allNetworks = connectivityManager.getAllNetworks()) == null) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (Network network : allNetworks) {
                ConnectivityManager connectivityManager2 = this.getMonetizationNetwork;
                Intrinsics.f(connectivityManager2);
                NetworkCapabilities networkCapabilities = connectivityManager2.getNetworkCapabilities(network);
                if (networkCapabilities != null) {
                    arrayList.add(networkCapabilities);
                }
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (y_((NetworkCapabilities) it.next())) {
                    return true;
                }
            }
            return false;
        } catch (Exception e13) {
            AFLogger.afErrorLog("Failed collecting ivc data", e13);
            return false;
        }
    }
}
