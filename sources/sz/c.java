package sz;

import com.pinterest.api.model.xs0;
import kotlin.jvm.internal.Intrinsics;
import rz.d;

/* loaded from: classes.dex */
public final class c implements d {
    @Override // rz.d
    public final Object b(vd0.c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        vd0.c m13 = pinterestJsonObject.m("data");
        if (m13 != null) {
            pinterestJsonObject = m13;
        }
        Object e13 = vd0.c.f125622b.e(pinterestJsonObject.f125623a, xs0.class);
        Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.ThirdPartyAdConfig");
        return (xs0) e13;
    }
}
