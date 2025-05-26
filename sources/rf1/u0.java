package rf1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f107912a;

    /* renamed from: b, reason: collision with root package name */
    public final a11.b f107913b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f107914c;

    /* renamed from: d, reason: collision with root package name */
    public final String f107915d;

    public u0(String str, a11.b bVar, boolean z13, String str2) {
        this.f107912a = str;
        this.f107913b = bVar;
        this.f107914c = z13;
        this.f107915d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return Intrinsics.d(this.f107912a, u0Var.f107912a) && this.f107913b == u0Var.f107913b && this.f107914c == u0Var.f107914c && Intrinsics.d(this.f107915d, u0Var.f107915d);
    }

    public final int hashCode() {
        String str = this.f107912a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        a11.b bVar = this.f107913b;
        int e13 = ep.b.e(this.f107914c, (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31);
        String str2 = this.f107915d;
        return e13 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "StoryPinOrigin(navigationSource=" + this.f107912a + ", arrivalMethod=" + this.f107913b + ", isAdPreview=" + this.f107914c + ", sourcePinId=" + this.f107915d + ")";
    }
}
