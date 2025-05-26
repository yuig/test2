package zb0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f141556a;

    public c(Integer num) {
        this.f141556a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f141556a, ((c) obj).f141556a);
    }

    @Override // zb0.f
    public final Integer h() {
        return this.f141556a;
    }

    public final int hashCode() {
        Integer num = this.f141556a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "AlertConfirmButtonClicked(alertId=" + this.f141556a + ")";
    }
}
