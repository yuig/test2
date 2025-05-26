package zw;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public final String f142895a;

    public e(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f142895a = pinId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f142895a, ((e) obj).f142895a);
    }

    public final int hashCode() {
        return this.f142895a.hashCode();
    }

    public final String j() {
        return this.f142895a;
    }

    public final String toString() {
        return a.a.p(new StringBuilder("RecordNavigationToExternal(pinId="), this.f142895a, ")");
    }
}
