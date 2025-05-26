package zb0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements f {

    /* renamed from: a, reason: collision with root package name */
    public final yb0.d f141557a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f141558b;

    public d(yb0.d dismissReason, Integer num) {
        Intrinsics.checkNotNullParameter(dismissReason, "dismissReason");
        this.f141557a = dismissReason;
        this.f141558b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f141557a == dVar.f141557a && Intrinsics.d(this.f141558b, dVar.f141558b);
    }

    @Override // zb0.f
    public final Integer h() {
        return this.f141558b;
    }

    public final int hashCode() {
        int hashCode = this.f141557a.hashCode() * 31;
        Integer num = this.f141558b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "AlertDismissed(dismissReason=" + this.f141557a + ", alertId=" + this.f141558b + ")";
    }
}
