package tb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f116961a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f116962b;

    public d(String key, Long l13) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f116961a = key;
        this.f116962b = l13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f116961a, dVar.f116961a) && Intrinsics.d(this.f116962b, dVar.f116962b);
    }

    public final int hashCode() {
        int hashCode = this.f116961a.hashCode() * 31;
        Long l13 = this.f116962b;
        return hashCode + (l13 == null ? 0 : l13.hashCode());
    }

    public final String toString() {
        return "Preference(key=" + this.f116961a + ", value=" + this.f116962b + ')';
    }
}
