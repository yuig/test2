package sv;

import kotlin.jvm.internal.Intrinsics;
import zy.k0;

/* loaded from: classes3.dex */
public final class s implements u {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f115312a;

    public s(k0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f115312a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && Intrinsics.d(this.f115312a, ((s) obj).f115312a);
    }

    public final int hashCode() {
        return this.f115312a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("LoggingSideEffectRequest(request="), this.f115312a, ")");
    }
}
