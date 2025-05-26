package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public abstract class m implements Map, ll2.a {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final i f80385c = new i(null);

    /* renamed from: a, reason: collision with root package name */
    public volatile j f80386a;

    /* renamed from: b, reason: collision with root package name */
    public volatile l f80387b;

    public final boolean b(Map.Entry entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object obj = get(key);
        if (Intrinsics.d(value, obj)) {
            return obj != null || containsKey(key);
        }
        return false;
    }

    public abstract Set c();

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return g(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set c13 = c();
        if (c13.isEmpty()) {
            return false;
        }
        Iterator it = c13.iterator();
        while (it.hasNext()) {
            if (Intrinsics.d(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    public Set d() {
        if (this.f80386a == null) {
            this.f80386a = new j(this);
        }
        j jVar = this.f80386a;
        Intrinsics.f(jVar);
        return jVar;
    }

    public int e() {
        return ((b) c()).b();
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return c();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (e() != map.size()) {
            return false;
        }
        Set entrySet = map.entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return true;
        }
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            if (!b((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Collection f() {
        if (this.f80387b == null) {
            this.f80387b = new l(this);
        }
        l lVar = this.f80387b;
        Intrinsics.f(lVar);
        return lVar;
    }

    public final Map.Entry g(Object obj) {
        Object obj2;
        Iterator it = c().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (Intrinsics.d(((Map.Entry) obj2).getKey(), obj)) {
                break;
            }
        }
        return (Map.Entry) obj2;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        Map.Entry g13 = g(obj);
        if (g13 != null) {
            return g13.getValue();
        }
        return null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return c().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return e() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return d();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return e();
    }

    public final String toString() {
        return CollectionsKt.Z(c(), ", ", "{", "}", 0, null, new k(this), 24);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return f();
    }
}
