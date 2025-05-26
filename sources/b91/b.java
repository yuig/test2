package b91;

import com.pinterest.hairball.network.d;
import com.pinterest.hairball.network.e;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b extends e {

    /* renamed from: a, reason: collision with root package name */
    public final x20.a f22245a;

    public b(x20.a tryOnService) {
        Intrinsics.checkNotNullParameter(tryOnService, "tryOnService");
        this.f22245a = tryOnService;
    }

    @Override // com.pinterest.hairball.network.e
    public final d getBuilder(Object... params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return new j90.b(this);
    }
}
