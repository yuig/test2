package cy1;

import com.pinterest.api.model.f30;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f53445a;

    /* renamed from: b, reason: collision with root package name */
    public final Date f53446b;

    public e(f30 pin, Date date) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f53445a = pin;
        this.f53446b = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f53445a, eVar.f53445a) && Intrinsics.d(this.f53446b, eVar.f53446b);
    }

    public final int hashCode() {
        int hashCode = this.f53445a.hashCode() * 31;
        Date date = this.f53446b;
        return hashCode + (date == null ? 0 : date.hashCode());
    }

    public final String toString() {
        return "PinWithCreatedDate(pin=" + this.f53445a + ", createdDate=" + this.f53446b + ")";
    }
}
