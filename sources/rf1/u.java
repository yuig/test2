package rf1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final t f107909a;

    /* renamed from: b, reason: collision with root package name */
    public final h32.u0 f107910b;

    /* renamed from: c, reason: collision with root package name */
    public final h32.g0 f107911c;

    public u(t ids, h32.u0 element, h32.g0 component) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(component, "component");
        this.f107909a = ids;
        this.f107910b = element;
        this.f107911c = component;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.d(this.f107909a, uVar.f107909a) && this.f107910b == uVar.f107910b && this.f107911c == uVar.f107911c;
    }

    public final int hashCode() {
        return this.f107911c.hashCode() + ((this.f107910b.hashCode() + (this.f107909a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SponsorshipLogging(ids=" + this.f107909a + ", element=" + this.f107910b + ", component=" + this.f107911c + ")";
    }
}
