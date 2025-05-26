package v21;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w implements z {

    /* renamed from: a, reason: collision with root package name */
    public final String f123904a;

    public w(String experienceId) {
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        this.f123904a = experienceId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && Intrinsics.d(this.f123904a, ((w) obj).f123904a);
    }

    public final int hashCode() {
        return this.f123904a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("RetryClicked(experienceId="), this.f123904a, ")");
    }
}
