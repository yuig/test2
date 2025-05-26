package p;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class g implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public c f98291a;

    /* renamed from: b, reason: collision with root package name */
    public c f98292b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f98293c = new WeakHashMap();

    /* renamed from: d, reason: collision with root package name */
    public int f98294d = 0;

    public c b(Object obj) {
        c cVar = this.f98291a;
        while (cVar != null && !cVar.f98282a.equals(obj)) {
            cVar = cVar.f98284c;
        }
        return cVar;
    }

    public Object c(Object obj, Object obj2) {
        c b13 = b(obj);
        if (b13 != null) {
            return b13.f98283b;
        }
        c cVar = new c(obj, obj2);
        this.f98294d++;
        c cVar2 = this.f98292b;
        if (cVar2 == null) {
            this.f98291a = cVar;
            this.f98292b = cVar;
            return null;
        }
        cVar2.f98284c = cVar;
        cVar.f98285d = cVar2;
        this.f98292b = cVar;
        return null;
    }

    public Object d(Object obj) {
        c b13 = b(obj);
        if (b13 == null) {
            return null;
        }
        this.f98294d--;
        WeakHashMap weakHashMap = this.f98293c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(b13);
            }
        }
        c cVar = b13.f98285d;
        if (cVar != null) {
            cVar.f98284c = b13.f98284c;
        } else {
            this.f98291a = b13.f98284c;
        }
        c cVar2 = b13.f98284c;
        if (cVar2 != null) {
            cVar2.f98285d = cVar;
        } else {
            this.f98292b = cVar;
        }
        b13.f98284c = null;
        b13.f98285d = null;
        return b13.f98283b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((p.e) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0054, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof p.g
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            p.g r7 = (p.g) r7
            int r1 = r6.f98294d
            int r3 = r7.f98294d
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            p.e r3 = (p.e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            p.e r4 = (p.e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            p.e r7 = (p.e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.g.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i13 = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return i13;
            }
            i13 += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.f98291a, this.f98292b, 0);
        this.f98293c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                sb3.append("]");
                return sb3.toString();
            }
            sb3.append(((Map.Entry) eVar.next()).toString());
            if (eVar.hasNext()) {
                sb3.append(", ");
            }
        }
    }
}
