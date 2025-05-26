package qm2;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final f f104419a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f104420b;

    public g(f qualifier, boolean z13) {
        Intrinsics.checkNotNullParameter(qualifier, "qualifier");
        this.f104419a = qualifier;
        this.f104420b = z13;
    }

    public static g a(g gVar, f qualifier, boolean z13, int i13) {
        if ((i13 & 1) != 0) {
            qualifier = gVar.f104419a;
        }
        if ((i13 & 2) != 0) {
            z13 = gVar.f104420b;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(qualifier, "qualifier");
        return new g(qualifier, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f104419a == gVar.f104419a && this.f104420b == gVar.f104420b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f104420b) + (this.f104419a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NullabilityQualifierWithMigrationStatus(qualifier=");
        sb3.append(this.f104419a);
        sb3.append(", isForWarningOnly=");
        return cb.m(sb3, this.f104420b, ')');
    }
}
