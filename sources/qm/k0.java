package qm;

import a.cb;
import com.google.gson.JsonSyntaxException;

/* loaded from: classes.dex */
public final class k0 extends nm.i0 {
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        String Y0 = aVar.Y0();
        if (Y0.length() == 1) {
            return Character.valueOf(Y0.charAt(0));
        }
        StringBuilder o13 = cb.o("Expecting character, got: ", Y0, "; at ");
        o13.append(aVar.o());
        throw new JsonSyntaxException(o13.toString());
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Character ch3 = (Character) obj;
        cVar.M(ch3 == null ? null : String.valueOf(ch3));
    }
}
