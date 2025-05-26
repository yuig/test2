package qm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements k {

    /* renamed from: a, reason: collision with root package name */
    public final String f104276a;

    public h(String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.f104276a = errorMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f104276a, ((h) obj).f104276a);
    }

    public final int hashCode() {
        return this.f104276a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("BoardActionFailed(errorMessage="), this.f104276a, ")");
    }
}
