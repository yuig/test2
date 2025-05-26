package dn2;

import am2.d0;
import kotlin.jvm.internal.Intrinsics;
import pn2.b0;
import pn2.h0;
import t3.s1;

/* loaded from: classes4.dex */
public final class e extends p {
    public e(char c13) {
        super(Character.valueOf(c13));
    }

    @Override // dn2.g
    public final b0 a(d0 module) {
        Intrinsics.checkNotNullParameter(module, "module");
        xl2.l f13 = module.f();
        f13.getClass();
        h0 t13 = f13.t(xl2.o.CHAR);
        if (t13 != null) {
            Intrinsics.checkNotNullExpressionValue(t13, "getCharType(...)");
            return t13;
        }
        xl2.l.a(63);
        throw null;
    }

    @Override // dn2.g
    public final String toString() {
        String valueOf;
        Object[] objArr = new Object[2];
        Object obj = this.f55623a;
        objArr[0] = Integer.valueOf(((Character) obj).charValue());
        char charValue = ((Character) obj).charValue();
        if (charValue == '\b') {
            valueOf = "\\b";
        } else if (charValue == '\t') {
            valueOf = "\\t";
        } else if (charValue == '\n') {
            valueOf = "\\n";
        } else if (charValue == '\f') {
            valueOf = "\\f";
        } else if (charValue == '\r') {
            valueOf = "\\r";
        } else {
            byte type = (byte) Character.getType(charValue);
            valueOf = (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? "?" : String.valueOf(charValue);
        }
        objArr[1] = valueOf;
        return s1.d(objArr, 2, "\\u%04X ('%s')", "format(...)");
    }
}
