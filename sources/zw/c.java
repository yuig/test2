package zw;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final String f142893a;

    public c(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f142893a = pinId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f142893a, ((c) obj).f142893a);
    }

    public final int hashCode() {
        return this.f142893a.hashCode();
    }

    public final String j() {
        return this.f142893a;
    }

    public final String toString() {
        return a.a.p(new StringBuilder("RecordAdImageImpressionStarted(pinId="), this.f142893a, ")");
    }
}
