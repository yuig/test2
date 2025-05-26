package qm;

import com.google.gson.JsonSyntaxException;

/* loaded from: classes.dex */
public final class j1 extends nm.i0 {
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        try {
            return Integer.valueOf(aVar.o0());
        } catch (NumberFormatException e13) {
            throw new JsonSyntaxException((Throwable) e13);
        }
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        if (((Number) obj) == null) {
            cVar.m();
        } else {
            cVar.J(r4.intValue());
        }
    }
}
