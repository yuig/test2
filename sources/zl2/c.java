package zl2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ym2.b f142103a;

    /* renamed from: b, reason: collision with root package name */
    public final ym2.b f142104b;

    /* renamed from: c, reason: collision with root package name */
    public final ym2.b f142105c;

    public c(ym2.b javaClass, ym2.b kotlinReadOnly, ym2.b kotlinMutable) {
        Intrinsics.checkNotNullParameter(javaClass, "javaClass");
        Intrinsics.checkNotNullParameter(kotlinReadOnly, "kotlinReadOnly");
        Intrinsics.checkNotNullParameter(kotlinMutable, "kotlinMutable");
        this.f142103a = javaClass;
        this.f142104b = kotlinReadOnly;
        this.f142105c = kotlinMutable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f142103a, cVar.f142103a) && Intrinsics.d(this.f142104b, cVar.f142104b) && Intrinsics.d(this.f142105c, cVar.f142105c);
    }

    public final int hashCode() {
        return this.f142105c.hashCode() + ((this.f142104b.hashCode() + (this.f142103a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlatformMutabilityMapping(javaClass=" + this.f142103a + ", kotlinReadOnly=" + this.f142104b + ", kotlinMutable=" + this.f142105c + ')';
    }
}
