package oh1;

import com.pinterest.api.model.AggregatedCommentFeed;
import com.pinterest.api.model.z2;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class j extends kotlin.jvm.internal.p implements kl2.m {
    @Override // kl2.m
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        AggregatedCommentFeed p03 = (AggregatedCommentFeed) obj;
        rp0.d p13 = (rp0.d) obj2;
        Intrinsics.checkNotNullParameter(p03, "p0");
        Intrinsics.checkNotNullParameter(p13, "p1");
        ((m) this.receiver).Q3(p03, p13, ((Number) obj3).intValue(), (z2) obj4);
        return Unit.f80348a;
    }
}
