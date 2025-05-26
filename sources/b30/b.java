package b30;

import kotlin.jvm.internal.Intrinsics;
import rz.d;

/* loaded from: classes3.dex */
public final class b implements d {
    @Override // rz.d
    public final Object b(vd0.c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        vd0.c m13 = pinterestJsonObject.m("data");
        if (m13 != null) {
            pinterestJsonObject = m13;
        }
        String d2 = pinterestJsonObject.d("full_url");
        return d2 == null ? "" : d2;
    }
}
