package so0;

import com.pinterest.hairball.network.d;
import com.pinterest.hairball.network.e;
import j90.b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends e {

    /* renamed from: a, reason: collision with root package name */
    public final c82.e f114751a;

    public a(c82.e siteService) {
        Intrinsics.checkNotNullParameter(siteService, "siteService");
        this.f114751a = siteService;
    }

    @Override // com.pinterest.hairball.network.e
    public final d getBuilder(Object[] params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return new b(this);
    }
}
