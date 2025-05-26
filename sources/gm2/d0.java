package gm2;

import java.lang.reflect.Type;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;

/* loaded from: classes2.dex */
public abstract class d0 implements pm2.p {
    @Override // pm2.d
    public pm2.a a(ym2.c fqName) {
        Object obj;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Iterator it = getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(d.a(l0.t0(l0.m0(((e) ((pm2.a) obj)).f65765a))).b(), fqName)) {
                break;
            }
        }
        return (pm2.a) obj;
    }

    public abstract Type b();

    public final boolean equals(Object obj) {
        return (obj instanceof d0) && Intrinsics.d(b(), ((d0) obj).b());
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + b();
    }
}
