package pg0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f100058a;

    public d0(String experienceId) {
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        this.f100058a = experienceId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && Intrinsics.d(this.f100058a, ((d0) obj).f100058a);
    }

    public final int hashCode() {
        return this.f100058a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("PositiveFeedbackReportLinkEvent(experienceId="), this.f100058a, ")");
    }
}
