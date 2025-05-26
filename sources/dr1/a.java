package dr1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a implements rz.d {
    @Override // rz.d
    public final Object b(vd0.c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        vd0.c m13 = pinterestJsonObject.m("data");
        String o13 = m13 != null ? m13.o("access_token", "") : null;
        return o13 == null ? "" : o13;
    }
}
