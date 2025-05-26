package sl;

import java.util.Set;

/* loaded from: classes.dex */
public interface c {
    default Object a(Class cls) {
        return e(q.a(cls));
    }

    default Set b(q qVar) {
        return (Set) d(qVar).get();
    }

    cm.a c(q qVar);

    cm.a d(q qVar);

    default Object e(q qVar) {
        cm.a c13 = c(qVar);
        if (c13 == null) {
            return null;
        }
        return c13.get();
    }

    default cm.a f(Class cls) {
        return c(q.a(cls));
    }
}
