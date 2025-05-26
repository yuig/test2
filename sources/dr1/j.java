package dr1;

import kotlin.jvm.internal.Intrinsics;
import qr1.d0;

/* loaded from: classes2.dex */
public final class j implements rz.d {
    @Override // rz.d
    public final Object b(vd0.c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        vd0.c m13 = pinterestJsonObject.m("data");
        if (m13 != null) {
            pinterestJsonObject = m13;
        }
        Object e13 = vd0.c.f125622b.e(pinterestJsonObject.f125623a, d0.class);
        Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.identity.core.model.SSOInfo");
        return (d0) e13;
    }
}
