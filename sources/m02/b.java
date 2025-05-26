package m02;

import com.pinterest.api.model.ay;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ay f85274a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f85275b;

    public b(ay notice, HashMap noticeAuxData) {
        Intrinsics.checkNotNullParameter(notice, "notice");
        Intrinsics.checkNotNullParameter(noticeAuxData, "noticeAuxData");
        this.f85274a = notice;
        this.f85275b = noticeAuxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f85274a, bVar.f85274a) && Intrinsics.d(this.f85275b, bVar.f85275b);
    }

    public final int hashCode() {
        return this.f85275b.hashCode() + (this.f85274a.hashCode() * 31);
    }

    public final String toString() {
        return "ReportSensitivityData(notice=" + this.f85274a + ", noticeAuxData=" + this.f85275b + ")";
    }
}
