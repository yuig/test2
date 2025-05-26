package co2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class r extends s {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f28346a;

    public r(Throwable th3) {
        this.f28346a = th3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            if (Intrinsics.d(this.f28346a, ((r) obj).f28346a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th3 = this.f28346a;
        if (th3 != null) {
            return th3.hashCode();
        }
        return 0;
    }

    @Override // co2.s
    public final String toString() {
        return "Closed(" + this.f28346a + ')';
    }
}
