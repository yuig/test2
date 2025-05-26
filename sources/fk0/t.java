package fk0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t implements u {

    /* renamed from: a, reason: collision with root package name */
    public final al1.i f62325a;

    public t(al1.i request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f62325a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Intrinsics.d(this.f62325a, ((t) obj).f62325a);
    }

    public final int hashCode() {
        return this.f62325a.hashCode();
    }

    public final String toString() {
        return pk2.f.g(new StringBuilder("NavigationRequest(request="), this.f62325a, ")");
    }
}
