package qm;

import a.cb;
import com.google.gson.JsonSyntaxException;
import java.util.UUID;

/* loaded from: classes.dex */
public final class v0 extends nm.i0 {
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        String Y0 = aVar.Y0();
        try {
            return UUID.fromString(Y0);
        } catch (IllegalArgumentException e13) {
            StringBuilder o13 = cb.o("Failed parsing '", Y0, "' as UUID; at path ");
            o13.append(aVar.o());
            throw new JsonSyntaxException(o13.toString(), e13);
        }
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        UUID uuid = (UUID) obj;
        cVar.M(uuid == null ? null : uuid.toString());
    }
}
