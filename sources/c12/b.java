package c12;

import com.pinterest.api.model.fr0;
import kotlin.jvm.internal.Intrinsics;
import rz.d;

/* loaded from: classes2.dex */
public final class b implements d {
    @Override // rz.d
    public final Object b(vd0.c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        vd0.c m13 = pinterestJsonObject.m("data");
        vd0.c m14 = m13 != null ? m13.m("survey") : null;
        Intrinsics.f(m14);
        Object e13 = vd0.c.f125622b.e(m14.f125623a, fr0.class);
        Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.Survey");
        return (fr0) e13;
    }
}
