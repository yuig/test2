package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ck {

    /* renamed from: a, reason: collision with root package name */
    public final int f3944a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3945b;

    public ck(String description, int i13) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f3944a = i13;
        this.f3945b = description;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck)) {
            return false;
        }
        ck ckVar = (ck) obj;
        return this.f3944a == ckVar.f3944a && Intrinsics.d(this.f3945b, ckVar.f3945b);
    }

    public final int hashCode() {
        return this.f3945b.hashCode() + (Integer.hashCode(this.f3944a) * 31);
    }

    public final String toString() {
        return "BowResponseError(code=" + this.f3944a + ", description=" + this.f3945b + ")";
    }
}
