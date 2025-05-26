package pm;

import java.util.Map;

/* loaded from: classes.dex */
public final class n implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public n f100606a;

    /* renamed from: b, reason: collision with root package name */
    public n f100607b;

    /* renamed from: c, reason: collision with root package name */
    public n f100608c;

    /* renamed from: d, reason: collision with root package name */
    public n f100609d;

    /* renamed from: e, reason: collision with root package name */
    public n f100610e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f100611f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f100612g;

    /* renamed from: h, reason: collision with root package name */
    public Object f100613h;

    /* renamed from: i, reason: collision with root package name */
    public int f100614i;

    public n(boolean z13) {
        this.f100611f = null;
        this.f100612g = z13;
        this.f100610e = this;
        this.f100609d = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f100611f;
        if (obj2 == null) {
            if (entry.getKey() != null) {
                return false;
            }
        } else if (!obj2.equals(entry.getKey())) {
            return false;
        }
        Object obj3 = this.f100613h;
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
        return this.f100611f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f100613h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f100611f;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f100613h;
        return (obj2 != null ? obj2.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f100612g) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f100613h;
        this.f100613h = obj;
        return obj2;
    }

    public final String toString() {
        return this.f100611f + "=" + this.f100613h;
    }

    public n(boolean z13, n nVar, Object obj, n nVar2, n nVar3) {
        this.f100606a = nVar;
        this.f100611f = obj;
        this.f100612g = z13;
        this.f100614i = 1;
        this.f100609d = nVar2;
        this.f100610e = nVar3;
        nVar3.f100609d = this;
        nVar2.f100610e = this;
    }
}
