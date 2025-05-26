package wz;

import com.pinterest.api.model.v1;
import kotlin.jvm.internal.Intrinsics;
import rz.d;
import vd0.c;

/* loaded from: classes3.dex */
public final class a implements d {
    @Override // rz.d
    public final Object b(c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        c m13 = pinterestJsonObject.m("data");
        if (m13 != null) {
            pinterestJsonObject = m13;
        }
        Object e13 = c.f125622b.e(pinterestJsonObject.f125623a, v1.class);
        Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.AdsPromotions");
        return (v1) e13;
    }
}
