package rb;

import ae.q;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import he.n;
import kb.b0;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* loaded from: classes.dex */
public final class h extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107066a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f107067b;

    public /* synthetic */ h(Object obj, int i13) {
        this.f107066a = i13;
        this.f107067b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        boolean z13;
        switch (this.f107066a) {
            case 1:
                n.f().post(new q(this, true));
                break;
            case 2:
            default:
                super.onAvailable(network);
                break;
            case 3:
                NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = (NetworkChangeNotifierAutoDetect) this.f107067b;
                z13 = networkChangeNotifierAutoDetect.mRegistered;
                if (z13) {
                    networkChangeNotifierAutoDetect.connectionTypeChanged();
                    break;
                }
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
        pb.h a13;
        switch (this.f107066a) {
            case 0:
                Intrinsics.checkNotNullParameter(network, "network");
                Intrinsics.checkNotNullParameter(capabilities, "capabilities");
                b0.e().a(j.f107070a, "Network capabilities changed: " + capabilities);
                i iVar = (i) this.f107067b;
                if (Build.VERSION.SDK_INT >= 28) {
                    Intrinsics.checkNotNullParameter(capabilities, "<this>");
                    a13 = new pb.h(capabilities.hasCapability(12), capabilities.hasCapability(16), true ^ capabilities.hasCapability(11), capabilities.hasCapability(18));
                } else {
                    a13 = j.a(iVar.f107068f);
                }
                iVar.b(a13);
                break;
            case 1:
            default:
                super.onCapabilitiesChanged(network, capabilities);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(network, "network");
                Intrinsics.checkNotNullParameter(capabilities, "networkCapabilities");
                ac2.f fVar = ac2.f.f1945a;
                ac2.f.d(capabilities.hasTransport(1), capabilities.hasTransport(0));
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        switch (this.f107066a) {
            case 3:
                onAvailable(null);
                break;
            default:
                super.onLinkPropertiesChanged(network, linkProperties);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.f107066a) {
            case 0:
                Intrinsics.checkNotNullParameter(network, "network");
                b0.e().a(j.f107070a, "Network connection lost");
                i iVar = (i) this.f107067b;
                iVar.b(j.a(iVar.f107068f));
                break;
            case 1:
                n.f().post(new q(this, false));
                break;
            case 2:
                Intrinsics.checkNotNullParameter(network, "network");
                ac2.f fVar = ac2.f.f1945a;
                ac2.f.d(false, false);
                break;
            default:
                onAvailable(null);
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        this(networkChangeNotifierAutoDetect, 3);
        this.f107066a = 3;
    }
}
