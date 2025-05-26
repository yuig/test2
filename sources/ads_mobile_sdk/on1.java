package ads_mobile_sdk;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.SystemClock;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class on1 extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    public final /* synthetic */ un1 f9378a;

    public on1(un1 un1Var) {
        this.f9378a = un1Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        zn2.a aVar = zn2.b.f142311b;
        this.f9378a.f12132c.getClass();
        long Q2 = dl2.b.Q2(SystemClock.elapsedRealtime(), zn2.d.MILLISECONDS);
        ok.e0 e0Var = gk0.f5596a;
        gk0.a(new in1(Q2, network));
        un1 un1Var = this.f9378a;
        j0 j0Var = un1Var.f12131b;
        jn1 block = new jn1(un1Var, Q2, network, null);
        kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(networkCapabilities, "networkCapabilities");
        zn2.a aVar = zn2.b.f142311b;
        this.f9378a.f12132c.getClass();
        long Q2 = dl2.b.Q2(SystemClock.elapsedRealtime(), zn2.d.MILLISECONDS);
        ok.e0 e0Var = gk0.f5596a;
        gk0.a(new kn1(Q2, network, networkCapabilities));
        un1 un1Var = this.f9378a;
        j0 j0Var = un1Var.f12131b;
        ln1 block = new ln1(un1Var, Q2, network, networkCapabilities, null);
        kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        zn2.a aVar = zn2.b.f142311b;
        this.f9378a.f12132c.getClass();
        long Q2 = dl2.b.Q2(SystemClock.elapsedRealtime(), zn2.d.MILLISECONDS);
        ok.e0 e0Var = gk0.f5596a;
        gk0.a(new mn1(Q2, network));
        un1 un1Var = this.f9378a;
        j0 j0Var = un1Var.f12131b;
        nn1 block = new nn1(un1Var, Q2, null);
        kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
    }
}
