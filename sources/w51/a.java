package w51;

import com.pinterest.api.model.kg0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final kg0 f128104a;

    public a(kg0 scheduledPin) {
        Intrinsics.checkNotNullParameter(scheduledPin, "scheduledPin");
        this.f128104a = scheduledPin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.f128104a, ((a) obj).f128104a);
    }

    public final int hashCode() {
        return this.f128104a.hashCode();
    }

    public final String toString() {
        return "ScheduledPinCreatedEvent(scheduledPin=" + this.f128104a + ")";
    }
}
