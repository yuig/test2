package qm;

import a.cb;
import com.google.gson.JsonSyntaxException;
import java.util.Currency;

/* loaded from: classes.dex */
public final class w0 extends nm.i0 {
    @Override // nm.i0
    public final Object c(um.a aVar) {
        String Y0 = aVar.Y0();
        try {
            return Currency.getInstance(Y0);
        } catch (IllegalArgumentException e13) {
            StringBuilder o13 = cb.o("Failed parsing '", Y0, "' as Currency; at path ");
            o13.append(aVar.o());
            throw new JsonSyntaxException(o13.toString(), e13);
        }
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        cVar.M(((Currency) obj).getCurrencyCode());
    }
}
