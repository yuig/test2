package cr0;

import com.pinterest.api.model.f30;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f53094a;

    /* renamed from: b, reason: collision with root package name */
    public final m f53095b;

    /* renamed from: c, reason: collision with root package name */
    public final l f53096c;

    /* renamed from: d, reason: collision with root package name */
    public final Date f53097d;

    public g(f30 pin, m updateFrequency, l updateDateRange, Date date) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(updateFrequency, "updateFrequency");
        Intrinsics.checkNotNullParameter(updateDateRange, "updateDateRange");
        this.f53094a = pin;
        this.f53095b = updateFrequency;
        this.f53096c = updateDateRange;
        this.f53097d = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f53094a, gVar.f53094a) && this.f53095b == gVar.f53095b && this.f53096c == gVar.f53096c && Intrinsics.d(this.f53097d, gVar.f53097d);
    }

    public final int hashCode() {
        int hashCode = (this.f53096c.hashCode() + ((this.f53095b.hashCode() + (this.f53094a.hashCode() * 31)) * 31)) * 31;
        Date date = this.f53097d;
        return hashCode + (date == null ? 0 : date.hashCode());
    }

    public final String toString() {
        return "AnalyticsLastUpdatedState(pin=" + this.f53094a + ", updateFrequency=" + this.f53095b + ", updateDateRange=" + this.f53096c + ", updateTimestamp=" + this.f53097d + ")";
    }
}
