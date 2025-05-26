package xw0;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lxw0/a;", "", "", "a", "J", "getStartTimestampMs", "()J", "startTimestampMs", "b", "getDurationMs", "durationMs", "", "c", "Z", "isFromImage", "()Z", "ideaPinModelsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("startTimestampMs")
    private final long startTimestampMs;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("durationMs")
    private final long durationMs;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("isFromImage")
    private final boolean isFromImage;

    public a(long j13, long j14, boolean z13) {
        this.startTimestampMs = j13;
        this.durationMs = j14;
        this.isFromImage = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.startTimestampMs == aVar.startTimestampMs && this.durationMs == aVar.durationMs && this.isFromImage == aVar.isFromImage;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isFromImage) + a.a.c(this.durationMs, Long.hashCode(this.startTimestampMs) * 31, 31);
    }

    public final String toString() {
        long j13 = this.startTimestampMs;
        long j14 = this.durationMs;
        boolean z13 = this.isFromImage;
        StringBuilder u13 = a.a.u("IdeaPinClipsAuxData(startTimestampMs=", j13, ", durationMs=");
        u13.append(j14);
        u13.append(", isFromImage=");
        u13.append(z13);
        u13.append(")");
        return u13.toString();
    }
}
