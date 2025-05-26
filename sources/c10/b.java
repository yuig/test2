package c10;

import ao2.m0;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import rl2.a0;
import rl2.t;
import t3.s1;
import tb0.g;
import tb0.h;
import ul2.q1;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final h f24482a;

    public b(h crashReporter) {
        Intrinsics.checkNotNullParameter(crashReporter, "crashReporter");
        this.f24482a = crashReporter;
    }

    public final z40.b a(String operationName, int i13, Object obj) {
        Intrinsics.checkNotNullParameter(operationName, "operationName");
        if (i13 < 3 && obj != null) {
            if (obj instanceof z40.b) {
                return (z40.b) obj;
            }
            if (obj instanceof Collection) {
                return null;
            }
            try {
                Iterator it = m0.A(k0.f80436a.b(obj.getClass())).iterator();
                while (it.hasNext()) {
                    t tVar = (t) it.next();
                    if (tVar.getVisibility() != a0.PRIVATE) {
                        Object call = tVar.call(obj);
                        if (call == null && !((q1) tVar.getReturnType()).f122585a.x0()) {
                            this.f24482a.A("Could not find common error in GraphQL response: " + operationName, new IllegalStateException("Warning: Member " + tVar.getName() + " is marked as non-nullable but returned null"));
                            return null;
                        }
                        z40.b a13 = a(operationName, i13 + 1, call);
                        if (a13 != null) {
                            return a13;
                        }
                    }
                }
            } catch (Throwable th3) {
                HashSet hashSet = h.f117076w;
                g.f117075a.A(s1.c("Could not find common error in GraphQL response: ", operationName, ", member: ", k0.f80436a.b(obj.getClass()).f()), th3);
            }
        }
        return null;
    }
}
