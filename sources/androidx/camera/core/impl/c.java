package androidx.camera.core.impl;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f16809a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f16810b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f16811c;

    public c(Class cls, Object obj, String str) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f16809a = str;
        if (cls == null) {
            throw new NullPointerException("Null valueClass");
        }
        this.f16810b = cls;
        this.f16811c = obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f16809a.equals(cVar.f16809a) && this.f16810b.equals(cVar.f16810b)) {
            Object obj2 = cVar.f16811c;
            Object obj3 = this.f16811c;
            if (obj3 == null) {
                if (obj2 == null) {
                    return true;
                }
            } else if (obj3.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.f16809a.hashCode() ^ 1000003) * 1000003) ^ this.f16810b.hashCode()) * 1000003;
        Object obj = this.f16811c;
        return hashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "Option{id=" + this.f16809a + ", valueClass=" + this.f16810b + ", token=" + this.f16811c + "}";
    }
}
