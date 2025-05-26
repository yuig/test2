package i00;

import kotlin.jvm.internal.Intrinsics;
import rz.d;
import vd0.c;

/* loaded from: classes.dex */
public final class a implements d {
    @Override // rz.d
    public final Object b(c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        String d2 = pinterestJsonObject.d("data");
        return d2 == null ? "" : d2;
    }
}
