package is1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f0 extends g0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f73587a;

    public f0(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f73587a = pinId;
    }

    @Override // is1.g0
    public final String a() {
        return this.f73587a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && Intrinsics.d(this.f73587a, ((f0) obj).f73587a);
    }

    public final int hashCode() {
        return this.f73587a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("ShowTranslations(pinId="), this.f73587a, ")");
    }
}
