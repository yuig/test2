package pd;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f99641a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f99642b;

    public d0() {
        this.f99641a = new HashMap();
        this.f99642b = new HashMap();
    }

    public static qq2.c a() {
        return new qq2.c((n60.o) null);
    }

    public final Object b(Enum r43) {
        Object obj = this.f99641a.get(r43);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: " + r43);
    }

    public final Enum c(Object obj) {
        Enum r03 = (Enum) this.f99642b.get(obj);
        if (r03 != null) {
            return r03;
        }
        throw new GeneralSecurityException(a.a.i("Unable to convert object enum: ", obj));
    }

    public d0(Map map, Map map2) {
        this.f99641a = map;
        this.f99642b = map2;
    }
}
