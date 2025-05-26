package qm;

import com.google.gson.JsonSyntaxException;

/* loaded from: classes.dex */
public final class h0 extends nm.i0 {
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        try {
            return Long.valueOf(aVar.W1());
        } catch (NumberFormatException e13) {
            throw new JsonSyntaxException(e13);
        }
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            cVar.m();
        } else {
            cVar.J(number.longValue());
        }
    }
}
