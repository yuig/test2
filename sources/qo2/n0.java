package qo2;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n0 implements Map.Entry, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f104597a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f104598b;

    public n0(Object obj, Object obj2) {
        this.f104597a = obj;
        this.f104598b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return Intrinsics.d(this.f104597a, n0Var.f104597a) && Intrinsics.d(this.f104598b, n0Var.f104598b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f104597a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f104598b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f104597a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f104598b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "MapEntry(key=" + this.f104597a + ", value=" + this.f104598b + ')';
    }
}
