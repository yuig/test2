package is1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e0 extends g0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f73586a;

    public e0(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f73586a = pinId;
    }

    @Override // is1.g0
    public final String a() {
        return this.f73586a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && Intrinsics.d(this.f73586a, ((e0) obj).f73586a);
    }

    public final int hashCode() {
        return this.f73586a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("ShowRichTranslations(pinId="), this.f73586a, ")");
    }
}
