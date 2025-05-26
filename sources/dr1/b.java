package dr1;

import kotlin.jvm.internal.Intrinsics;
import nm.s;
import nm.u;

/* loaded from: classes2.dex */
public final class b implements rz.d {
    @Override // rz.d
    public final Object b(vd0.c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        s v13 = pinterestJsonObject.f125623a.v("data");
        v13.getClass();
        if (!(v13 instanceof u)) {
            String p13 = v13.p();
            Intrinsics.checkNotNullExpressionValue(p13, "getAsString(...)");
            return new qr1.d(p13);
        }
        vd0.c m13 = pinterestJsonObject.m("data");
        if (m13 != null) {
            pinterestJsonObject = m13;
        }
        Object e13 = vd0.c.f125622b.e(pinterestJsonObject.f125623a, qr1.d.class);
        Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.identity.core.model.AuthenticationResult");
        return (qr1.d) e13;
    }
}
