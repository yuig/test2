package ba1;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q implements r {

    /* renamed from: a, reason: collision with root package name */
    public final wy0 f22394a;

    /* renamed from: b, reason: collision with root package name */
    public final long f22395b;

    /* renamed from: c, reason: collision with root package name */
    public final long f22396c;

    public q(wy0 user, long j13, long j14) {
        Intrinsics.checkNotNullParameter(user, "user");
        this.f22394a = user;
        this.f22395b = j13;
        this.f22396c = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.d(this.f22394a, qVar.f22394a) && this.f22395b == qVar.f22395b && this.f22396c == qVar.f22396c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f22396c) + a.a.c(this.f22395b, this.f22394a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "UserSettingsLoaded(user=" + this.f22394a + ", currentDayInMillis=" + this.f22395b + ", apiMigrationHardDeadlineInMillis=" + this.f22396c + ")";
    }
}
