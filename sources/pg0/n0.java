package pg0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f100082a;

    public n0(String experienceId) {
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        this.f100082a = experienceId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && Intrinsics.d(this.f100082a, ((n0) obj).f100082a);
    }

    public final int hashCode() {
        return this.f100082a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("ShowNegativeFeedbackReportLinkEvent(experienceId="), this.f100082a, ")");
    }
}
