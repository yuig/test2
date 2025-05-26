package pg2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h extends i {

    /* renamed from: a */
    public final s f100129a;

    /* renamed from: b */
    public final Long f100130b;

    public h(s endpoint, Long l13) {
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        this.f100129a = endpoint;
        this.f100130b = l13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f100129a == hVar.f100129a && Intrinsics.d(this.f100130b, hVar.f100130b);
    }

    public final int hashCode() {
        int hashCode = this.f100129a.hashCode() * 31;
        Long l13 = this.f100130b;
        return hashCode + (l13 == null ? 0 : l13.hashCode());
    }

    public final String toString() {
        return "TooManyRequests(endpoint=" + this.f100129a + ", retryAfter=" + this.f100130b + ')';
    }
}
