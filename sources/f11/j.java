package f11;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Date f60782a;

    public j(Date scheduledDate) {
        Intrinsics.checkNotNullParameter(scheduledDate, "scheduledDate");
        this.f60782a = scheduledDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.d(this.f60782a, ((j) obj).f60782a);
    }

    public final int hashCode() {
        return this.f60782a.hashCode();
    }

    public final String toString() {
        return "SchedulePinDateSetEvent(scheduledDate=" + this.f60782a + ")";
    }
}
