package qm;

import com.google.gson.JsonIOException;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class y extends x {

    /* renamed from: b, reason: collision with root package name */
    public final pm.p f104233b;

    public y(pm.p pVar, z zVar) {
        super(zVar);
        this.f104233b = pVar;
    }

    @Override // qm.x
    public final Object f() {
        return this.f104233b.u();
    }

    @Override // qm.x
    public final Object g(Object obj) {
        return obj;
    }

    @Override // qm.x
    public final void h(Object obj, um.a aVar, w wVar) {
        Object c13 = wVar.f104229g.c(aVar);
        if (c13 == null && wVar.f104230h) {
            return;
        }
        boolean z13 = wVar.f104226d;
        Field field = wVar.f104224b;
        if (z13) {
            b0.b(obj, field);
        } else if (wVar.f104231i) {
            throw new JsonIOException(a.a.j("Cannot set value of 'static final' ", sm.c.e(field, false)));
        }
        field.set(obj, c13);
    }
}
