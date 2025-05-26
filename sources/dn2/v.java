package dn2;

import am2.d0;
import kotlin.jvm.internal.Intrinsics;
import pn2.b0;
import pn2.h0;

/* loaded from: classes4.dex */
public final class v extends g {
    public v() {
        super(null);
    }

    @Override // dn2.g
    public final b0 a(d0 module) {
        Intrinsics.checkNotNullParameter(module, "module");
        h0 A0 = module.f().o().A0(true);
        if (A0 != null) {
            Intrinsics.checkNotNullExpressionValue(A0, "getNullableNothingType(...)");
            return A0;
        }
        xl2.l.a(50);
        throw null;
    }
}
