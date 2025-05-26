package dn2;

import am2.d0;
import kotlin.jvm.internal.Intrinsics;
import pn2.b0;
import pn2.h0;

/* loaded from: classes4.dex */
public final class d extends p {
    public d(byte b13) {
        super(Byte.valueOf(b13));
    }

    @Override // dn2.g
    public final b0 a(d0 module) {
        Intrinsics.checkNotNullParameter(module, "module");
        xl2.l f13 = module.f();
        f13.getClass();
        h0 t13 = f13.t(xl2.o.BYTE);
        if (t13 != null) {
            Intrinsics.checkNotNullExpressionValue(t13, "getByteType(...)");
            return t13;
        }
        xl2.l.a(57);
        throw null;
    }

    @Override // dn2.g
    public final String toString() {
        return ((Number) this.f55623a).intValue() + ".toByte()";
    }
}
