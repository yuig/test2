package pb;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import ao2.k2;
import ao2.o1;
import co2.y;
import co2.z;
import com.bugsnag.android.n;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kb.b0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f99407a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f99408b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f99409c;

    public e(k2 k2Var, z zVar) {
        this.f99407a = 0;
        this.f99408b = k2Var;
        this.f99409c = zVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        Function2 function2;
        switch (this.f99407a) {
            case 1:
                super.onAvailable(network);
                if (((AtomicBoolean) this.f99409c).getAndSet(true) && (function2 = (Function2) this.f99408b) != null) {
                    function2.invoke(Boolean.TRUE, "unknown");
                    break;
                }
                break;
            default:
                super.onAvailable(network);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.f99407a) {
            case 0:
                Intrinsics.checkNotNullParameter(network, "network");
                Intrinsics.checkNotNullParameter(networkCapabilities, "networkCapabilities");
                ((o1) this.f99408b).cancel((CancellationException) null);
                b0.e().a(m.f99427a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
                ((y) ((z) this.f99409c)).g(a.f99402a);
                break;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.f99407a) {
            case 0:
                Intrinsics.checkNotNullParameter(network, "network");
                ((o1) this.f99408b).cancel((CancellationException) null);
                b0.e().a(m.f99427a, "NetworkRequestConstraintController onLost callback");
                ((y) ((z) this.f99409c)).g(new b(7));
                break;
            default:
                super.onLost(network);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        Function2 function2;
        switch (this.f99407a) {
            case 1:
                super.onUnavailable();
                if (((AtomicBoolean) this.f99409c).getAndSet(true) && (function2 = (Function2) this.f99408b) != null) {
                    function2.invoke(Boolean.FALSE, "unknown");
                    break;
                }
                break;
            default:
                super.onUnavailable();
                break;
        }
    }

    public e(n nVar) {
        this.f99407a = 1;
        this.f99408b = nVar;
        this.f99409c = new AtomicBoolean(false);
    }
}
