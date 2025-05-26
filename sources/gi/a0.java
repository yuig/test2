package gi;

import java.io.Serializable;
import java.util.Map;
import kh2.p2;

/* loaded from: classes3.dex */
public abstract class a0 implements Map, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final Map.Entry[] f65043b = new Map.Entry[0];

    /* renamed from: a, reason: collision with root package name */
    public transient b0 f65044a;

    @Override // java.util.Map
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final b0 entrySet() {
        b0 b0Var = this.f65044a;
        if (b0Var == null) {
            e0 e0Var = (e0) this;
            b0Var = e0Var.isEmpty() ? l0.f65084j : new d0(e0Var);
            this.f65044a = b0Var;
        }
        return b0Var;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return ((e0) this).f65063d.contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return ((e0) this).entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return p2.j1(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((e0) this).size() == 0;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        e0 e0Var = (e0) this;
        int size = e0Var.size();
        if (size < 0) {
            throw new IllegalArgumentException(a.a.d("size cannot be negative but was: ", size));
        }
        StringBuilder sb3 = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb3.append('{');
        boolean z13 = true;
        for (Map.Entry entry : e0Var.entrySet()) {
            if (!z13) {
                sb3.append(", ");
            }
            sb3.append(entry.getKey());
            sb3.append('=');
            sb3.append(entry.getValue());
            z13 = false;
        }
        sb3.append('}');
        return sb3.toString();
    }
}
