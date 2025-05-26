package q72;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final c f102797a;

    public a(c cVar) {
        this.f102797a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.f102797a, ((a) obj).f102797a);
    }

    public final int hashCode() {
        c cVar = this.f102797a;
        if (cVar == null) {
            return 0;
        }
        return cVar.hashCode();
    }

    public final String toString() {
        return "LinkDomain(officialUser=" + this.f102797a + ")";
    }
}
