package xu1;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.util.Log;
import ao2.j0;
import do2.t2;
import do2.u2;
import java.util.concurrent.atomic.AtomicBoolean;
import jk2.l1;
import kotlin.jvm.internal.Intrinsics;
import t3.s1;
import uj2.a0;

/* loaded from: classes2.dex */
public final class d extends ConnectivityManager.NetworkCallback implements g {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f135947i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f135948a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f135949b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f135950c;

    /* renamed from: d, reason: collision with root package name */
    public ConnectivityManager f135951d;

    /* renamed from: e, reason: collision with root package name */
    public final uk2.d f135952e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f135953f;

    /* renamed from: g, reason: collision with root package name */
    public final f f135954g;

    /* renamed from: h, reason: collision with root package name */
    public final t2 f135955h;

    public d(Context context, jk2.v appBackgroundStateObservable, j0 applicationScope) {
        a0 observeOnScheduler = wj2.c.a();
        Intrinsics.checkNotNullExpressionValue(observeOnScheduler, "mainThread(...)");
        NetworkRequest networkRequest = new NetworkRequest.Builder().addCapability(12).build();
        Intrinsics.checkNotNullExpressionValue(networkRequest, "build(...)");
        boolean z13 = e.f135956a.f135957a.get();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(observeOnScheduler, "observeOnScheduler");
        Intrinsics.checkNotNullParameter(networkRequest, "networkRequest");
        Intrinsics.checkNotNullParameter(appBackgroundStateObservable, "appBackgroundStateObservable");
        Intrinsics.checkNotNullParameter(applicationScope, "applicationScope");
        this.f135948a = context;
        this.f135949b = observeOnScheduler;
        this.f135950c = applicationScope;
        this.f135952e = s1.h("create(...)");
        this.f135953f = new AtomicBoolean(false);
        this.f135954g = new f(z13);
        this.f135955h = u2.a(Boolean.FALSE);
        appBackgroundStateObservable.o().F(new or1.j(13, new hk1.t(this, 24)), new or1.j(14, b.f135943i), ck2.i.f27923c, ck2.i.f27924d);
        ConnectivityManager connectivityManager = this.f135951d;
        if (connectivityManager == null) {
            Object systemService = context.getSystemService("connectivity");
            connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            this.f135951d = connectivityManager;
        }
        if (connectivityManager != null) {
            connectivityManager.registerNetworkCallback(networkRequest, this);
        }
    }

    @Override // xu1.g
    public final uj2.q a() {
        l1 A = this.f135952e.o().A(this.f135949b);
        Intrinsics.checkNotNullExpressionValue(A, "observeOn(...)");
        return A;
    }

    public final void b(boolean z13) {
        this.f135954g.a(z13);
        if (this.f135953f.get()) {
            this.f135952e.c(Boolean.valueOf(z13));
            kotlin.jvm.internal.j.z(this.f135950c, null, null, new c(this, z13, null), 3);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        Log.d("NetworkStateMonitor", "network available");
        ConnectivityManager connectivityManager = this.f135951d;
        if (connectivityManager == null) {
            Object systemService = this.f135948a.getSystemService("connectivity");
            connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            this.f135951d = connectivityManager;
        }
        b(connectivityManager == null ? true : bs1.c.k1(connectivityManager));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        Log.d("NetworkStateMonitor", "network lost");
        ConnectivityManager connectivityManager = this.f135951d;
        if (connectivityManager == null) {
            Object systemService = this.f135948a.getSystemService("connectivity");
            connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            this.f135951d = connectivityManager;
        }
        b(connectivityManager == null ? true : bs1.c.k1(connectivityManager));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        Log.d("NetworkStateMonitor", "network unavailable");
        ConnectivityManager connectivityManager = this.f135951d;
        if (connectivityManager == null) {
            Object systemService = this.f135948a.getSystemService("connectivity");
            connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            this.f135951d = connectivityManager;
        }
        b(connectivityManager == null ? true : bs1.c.k1(connectivityManager));
    }
}
