package is1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d0 extends g0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f73583a;

    public d0(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f73583a = pinId;
    }

    @Override // is1.g0
    public final String a() {
        return this.f73583a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && Intrinsics.d(this.f73583a, ((d0) obj).f73583a);
    }

    public final int hashCode() {
        return this.f73583a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("HideTranslations(pinId="), this.f73583a, ")");
    }
}
