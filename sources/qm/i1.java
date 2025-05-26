package qm;

import com.google.gson.JsonSyntaxException;

/* loaded from: classes.dex */
public final class i1 extends nm.i0 {
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        try {
            int o03 = aVar.o0();
            if (o03 <= 65535 && o03 >= -32768) {
                return Short.valueOf((short) o03);
            }
            StringBuilder s13 = a.a.s("Lossy conversion from ", o03, " to short; at path ");
            s13.append(aVar.o());
            throw new JsonSyntaxException(s13.toString());
        } catch (NumberFormatException e13) {
            throw new JsonSyntaxException(e13);
        }
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        if (((Number) obj) == null) {
            cVar.m();
        } else {
            cVar.J(r4.shortValue());
        }
    }
}
