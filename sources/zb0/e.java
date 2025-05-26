package zb0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f141559a;

    public e(Integer num) {
        this.f141559a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f141559a, ((e) obj).f141559a);
    }

    @Override // zb0.f
    public final Integer h() {
        return this.f141559a;
    }

    public final int hashCode() {
        Integer num = this.f141559a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "AlertShown(alertId=" + this.f141559a + ")";
    }
}
