package is1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c0 extends g0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f73579a;

    public c0(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f73579a = pinId;
    }

    @Override // is1.g0
    public final String a() {
        return this.f73579a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && Intrinsics.d(this.f73579a, ((c0) obj).f73579a);
    }

    public final int hashCode() {
        return this.f73579a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("HideRichTranslations(pinId="), this.f73579a, ")");
    }
}
