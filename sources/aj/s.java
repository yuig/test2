package aj;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Laj/s;", "", "", "a", "Z", "startMuted", "b", "clickToExpandRequested", "c", "customControlsRequested", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class s {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("startMuted")
    public boolean startMuted;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("clickToExpandRequested")
    public boolean clickToExpandRequested;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("customControlsRequested")
    public boolean customControlsRequested;

    public s() {
        this(true, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.startMuted == sVar.startMuted && this.clickToExpandRequested == sVar.clickToExpandRequested && this.customControlsRequested == sVar.customControlsRequested;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public final int hashCode() {
        boolean z13 = this.startMuted;
        ?? r03 = z13;
        if (z13) {
            r03 = 1;
        }
        int i13 = r03 * 31;
        ?? r23 = this.clickToExpandRequested;
        int i14 = r23;
        if (r23 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        boolean z14 = this.customControlsRequested;
        return i15 + (z14 ? 1 : z14 ? 1 : 0);
    }

    public final String toString() {
        boolean z13 = this.startMuted;
        boolean z14 = this.clickToExpandRequested;
        boolean z15 = this.customControlsRequested;
        StringBuilder sb3 = new StringBuilder("VideoOptionsSignal(startMuted=");
        sb3.append(z13);
        sb3.append(", clickToExpandRequested=");
        sb3.append(z14);
        sb3.append(", customControlsRequested=");
        return a.a.r(sb3, z15, ")");
    }

    public s(boolean z13, boolean z14, boolean z15) {
        this.startMuted = z13;
        this.clickToExpandRequested = z14;
        this.customControlsRequested = z15;
    }
}
