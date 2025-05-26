package ho2;

import ao2.e2;
import df.j1;
import java.util.Iterator;
import java.util.List;
import yn2.c0;

/* loaded from: classes2.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final e2 f69782a;

    static {
        String str;
        Object next;
        e2 e2Var;
        int i13 = x.f69791a;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        try {
            List t13 = c0.t(yn2.x.c(ep.b.p()));
            Iterator it = t13.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int c13 = ((p) next).c();
                    do {
                        Object next2 = it.next();
                        int c14 = ((p) next2).c();
                        if (c13 < c14) {
                            next = next2;
                            c13 = c14;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            p pVar = (p) next;
            if (pVar != null) {
                try {
                    e2Var = pVar.b(t13);
                } catch (Throwable unused2) {
                    pVar.a();
                    e2Var = null;
                }
                if (e2Var != null) {
                    f69782a = e2Var;
                    return;
                }
            }
            j1.J(null, 3);
            throw null;
        } catch (Throwable th3) {
            j1.J(th3, 2);
            throw null;
        }
    }
}
