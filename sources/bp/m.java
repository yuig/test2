package bp;

import com.pinterest.api.model.Feed;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m extends b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f23643e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final Object f23644f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Feed feed, l adapter, z12.a service) {
        super(feed, adapter);
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(service, "service");
        this.f23644f = service;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Feed feed, o adapter, z12.f service) {
        super(feed, adapter);
        Intrinsics.checkNotNullParameter(feed, "feed");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(service, "service");
        this.f23644f = service;
    }
}
