package vc;

import kotlin.jvm.internal.Intrinsics;
import pc.u0;

/* loaded from: classes.dex */
public final class m implements ad.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125545a;

    public /* synthetic */ m(int i13) {
        this.f125545a = i13;
    }

    @Override // ad.a
    public final do2.i a(pc.f request, ad.b chain) {
        ad.a aVar;
        switch (this.f125545a) {
            case 0:
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(chain, "chain");
                return new pb.k(new l(chain, request, null));
            case 1:
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(chain, "chain");
                return new pb.k(new p(chain, request, null));
            case 2:
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(chain, "chain");
                pc.e a13 = request.a(request.f99541a);
                d7.b.D(a13);
                return chain.a(a13.d());
            case 3:
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(chain, "chain");
                if (!(request.f99541a instanceof u0)) {
                    return chain.a(request);
                }
                Intrinsics.checkNotNullParameter(request, "<this>");
                g gVar = (g) request.f99543c.a(g.f125526c);
                if (gVar == null || (aVar = gVar.f125527b) == null) {
                    aVar = r.f125567c;
                }
                return aVar.a(request, chain);
            case 4:
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(chain, "chain");
                return new pb.k(new q(chain, request, null));
            default:
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(chain, "chain");
                return chain.a(request);
        }
    }
}
