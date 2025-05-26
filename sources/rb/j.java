package rb;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import kb.b0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f107070a;

    static {
        String h10 = b0.h("NetworkStateTracker");
        Intrinsics.checkNotNullExpressionValue(h10, "tagWithPrefix(\"NetworkStateTracker\")");
        f107070a = h10;
    }

    public static final pb.h a(ConnectivityManager connectivityManager) {
        boolean z13;
        NetworkCapabilities networkCapabilities;
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z14 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        try {
            Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
            Network activeNetwork = connectivityManager.getActiveNetwork();
            Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
            networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        } catch (SecurityException e13) {
            b0.e().d(f107070a, "Unable to validate active network", e13);
        }
        if (networkCapabilities != null) {
            Intrinsics.checkNotNullParameter(networkCapabilities, "<this>");
            z13 = networkCapabilities.hasCapability(16);
            return new pb.h(z14, z13, connectivityManager.isActiveNetworkMetered(), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
        }
        z13 = false;
        return new pb.h(z14, z13, connectivityManager.isActiveNetworkMetered(), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
    }
}
