package g7;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import pk.e2;
import pk.p0;

/* loaded from: classes3.dex */
public final class n extends p0 implements Map {

    /* renamed from: a, reason: collision with root package name */
    public final Map f63814a;

    public n(Map map) {
        this.f63814a = map;
    }

    @Override // pk.p0
    public final Object a() {
        return this.f63814a;
    }

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void clear() {
        this.f63814a.clear();
    }

    @Override // java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void putAll(Map map) {
        this.f63814a.putAll(map);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.f63814a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return e(obj);
    }

    public final boolean e(Object obj) {
        e2 e2Var = new e2(entrySet().iterator());
        if (obj == null) {
            while (e2Var.hasNext()) {
                if (e2Var.next() == null) {
                    return true;
                }
            }
        } else {
            while (e2Var.hasNext()) {
                if (obj.equals(e2Var.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return dl2.b.m0(this.f63814a.entrySet(), new m(0));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && bf.b.M(obj, this);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f63814a.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return dl2.b.r1(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.f63814a;
        if (map.isEmpty()) {
            return true;
        }
        return map.size() == 1 && map.containsKey(null);
    }

    @Override // java.util.Map
    public final Set keySet() {
        return dl2.b.m0(this.f63814a.keySet(), new m(1));
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f63814a.put(obj, obj2);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f63814a.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        Map map = this.f63814a;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f63814a.values();
    }
}
