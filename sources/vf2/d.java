package vf2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f125780a;

    /* renamed from: b, reason: collision with root package name */
    public final String f125781b;

    public d(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f125780a = key;
        this.f125781b = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f125780a, dVar.f125780a) && Intrinsics.d(this.f125781b, dVar.f125781b);
    }

    public final int hashCode() {
        return this.f125781b.hashCode() + (this.f125780a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SpanAttributeData(key=");
        sb3.append(this.f125780a);
        sb3.append(", value=");
        return ep.b.k(sb3, this.f125781b, ')');
    }
}
