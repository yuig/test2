package v21;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements h {

    /* renamed from: a, reason: collision with root package name */
    public final String f123878a;

    public f(String experienceId) {
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        this.f123878a = experienceId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f123878a, ((f) obj).f123878a);
    }

    public final int hashCode() {
        return this.f123878a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("RetryClicked(experienceId="), this.f123878a, ")");
    }
}
