package nm;

import com.google.gson.JsonIOException;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class i0 {
    public final Object a(u uVar) {
        try {
            return c(new qm.m(uVar));
        } catch (IOException e13) {
            throw new JsonIOException((Throwable) e13);
        }
    }

    public final m b() {
        return new m(this, 2);
    }

    public abstract Object c(um.a aVar);

    public final s d(Object obj) {
        try {
            qm.o oVar = new qm.o();
            e(oVar, obj);
            return oVar.Q();
        } catch (IOException e13) {
            throw new JsonIOException(e13);
        }
    }

    public abstract void e(um.c cVar, Object obj);
}
