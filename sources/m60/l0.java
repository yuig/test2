package m60;

import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final l0 f85920i = new l0(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        HashMap auxData = (HashMap) obj;
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        LinkedHashSet linkedHashSet = hs1.r.f70069g;
        auxData.put("perf_image_urls_prefetched", String.valueOf(linkedHashSet.size()));
        LinkedHashSet linkedHashSet2 = hs1.r.f70070h;
        auxData.put("perf_image_urls_request_hit_cache", String.valueOf(linkedHashSet2.size()));
        linkedHashSet.clear();
        linkedHashSet2.clear();
        return Unit.f80348a;
    }
}
