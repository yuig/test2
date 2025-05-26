package fw0;

import com.pinterest.hairball.network.f;
import com.pinterest.hairball.network.g;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b extends g {

    /* renamed from: a, reason: collision with root package name */
    public final l20.a f63044a;

    public b(l20.a findImageService) {
        Intrinsics.checkNotNullParameter(findImageService, "findImageService");
        this.f63044a = findImageService;
    }

    @Override // com.pinterest.hairball.network.g
    public final f a(Object[] params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Object obj = params[0];
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.String");
        return new a(this, (String) obj, (String) params[1], (String) params[2]);
    }
}
