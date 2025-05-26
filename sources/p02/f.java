package p02;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f98410a;

    /* renamed from: b, reason: collision with root package name */
    public final String f98411b;

    public f(String str, boolean z13) {
        this.f98410a = z13;
        this.f98411b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f98410a == fVar.f98410a && Intrinsics.d(this.f98411b, fVar.f98411b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f98410a) * 31;
        String str = this.f98411b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "RVCSectionArgs(isYourAccountTab=" + this.f98410a + ", userId=" + this.f98411b + ")";
    }
}
