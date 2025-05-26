package fl;

import el.r0;
import el.t0;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class g implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g f62512a = new g();

    @Override // el.t0
    public final Class a() {
        return e.class;
    }

    @Override // el.t0
    public final Class b() {
        return e.class;
    }

    @Override // el.t0
    public final Object c(r0 r0Var) {
        if (r0Var.f59526c == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator it = r0Var.f59524a.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
            }
        }
        return new f();
    }
}
