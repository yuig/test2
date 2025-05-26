package ma1;

import a.cb;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;

/* loaded from: classes5.dex */
public final class q implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f86800a;

    /* renamed from: b, reason: collision with root package name */
    public final long f86801b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86802c;

    /* renamed from: d, reason: collision with root package name */
    public final String f86803d;

    /* renamed from: e, reason: collision with root package name */
    public final String f86804e;

    /* renamed from: f, reason: collision with root package name */
    public final String f86805f;

    /* renamed from: g, reason: collision with root package name */
    public final String f86806g;

    /* renamed from: h, reason: collision with root package name */
    public final String f86807h;

    /* renamed from: i, reason: collision with root package name */
    public final String f86808i;

    /* renamed from: j, reason: collision with root package name */
    public final long f86809j;

    public /* synthetic */ q() {
        this(false, 0L, "", "", "", "", "", "", "", 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f86800a == qVar.f86800a && this.f86801b == qVar.f86801b && Intrinsics.d(this.f86802c, qVar.f86802c) && Intrinsics.d(this.f86803d, qVar.f86803d) && Intrinsics.d(this.f86804e, qVar.f86804e) && Intrinsics.d(this.f86805f, qVar.f86805f) && Intrinsics.d(this.f86806g, qVar.f86806g) && Intrinsics.d(this.f86807h, qVar.f86807h) && Intrinsics.d(this.f86808i, qVar.f86808i) && this.f86809j == qVar.f86809j;
    }

    public final int hashCode() {
        return Long.hashCode(this.f86809j) + cb.d(this.f86808i, cb.d(this.f86807h, cb.d(this.f86806g, cb.d(this.f86805f, cb.d(this.f86804e, cb.d(this.f86803d, cb.d(this.f86802c, a.a.c(this.f86801b, Boolean.hashCode(this.f86800a) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ConnectedDevicesItemVMState(current=");
        sb3.append(this.f86800a);
        sb3.append(", lastAccessedAt=");
        sb3.append(this.f86801b);
        sb3.append(", id=");
        sb3.append(this.f86802c);
        sb3.append(", location=");
        sb3.append(this.f86803d);
        sb3.append(", type=");
        sb3.append(this.f86804e);
        sb3.append(", platformVersion=");
        sb3.append(this.f86805f);
        sb3.append(", ipAddress=");
        sb3.append(this.f86806g);
        sb3.append(", deviceName=");
        sb3.append(this.f86807h);
        sb3.append(", platformType=");
        sb3.append(this.f86808i);
        sb3.append(", createdAt=");
        return a.a.o(sb3, this.f86809j, ")");
    }

    public q(boolean z13, long j13, String id3, String location, String type, String platformVersion, String ipAddress, String deviceName, String platformType, long j14) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(platformVersion, "platformVersion");
        Intrinsics.checkNotNullParameter(ipAddress, "ipAddress");
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        Intrinsics.checkNotNullParameter(platformType, "platformType");
        this.f86800a = z13;
        this.f86801b = j13;
        this.f86802c = id3;
        this.f86803d = location;
        this.f86804e = type;
        this.f86805f = platformVersion;
        this.f86806g = ipAddress;
        this.f86807h = deviceName;
        this.f86808i = platformType;
        this.f86809j = j14;
    }
}
