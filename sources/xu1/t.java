package xu1;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class t extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f135974a;

    /* renamed from: b, reason: collision with root package name */
    public final o00.a f135975b;

    /* renamed from: c, reason: collision with root package name */
    public final int f135976c;

    public t(j0 applicationScope, o00.a coroutineDispatcherProvider) {
        Intrinsics.checkNotNullParameter(applicationScope, "applicationScope");
        Intrinsics.checkNotNullParameter(coroutineDispatcherProvider, "coroutineDispatcherProvider");
        this.f135974a = applicationScope;
        this.f135975b = coroutineDispatcherProvider;
        this.f135976c = 1;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        i[] iVarArr;
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(networkCapabilities, "networkCapabilities");
        boolean hasTransport = networkCapabilities.hasTransport(this.f135976c);
        int i13 = networkCapabilities.hasTransport(0) ? 2 : 0;
        uk2.d dVar = y.f135991e;
        i.Companion.getClass();
        iVarArr = i.values;
        dVar.c(iVarArr[(hasTransport ? 1 : 0) | i13]);
        kotlin.jvm.internal.j.z(this.f135974a, null, null, new o(this, hasTransport ? 1 : 0, i13, null), 3);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        y.f135991e.c(i.NONE);
        kotlin.jvm.internal.j.z(this.f135974a, null, null, new q(this, null), 3);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        y.f135991e.c(i.NONE);
        kotlin.jvm.internal.j.z(this.f135974a, null, null, new s(this, null), 3);
    }
}
