package ay1;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b0 implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final Date f20660a;

    public b0(Date date) {
        this.f20660a = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && Intrinsics.d(this.f20660a, ((b0) obj).f20660a);
    }

    public final int hashCode() {
        Date date = this.f20660a;
        if (date == null) {
            return 0;
        }
        return date.hashCode();
    }

    public final String toString() {
        return "Success(createdDate=" + this.f20660a + ")";
    }
}
