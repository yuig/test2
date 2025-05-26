package zw;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d implements f {

    /* renamed from: a, reason: collision with root package name */
    public final String f142894a;

    public d(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f142894a = pinId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f142894a, ((d) obj).f142894a);
    }

    public final int hashCode() {
        return this.f142894a.hashCode();
    }

    public final String j() {
        return this.f142894a;
    }

    public final String toString() {
        return a.a.p(new StringBuilder("RecordNavigationToCloseup(pinId="), this.f142894a, ")");
    }
}
