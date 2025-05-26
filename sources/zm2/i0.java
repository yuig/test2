package zm2;

import java.util.Map;

/* loaded from: classes2.dex */
public final class i0 implements Comparable, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final Comparable f142223a;

    /* renamed from: b, reason: collision with root package name */
    public Object f142224b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f142225c;

    public i0(e0 e0Var, Comparable comparable, Object obj) {
        this.f142225c = e0Var;
        this.f142223a = comparable;
        this.f142224b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f142223a.compareTo(((i0) obj).f142223a);
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
        Comparable comparable = this.f142223a;
        if (comparable != null ? comparable.equals(key) : key == null) {
            Object obj2 = this.f142224b;
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
        return this.f142223a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f142224b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f142223a;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f142224b;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i13 = e0.f142195f;
        this.f142225c.b();
        Object obj2 = this.f142224b;
        this.f142224b = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f142223a);
        String valueOf2 = String.valueOf(this.f142224b);
        StringBuilder sb3 = new StringBuilder(valueOf2.length() + valueOf.length() + 1);
        sb3.append(valueOf);
        sb3.append("=");
        sb3.append(valueOf2);
        return sb3.toString();
    }
}
