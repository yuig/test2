package km;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f80160a;

    /* renamed from: b, reason: collision with root package name */
    public final c f80161b;

    public b(Set set, c cVar) {
        this.f80160a = b(set);
        this.f80161b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb3 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb3.append(aVar.f80158a);
            sb3.append('/');
            sb3.append(aVar.f80159b);
            if (it.hasNext()) {
                sb3.append(' ');
            }
        }
        return sb3.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        c cVar = this.f80161b;
        synchronized (cVar.f80163a) {
            unmodifiableSet = Collections.unmodifiableSet(cVar.f80163a);
        }
        boolean isEmpty = unmodifiableSet.isEmpty();
        String str = this.f80160a;
        if (isEmpty) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(' ');
        synchronized (cVar.f80163a) {
            unmodifiableSet2 = Collections.unmodifiableSet(cVar.f80163a);
        }
        sb3.append(b(unmodifiableSet2));
        return sb3.toString();
    }
}
