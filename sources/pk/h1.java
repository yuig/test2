package pk;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes.dex */
public abstract class h1 implements Map, Serializable {

    /* renamed from: a */
    public transient o1 f100411a;

    /* renamed from: b */
    public transient o1 f100412b;

    /* renamed from: c */
    public transient v0 f100413c;

    public static d7.b0 a() {
        return new d7.b0(2, 0);
    }

    public static d7.b0 b(int i13) {
        a0.C(i13, "expectedSize");
        return new d7.b0(i13);
    }

    public static h1 c(Map map) {
        if ((map instanceof h1) && !(map instanceof SortedMap)) {
            h1 h1Var = (h1) map;
            h1Var.getClass();
            return h1Var;
        }
        Set entrySet = map.entrySet();
        d7.b0 b0Var = new d7.b0(entrySet instanceof Collection ? entrySet.size() : 4);
        b0Var.g(entrySet);
        return b0Var.a();
    }

    public static a3 i(String str, Object obj) {
        a0.B(str, obj);
        return a3.k(1, new Object[]{str, obj}, null);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
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
        return values().contains(obj);
    }

    public abstract x2 d();

    public abstract y2 e();

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return bf.b.M(obj, this);
    }

    public abstract v0 f();

    @Override // java.util.Map
    /* renamed from: g */
    public final o1 entrySet() {
        o1 o1Var = this.f100411a;
        if (o1Var != null) {
            return o1Var;
        }
        x2 d2 = d();
        this.f100411a = d2;
        return d2;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    /* renamed from: h */
    public final o1 keySet() {
        o1 o1Var = this.f100412b;
        if (o1Var != null) {
            return o1Var;
        }
        y2 e13 = e();
        this.f100412b = e13;
        return e13;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return dl2.b.r1(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* renamed from: j */
    public v0 values() {
        v0 v0Var = this.f100413c;
        if (v0Var != null) {
            return v0Var;
        }
        v0 f13 = f();
        this.f100413c = f13;
        return f13;
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
        int size = size();
        a0.C(size, "size");
        StringBuilder sb3 = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb3.append('{');
        boolean z13 = true;
        for (Map.Entry entry : entrySet()) {
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

    public Object writeReplace() {
        return new g1(this);
    }
}
