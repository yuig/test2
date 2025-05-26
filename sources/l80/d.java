package l80;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d extends f {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f82110a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f82111b;

    public d(Throwable throwable, Integer num) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f82110a = throwable;
        this.f82111b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f82110a, dVar.f82110a) && Intrinsics.d(this.f82111b, dVar.f82111b);
    }

    public final int hashCode() {
        int hashCode = this.f82110a.hashCode() * 31;
        Integer num = this.f82111b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "Error(throwable=" + this.f82110a + ", apiErrorCode=" + this.f82111b + ")";
    }
}
