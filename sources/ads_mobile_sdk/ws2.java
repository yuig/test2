package ads_mobile_sdk;

import java.util.Arrays;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ws2 {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f13238a;

    /* renamed from: b, reason: collision with root package name */
    public final jw1[] f13239b;

    public ws2(UUID rootTraceId, jw1[] perTraceMeta) {
        Intrinsics.checkNotNullParameter(rootTraceId, "rootTraceId");
        Intrinsics.checkNotNullParameter(perTraceMeta, "perTraceMeta");
        this.f13238a = rootTraceId;
        this.f13239b = perTraceMeta;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ws2)) {
            return false;
        }
        ws2 ws2Var = (ws2) obj;
        return Intrinsics.d(this.f13238a, ws2Var.f13238a) && Intrinsics.d(this.f13239b, ws2Var.f13239b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f13239b) + (this.f13238a.hashCode() * 31);
    }

    public final String toString() {
        return "TraceSnapshot(rootTraceId=" + this.f13238a + ", perTraceMeta=" + Arrays.toString(this.f13239b) + ")";
    }
}
