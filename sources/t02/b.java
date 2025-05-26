package t02;

import com.pinterest.api.model.ay;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final ay f115714a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f115715b;

    public b(ay notice, HashMap noticeAuxData) {
        Intrinsics.checkNotNullParameter(notice, "notice");
        Intrinsics.checkNotNullParameter(noticeAuxData, "noticeAuxData");
        this.f115714a = notice;
        this.f115715b = noticeAuxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f115714a, bVar.f115714a) && Intrinsics.d(this.f115715b, bVar.f115715b);
    }

    public final int hashCode() {
        return this.f115715b.hashCode() + (this.f115714a.hashCode() * 31);
    }

    public final String toString() {
        return "ReportSensitivityNoticeDisplayState(notice=" + this.f115714a + ", noticeAuxData=" + this.f115715b + ")";
    }
}
