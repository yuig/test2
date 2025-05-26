package yk2;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e implements Map.Entry, ll2.d {

    /* renamed from: a, reason: collision with root package name */
    public final g f139244a;

    /* renamed from: b, reason: collision with root package name */
    public final int f139245b;

    public e(g map, int i13) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f139244a = map;
        this.f139245b = i13;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (Intrinsics.d(entry.getKey(), getKey()) && Intrinsics.d(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f139244a.f139248a[this.f139245b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Object[] objArr = this.f139244a.f139249b;
        Intrinsics.f(objArr);
        return objArr[this.f139245b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int hashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return hashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        g gVar = this.f139244a;
        gVar.d();
        Object[] objArr = gVar.f139249b;
        if (objArr == null) {
            int length = gVar.f139248a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.".toString());
            }
            objArr = new Object[length];
            gVar.f139249b = objArr;
        }
        int i13 = this.f139245b;
        Object obj2 = objArr[i13];
        objArr[i13] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(getKey());
        sb3.append('=');
        sb3.append(getValue());
        return sb3.toString();
    }
}
