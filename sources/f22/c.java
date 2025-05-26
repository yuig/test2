package f22;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c implements rz.d {
    @Override // rz.d
    public final Object b(vd0.c pinterestJsonObject) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        vd0.c m13 = pinterestJsonObject.m("data");
        if (m13 == null || (bool = m13.h("deactivation_permission", Boolean.FALSE)) == null) {
            bool = Boolean.FALSE;
        }
        return new b(bool.booleanValue());
    }
}
