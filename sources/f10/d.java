package f10;

import do2.i;
import ed.m;
import ey.k3;
import kotlin.jvm.internal.Intrinsics;
import pc.f;
import pc.o0;

/* loaded from: classes.dex */
public final class d implements dd.a {

    /* renamed from: a, reason: collision with root package name */
    public final m f60774a;

    /* renamed from: b, reason: collision with root package name */
    public final k3 f60775b;

    public d(m apolloHttpNetworkTransport, k3 perfLogger) {
        Intrinsics.checkNotNullParameter(apolloHttpNetworkTransport, "apolloHttpNetworkTransport");
        Intrinsics.checkNotNullParameter(perfLogger, "perfLogger");
        this.f60774a = apolloHttpNetworkTransport;
        this.f60775b = perfLogger;
    }

    @Override // dd.a
    public final i a(f apolloRequest) {
        Intrinsics.checkNotNullParameter(apolloRequest, "request");
        o0 apolloOperation = apolloRequest.f99541a;
        Intrinsics.checkNotNullParameter(apolloOperation, "apolloOperation");
        w00.a pinterestOperation = new w00.a(apolloOperation);
        Intrinsics.checkNotNullParameter(apolloRequest, "apolloRequest");
        Intrinsics.checkNotNullParameter(pinterestOperation, "pinterestOperation");
        return this.f60774a.a(apolloRequest.a(pinterestOperation).d());
    }

    @Override // dd.a
    public final void dispose() {
        this.f60774a.dispose();
    }
}
