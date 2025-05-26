package ma1;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final String f86794a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86795b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86796c;

    /* renamed from: d, reason: collision with root package name */
    public final String f86797d;

    /* renamed from: e, reason: collision with root package name */
    public final String f86798e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f86799f;

    public p(String lastAccessedDate, String locationCity, String locationIp, String deviceType, String sessionId, boolean z13) {
        Intrinsics.checkNotNullParameter(lastAccessedDate, "lastAccessedDate");
        Intrinsics.checkNotNullParameter(locationCity, "locationCity");
        Intrinsics.checkNotNullParameter(locationIp, "locationIp");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f86794a = lastAccessedDate;
        this.f86795b = locationCity;
        this.f86796c = locationIp;
        this.f86797d = deviceType;
        this.f86798e = sessionId;
        this.f86799f = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.d(this.f86794a, pVar.f86794a) && Intrinsics.d(this.f86795b, pVar.f86795b) && Intrinsics.d(this.f86796c, pVar.f86796c) && Intrinsics.d(this.f86797d, pVar.f86797d) && Intrinsics.d(this.f86798e, pVar.f86798e) && this.f86799f == pVar.f86799f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f86799f) + cb.d(this.f86798e, cb.d(this.f86797d, cb.d(this.f86796c, cb.d(this.f86795b, this.f86794a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ConnectedDevicesItemDisplayState(lastAccessedDate=");
        sb3.append(this.f86794a);
        sb3.append(", locationCity=");
        sb3.append(this.f86795b);
        sb3.append(", locationIp=");
        sb3.append(this.f86796c);
        sb3.append(", deviceType=");
        sb3.append(this.f86797d);
        sb3.append(", sessionId=");
        sb3.append(this.f86798e);
        sb3.append(", current=");
        return a.a.r(sb3, this.f86799f, ")");
    }
}
