package qm;

import com.google.gson.JsonSyntaxException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class x extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final z f104232a;

    public x(z zVar) {
        this.f104232a = zVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        Object f13 = f();
        Map map = this.f104232a.f104235a;
        try {
            aVar.c();
            while (aVar.hasNext()) {
                w wVar = (w) map.get(aVar.k0());
                if (wVar == null) {
                    aVar.E();
                } else {
                    h(f13, aVar, wVar);
                }
            }
            aVar.g();
            return g(f13);
        } catch (IllegalAccessException e13) {
            sm.c.c(e13);
            throw null;
        } catch (IllegalStateException e14) {
            throw new JsonSyntaxException((Throwable) e14);
        }
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        if (obj == null) {
            cVar.m();
            return;
        }
        cVar.d();
        try {
            Iterator it = this.f104232a.f104236b.iterator();
            while (it.hasNext()) {
                ((w) it.next()).a(cVar, obj);
            }
            cVar.g();
        } catch (IllegalAccessException e13) {
            sm.c.c(e13);
            throw null;
        }
    }

    public abstract Object f();

    public abstract Object g(Object obj);

    public abstract void h(Object obj, um.a aVar, w wVar);
}
