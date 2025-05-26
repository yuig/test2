package jx1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m implements r {

    /* renamed from: a, reason: collision with root package name */
    public final gx1.d f77691a;

    public m(gx1.d audienceType) {
        Intrinsics.checkNotNullParameter(audienceType, "audienceType");
        this.f77691a = audienceType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && this.f77691a == ((m) obj).f77691a;
    }

    public final int hashCode() {
        return this.f77691a.hashCode();
    }

    public final String toString() {
        return "FetchDataSideEffectRequest(audienceType=" + this.f77691a + ")";
    }
}
