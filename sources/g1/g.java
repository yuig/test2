package g1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class g extends o0 implements Map {

    /* renamed from: d */
    public a f63263d;

    /* renamed from: e */
    public c f63264e;

    /* renamed from: f */
    public e f63265f;

    public g(g gVar) {
        super(0);
        if (gVar != null) {
            g(gVar);
        }
    }

    @Override // g1.o0, java.util.Map
    public final boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    @Override // g1.o0, java.util.Map
    public final boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        a aVar = this.f63263d;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(0, this);
        this.f63263d = aVar2;
        return aVar2;
    }

    @Override // g1.o0, java.util.Map
    public final Object get(Object obj) {
        return super.get(obj);
    }

    public final boolean k(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set keySet() {
        c cVar = this.f63264e;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(this);
        this.f63264e = cVar2;
        return cVar2;
    }

    public final boolean m(Collection collection) {
        int i13 = this.f63294c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i13 != this.f63294c;
    }

    public final boolean n(Collection collection) {
        int i13 = this.f63294c;
        for (int i14 = i13 - 1; i14 >= 0; i14--) {
            if (!collection.contains(f(i14))) {
                h(i14);
            }
        }
        return i13 != this.f63294c;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f63294c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // g1.o0, java.util.Map
    public final Object remove(Object obj) {
        return super.remove(obj);
    }

    @Override // java.util.Map
    public final Collection values() {
        e eVar = this.f63265f;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this);
        this.f63265f = eVar2;
        return eVar2;
    }
}
