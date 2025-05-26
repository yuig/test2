package ad;

import ao2.f0;
import do2.i;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import pc.f;
import pc.j0;
import pc.o0;
import pc.u0;

/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final dd.a f2080a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f2081b;

    public c(dd.a networkTransport, dd.a subscriptionNetworkTransport, f0 dispatcher) {
        Intrinsics.checkNotNullParameter(networkTransport, "networkTransport");
        Intrinsics.checkNotNullParameter(subscriptionNetworkTransport, "subscriptionNetworkTransport");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f2080a = networkTransport;
        this.f2081b = dispatcher;
    }

    @Override // ad.a
    public final i a(f request, b chain) {
        i a13;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(chain, "chain");
        o0 o0Var = request.f99541a;
        boolean z13 = o0Var instanceof u0;
        dd.a aVar = this.f2080a;
        if (z13) {
            a13 = aVar.a(request);
        } else {
            if (!(o0Var instanceof j0)) {
                throw new IllegalStateException("".toString());
            }
            a13 = aVar.a(request);
        }
        return l0.j0(a13, this.f2081b);
    }
}
