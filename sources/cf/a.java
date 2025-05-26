package cf;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a implements NsdManager.RegistrationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f27633a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f27634b;

    public a(String str, String str2) {
        this.f27633a = str;
        this.f27634b = str2;
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onRegistrationFailed(NsdServiceInfo serviceInfo, int i13) {
        Intrinsics.checkNotNullParameter(serviceInfo, "serviceInfo");
        b bVar = b.f27635a;
        b.a(this.f27634b);
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onServiceRegistered(NsdServiceInfo NsdServiceInfo) {
        Intrinsics.checkNotNullParameter(NsdServiceInfo, "NsdServiceInfo");
        if (Intrinsics.d(this.f27633a, NsdServiceInfo.getServiceName())) {
            return;
        }
        b bVar = b.f27635a;
        b.a(this.f27634b);
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onServiceUnregistered(NsdServiceInfo serviceInfo) {
        Intrinsics.checkNotNullParameter(serviceInfo, "serviceInfo");
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onUnregistrationFailed(NsdServiceInfo serviceInfo, int i13) {
        Intrinsics.checkNotNullParameter(serviceInfo, "serviceInfo");
    }
}
