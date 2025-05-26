package vu;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final a f126651a;

    public l(a type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f126651a = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && this.f126651a == ((l) obj).f126651a;
    }

    public final int hashCode() {
        return this.f126651a.hashCode();
    }

    public final String toString() {
        return "DestinationViewEvent(type=" + this.f126651a + ")";
    }
}
