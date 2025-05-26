package b30;

import com.pinterest.hairball.network.f;
import com.pinterest.hairball.network.g;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: a, reason: collision with root package name */
    public final c f21415a;

    public a(c urlShortenerService) {
        Intrinsics.checkNotNullParameter(urlShortenerService, "urlShortenerService");
        this.f21415a = urlShortenerService;
    }

    @Override // com.pinterest.hairball.network.g
    public final f a(Object[] params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Object obj = params[0];
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.String");
        return new ar.a(this, (String) obj);
    }
}
