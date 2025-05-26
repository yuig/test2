package p;

import java.util.Map;

/* loaded from: classes.dex */
public final class c implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final Object f98282a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f98283b;

    /* renamed from: c, reason: collision with root package name */
    public c f98284c;

    /* renamed from: d, reason: collision with root package name */
    public c f98285d;

    public c(Object obj, Object obj2) {
        this.f98282a = obj;
        this.f98283b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f98282a.equals(cVar.f98282a) && this.f98283b.equals(cVar.f98283b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f98282a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f98283b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f98282a.hashCode() ^ this.f98283b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f98282a + "=" + this.f98283b;
    }
}
