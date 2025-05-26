package qr1;

import a.cb;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011R\u001a\u0010\u0019\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011R\u001a\u0010\u001a\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001a\u0010\u001c\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u000e\u0010\u0011R\u001a\u0010\u001d\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u001b\u0010\u0011R\u001a\u0010\u001e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0003\u0010\u000b¨\u0006\u001f"}, d2 = {"Lqr1/o;", "", "", "a", "Z", "b", "()Z", "current", "", "J", "f", "()J", "lastAccessedAt", "", "c", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "id", "g", "location", "e", "j", "type", "i", "platformVersion", "ipAddress", "h", "deviceName", "platformType", "createdAt", "identity-core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final /* data */ class o {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("current")
    private final boolean current;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("last_accessed_at")
    private final long lastAccessedAt;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("id")
    @NotNull
    private final String id;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("location")
    @NotNull
    private final String location;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @om.b("type")
    @NotNull
    private final String type;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @om.b("platform_version")
    @NotNull
    private final String platformVersion;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @om.b("ip_address")
    @NotNull
    private final String ipAddress;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @om.b("device_name")
    @NotNull
    private final String deviceName;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @om.b("platform_type")
    @NotNull
    private final String platformType;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @om.b("created_at")
    private final long createdAt;

    /* renamed from: a, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getCurrent() {
        return this.current;
    }

    /* renamed from: c, reason: from getter */
    public final String getDeviceName() {
        return this.deviceName;
    }

    /* renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: e, reason: from getter */
    public final String getIpAddress() {
        return this.ipAddress;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.current == oVar.current && this.lastAccessedAt == oVar.lastAccessedAt && Intrinsics.d(this.id, oVar.id) && Intrinsics.d(this.location, oVar.location) && Intrinsics.d(this.type, oVar.type) && Intrinsics.d(this.platformVersion, oVar.platformVersion) && Intrinsics.d(this.ipAddress, oVar.ipAddress) && Intrinsics.d(this.deviceName, oVar.deviceName) && Intrinsics.d(this.platformType, oVar.platformType) && this.createdAt == oVar.createdAt;
    }

    /* renamed from: f, reason: from getter */
    public final long getLastAccessedAt() {
        return this.lastAccessedAt;
    }

    /* renamed from: g, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    /* renamed from: h, reason: from getter */
    public final String getPlatformType() {
        return this.platformType;
    }

    public final int hashCode() {
        return Long.hashCode(this.createdAt) + cb.d(this.platformType, cb.d(this.deviceName, cb.d(this.ipAddress, cb.d(this.platformVersion, cb.d(this.type, cb.d(this.location, cb.d(this.id, a.a.c(this.lastAccessedAt, Boolean.hashCode(this.current) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    /* renamed from: i, reason: from getter */
    public final String getPlatformVersion() {
        return this.platformVersion;
    }

    /* renamed from: j, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final String toString() {
        boolean z13 = this.current;
        long j13 = this.lastAccessedAt;
        String str = this.id;
        String str2 = this.location;
        String str3 = this.type;
        String str4 = this.platformVersion;
        String str5 = this.ipAddress;
        String str6 = this.deviceName;
        String str7 = this.platformType;
        long j14 = this.createdAt;
        StringBuilder sb3 = new StringBuilder("ConnectedDevicesData(current=");
        sb3.append(z13);
        sb3.append(", lastAccessedAt=");
        sb3.append(j13);
        a.a.B(sb3, ", id=", str, ", location=", str2);
        a.a.B(sb3, ", type=", str3, ", platformVersion=", str4);
        a.a.B(sb3, ", ipAddress=", str5, ", deviceName=", str6);
        sb3.append(", platformType=");
        sb3.append(str7);
        sb3.append(", createdAt=");
        return a.a.o(sb3, j14, ")");
    }
}
