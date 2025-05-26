package oq;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final String f97148a;

    public w(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f97148a = pinId;
    }

    public final String a() {
        return this.f97148a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && Intrinsics.d(this.f97148a, ((w) obj).f97148a);
    }

    public final int hashCode() {
        return this.f97148a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("VirtualTryOnButtonEvent(pinId="), this.f97148a, ")");
    }
}
