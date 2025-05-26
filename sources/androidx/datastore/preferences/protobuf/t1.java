package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* loaded from: classes3.dex */
public final class t1 implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparable f18141a;

    /* renamed from: b, reason: collision with root package name */
    public Object f18142b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f18143c;

    public t1(p1 p1Var, Comparable comparable, Object obj) {
        this.f18143c = p1Var;
        this.f18141a = comparable;
        this.f18142b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f18141a.compareTo(((t1) obj).f18141a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Comparable comparable = this.f18141a;
        if (comparable != null ? comparable.equals(key) : key == null) {
            Object obj2 = this.f18142b;
            Object value = entry.getValue();
            if (obj2 == null) {
                if (value == null) {
                    return true;
                }
            } else if (obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f18141a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f18142b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f18141a;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f18142b;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i13 = p1.f18122g;
        this.f18143c.b();
        Object obj2 = this.f18142b;
        this.f18142b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f18141a + "=" + this.f18142b;
    }
}
