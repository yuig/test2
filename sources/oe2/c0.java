package oe2;

import java.util.Map;

/* loaded from: classes4.dex */
public final class c0 implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public c0 f94293a;

    /* renamed from: b, reason: collision with root package name */
    public c0 f94294b;

    /* renamed from: c, reason: collision with root package name */
    public c0 f94295c;

    /* renamed from: d, reason: collision with root package name */
    public c0 f94296d;

    /* renamed from: e, reason: collision with root package name */
    public c0 f94297e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f94298f;

    /* renamed from: g, reason: collision with root package name */
    public final int f94299g;

    /* renamed from: h, reason: collision with root package name */
    public Object f94300h;

    /* renamed from: i, reason: collision with root package name */
    public int f94301i;

    public c0() {
        this.f94298f = null;
        this.f94299g = -1;
        this.f94297e = this;
        this.f94296d = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f94298f;
        if (obj2 == null) {
            if (entry.getKey() != null) {
                return false;
            }
        } else if (!obj2.equals(entry.getKey())) {
            return false;
        }
        Object obj3 = this.f94300h;
        if (obj3 == null) {
            if (entry.getValue() != null) {
                return false;
            }
        } else if (!obj3.equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f94298f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f94300h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f94298f;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f94300h;
        return (obj2 != null ? obj2.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f94300h;
        this.f94300h = obj;
        return obj2;
    }

    public final String toString() {
        return this.f94298f + "=" + this.f94300h;
    }

    public c0(c0 c0Var, Object obj, int i13, c0 c0Var2, c0 c0Var3) {
        this.f94293a = c0Var;
        this.f94298f = obj;
        this.f94299g = i13;
        this.f94301i = 1;
        this.f94296d = c0Var2;
        this.f94297e = c0Var3;
        c0Var3.f94296d = this;
        c0Var2.f94297e = this;
    }
}
