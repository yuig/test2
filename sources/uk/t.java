package uk;

import el.g0;
import el.h0;
import el.u0;
import il.j4;
import il.o5;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f122376a = 0;

    static {
        Logger.getLogger(t.class.getName());
        new ConcurrentHashMap();
        HashSet hashSet = new HashSet();
        hashSet.add(a.class);
        hashSet.add(d.class);
        hashSet.add(u.class);
        hashSet.add(f.class);
        hashSet.add(e.class);
        hashSet.add(p.class);
        hashSet.add(hl.a.class);
        hashSet.add(r.class);
        hashSet.add(s.class);
        Collections.unmodifiableSet(hashSet);
    }

    public static Object a(j4 j4Var, Class cls) {
        String F = j4Var.F();
        com.google.crypto.tink.shaded.protobuf.k G = j4Var.G();
        h a13 = el.k.f59500d.a(F);
        el.q qVar = (el.q) a13;
        if (qVar.f59518b.equals(cls)) {
            return g0.f59489b.b(h0.f59491b.a(u0.a(qVar.f59517a, G, qVar.f59519c, o5.RAW, null)), qVar.f59518b);
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + a13.getClass() + ", which only supports: " + ((el.q) a13).f59518b);
    }
}
