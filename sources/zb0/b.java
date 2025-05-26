package zb0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f141555a;

    public b(Integer num) {
        this.f141555a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f141555a, ((b) obj).f141555a);
    }

    @Override // zb0.f
    public final Integer h() {
        return this.f141555a;
    }

    public final int hashCode() {
        Integer num = this.f141555a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "AlertCancelButtonClicked(alertId=" + this.f141555a + ")";
    }
}
