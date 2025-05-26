package kb1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    public final String f79067a;

    public c(String confirmedCode) {
        Intrinsics.checkNotNullParameter(confirmedCode, "confirmedCode");
        this.f79067a = confirmedCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f79067a, ((c) obj).f79067a);
    }

    public final int hashCode() {
        return this.f79067a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("ConfirmedCodeProvided(confirmedCode="), this.f79067a, ")");
    }
}
