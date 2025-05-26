package dn2;

import am2.d0;
import kotlin.jvm.internal.Intrinsics;
import pn2.b0;
import pn2.h0;

/* loaded from: classes2.dex */
public final class x extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(String value) {
        super(value);
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // dn2.g
    public final b0 a(d0 module) {
        Intrinsics.checkNotNullParameter(module, "module");
        h0 v13 = module.f().v();
        Intrinsics.checkNotNullExpressionValue(v13, "getStringType(...)");
        return v13;
    }

    @Override // dn2.g
    public final String toString() {
        return ep.b.k(new StringBuilder("\""), (String) this.f55623a, '\"');
    }
}
