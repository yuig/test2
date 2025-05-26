package he;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f68952a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    public final long f68953b;

    /* renamed from: c, reason: collision with root package name */
    public long f68954c;

    public k(long j13) {
        this.f68953b = j13;
    }

    public final synchronized Object a(Object obj) {
        j jVar;
        jVar = (j) this.f68952a.get(obj);
        return jVar != null ? jVar.f68950a : null;
    }

    public int b(Object obj) {
        return 1;
    }

    public void c(Object obj, Object obj2) {
    }

    public final synchronized Object d(Object obj, Object obj2) {
        int b13 = b(obj2);
        long j13 = b13;
        if (j13 >= this.f68953b) {
            c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f68954c += j13;
        }
        j jVar = (j) this.f68952a.put(obj, obj2 == null ? null : new j(obj2, b13));
        if (jVar != null) {
            this.f68954c -= jVar.f68951b;
            if (!jVar.f68950a.equals(obj2)) {
                c(obj, jVar.f68950a);
            }
        }
        e(this.f68953b);
        return jVar != null ? jVar.f68950a : null;
    }

    public final synchronized void e(long j13) {
        while (this.f68954c > j13) {
            Iterator it = this.f68952a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            j jVar = (j) entry.getValue();
            this.f68954c -= jVar.f68951b;
            Object key = entry.getKey();
            it.remove();
            c(key, jVar.f68950a);
        }
    }
}
