package dr0;

import com.pinterest.api.model.yc0;
import com.pinterest.hairball.network.d;
import com.pinterest.hairball.network.e;
import kotlin.jvm.internal.Intrinsics;
import qx.b;

/* loaded from: classes5.dex */
public final class a extends e {

    /* renamed from: a, reason: collision with root package name */
    public final rr0.a f56212a;

    /* renamed from: b, reason: collision with root package name */
    public final z12.e f56213b;

    public a(rr0.a nextPageUrlFactory, z12.e repinActivityFeedPagingService) {
        Intrinsics.checkNotNullParameter(nextPageUrlFactory, "nextPageUrlFactory");
        Intrinsics.checkNotNullParameter(repinActivityFeedPagingService, "repinActivityFeedPagingService");
        this.f56212a = nextPageUrlFactory;
        this.f56213b = repinActivityFeedPagingService;
    }

    @Override // com.pinterest.hairball.network.e
    public final d getBuilder(Object... params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Object obj = params[0];
        return new b(this, obj instanceof yc0 ? (yc0) obj : null);
    }
}
