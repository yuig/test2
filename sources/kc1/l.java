package kc1;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l implements m {

    /* renamed from: a, reason: collision with root package name */
    public final Set f79164a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f79165b;

    public l(Set pronouns, boolean z13) {
        Intrinsics.checkNotNullParameter(pronouns, "pronouns");
        this.f79164a = pronouns;
        this.f79165b = z13;
    }

    @Override // kc1.m
    public final boolean a() {
        return this.f79165b;
    }

    @Override // kc1.m
    public final Set b() {
        return this.f79164a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.f79164a, lVar.f79164a) && this.f79165b == lVar.f79165b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f79165b) + (this.f79164a.hashCode() * 31);
    }

    public final String toString() {
        return "Selected(pronouns=" + this.f79164a + ", doneAvailable=" + this.f79165b + ")";
    }
}
