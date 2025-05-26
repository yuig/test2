package qm;

import com.google.gson.JsonSyntaxException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f104132a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f104133b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f104134c;

    public c(nm.o oVar, Type type, nm.i0 i0Var, pm.p pVar) {
        this.f104133b = new f0(oVar, i0Var, type);
        this.f104134c = pVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        int i13 = this.f104132a;
        Object obj = this.f104133b;
        Object obj2 = this.f104134c;
        switch (i13) {
            case 0:
                if (aVar.K() == um.b.NULL) {
                    aVar.B1();
                    return null;
                }
                Collection collection = (Collection) ((pm.p) obj2).u();
                aVar.a();
                while (aVar.hasNext()) {
                    collection.add(((nm.i0) obj).c(aVar));
                }
                aVar.f();
                return collection;
            default:
                Object c13 = ((c1) obj2).f104137c.c(aVar);
                if (c13 != null) {
                    Class cls = (Class) obj;
                    if (!cls.isInstance(c13)) {
                        throw new JsonSyntaxException("Expected a " + cls.getName() + " but was " + c13.getClass().getName() + "; at path " + aVar.o());
                    }
                }
                return c13;
        }
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        switch (this.f104132a) {
            case 0:
                Collection collection = (Collection) obj;
                if (collection != null) {
                    cVar.c();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((nm.i0) this.f104133b).e(cVar, it.next());
                    }
                    cVar.f();
                    break;
                } else {
                    cVar.m();
                    break;
                }
            default:
                ((c1) this.f104134c).f104137c.e(cVar, obj);
                break;
        }
    }

    public c(c1 c1Var, Class cls) {
        this.f104134c = c1Var;
        this.f104133b = cls;
    }
}
