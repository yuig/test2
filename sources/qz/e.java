package qz;

import android.os.SystemClock;
import ey.m0;
import ey.n0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.internal.connection.RealCall;

/* loaded from: classes.dex */
public final class e extends EventListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f105390b;

    @Override // okhttp3.EventListener
    public final void B(RealCall call, Handshake handshake) {
        switch (this.f105390b) {
            case 0:
                Intrinsics.checkNotNullParameter(call, "call");
                vb0.j.f125474i = SystemClock.elapsedRealtime();
                super.B(call, handshake);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(call, "call");
                vb0.j.f125480o = SystemClock.elapsedRealtime();
                super.B(call, handshake);
                break;
            default:
                super.B(call, handshake);
                break;
        }
    }

    @Override // okhttp3.EventListener
    public final void C(RealCall call) {
        switch (this.f105390b) {
            case 0:
                Intrinsics.checkNotNullParameter(call, "call");
                vb0.j.f125473h = SystemClock.elapsedRealtime();
                super.C(call);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(call, "call");
                vb0.j.f125479n = SystemClock.elapsedRealtime();
                super.C(call);
                break;
            default:
                super.C(call);
                break;
        }
    }

    @Override // okhttp3.EventListener
    public final void d(Call call) {
        switch (this.f105390b) {
            case 1:
                Intrinsics.checkNotNullParameter(call, "call");
                new ey.g0(0, 0).i();
                break;
            case 2:
                Intrinsics.checkNotNullParameter(call, "call");
                new n0(0, 0).i();
                break;
            default:
                super.d(call);
                break;
        }
    }

    @Override // okhttp3.EventListener
    public final void f(Call call) {
        switch (this.f105390b) {
            case 1:
                Intrinsics.checkNotNullParameter(call, "call");
                new ey.f0(0, 0).i();
                break;
            case 2:
                Intrinsics.checkNotNullParameter(call, "call");
                new m0(0, 0).i();
                break;
            default:
                super.f(call);
                break;
        }
    }

    @Override // okhttp3.EventListener
    public final void m(Call call, String domainName, List inetAddressList) {
        switch (this.f105390b) {
            case 0:
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(domainName, "domainName");
                Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
                vb0.j.f125472g = SystemClock.elapsedRealtime();
                super.m(call, domainName, inetAddressList);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(domainName, "domainName");
                Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
                vb0.j.f125478m = SystemClock.elapsedRealtime();
                super.m(call, domainName, inetAddressList);
                break;
            default:
                super.m(call, domainName, inetAddressList);
                break;
        }
    }

    @Override // okhttp3.EventListener
    public final void n(Call call, String domainName) {
        switch (this.f105390b) {
            case 0:
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(domainName, "domainName");
                vb0.j.f125471f = SystemClock.elapsedRealtime();
                super.n(call, domainName);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(domainName, "domainName");
                vb0.j.f125477l = SystemClock.elapsedRealtime();
                super.n(call, domainName);
                break;
            default:
                super.n(call, domainName);
                break;
        }
    }
}
