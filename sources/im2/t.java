package im2;

import a.cb;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final qm2.g f72777a;

    /* renamed from: b, reason: collision with root package name */
    public final Collection f72778b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f72779c;

    public t(qm2.g nullabilityQualifier, Collection qualifierApplicabilityTypes, boolean z13) {
        Intrinsics.checkNotNullParameter(nullabilityQualifier, "nullabilityQualifier");
        Intrinsics.checkNotNullParameter(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        this.f72777a = nullabilityQualifier;
        this.f72778b = qualifierApplicabilityTypes;
        this.f72779c = z13;
    }

    public static t a(t tVar, qm2.g nullabilityQualifier) {
        Intrinsics.checkNotNullParameter(nullabilityQualifier, "nullabilityQualifier");
        Collection qualifierApplicabilityTypes = tVar.f72778b;
        Intrinsics.checkNotNullParameter(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        return new t(nullabilityQualifier, qualifierApplicabilityTypes, tVar.f72779c);
    }

    public final qm2.g b() {
        return this.f72777a;
    }

    public final Collection c() {
        return this.f72778b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.f72777a, tVar.f72777a) && Intrinsics.d(this.f72778b, tVar.f72778b) && this.f72779c == tVar.f72779c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f72779c) + ((this.f72778b.hashCode() + (this.f72777a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("JavaDefaultQualifiers(nullabilityQualifier=");
        sb3.append(this.f72777a);
        sb3.append(", qualifierApplicabilityTypes=");
        sb3.append(this.f72778b);
        sb3.append(", definitelyNotNull=");
        return cb.m(sb3, this.f72779c, ')');
    }

    public t(qm2.g gVar, Collection collection) {
        this(gVar, collection, gVar.f104419a == qm2.f.NOT_NULL);
    }
}
