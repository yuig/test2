package tq0;

import h32.f1;
import h32.u;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e extends b {
    @Override // tq0.b
    public final void l(Object impressionWrapper) {
        Intrinsics.checkNotNullParameter(impressionWrapper, "impressionWrapper");
        if (impressionWrapper instanceof d) {
            HashMap hashMap = new HashMap();
            d dVar = (d) impressionWrapper;
            String str = dVar.f118996b;
            if (str != null) {
                hashMap.put("story_id", str);
            }
            f1 f1Var = f1.MORE_IDEAS_FEED_UPSELL_IMPRESSION_ONE_PIXEL;
            u uVar = dVar.f118995a;
            this.f118989b.k0(f1Var, hashMap, uVar.f67266g, uVar);
        }
    }
}
