package qm;

import a.cb;
import com.google.gson.JsonSyntaxException;
import java.math.BigInteger;

/* loaded from: classes.dex */
public final class n0 extends nm.i0 {
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        String Y0 = aVar.Y0();
        try {
            bs1.c.w(Y0);
            return new BigInteger(Y0);
        } catch (NumberFormatException e13) {
            StringBuilder o13 = cb.o("Failed parsing '", Y0, "' as BigInteger; at path ");
            o13.append(aVar.o());
            throw new JsonSyntaxException(o13.toString(), e13);
        }
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        cVar.L((BigInteger) obj);
    }
}
