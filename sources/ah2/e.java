package ah2;

import kotlin.jvm.internal.Intrinsics;
import pg2.s;

/* loaded from: classes4.dex */
public final class e extends f {

    /* renamed from: c, reason: collision with root package name */
    public final s f15198c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f15199d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(s endpoint, Long l13) {
        super(true);
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        this.f15198c = endpoint;
        this.f15199d = l13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f15198c == eVar.f15198c && Intrinsics.d(this.f15199d, eVar.f15199d);
    }

    public final int hashCode() {
        int hashCode = this.f15198c.hashCode() * 31;
        Long l13 = this.f15199d;
        return hashCode + (l13 == null ? 0 : l13.hashCode());
    }

    public final String toString() {
        return "TooManyRequests(endpoint=" + this.f15198c + ", retryAfterMs=" + this.f15199d + ')';
    }
}
