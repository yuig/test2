package kj1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d extends oe.f {

    /* renamed from: c, reason: collision with root package name */
    public final String f79850c;

    /* renamed from: d, reason: collision with root package name */
    public final c f79851d;

    public d(String validatedUrl, c localFallback) {
        Intrinsics.checkNotNullParameter(validatedUrl, "validatedUrl");
        Intrinsics.checkNotNullParameter(localFallback, "localFallback");
        this.f79850c = validatedUrl;
        this.f79851d = localFallback;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f79850c, dVar.f79850c) && Intrinsics.d(this.f79851d, dVar.f79851d);
    }

    public final int hashCode() {
        return this.f79851d.hashCode() + (this.f79850c.hashCode() * 31);
    }

    public final String i1() {
        return this.f79850c;
    }

    public final String toString() {
        return "RemoteBadgeIndicator(validatedUrl=" + this.f79850c + ", localFallback=" + this.f79851d + ")";
    }
}
