package ads_mobile_sdk;

import java.util.Map;

/* loaded from: classes2.dex */
public final class sm2 implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparable f11166a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11167b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vm2 f11168c;

    public sm2(vm2 vm2Var, Comparable comparable, Object obj) {
        this.f11168c = vm2Var;
        this.f11166a = comparable;
        this.f11167b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f11166a.compareTo(((sm2) obj).f11166a);
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
        Comparable comparable = this.f11166a;
        Object key = entry.getKey();
        if (comparable != null ? comparable.equals(key) : key == null) {
            Object obj2 = this.f11167b;
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
        return this.f11166a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f11167b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f11166a;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f11167b;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f11168c.a();
        Object obj2 = this.f11167b;
        this.f11167b = obj;
        return obj2;
    }

    public final String toString() {
        return a.a.D(String.valueOf(this.f11166a), "=", String.valueOf(this.f11167b));
    }
}
