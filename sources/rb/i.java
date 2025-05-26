package rb;

import android.content.Context;
import android.net.ConnectivityManager;
import kb.b0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends f {

    /* renamed from: f, reason: collision with root package name */
    public final ConnectivityManager f107068f;

    /* renamed from: g, reason: collision with root package name */
    public final h f107069g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, vb.b taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Object systemService = this.f107061b.getSystemService("connectivity");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f107068f = (ConnectivityManager) systemService;
        this.f107069g = new h(this, 0);
    }

    @Override // rb.f
    public final Object a() {
        return j.a(this.f107068f);
    }

    @Override // rb.f
    public final void c() {
        try {
            b0.e().a(j.f107070a, "Registering network callback");
            ConnectivityManager connectivityManager = this.f107068f;
            h networkCallback = this.f107069g;
            Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
            Intrinsics.checkNotNullParameter(networkCallback, "networkCallback");
            connectivityManager.registerDefaultNetworkCallback(networkCallback);
        } catch (IllegalArgumentException e13) {
            b0.e().d(j.f107070a, "Received exception while registering network callback", e13);
        } catch (SecurityException e14) {
            b0.e().d(j.f107070a, "Received exception while registering network callback", e14);
        }
    }

    @Override // rb.f
    public final void d() {
        try {
            b0.e().a(j.f107070a, "Unregistering network callback");
            ConnectivityManager connectivityManager = this.f107068f;
            h networkCallback = this.f107069g;
            Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
            Intrinsics.checkNotNullParameter(networkCallback, "networkCallback");
            connectivityManager.unregisterNetworkCallback(networkCallback);
        } catch (IllegalArgumentException e13) {
            b0.e().d(j.f107070a, "Received exception while unregistering network callback", e13);
        } catch (SecurityException e14) {
            b0.e().d(j.f107070a, "Received exception while unregistering network callback", e14);
        }
    }
}
