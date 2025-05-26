package qm;

import com.google.gson.JsonSyntaxException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class k1 extends nm.i0 {
    @Override // nm.i0
    public final Object c(um.a aVar) {
        try {
            return new AtomicInteger(aVar.o0());
        } catch (NumberFormatException e13) {
            throw new JsonSyntaxException(e13);
        }
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        cVar.J(((AtomicInteger) obj).get());
    }
}
