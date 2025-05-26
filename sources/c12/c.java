package c12;

import com.pinterest.api.model.w01;
import kotlin.jvm.internal.Intrinsics;
import rz.d;

/* loaded from: classes2.dex */
public final class c implements d {
    @Override // rz.d
    public final Object b(vd0.c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        vd0.c m13 = pinterestJsonObject.m("data");
        Intrinsics.f(m13);
        Object e13 = vd0.c.f125622b.e(m13.f125623a, w01.class);
        Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.Visit");
        return (w01) e13;
    }
}
