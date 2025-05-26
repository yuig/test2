package d10;

import do2.i;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h implements ad.a {
    @Override // ad.a
    public final i a(pc.f request, ad.b chain) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(chain, "chain");
        pc.e a13 = request.a(request.f99541a);
        a13.c("X-Pinterest-Query-Hash", request.f99541a.a());
        return chain.a(a13.d());
    }
}
