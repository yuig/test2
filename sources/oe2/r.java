package oe2;

import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class r {
    public abstract Object a(v vVar);

    public final r b() {
        return this instanceof pe2.a ? this : new pe2.a(this);
    }

    public final String c(Object obj) {
        wo2.j jVar = new wo2.j();
        try {
            d(new x(jVar), obj);
            return jVar.M();
        } catch (IOException e13) {
            throw new AssertionError(e13);
        }
    }

    public abstract void d(y yVar, Object obj);
}
