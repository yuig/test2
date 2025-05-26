package n2;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class b implements Map.Entry, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f88926a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f88927b;

    public b(Object obj, Object obj2) {
        this.f88926a = obj;
        this.f88927b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && Intrinsics.d(entry.getKey(), this.f88926a) && Intrinsics.d(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f88926a;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f88927b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f88926a;
        int hashCode = obj != null ? obj.hashCode() : 0;
        Object value = getValue();
        return (value != null ? value.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f88926a);
        sb3.append('=');
        sb3.append(getValue());
        return sb3.toString();
    }
}
